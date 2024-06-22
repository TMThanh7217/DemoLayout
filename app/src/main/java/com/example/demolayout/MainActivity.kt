package com.example.demolayout

import android.os.Bundle
import android.widget.GridView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class MainActivity : ComponentActivity() {

    // for grid view layout only
    private lateinit var gridViewDemo: GridView
    // end

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        // setContentView(R.layout.frame_layout_demo)
        //setContentView(R.layout.frame_layout_demo)
        //setContentView(R.layout.absolute_layout_demo)
        setContentView(R.layout.grid_view_layout)
        gridViewDemo = findViewById(R.id.gridViewDemo)
        val cardItemArrayList: ArrayList<CardItem?> = ArrayList<CardItem?>()

        cardItemArrayList.add(CardItem("DSA", R.drawable.ic_launcher_background))
        cardItemArrayList.add(CardItem("JAVA", R.drawable.ic_launcher_background))
        cardItemArrayList.add(CardItem("C++", R.drawable.ic_launcher_background))
        cardItemArrayList.add(CardItem("ad", R.drawable.ic_launcher_background))
        cardItemArrayList.add(CardItem("s212", R.drawable.ic_launcher_background))
        cardItemArrayList.add(CardItem("cc", R.drawable.ic_launcher_background))
        cardItemArrayList.add(CardItem("zz", R.drawable.ic_launcher_background))
        cardItemArrayList.add(CardItem("C--", R.drawable.ic_launcher_background))

        val adapter = GridViewLayoutAdapter(this, cardItemArrayList)
        gridViewDemo.adapter = adapter
        //setContentView(R.layout.linear_layout_demo)
        //setContentView(R.layout.relative_layout_demo)

    }
}

