package com.gildair.weatherapp.domain.weather

import com.gildair.weatherapp.domain.WeatherData.WeatherData

data class WeatherInfo(
    val weatherDataPerDay: Map<Int, List<WeatherData>>,
    val currentWeatherData: WeatherData?
)
