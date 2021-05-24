package com.lab8.securities_types;

import com.lab8.Securities;
import com.lab8.enums.RiskLevel;
import com.lab8.enums.TradingLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Shares extends Securities {
    private String sharesCategory;

    public Shares(final String type, final String brand, final  Integer price, final String buyingDate,
                  final RiskLevel riskLevel, final TradingLevel tradingLevel,
                  final String sharesCategory) {
        super(type, brand, price, buyingDate, riskLevel, tradingLevel);
        this.sharesCategory = sharesCategory;
    }

    @Override
    public String toString() {
        return objToString()
                + "|\n|Shares category: " + sharesCategory
                + "|\n";
    }

}
