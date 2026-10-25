package com.university.strategy;

public class CarRouteStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("[Автомобиль] Расчет быстрейшего пути по магистралям от \""
                + origin + "\" до \"" + destination + "\" с учетом текущих пробок.");
    }
}