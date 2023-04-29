public class Main {
    public static void main(String[] args) {
        for(SolarSystem planet : SolarSystem.values()) {
            System.out.println(planet);
            System.out.println(planet.getOrderFromSun());
            System.out.println(planet.getDistanceFromPreviousPlanet());
            System.out.println(planet.getDistanceFromSun());
            System.out.println(planet.getRadius());
            System.out.println(planet.getPreviousPlanet());
            System.out.println(planet.getNextPlanet());
            System.out.println("--------------------");
        }
    }
}
