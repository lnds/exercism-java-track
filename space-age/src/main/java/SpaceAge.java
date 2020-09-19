class SpaceAge {

    static double SECONDS_ON_EARTH = 365.25 * 86400.00;
    static double MERCURY_FACTOR = 0.2408467;
    static double VENUS_FACTOR = 0.61519726;
    static double MARS_FACTOR = 1.8808158;
    static double JUPITER_FACTOR = 11.862615;
    static double SATURN_FACTOR = 29.447498;
    static double URANUS_FACTOR = 84.016846;
    static double NEPTUNE_FACTOR = 164.79132;

    private double seconds;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return this.seconds;
    }

    double onEarth() {
        return getSeconds() / SECONDS_ON_EARTH;
    }

    double onMercury() {
        return onEarth() / MERCURY_FACTOR;
    }

    double onVenus() {
        return onEarth() / VENUS_FACTOR;
    }

    double onMars() {
        return onEarth() / MARS_FACTOR;
    }

    double onJupiter() {
        return onEarth() / JUPITER_FACTOR;
    }

    double onSaturn() {
        return onEarth() / SATURN_FACTOR;
    }

    double onUranus() {
        return onEarth() / URANUS_FACTOR;
    }

    double onNeptune() {
        return onEarth() / NEPTUNE_FACTOR;
    }

}
