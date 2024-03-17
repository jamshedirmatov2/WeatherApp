package com.wigroup.weatherapp.data.mapper

import com.wigroup.weatherapp.data.network.dto.CityDto
import com.wigroup.weatherapp.domain.entity.City

fun CityDto.toEntity(): City = City(id, name, country)

fun List<CityDto>.toEntities(): List<City> = map { it.toEntity() }