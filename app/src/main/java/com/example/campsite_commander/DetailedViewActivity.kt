package com.example.campsite_commander

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailedViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(
            R.layout.activity_detailed_view
        )

        val txtDetails =
            findViewById<TextView>(R.id.txtDetails)

        val btnBack =
            findViewById<Button>(R.id.btnBack)

        var output = ""

        for (i in GearData.itemNames.indices) {

            output +=
                "Item: ${GearData.itemNames[i]}\n" +
                        "Category: ${GearData.categories[i]}\n" +
                        "Quantity: ${GearData.quantities[i]}\n" +
                        "Comment: ${GearData.comments[i]}\n\n"
        }

        txtDetails.text = output

        btnBack.setOnClickListener {
            finish()
        }
    }
}