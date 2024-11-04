package com.gildair.weatherapp.di

import com.gildair.weatherapp.data.location.DefaultLocationTracker
import com.gildair.weatherapp.domain.location.LocationTracker
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class WeatherRepositoryModule {
    @Binds
    @Singleton
    abstract fun bindWeatherRepository(defaultLocationTracker: DefaultLocationTracker): LocationTracker
}