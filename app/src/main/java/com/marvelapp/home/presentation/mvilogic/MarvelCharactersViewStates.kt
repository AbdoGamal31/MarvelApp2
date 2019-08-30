package com.marvelapp.home.presentation.mvilogic

import com.marvelapp.home.entities.MarvelCharacters

sealed class MarvelCharactersViewStates {
    //init marvel characters
    object LoadingForGettingMarvelCharachtersState : MarvelCharactersViewStates()

    data class ErrorState(val throwable: Throwable) : MarvelCharactersViewStates()
    data class SuccessState(val marvelCharacters: MarvelCharacters) : MarvelCharactersViewStates()

    //load more marvel characters
    object LoadMoreMarvelCharactersViewState : MarvelCharactersViewStates()

    object HideLoadMoreViewState : MarvelCharactersViewStates()
    object CloseSearchResultDialog : MarvelCharactersViewStates()
    object ShowSearchResultDialog : MarvelCharactersViewStates()
    object ShowLoadingForSearchForCharacterByNameState : MarvelCharactersViewStates()
    data class SuccessForSearchResultState(val marvelCharacters: MarvelCharacters) : MarvelCharactersViewStates()

}