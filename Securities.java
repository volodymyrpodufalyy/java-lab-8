package com.lab8;

import com.lab8.enums.RiskLevel;
import com.lab8.enums.TradingLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Securities {
    private String type;
    private String brand;
    private Integer price;
    private String buyingDate;
    private RiskLevel riskLevel;
    private TradingLevel tradingLevel;

    @Override
    public String toString() {
        return objToString() + "|\n|";
    }

    public String objToString() {
        return  "\n|Type: " + type
                + "|\n|Brand: " + brand
                + "|\n|Price: " + price
                + "|\n|Buying date: " + buyingDate
                + "|\n|Risk Level: " + riskLevel
                + "|\n|Trading level: " + tradingLevel;
    }
}

