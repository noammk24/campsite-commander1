package com.example.campsite_commander

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailedViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view)

        val txtDetails = findViewById<TextView>(R.id.txtDetails)
        val btnBack = findViewById<Button>(R.id.btnBack)

        val output = StringBuilder()

        for (i in GearData.itemNames.indices) {
            output.append(getString(R.string.detail_item, GearData.itemNames[i])).append("\n")
                .append(getString(R.string.detail_category, GearData.categories[i])).append("\n")
                .append(getString(R.string.detail_quantity, GearData.quantities[i])).append("\n")
                .append(getString(R.string.detail_comment, GearData.comments[i])).append("\n\n")
        }

        txtDetails.text = output.toString()

        btnBack.setOnClickListener {
            finish()
        }
    }
}
