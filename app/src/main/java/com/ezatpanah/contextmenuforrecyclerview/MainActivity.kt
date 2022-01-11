package com.ezatpanah.contextmenuforrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ezatpanah.contextmenuforrecyclerview.databinding.ActivityMainBinding
import com.ezatpanah.recyclerviewanimations.SampleAdapter



class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private var nameList : MutableList<SampleModel> = mutableListOf()
    private lateinit var sampleAdapter: SampleAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        registerForContextMenu(binding.recyclerView)

        loadData()

        sampleAdapter= SampleAdapter(nameList)
        binding.apply {
            recyclerView.apply {
                layoutManager= LinearLayoutManager(this@MainActivity)
                adapter=sampleAdapter

            }
        }



    }



    private fun loadData(){
        nameList.add(SampleModel(1,"Sample Title"))
        nameList.add(SampleModel(2,"Sample Title"))
        nameList.add(SampleModel(3,"Sample Title"))
        nameList.add(SampleModel(4,"Sample Title"))
        nameList.add(SampleModel(5,"Sample Title"))
        nameList.add(SampleModel(6,"Sample Title"))
        nameList.add(SampleModel(7,"Sample Title"))
        nameList.add(SampleModel(8,"Sample Title"))
        nameList.add(SampleModel(9,"Sample Title"))
        nameList.add(SampleModel(10,"Sample Title"))
        nameList.add(SampleModel(11,"Sample Title"))
        nameList.add(SampleModel(12,"Sample Title"))
        nameList.add(SampleModel(13,"Sample Title"))
        nameList.add(SampleModel(14,"Sample Title"))
        nameList.add(SampleModel(15,"Sample Title"))
        nameList.add(SampleModel(16,"Sample Title"))
        nameList.add(SampleModel(17,"Sample Title"))
        nameList.add(SampleModel(18,"Sample Title"))
        nameList.add(SampleModel(19,"Sample Title"))
        nameList.add(SampleModel(20,"Sample Title"))
        nameList.add(SampleModel(21,"Sample Title"))
        nameList.add(SampleModel(22,"Sample Title"))
        nameList.add(SampleModel(23,"Sample Title"))
        nameList.add(SampleModel(24,"Sample Title"))
    }
}