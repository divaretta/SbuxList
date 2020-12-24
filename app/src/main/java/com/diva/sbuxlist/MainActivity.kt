package com.diva.sbuxlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val list = ArrayList<Sbux>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv_sbux.setHasFixedSize(true)
        list.addAll(getDataSbux())
        showRecyclerList()
        supportActionBar?.hide()
    }

    private fun showRecyclerList() {
        rv_sbux.layoutManager = LinearLayoutManager(this)
        val listSbuxAdapter = ListSbuxAdapter(list)
        rv_sbux.adapter = listSbuxAdapter

    }
    private fun getDataSbux() : ArrayList<Sbux>{
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.getStringArray(R.array.data_photo)
        val listSbux = ArrayList<Sbux>()
        for(position in dataName.indices){
            val sbux = Sbux (
                dataName[position],
                dataDescription[position],
                dataPhoto[position]
            )
            listSbux.add(sbux)
        }
        return listSbux
    }

}