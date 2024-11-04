package com.gildair.weatherapp.domain.repository

import com.gildair.weatherapp.domain.util.Resource
import com.gildair.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}