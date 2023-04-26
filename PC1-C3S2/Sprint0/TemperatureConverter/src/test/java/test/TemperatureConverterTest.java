package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import production.TemperatureConverter;

public class TemperatureConverterTest {
  @Test
  public void CelsiusToFahrenheitTest() {
    var converter = new TemperatureConverter();
    double fahrenheit = converter.CelsiusToFahrenheit(100.0);
    double expected = 212.0;
    assertEquals(expected, fahrenheit, 0.01);
  }

  @Test
  public void FahrenheitToCelsiusTest() {
    var converter = new TemperatureConverter();
    double celsius = converter.FahrenheitToCelsius(100.0);
    double expected = 37.78;
    assertEquals(expected, celsius, 0.01);
  }

}
