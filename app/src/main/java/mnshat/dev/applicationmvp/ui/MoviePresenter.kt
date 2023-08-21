package mnshat.dev.applicationmvp.ui

import mnshat.dev.applicationmvp.data.model.DetailsOfMovie

class MoviePresenter(val view: MovieView) {

    private var counter = 0

    fun getDetailsOfMoview() {
        val details: DetailsOfMovie
        if (counter % 2 == 0) {
            details = DetailsOfMovie("Be Smart", "101", " Very caver")
            sendDataToView(details, "Delete Movie")
            counter++
        } else {

            details = DetailsOfMovie("", "", "")
            sendDataToView(details, "Display Movie")
            counter++
        }
    }

    private fun sendDataToView(details: DetailsOfMovie, textButton: String) {
        view.getDetailsOfMovie(details, textButton)
    }


}