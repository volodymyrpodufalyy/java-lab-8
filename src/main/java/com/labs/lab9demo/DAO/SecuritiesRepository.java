package com.labs.lab9demo.DAO;

import com.labs.lab9demo.securities.Shares;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@EnableAutoConfiguration
@Repository
public interface SecuritiesRepository extends JpaRepository<Shares, Integer> {

}
