package com.weather.weather.dto;

public class Day {

    private double temp;
    private double windspeed;
    private String description;

    public WeatherInfo(double temp, double windspeed, String description) {
      this.temp = temp;
      this.windspeed = windspeed;
      this.description = description;
  }

  // Getters
  
  public double getTemp() {
      return temp;
  }

  public double getWindSpeed() {
      return windspeed;
  }

  public String getDescription() {
    return description;
}

}
