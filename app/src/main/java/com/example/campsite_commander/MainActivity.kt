//ST10517736 MULENGA NOAM KABEKE

package com.example.campsite_commander

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var txtTotal: TextView
    private lateinit var btnAdd: Button
    private lateinit var btnView: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        txtTotal = findViewById(R.id.txtTotal)
        btnAdd = findViewById(R.id.btnAddGear)
        btnView = findViewById(R.id.btnViewChecklist)

        calculateTotal()

        btnAdd.setOnClickListener {

            startActivity(
                Intent(this, AddGearActivity::class.java)
            )
        }

        btnView.setOnClickListener {

            startActivity(
                Intent(this, DetailedViewActivity::class.java)
            )
        }
    }

    override fun onResume() {
        super.onResume()
        calculateTotal()
    }
    //calculate total items packed

    private fun calculateTotal() {

        var total = 0

        for (i in GearData.quantities.indices) {
            total += GearData.quantities[i]
        }

        txtTotal.text =
            "Total Items Packed: $total"
    }
}