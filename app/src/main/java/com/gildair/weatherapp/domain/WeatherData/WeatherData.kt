package com.gildair.weatherapp.domain.WeatherData

import com.gildair.weatherapp.domain.weather.WeatherType
import java.time.LocalDateTime

data class WeatherData (
    val time: LocalDateTime,
    val temperatureCelsius: Double,
    val pressure: Double,
    val windSpeed: Double,
    val humidity: Double,
    val weatherType: WeatherType
)
