package com.labs.lab9demo.securities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.labs.lab9demo.enums.RiskLevel;
import com.labs.lab9demo.enums.TradingLevel;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Setter
@Getter
@NoArgsConstructor
public class Shares extends Securities {
    public int id;
    private String sharesCategory;

    public Shares(@JsonProperty("type") final String type,@JsonProperty("brand") final String brand,@JsonProperty("price") final  Integer price,
                  @JsonProperty("buyingDate") final String buyingDate,
                  @JsonProperty("riskLevel") final RiskLevel riskLevel,
                  @JsonProperty("tradingLevel") final TradingLevel tradingLevel,
                  @JsonProperty("sharesCategory") final String sharesCategory) {
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