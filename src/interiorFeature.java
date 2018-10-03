public class interiorFeature implements Feature {

  String interiorFeature = "Generic";

  public interiorFeature() {

  }

  public interiorFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }

  @Override
  public String toString() {
    return "Interior [" + interiorFeature + "]";
  }


  @Override
  public String getFeature() {
    return interiorFeature;
  }

  @Override
  public void setFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }
}