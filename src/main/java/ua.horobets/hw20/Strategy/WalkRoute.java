package ua.horobets.hw20.Strategy;

import java.util.concurrent.ThreadLocalRandom;
public class WalkRoute implements RouteStrategy {
    @Override
    public String calculateRoute(String destination) {
        double randomDistance = ThreadLocalRandom.current().nextDouble(0.1, 30);
        double roundedDistance = Math.round(randomDistance * 50.0) / 50.0;

        return "The length "
                + destination + " by Walking is "
                + roundedDistance + " kilometers";
    }
}