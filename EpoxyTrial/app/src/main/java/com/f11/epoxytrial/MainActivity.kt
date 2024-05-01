package com.f11.epoxytrial

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.f11.epoxytrial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
   /* private val controller = MyController(){
        Toast.makeText(this, "Image 1 clicked", Toast.LENGTH_SHORT).show()
    }*/

    private val compositeController = CompositeController()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Setup RecyclerView
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = compositeController.adapter
        }

        // Sample data
        /*val items = mutableListOf(
            SimpleItem("Simple Item 1"),
            SimpleItem("Simple Item 2"),
            ComplexItem("Text for View 1", "Text for View 2", "Text for View 3", "Text for View 4", androidx.core.R.drawable.ic_call_answer, com.google.android.material.R.drawable.ic_arrow_back_black_24),
            SimpleItem("Simple Item 3"),
            ComplexItem2("ComplexItem2 Text 1", "ComplexItem2 Text 2", "ComplexItem2 Text 3", "ComplexItem2 Text 4",
                com.google.android.material.R.drawable.ic_m3_chip_check,
                com.airbnb.viewmodeladapter.R.drawable.ic_mtrl_chip_checked_black,
                showText1 = true, showText3 = false
            ),
            ComplexItem2("ComplexItem2 Text 2", "ComplexItem2 Text 3", "ComplexItem2 Text 4", "ComplexItem2 Text 5",
                com.google.android.material.R.drawable.ic_m3_chip_check,
                com.airbnb.viewmodeladapter.R.drawable.ic_mtrl_chip_checked_black,
                showText1 = true, showText3 = true
            )

        )*/

        val items = listOf(
            CompositeItem(id = 1, type = 0, text = "Item 1 Text"),
            CompositeItem(id = 2, type = 1, text = "Item 2 Text", imageRes = com.google.android.material.R.drawable.ic_m3_chip_check),
            CompositeItem(id = 3, type = 2, text = "Item 3 Text", imageRes = androidx.core.R.drawable.ic_call_answer)
        )

        // Pass the data to the controller
        compositeController.setData(items)
    }
}

