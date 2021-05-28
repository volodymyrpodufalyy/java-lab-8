package com.labs.lab9demo;

import com.labs.lab9demo.enums.RiskLevel;
import com.labs.lab9demo.enums.TradingLevel;
import com.labs.lab9demo.manager.Broker;
import com.labs.lab9demo.securities.Bonds;
import com.labs.lab9demo.securities.Shares;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class App {
    public static void main(final String[] args) {
//        Broker brokerManager = new Broker(new ArrayList<>());
//        brokerManager.addSecurity(new Shares("Shares", "General Motors", 65,
//                "20 February", RiskLevel.EXTRAHIGH, TradingLevel.DESCENDING, "Usual"));
//        brokerManager.addSecurity(new Shares("Shares","Clubhouse", 2000,
//                "21 February", RiskLevel.MEDIUM, TradingLevel.GROWING, "Usual"));
//        brokerManager.addSecurity(new Shares("Shares", "Telegram", 500,
//                "24 February", RiskLevel.LOW, TradingLevel.DESCENDING,"Privilege"));
//        brokerManager.addSecurity(new Bonds("Bonds", "Apple", 100,
//                "1 February",RiskLevel.MEDIUM, TradingLevel.GROWING,1.5f, "short term"));
//        brokerManager.addSecurity(new Bonds("Bonds", "Google", 1000, "28 February",
//                RiskLevel.LOW, TradingLevel.GROWING,2.5f, "long term"));
//        brokerManager.addSecurity(new Bonds("Bonds", "Microsoft", 950, "13 February",
//                RiskLevel.LOW, TradingLevel.GROWING,1.35f, "medium term"));
//
//
//        System.out.println(brokerManager.searchByTrend(TradingLevel.DESCENDING));
//        System.out.println(brokerManager.searchByRiskLevel(RiskLevel.MEDIUM));
//        System.out.println(brokerManager.searchByPrice(2000));
//
//        brokerManager.sortByPrice(true).forEach(System.out::println);
//        brokerManager.sortByDate(false).forEach(System.out::println);
//
//
//        brokerManager.showSecurities(brokerManager.getSecurities());
    }
}