package com.labs.lab9demo.service;

import com.labs.lab9demo.DAO.SecuritiesRepository;
import com.labs.lab9demo.securities.Shares;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.*;

@Service
@Component("com.labs.lab9demo.service.SecuritiesRepository")
@Data
@ApplicationScope
public class SecuritiesService {

    private SecuritiesRepository repository;

    @Autowired
    public SecuritiesService(SecuritiesRepository securitiesRepository) {
        this.repository = securitiesRepository;
    }

    public void addShare(Shares share){
        repository.save(share);
    }

    public Shares updateShare(Integer id, Shares share) throws SharesNotFoundException {
        if (repository.existsById(share.getId())) {
            share.setId(id);
            return repository.save(share);
        }
        throw new SharesNotFoundException("Share " + share.getId() + " not found");
    }

    public List<Shares> getShares(){
        return repository.findAll();
    }

    public Shares getShare(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    public boolean deleteShare(Integer id){
        if(repository.findById(id).isPresent()) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

}
