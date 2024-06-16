package com.weather.weather.controller;

import org.springframework.web.bind.annotation.RestController;

import com.weather.weather.dto.WeatherInfo;
import com.weather.weather.service.WeatherService;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController

public class WeatherServiceController {
     

      private final WeatherService weatherService;

      public WeatherServiceController(WeatherService weatherService) {
        this.weatherService = weatherService;
      }

      @GetMapping("weather/{city}")
      public WeatherInfo getMethodName(@PathVariable String city) {
          return  weatherService.someRestCall(city);
      }
        
}
