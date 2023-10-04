public class PlayerBackstory
{
    int backstory;
    String backstoryName;
    Reputation backstoryReputation = new Reputation();
    void characterBackstory(int backstory, String backstoryName, Reputation backstoryReputation)
    {
        switch (backstory)
        {
            case 1:
                backstoryName = "Righteous citizen";
                backstoryReputation.westReputation = 20;
                backstoryReputation.eastReputation = 20;
                backstoryReputation.northReputation = 20;
                backstoryReputation.southReputation = 20;
                backstoryReputation.centralReputation = 20;
                backstoryReputation.setContinentReputation(backstoryReputation.continentReputation, backstoryReputation.southReputation, backstoryReputation.eastReputation,
                        backstoryReputation.westReputation, backstoryReputation.northReputation, backstoryReputation.centralReputation);
                break;
            case 2:
                backstoryName = "Typical citizen";
                backstoryReputation.westReputation = 10;
                backstoryReputation.eastReputation = 10;
                backstoryReputation.northReputation = 10;
                backstoryReputation.southReputation = 10;
                backstoryReputation.centralReputation = 10;
                backstoryReputation.setContinentReputation(backstoryReputation.continentReputation, backstoryReputation.southReputation, backstoryReputation.eastReputation,
                        backstoryReputation.westReputation, backstoryReputation.northReputation, backstoryReputation.centralReputation);
                break;
            case 3:
                backstoryName = "Good villager";
                backstoryReputation.westReputation = 0;
                backstoryReputation.eastReputation = 0;
                backstoryReputation.northReputation = 0;
                backstoryReputation.southReputation = 0;
                backstoryReputation.centralReputation = 0;
                backstoryReputation.setContinentReputation(backstoryReputation.continentReputation, backstoryReputation.southReputation, backstoryReputation.eastReputation,
                        backstoryReputation.westReputation, backstoryReputation.northReputation, backstoryReputation.centralReputation);
                break;
            case 4:
                backstoryName = "Small bandit";
                backstoryReputation.westReputation = -10;
                backstoryReputation.eastReputation = -10;
                backstoryReputation.northReputation = -10;
                backstoryReputation.southReputation = -10;
                backstoryReputation.centralReputation = -10;
                backstoryReputation.setContinentReputation(backstoryReputation.continentReputation, backstoryReputation.southReputation, backstoryReputation.eastReputation,
                        backstoryReputation.westReputation, backstoryReputation.northReputation, backstoryReputation.centralReputation);
                break;
            case 5:
                backstoryName = "Enemy of the Continent";
                backstoryReputation.westReputation = -20;
                backstoryReputation.eastReputation = -20;
                backstoryReputation.northReputation = -20;
                backstoryReputation.southReputation = -20;
                backstoryReputation.centralReputation = -20;
                backstoryReputation.setContinentReputation(backstoryReputation.continentReputation, backstoryReputation.southReputation, backstoryReputation.eastReputation,
                        backstoryReputation.westReputation, backstoryReputation.northReputation, backstoryReputation.centralReputation);
                break;
            default:
                backstoryName = "There is NO backstory with THAT number!";
                break;
        }
    }
}
