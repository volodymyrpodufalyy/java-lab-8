package com.labs.lab9demo.service;

import com.labs.lab9demo.securities.Shares;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/shares")
public class SecuritiesService {

    private final Map<Integer, Shares> shares = new HashMap<>();

    private final AtomicInteger idCounter = new AtomicInteger();

    @GetMapping
    public List<Shares> getShares() {
        return new LinkedList<>(shares.values());
    }

    @GetMapping(path = "/{id}")
    public Shares getShare(final @PathVariable("id") Integer sharesId) {
        return shares.get(sharesId);
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public Shares createShares(@RequestBody Shares share) {

        share.setId(idCounter.incrementAndGet());
        this.shares.put(share.getId(), share);

        return share;
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Shares> deleteShares(@PathVariable("id") Integer sharesId) {
        HttpStatus status = shares.remove(sharesId) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;

        return ResponseEntity.status(status).build();
    }

    @PutMapping(path = "/{id}")
    public Object updateShares(@PathVariable("id") Integer sharesId, final @RequestBody Shares share) {
        if(shares.containsKey(sharesId)) {
            share.setId(sharesId);
            return this.shares.put(share.getId(), share);
        } else {
            return new ResponseEntity<Shares>(HttpStatus.NOT_FOUND);
        }
    }

}
