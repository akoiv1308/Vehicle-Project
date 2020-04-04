class Vehicle {

  private int numOfwheels;
  private String engine;
  int speed;
  private String brand;
  private int fuelLevel;
  private boolean onOff = false;
  int passengers;
  String typeOfcontrol;

  Vehicle(String brand, String engine, int speed, int numOfwheels, int fuelLevel, boolean onOff, int passengers, String typeOfcontrol) {
    this.brand = brand;
    this.engine = engine;
    this.speed = speed;
    this.numOfwheels = numOfwheels;
    this.fuelLevel = fuelLevel;
    this.onOff = onOff;
    this.passengers = passengers;
    this.typeOfcontrol = typeOfcontrol;
  }

  public void honk() {                
    System.out.println("Beep, beep!");
  }

  public void turnOn() {
    this.onOff = true;
    System.out.println("Power: On");
  }

  public void turnOff() {
    this.onOff = false;
    System.out.println("Power: Off");
  }
          
  public void speedUp(int increment) {
    speed += increment;
  }

  public void fillUp() {
    int max = 100;
    this.fuelLevel = max;
  }

}
