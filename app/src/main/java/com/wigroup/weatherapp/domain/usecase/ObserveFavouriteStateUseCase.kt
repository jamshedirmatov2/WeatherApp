package com.wigroup.weatherapp.domain.usecase

import com.wigroup.weatherapp.domain.repository.FavouriteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ObserveFavouriteStateUseCase @Inject constructor(
    private val repository: FavouriteRepository
) {

    operator fun invoke(cityId: Int): Flow<Boolean> = repository.observeIsFavourite(cityId)
}