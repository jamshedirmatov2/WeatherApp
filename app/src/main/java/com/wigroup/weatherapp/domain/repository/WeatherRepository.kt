package com.wigroup.weatherapp.domain.repository

import com.wigroup.weatherapp.domain.entity.Forecast
import com.wigroup.weatherapp.domain.entity.Weather

interface WeatherRepository {

    suspend fun getWeather(cityId: Int): Weather

    suspend fun getForecast(cityId: Int): Forecast
}