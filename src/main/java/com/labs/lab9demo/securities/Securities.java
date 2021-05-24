package com.labs.lab9demo.securities;

import com.labs.lab9demo.enums.RiskLevel;
import com.labs.lab9demo.enums.TradingLevel;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Securities {
    private String type;
    private String brand;
    private Integer price;
    private String buyingDate;
    private RiskLevel riskLevel;
    private TradingLevel tradingLevel;

    public String objToString() {
        return  "\n|Type: " + type
                + "|\n|Brand: " + brand
                + "|\n|Price: " + price
                + "|\n|Buying date: " + buyingDate
                + "|\n|Risk Level: " + riskLevel
                + "|\n|Trading level: " + tradingLevel;
    }
}
