package com.university.strategy;

public class WalkingRouteStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("[Пешком] Расчет кратчайшего пешеходного маршрута через тротуары и парки от \""
                + origin + "\" до \"" + destination + "\".");
    }
}