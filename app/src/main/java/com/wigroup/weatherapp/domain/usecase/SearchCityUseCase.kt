package com.wigroup.weatherapp.domain.usecase

import com.wigroup.weatherapp.domain.entity.City
import com.wigroup.weatherapp.domain.repository.SearchRepository
import javax.inject.Inject

class SearchCityUseCase @Inject constructor(
    private val repository: SearchRepository
) {

    suspend operator fun invoke(query: String): List<City> = repository.search(query)
}