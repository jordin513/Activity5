import java.util.Date;

public class ManufacturedEngine implements Engine{

  String engineManufacturer;
  Date engineManufacturedDate;
  String engineMake;
  String engineModel;
  int engineCylinders;
  String engineType;
  String driveTrain;

  public ManufacturedEngine() {
    this.engineManufacturer = "Generic";
    this.engineManufacturedDate = new Date();
    this.engineMake = "Generic";
    this.engineModel = "Generic";
    this.engineType = "85 AKI";
    this.engineCylinders = 0;
    this.driveTrain= " 2WD: Two-Wheel Drives";

  }

  @Override
  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }

  @Override
  public void setEngineManufacturedDate(Date date) {

    this.engineManufacturedDate = date;

  }

  @Override
  public void setEngineManufacturer(String manufacturer) {

    this.engineManufacturer = manufacturer;
  }

  @Override
  public void setEngineMake(String engineMake) {

    this.engineMake= engineMake;
  }

  @Override
  public void setEngineModel(String engineModel) {

    this.engineModel = engineModel;
  }

  @Override
  public void setDriveTrain(String driveTrain) {

    this.driveTrain= driveTrain;
  }

  @Override
  public void setEngineType(String fuel) {

    this.engineType = fuel;

  }

  @Override
  public String toString() {
    return "ManufacturedEngine{" +
        "engineManufacturer='" + engineManufacturer + '\'' +
        ", engineManufacturedDate=" + engineManufacturedDate +
        ", engineMake='" + engineMake + '\'' +
        ", engineModel='" + engineModel + '\'' +
        ", engineCylinders=" + engineCylinders +
        ", engineType='" + engineType + '\'' +
        ", driveTrain='" + driveTrain + '\'' +
        '}';
  }
}
