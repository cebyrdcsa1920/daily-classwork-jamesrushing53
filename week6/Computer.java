public class Computer
{
    private int numCores;
    private double storageRemaining;
    private boolean apple;
    private String manufacturer;

    public Computer()
    {
        numCores = 8;
        storageRemaining = 2.5;
        apple = false;
        manufacturer = "Lenovo";
    }

    public Computer(int numCores, double storageRemaining, boolean apple, String manufacturer)
    {
        this.numCores = numCores;
        this.storageRemaining = storageRemaining;
        this.apple = apple;
        this.manufacturer = manufacturer;
    }
}