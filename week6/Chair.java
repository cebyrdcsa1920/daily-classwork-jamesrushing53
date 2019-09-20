public class Chair
{
    private int numLegs;
    private double weightCap;
    private boolean stool;
    private String brand;

    public Chair()
    {
        numLegs = 4;
        weightCap = 450.6;
        stool = false;
        brand = "Herman Miller";
    }

    public Chair(int numLegs, double weightCap, boolean stool, String brand)
    {
        this.numLegs = numLegs;
        this.weightCap = weightCap;
        this.stool = stool;
        this.brand = brand;
    }
}