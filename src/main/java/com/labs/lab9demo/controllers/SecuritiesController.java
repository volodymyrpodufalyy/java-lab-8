package com.labs.lab9demo.controllers;

import com.labs.lab9demo.securities.Shares;
import com.labs.lab9demo.service.SecuritiesService;
import com.labs.lab9demo.service.SharesNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

@Component("com.labs.lab9demo.service.SecuritiesService")
@RestController
@RequestMapping("/shares")
public class SecuritiesController {

    private static final Logger LOGGER = Logger.getLogger("com.labs.lab9demo.controllers.SecuritiesController");

    private SecuritiesService service;

    @Autowired
    public SecuritiesController(SecuritiesService securitiesService) {
        this.service = securitiesService;
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Shares> getShare(@PathVariable Integer id){
        try {
            return new ResponseEntity<>(service.getShare(id), HttpStatus.OK);
        } catch (NoSuchElementException e) {
            LOGGER.severe("Share " + id + " does not exists");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping
    public List<Shares> getShares() {
        return service.getShares();
    }

    @PostMapping
    public ResponseEntity<Shares> createShare(@RequestBody Shares share) {
            service.addShare(share);
            return new ResponseEntity<>(share, HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deleteShares(@PathVariable("id") Integer sharesId) {
        if (service.deleteShare(sharesId)){
            return ResponseEntity.ok("Successfully deleted");
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Shares> updateShares(@PathVariable("id") Integer sharesId, final @RequestBody Shares share) {
        try {
            share.setId(sharesId);
            service.updateShare(sharesId, share);
            return new ResponseEntity<>(share, HttpStatus.OK);
        } catch (SharesNotFoundException e) {
            LOGGER.severe("Can't update an performance with non-existing id");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
