package recordemo;
//
public record WeatherData(double temperatureCelsius, String conditions ) {
//
//    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        return temperatureCelsius*((double)9/5)+ 32;
    }
//
//    // Instance method to get a formatted summary string
    public String getSummary() {
        return String.format("Current weather: %.1f °C ( %.1f °F) and %s ", temperatureCelsius, temperatureFahrenheit(), conditions);
    }
//
//    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
        return new WeatherData(((double)5/9)*(tempFahrenheit-32), conditions);
    }

    public static void main(String[] args) {
        WeatherData todayWeather= new WeatherData(25, "Sunny");
        WeatherData yesterdayWeather= WeatherData.fromFahrenheit(50, "Cloudy");
        System.out.println("Today's weather: "+todayWeather.getSummary());
        System.out.println("Yesterday's weather: "+yesterdayWeather.getSummary());
    }
}
