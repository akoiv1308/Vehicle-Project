class LandVehicle extends Vehicle {

  private String typeOfroad;
  private String typeOfvehicle;

  LandVehicle(String brand, String engine, int speed, int numOfwheels, int fuelLevel, boolean onOff, int passengers, String typeOfcontrol, String typeOfroad, String typeOfvehicle) {
    super(brand, engine, speed, numOfwheels, fuelLevel, onOff, passengers, typeOfcontrol);
    this.typeOfroad = typeOfroad;
    this.typeOfvehicle = typeOfvehicle;
  }

  public void changeTypeofRoad(String typeOfvehicle) {
    if(typeOfvehicle.equalsIgnoreCase("Train")) {
      typeOfroad = "Rails";
    }
    else if(typeOfvehicle.equalsIgnoreCase("Car")) {
      typeOfroad = "Asphalt Road";
    }
  }
  
}