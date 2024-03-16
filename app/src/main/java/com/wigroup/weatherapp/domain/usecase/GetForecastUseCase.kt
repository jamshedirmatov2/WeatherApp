package com.wigroup.weatherapp.domain.usecase

import com.wigroup.weatherapp.domain.entity.Forecast
import com.wigroup.weatherapp.domain.repository.WeatherRepository
import javax.inject.Inject

class GetForecastUseCase @Inject constructor(
    private val repository: WeatherRepository
) {

    suspend operator fun invoke(cityId: Int): Forecast = repository.getForecast(cityId)
}