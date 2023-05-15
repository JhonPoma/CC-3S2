package production;

public class TemperatureConverter {

  public double CelsiusToFahrenheit(double celsiusTemperature) {
    return (9.0 / 5.0) * celsiusTemperature + 32;
  }

  public double FahrenheitToCelsius(double fahrenheitTemperature) {
    return (5.0 / 9.0) * (fahrenheitTemperature - 32);
  }

}
