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
public class Bonds extends Securities {
    private Float bondPercent;
    private String maturity;

    public Bonds(final String type, final String brand, final  Integer price, final String buyingDate,
                 final RiskLevel riskLevel, final TradingLevel tradingLevel,
                 final Float bondPercent, final String maturity ) {
        super(type, brand, price, buyingDate, riskLevel, tradingLevel);
        this.bondPercent = bondPercent;
        this.maturity = maturity;
    }

    @Override
    public String toString() {
        return objToString()
                + "|\n|Bond Percent: " + bondPercent
                + "|\n|Maturity: " + maturity
                + "|\n";
    }

}
