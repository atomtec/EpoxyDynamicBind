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
    private val controller = CombinedController()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Setup RecyclerView
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = controller.adapter
        }

        val sampleData = generateSampleData()
        controller.setData(sampleData)
    }

    private fun generateSampleData(): List<CombinedItem> {
        return listOf(
            CombinedItem(
                id = 1,
                topText1 = "Top Text 1",
                topText2 = "Top Text 2",
                topImageRes = android.R.drawable.ic_menu_camera,
                type = 0,
                middleImageRes = android.R.drawable.ic_menu_gallery,
                bottomIcon1 = android.R.drawable.ic_menu_call,
                bottomIcon2 = android.R.drawable.ic_menu_compass,
                bottomIcon3 = android.R.drawable.ic_menu_agenda,
                bottomIcon4 = android.R.drawable.ic_menu_manage
            ),
            CombinedItem(
                id = 2,
                topText1 = "Top Text 1",
                topText2 = "Top Text 2",
                topImageRes = android.R.drawable.ic_menu_camera,
                type = 1,
                middleText1 = "Middle Text 1",
                middleText2 = "Middle Text 2",
                bottomIcon1 = android.R.drawable.ic_menu_call,
                bottomIcon2 = android.R.drawable.ic_menu_compass,
                bottomIcon3 = android.R.drawable.ic_menu_agenda,
                bottomIcon4 = android.R.drawable.ic_menu_manage
            ),
            CombinedItem(
                id = 3,
                topText1 = "Top Text 1",
                topText2 = "Top Text 2",
                topImageRes = android.R.drawable.ic_menu_camera,
                type = 2,
                middleText1 = "Middle Text 1",
                middleImageRes = android.R.drawable.ic_menu_gallery,
                bottomIcon1 = android.R.drawable.ic_menu_call,
                bottomIcon2 = android.R.drawable.ic_menu_compass,
                bottomIcon3 = android.R.drawable.ic_menu_agenda,
                bottomIcon4 = android.R.drawable.ic_menu_manage
            )
        )
    }

}

