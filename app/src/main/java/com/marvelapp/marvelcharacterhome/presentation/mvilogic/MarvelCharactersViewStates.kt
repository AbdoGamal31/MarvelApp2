package com.marvelapp.marvelcharacterhome.presentation.mvilogic

import com.marvelapp.entities.MarvelCharacters
import com.marvelapp.entities.Results

sealed class MarvelCharactersHomeViewStates {

    object ShowLoadingMarvelCharactersState : MarvelCharactersHomeViewStates()
    data class ErrorState(val throwable: Throwable) : MarvelCharactersHomeViewStates()
    data class SuccessState(val marvelCharacters: MarvelCharacters) : MarvelCharactersHomeViewStates()
    object HideLoadMoreMarvelCharactersViewState : MarvelCharactersHomeViewStates()
    object ShowLoadMoreMarvelCharactersViewState : MarvelCharactersHomeViewStates()
    data class GoToMarvelCharacterDetailsPageState(val marvelCharacter: Results) : MarvelCharactersHomeViewStates()
}

sealed class MarvelCharactersSearchDialogViewStates {

    object ShowSearchResultDialogState : MarvelCharactersSearchDialogViewStates()
    object ShowLoadingIndicatorSearchForCharacterState : MarvelCharactersSearchDialogViewStates()
    object HideLoadingIndicatorSearchForCharacterState : MarvelCharactersSearchDialogViewStates()
    object CloseSearchResultDialogState : MarvelCharactersSearchDialogViewStates()
    data class SuccessForSearchResultState(val marvelCharacters: MarvelCharacters) :
            MarvelCharactersSearchDialogViewStates()

    object EmptyStateSearchResultDialog : MarvelCharactersSearchDialogViewStates()

    data class GoToMarvelCharacterDetailsPageState(val marvelCharacter: Results) : MarvelCharactersSearchDialogViewStates()

}