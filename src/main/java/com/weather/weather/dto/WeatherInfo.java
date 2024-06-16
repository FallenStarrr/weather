package com.weather.weather.dto;

import java.util.List;

public class WeatherInfo {

  private double latitude;
  private double longitude;
  private List<Day> days;

  // Constructor
  public WeatherInfo(double latitude, double longitude, List<Day> days) {
      this.latitude = latitude;
      this.longitude = longitude;
      this.days = days;
  }

  // Getters
  
  public double getLatitude() {
      return latitude;
  }

  public double getLongitude() {
      return longitude;
  }

  public List<Day> getDays() {
    return days;
}
}
