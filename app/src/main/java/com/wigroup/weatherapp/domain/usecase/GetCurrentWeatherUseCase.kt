package com.wigroup.weatherapp.domain.usecase

import com.wigroup.weatherapp.domain.entity.Weather
import com.wigroup.weatherapp.domain.repository.WeatherRepository
import javax.inject.Inject

class GetCurrentWeatherUseCase @Inject constructor(
    private val repository: WeatherRepository
) {

    suspend operator fun invoke(cityId: Int): Weather = repository.getWeather(cityId)
}