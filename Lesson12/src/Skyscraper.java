public class Skyscraper
{
    public double height;
    public double groundFloorArea;
    private int numberOfFloors;
    private String architectName;
    private int constructionYear;
    
    public boolean hasElevator;
    private boolean hasObservationDeck;
    public boolean isResidential;
    
    
    public double getHeight() {
        return height;
    }

    public double getGroundFloorArea() {
        return groundFloorArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public String getArchitectName() {
        return architectName;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public boolean isHasElevator() {
        return hasElevator;
    }

    public boolean isHasObservationDeck() {
        return hasObservationDeck;
    }

    public boolean isResidential() {
        return isResidential;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setGroundFloorArea(double groundFloorArea) {
        this.groundFloorArea = groundFloorArea;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void setArchitectName(String architectName) {
        this.architectName = architectName;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear;
    }

    public void setHasElevator(boolean hasElevator) {
        this.hasElevator = hasElevator;
    }

    public void setHasObservationDeck(boolean hasObservationDeck) {
        this.hasObservationDeck = hasObservationDeck;
    }

    public void setResidential(boolean residential) {
        isResidential = residential;
    }
}
