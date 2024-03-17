package com.wigroup.weatherapp.domain.usecase

import com.wigroup.weatherapp.domain.entity.City
import com.wigroup.weatherapp.domain.repository.FavouriteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetFavouriteCitiesUseCase @Inject constructor(
    private val repository: FavouriteRepository
) {

    operator fun invoke(): Flow<List<City>> = repository.favouriteCities
}