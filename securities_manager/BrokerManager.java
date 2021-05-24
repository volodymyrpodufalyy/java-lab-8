package com.lab8.securities_manager;


import com.lab8.Securities;
import com.lab8.enums.RiskLevel;
import com.lab8.enums.TradingLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


@Getter
@NoArgsConstructor
public class BrokerManager {

    private List<Securities> securities;

    public BrokerManager(final List<Securities> securitiesList) {
        securities = securitiesList;
    }

    public void addSecurity(final Securities security) {
        securities.add(security);
    }

    public List<Securities> searchByPrice(Integer searchPrice) {
        return securities.stream()
                .filter(s -> s.getPrice().equals(searchPrice))
                .collect(Collectors.toList());
    }

    public List<Securities> searchByRiskLevel(final RiskLevel searchRiskLevel) {
        return securities.stream()
                .filter(s ->
                s.getRiskLevel().equals(searchRiskLevel))
                .collect(Collectors.toList());
    }

    public List<Securities> searchByTrend(final TradingLevel searchTradingLevel) {
        return securities.stream()
                .filter(s ->
                s.getTradingLevel().equals(searchTradingLevel))
                .collect(Collectors.toList());
    }

    public List<Securities> sortByPrice(final boolean reverse) {
        if (reverse) {
            securities.sort((Securities s1, Securities s2) ->
                    Float.compare(s2.getPrice(), s1.getPrice()));
        } else {
            securities.sort((Securities s1, Securities s2) ->
                    Float.compare(s2.getPrice(), s1.getPrice()));
        }
        return securities;
    }

    public List<Securities> sortByDate(final boolean reverse) {
        if (reverse) {
            securities.sort((Securities s1, Securities s2) ->
                        s2.getBuyingDate().compareTo(s1.getBuyingDate()));
        } else {
            securities.sort(Comparator.comparing(Securities::getBuyingDate));
        }
        return securities;
    }


    public void show(List<Securities> securitiesList) {
        securitiesList.forEach(System.out::println);
    }


}
