package com.example.campsite_commander

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AddGearActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_gear)

        val edtItem = findViewById<EditText>(R.id.edtItem)
        val edtCategory = findViewById<EditText>(R.id.edtCategory)
        val edtQuantity = findViewById<EditText>(R.id.edtQuantity)
        val edtComment = findViewById<EditText>(R.id.edtComment)
        val btnSave = findViewById<Button>(R.id.btnSave)

        btnSave.setOnClickListener {
            val itemName = edtItem.text.toString()
            val category = edtCategory.text.toString()
            val quantityStr = edtQuantity.text.toString()
            val comment = edtComment.text.toString()

            if (itemName.isEmpty() || category.isEmpty() || quantityStr.isEmpty() || comment.isEmpty()) {
                Toast.makeText(this, getString(R.string.fill_fields), Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val quantity = quantityStr.toIntOrNull()
            if (quantity == null) {
                Toast.makeText(this, getString(R.string.invalid_quantity), Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            GearData.itemNames.add(itemName)
            GearData.categories.add(category)
            GearData.quantities.add(quantity)
            GearData.comments.add(comment)

            Toast.makeText(this, getString(R.string.gear_added), Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
