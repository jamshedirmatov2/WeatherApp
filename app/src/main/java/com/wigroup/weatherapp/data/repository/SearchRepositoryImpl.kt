package com.wigroup.weatherapp.data.repository

import com.wigroup.weatherapp.data.mapper.toEntities
import com.wigroup.weatherapp.data.network.api.ApiService
import com.wigroup.weatherapp.domain.entity.City
import com.wigroup.weatherapp.domain.repository.SearchRepository
import javax.inject.Inject

class SearchRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : SearchRepository {
    override suspend fun search(query: String): List<City> {
        return apiService.searchCity(query).toEntities()
    }
}