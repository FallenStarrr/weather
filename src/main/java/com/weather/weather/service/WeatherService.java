package com.weather.weather.service;

import org.springframework.web.bind.annotation.PathVariable;

import com.weather.weather.dto.WeatherInfo;

public interface WeatherService {
  WeatherInfo someRestCall(@PathVariable String city);
}
