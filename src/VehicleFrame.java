public class VehicleFrame implements Chassis {

  String vehicleFrameType= "Unibody";

  @Override
  public Chassis getChassisType() {
    return this;
  }

  @Override
  public void setChassisType(String vehicleChassis) {

    this.vehicleFrameType = vehicleChassis;
  }

  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;

  }

  public String toString(){
    return "Chassis   : "+ chassis +"\n Vehicle Frame   : "+vehicleFrameType;
  }
}
