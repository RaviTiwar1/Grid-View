package com.example.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var  gridView: GridView
    var nameList = ArrayList<String>()
    var imageList = ArrayList<Int>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gridView = findViewById(R.id.gridView)

    fillArrays()

        val adapter = AnimalAdapter(this ,nameList,imageList)

        gridView.adapter = adapter

        gridView.setOnItemClickListener { adapterView, view, position, id ->

            Toast.makeText(applicationContext,"You Selected the ${nameList[position]}"
                ,Toast.LENGTH_SHORT).show()
        }
    }

    fun fillArrays(){

        nameList.add("Bird")
        nameList.add("Cat")
        nameList.add("Dog")
        nameList.add("Chicken")
        nameList.add("Monkey")
        nameList.add("Rabbit")
        nameList.add("Elephant")
        nameList.add("Lion")
        nameList.add("Tiger")
        nameList.add("Sheep")
        nameList.add("Fish")
        nameList.add("Bear")


        imageList.add(R.drawable.bird)
        imageList.add(R.drawable.cat)
        imageList.add(R.drawable.dog)
        imageList.add(R.drawable.chicken)
        imageList.add(R.drawable.monkey)
        imageList.add(R.drawable.rabbit)
        imageList.add(R.drawable.elephant)
        imageList.add(R.drawable.lion)
        imageList.add(R.drawable.tiger)
        imageList.add(R.drawable.sheep)
        imageList.add(R.drawable.fish)
        imageList.add(R.drawable.bear)


    }

}