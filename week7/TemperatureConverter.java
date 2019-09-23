public class TemperatureConverter
{
    private double temperature;
    private boolean isCelsius;

    public TemperatureConverter(double celsius)
    {
        temperature = celsius;
        is Celsius = true;
    }

    public void convertToF()
    {
        if (isCelsius)
        {
           temperature = temperature * 9 / 5 + 32;
        }
    }

    public String toString()
    {
        String result = "The current temperature is " + temperature + " degrees";
        if (isCelsius)
        {
            result += " Celsius";
        }
        else
        {
           result += " Fahrenheit";
        }
        return result;
    }
}