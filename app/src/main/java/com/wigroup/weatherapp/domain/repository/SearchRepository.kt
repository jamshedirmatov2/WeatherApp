package com.wigroup.weatherapp.domain.repository

import com.wigroup.weatherapp.domain.entity.City

interface SearchRepository {

    suspend fun search(query: String): List<City>
}