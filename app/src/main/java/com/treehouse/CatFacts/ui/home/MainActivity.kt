package com.treehouse.CatFacts.ui.home

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.treehouse.CatFacts.App
import com.treehouse.CatFacts.model.ArrResponse
import com.treehouse.CatFacts.ui.home.di.DaggerHomeComponent
import com.treehouse.randomjoke.R
import com.treehouse.randomjoke.R.id.message
import com.treehouse.CatFacts.ui.home.di.HomeModule
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HomeContract.View {


    private val RanAdapter = RanAdapter()
    @Inject
    lateinit var homePresenter: HomeContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerHomeComponent.builder()
            .appComponent((application as App).getComponent())
            .homeModule(HomeModule(this))
            .build()
            .inject(this)

        //val homePresenter: HomeContract.Presenter = HomePresenter(popServices, this)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RanAdapter

        btnRandom.setOnClickListener{

            homePresenter.getRandomDetails(_id = String(),__v = String(),
                text = String(),updatedAt = String(),deleted = String(),source = String(),used = String())
            /*homePresenter.getRandomDetails(icon_url = String(),id = String(),
                url = String(),value = String())*/
        }
    }
    override fun showResults(result: List<ArrResponse>)
    {
        RanAdapter.setData(result)
    }


    @SuppressLint("ResourceType")
    override fun showError(massege: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }


}