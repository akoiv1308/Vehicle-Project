class Aircraft extends Vehicle {

  private boolean rudder = true;
  private int altitude;
  private boolean cockpit;
  private boolean horizontalStabilizer;

  Aircraft(String brand, String engine, int speed, int numOfwheels, int fuelLevel, boolean onOff, int passengers, String typeOfcontrol, boolean rudder, int altitude, boolean cockpit, boolean horizontalStabilizer) {
    super(brand, engine, speed, numOfwheels, fuelLevel, onOff, passengers, typeOfcontrol);
    this.rudder = rudder;
    this.altitude = altitude;
    this.cockpit = cockpit;
    this.horizontalStabilizer = horizontalStabilizer;
  }

  public void setAltitude(int height) {
    altitude += height;
  }
}