package com.university.strategy;

public class PublicTransportRouteStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Расчет оптимального маршрута на автобусе от \""
                + origin + "\" до \"" + destination + "\" с учетом пересадок.");
    }
}