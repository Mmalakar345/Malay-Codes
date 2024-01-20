/*Write a java program to create two function fahrenheitToCelsius() & celsiusToFahrenheit().
calculate value celsiusToFahrenheit and fahrenheitToCelsius
 */

public class TemperatureConversion {
    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
      }
    
      public static double fahrenheitToCelsius(double fahrenheit){
        return ( fahrenheit -32) * 5/9;
      }
    
      public static void main(String[] args){
        System.out.println(celsiusToFahrenheit(15));
        System.out.println(fahrenheitToCelsius(59));
      }
      
    
}
