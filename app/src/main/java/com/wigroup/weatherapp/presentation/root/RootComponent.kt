package com.wigroup.weatherapp.presentation.root

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
import com.wigroup.weatherapp.presentation.details.DetailsComponent
import com.wigroup.weatherapp.presentation.favourite.FavouriteComponent
import com.wigroup.weatherapp.presentation.search.SearchComponent

interface RootComponent {

    val stack: Value<ChildStack<*, Child>>

    sealed interface Child {

        data class Favourite(val component: FavouriteComponent) : Child

        data class Search(val component: SearchComponent) : Child

        data class Details(val component: DetailsComponent) : Child
    }
}