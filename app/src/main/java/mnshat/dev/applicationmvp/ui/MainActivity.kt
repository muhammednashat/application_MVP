package mnshat.dev.applicationmvp.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import mnshat.dev.applicationmvp.R
import mnshat.dev.applicationmvp.data.model.DetailsOfMovie

class MainActivity : AppCompatActivity(), MovieView, View.OnClickListener {
    private lateinit var tvId: TextView
    private lateinit var tVName: TextView
    private lateinit var tVDescription: TextView
    private lateinit var btnDisplay: Button
    private lateinit var presenterMovie: MoviePresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeVariables()

    }

    private fun initializeVariables() {
        tVName = findViewById(R.id.tv_name)
        tvId = findViewById(R.id.tv_id)
        tVDescription = findViewById(R.id.tv_description)
        btnDisplay = findViewById(R.id.button)
        btnDisplay.setOnClickListener(this)
        presenterMovie = MoviePresenter(this)
    }

    override fun getDetailsOfMovie(detailsOfMovie: DetailsOfMovie, textButton: String) {
        btnDisplay.text = textButton
        tvId.text = detailsOfMovie.id
        tVName.text = detailsOfMovie.name
        tVDescription.text = detailsOfMovie.description
    }

    override fun onClick(v: View?) {
        presenterMovie.getDetailsOfMoview()
    }
}