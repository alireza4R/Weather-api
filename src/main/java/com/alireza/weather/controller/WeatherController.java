package com.alireza.weather.controller;

import com.alireza.weather.model.WeatherInformation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class WeatherController {
    private final RestClient restClient;

    public WeatherController(RestClient.Builder builder) {
        this.restClient = builder.baseUrl("https://api.open-meteo.com").build();
    }

    @GetMapping("/api/weather")
    public WeatherInformation getWeather(@RequestParam double lat, @RequestParam double lon){
        return restClient.get().uri(uriBuilder -> uriBuilder
                .path("/v1/forecast")
                .queryParam("latitude", lat)
                .queryParam("longitude", lon)
                .queryParam("current","precipitation","temperature_2m,wind_speed_10m,weather_code")
                .build()).retrieve()
                .body(WeatherInformation.class);
    }
}
