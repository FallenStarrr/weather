package com.weather.weather.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestClient;

import com.weather.weather.dto.WeatherInfo;

@Service
public class WeatherServiceImpl implements WeatherService {

     private final RestClient restClient;
     private final String API_KEY = "PYZ6FTXB7UDZP2J58DFWHTULH"; 

     public WeatherServiceImpl(RestClient.Builder restClientBuilder) {
              this.restClient = restClientBuilder.baseUrl("https://weather.visualcrossing.com").build();
     }

     public WeatherInfo someRestCall(@PathVariable String city) {
      return this.restClient.get().uri("/VisualCrossingWebServices/rest/services/timeline/{city}/2020-10-19?key={API_KEY}&unitGroup=metric", city, API_KEY).retrieve().body(WeatherInfo.class);
    }
} 
