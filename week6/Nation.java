public class Nation
{
    private int population;
    private double avgAge;
    private boolean democratic;
    private String name;

    public Nation()
    {
        population = 1420000;
        avgAge = 35.6;
        democratic = true;
        name = "Fake State";
    }

    public Nation(int population, double avgAge, boolean democratic, String name)
    {
        this.population = population;
        this.avgAge = avgAge;
        this.democratic = democratic;
        this.name = name;
    }
}