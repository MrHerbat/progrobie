/**
 * klasa zawierająca najważniejsze rzeczy do zrobienia konkretnego samochdu
 */
public class Car {
    /**
     * brandName - nazwa marki samochodu
     */
    String brandName;
    /**
     * fuelTankCapacity - pojemność zbiornika paliwa samochodu
     */
    int maxSpeed;
    /**
     * isElectric - czy samochód jest elektryczny
     */
    boolean isElectric;

    /**
     * Konstruktor jednoargumentowy tylko z nazwą marki samochodu
     * @param brandName nazwa marki samochodu
     */
    public Car(String brandName) {
        this.brandName = brandName;
    }

    /**
     * Konstruktor jednoargumentowy tylko z maksymalną predkością samochodu
     * @param maxSpeed maksymalna prędkość
     */
    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * Konstruktor jednoargumentowy tylko z stwierdzeniem, czy samochód jest elekryczny
     * @param isElectric czy samochód jest elektryczny
     */
    public Car(boolean isElectric) {
        this.isElectric = isElectric;
    }

    /**
     * Konstruktor dwuargumentowy z nazwą marki i maksymalną prędkością samochodu
     * @param brandName nazwa marki samochod
     * @param maxSpeed maksymalna prędkość
     */
    public Car(String brandName, int maxSpeed) {
        this.brandName = brandName;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Konstruktor dwuargumentowy z maksymalną prędkością i czy samochód jest elektryczny
     * @param maxSpeed maksymalna prędkość
     * @param isElectric czy samochód jest elektryczny
     */
    public Car(int maxSpeed, boolean isElectric) {
        this.maxSpeed = maxSpeed;
        this.isElectric = isElectric;
    }

    /**
     * Konstruktor dwuargumentowy zwracający nazwę marki i czy samochód jest elektryczny
     * @param brandName nazwa marki samochodu
     * @param isElectric czy samochód jest elektryczny
     */
    public Car(String brandName, boolean isElectric) {
        this.brandName = brandName;
        this.isElectric = isElectric;
    }

    /**
     * Konstruktor trzyargumentowy zwracający nazwę marki, maksymalną prędkość i czy samochód jest elektryczny
     * @param brandName nazwa marki samochodu
     * @param maxSpeed maksumalna prędkość samochodu
     * @param isElectric czy samochód jest elektryczny
     */
    public Car(String brandName, int maxSpeed, boolean isElectric) {
        this.brandName = brandName;
        this.maxSpeed = maxSpeed;
        this.isElectric = isElectric;
    }

    /**
     * zwraca wartość brandName
     * @return brandName
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * ustawia wartość brandName
     * @param brandName nazwa marki
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * zwraca wartość maxSpeed
     * @return maxSpeed
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * ustawia wartość maxSpeed
     * @param maxSpeed maksymalna prędkość samochodu
     */
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * zwraca wartość isElectric
     * @return isElectric
     */
    public boolean isElectric() {
        return isElectric;
    }

    /**
     * ustawia wartość isElectric na electric
     * @param electric czy jest elektryczny
     */
    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}
