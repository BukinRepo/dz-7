public enum SolarSystem {
    MERCURY(1, 0.0, 2439.7, null, "VENERA"),
    VENERA(2, 12.5, 6051.8, MERCURY, "EARTH"),
    EARTH(3, 22.5, 6378.14, VENERA, "MARS"),
    MARS(4, 13.2, 3397, EARTH, "JUPITER"),
    JUPITER(5,45.3, 71492, MARS, "SATURN"),
    SATURN(6, 11.1, 60268.2, JUPITER, "URAN"),
    URAN(7, 8.8, 25559.3, SATURN, "NEPTUNE"),
    NEPTUNE(8, 15.2, 24764, URAN, "PLUTO"),
    PLUTO(9, 56.6, 1151.8, NEPTUNE, "PLUTO the last planet in Solar System");

    private final int orderFromSun;
    private final double distanceFromPreviousPlanet;
    private final double distanceFromSun;
    private final double radius;
    private final SolarSystem previousPlanet;
    private final String nextPlanet;

    SolarSystem(int orderFromSun, double distanceFromPreviousPlanet, double radius, SolarSystem previousPlanet, String nextPlanet){
        this.orderFromSun = orderFromSun;
        this.distanceFromPreviousPlanet = distanceFromPreviousPlanet;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        this.distanceFromSun = previousPlanet != null ? previousPlanet.distanceFromSun + distanceFromPreviousPlanet : distanceFromPreviousPlanet;
        this.nextPlanet = nextPlanet;
    }

    public int getOrderFromSun() {
        return orderFromSun;
    }

    public double getDistanceFromPreviousPlanet() {
        return distanceFromPreviousPlanet;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getRadius() {
        return radius;
    }

    public SolarSystem getPreviousPlanet() {
        return previousPlanet;
    }

    public String getNextPlanet() {
        return nextPlanet;
    }
}
