class Car extends LandVehicle {

  private String modelName; 
  private String fuelType;
  private String gearingSystem;

  Car(String brand, String engine, int speed, int numOfwheels, int fuelLevel, boolean onOff, int passengers, String typeOfcontrol, String typeOfroad, String typeOfvehicle, String modelName, String fuelType, String gearingSystem) {
    super(brand, engine, speed, numOfwheels, fuelLevel, onOff, passengers, typeOfcontrol, typeOfroad, typeOfvehicle);
    this.modelName = modelName;
    this.fuelType = fuelType;
    this.gearingSystem = gearingSystem;
  }

  public void applyBrake(int decrement) {
    speed -= decrement;
  }
          
  public void speedUp(int increment) {
    speed += increment;
  }

  public String typeOfcar(String fuelType) {
    String car = "";
    if(fuelType.equalsIgnoreCase("Electricity")) {
      car += "electric";
    }
    else if(fuelType.equalsIgnoreCase("Gas")) {
      car += "gas";
    }
    else {
      car += "hybrid";
    }
    return car;
  }

  public String getModelName() {
    return modelName;
  }

  public String[] typesOfgear(String gearingSystem) {
    String[] types = {"D-3", "D", "N", "R", "P", "2", "L"};
    return types;
  }

}