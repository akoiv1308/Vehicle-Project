public class Helicopter extends Aircraft {

  private int rotorBladeLength;
  private boolean mast;
  private boolean landingSkid;

  Helicopter(String brand, String engine, int speed, int numOfwheels, int fuelLevel, boolean onOff, int passengers, String typeOfcontrol, boolean rudder, int altitude, boolean cockpit, boolean horizontalStabilizer, int rotorBladeLength, boolean mast, boolean landingSkid) {
    super(brand, engine, speed, numOfwheels, fuelLevel, onOff, passengers, typeOfcontrol, rudder, altitude, cockpit, horizontalStabilizer);
    this.rotorBladeLength = rotorBladeLength;
    this.landingSkid = landingSkid;
    this.mast = mast;
  }

  public boolean landOnGround(boolean landingSkid) {
    if(landingSkid) {
      return true;
    }
    return false;
  }

}