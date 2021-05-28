package com.labs.lab9demo.securities;

import com.labs.lab9demo.enums.RiskLevel;
import com.labs.lab9demo.enums.TradingLevel;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shares  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    private String type;
    private String brand;
    private Integer price;
    private String buyingDate;
    private RiskLevel riskLevel;
    private TradingLevel tradingLevel;
    private String sharesCategory;


}