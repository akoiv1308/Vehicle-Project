class Airplane extends Aircraft {

  private int numOfpropellers;
  private int numOfwings;
  private int turbinePower;
  private boolean spoiler;

  Airplane(String brand, String engine, int speed, int numOfwheels, int fuelLevel, boolean onOff, int passengers, String typeOfcontrol, boolean rudder, int altitude, boolean cockput, boolean horizontalStabilizer, int numOfpropellers, int numOfwings, int turbinePower, boolean spoiler) {
    super(brand, engine, speed, numOfwheels, fuelLevel, onOff, passengers, typeOfcontrol, rudder, altitude, cockput, horizontalStabilizer);
    this.numOfpropellers = numOfpropellers;
    this.numOfwings = numOfwings;
    this.turbinePower = turbinePower;
    this.spoiler = spoiler;
  }

  public void totalDistance(int speed, int fuelLevel) {
    int requiredSpeed;
    int extremelyLow;

    if(speed <= requiredSpeed) {
      System.out.println("Need to increase speed!");
    }
    else if(fuelLevel == extremelyLow) {
      System.out.println("Suggestion: Land Immediately");
    }
  }

}