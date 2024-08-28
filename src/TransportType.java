public enum TransportType {
    CAR(850.0),
    BUS(400.0),
    TRAIN(175.0);

    private final double costPerKilometr;

    TransportType(double costPerKilometr) {
        this.costPerKilometr = costPerKilometr;
    }

    public double calculateTravelCost(double distance) {
        return distance * costPerKilometr;
    }
}
