package com.university.strategy;

import java.util.Objects;

public class Navigator {
    private RouteStrategy routeStrategy;

    public Navigator(RouteStrategy initialStrategy) {
        setRouteStrategy(initialStrategy);
    }

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = Objects.requireNonNull(routeStrategy, "Strategy cannot be null");
    }

    public void planRoute(String origin, String destination) {
        routeStrategy.buildRoute(origin, destination);
    }
}