package com.example.recyclerview

import android.graphics.drawable.Icon
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var myList: ArrayList<IconDataClass>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myList = ArrayList<IconDataClass>()

        for (i in 0 until 500) {
            myList.add(IconDataClass(R.drawable.ic_battery, "Battery"))
            myList.add(IconDataClass(R.drawable.ic_cake, "Cake"))
            myList.add(IconDataClass(R.drawable.ic_camera, "Camera"))
            myList.add(IconDataClass(R.drawable.ic_drive, "Drive"))
            myList.add(IconDataClass(R.drawable.ic_face, "Face") )
        }

        recycler_view.adapter = IconAdapter(myList)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)

    }
}
