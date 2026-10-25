package com.university.strategy;

public class Main {
    public static void main(String[] args) {
        String startPoint = "Astana IT University";
        String endPoint = "Khan Shatyr";

        Navigator navigator = new Navigator(new CarRouteStrategy());
        System.out.println("=== Вариант 1: Поездка на машине ===");
        navigator.planRoute(startPoint, endPoint);

        System.out.println("\n=== Вариант 2: Смена стратегии на пешую прогулку ===");
        navigator.setRouteStrategy(new WalkingRouteStrategy());
        navigator.planRoute(startPoint, endPoint);

        System.out.println("\n=== Вариант 3: Смена стратегии на автобус ===");
        navigator.setRouteStrategy(new PublicTransportRouteStrategy());
        navigator.planRoute(startPoint, endPoint);
    }
}