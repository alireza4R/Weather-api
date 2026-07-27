package com.alireza.weather.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record WeatherInformation(
        double latitude,
        double longitude,
        CurrentWeather current
) { }
