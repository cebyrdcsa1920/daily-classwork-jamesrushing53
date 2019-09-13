import java.awt.Color;

public class Pet
{
    private String name;
    private Color color;
    private int age;
    private double weight;
    private String species;

    public Pet()
    {
        name = "Beaux";
        color = Color.YELLOW;
        age = 5;
        weight = 100.5;
        species = "Yellow Lab";
    }

    public Pet(String name, Color color, int age, double weight, String species)
    {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.species = species;
    }

    /**
     * Adds weight to the pet for food eaten.
     *
     * @param updates weight for food eaten
     */

    public void gainWeight(double foodEaten)
    {
        weight += foodEaten;
    }
    /**
     * Gets weight of pet
     *
     * @return weight
     */

    public double getWeight()
    {
        return weight;
    }

    /**
     * Makes pet exercise. Loses weight.
     *
     * @param weight lost
     */

    public void exercise(double poundsBurned)
    {
        weight -= poundsBurned;
    }
}