package com.alireza.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record weatherInformation(String time,
                                 @JsonProperty("temperature_2m") double temperature,
                                 @JsonProperty("precipitation") double precipitation,
                                 @JsonProperty("weather_code") int weatherCode,
                                 @JsonProperty("wind_speed_10m") double windSpeed) {
}
