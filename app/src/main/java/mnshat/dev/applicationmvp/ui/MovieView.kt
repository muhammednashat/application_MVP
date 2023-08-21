package mnshat.dev.applicationmvp.ui

import mnshat.dev.applicationmvp.data.model.DetailsOfMovie

interface MovieView {
    fun getDetailsOfMovie(detailsOfMovie: DetailsOfMovie, textButton: String)
}