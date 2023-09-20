public class Screen {

    int refreshSpeed;
    double monitorSize;
    Brands brandName;
    Displays displayType;

    public Screen(int refreshSpeed, int size, String BrandName, String monitorDisplayType) {
        this.refreshSpeed = refreshSpeed;
        this.monitorSize = monitorSize;
        this.brandName = new Brands(BrandName);
        this.displayType = new Displays(monitorDisplayType);
    }


}
