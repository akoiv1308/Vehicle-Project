class Train extends LandVehicle {

  private int powerSource;
  private int numOfcars;
  private boolean warningLights = false;

  Train(String brand, String engine, int speed, int numOfwheels, int fuelLevel, boolean onOff, int passengers, String typeOfcontrol, String typeOfroad, String typeOfvehicle, int powerSource, int numOfcars, boolean warningLights) {
    super(brand, engine, speed, numOfwheels, fuelLevel, onOff,passengers, typeOfcontrol, typeOfroad, typeOfvehicle);
    this.powerSource = powerSource;
    this.numOfcars = numOfcars;
    this.warningLights = warningLights;
  } 

  public void setControlType() {
    typeOfcontrol = "Speed Bar";
  }

  public void setPowerSource(int amount) {
    powerSource += amount;
  }

  public void amountOfcars(int number) {
    numOfcars += number;
  }

  public void setNumOfPassengers(int num) {
    passengers += num;
  }

  public void determineRushHours(int passengers) {
    if(passengers > 500) {
      System.out.println("Subway's are extremely crowded today");
    }
    else {
      System.out.println("Not crowded");
    }
    System.out.println("Have a good day!");
  }

  public void announcement() {
    System.out.println("This is a Coney Island bound F local Train. The next stop is Avenue I. Stand clear of the closing doors, please!");
  }

}