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

        val btnSave =
            findViewById<Button>(R.id.btnSave)

        btnSave.setOnClickListener {

            if (
                edtItem.text.isEmpty() ||
                edtCategory.text.isEmpty() ||
                edtQuantity.text.isEmpty() ||
                edtComment.text.isEmpty()
            ) {

                Toast.makeText(
                    this,
                    "Fill in all fields",
                    Toast.LENGTH_SHORT
                ).show()

                return@setOnClickListener
            }

            GearData.itemNames.add(
                edtItem.text.toString()
            )

            GearData.categories.add(
                edtCategory.text.toString()
            )

            GearData.quantities.add(
                edtQuantity.text.toString().toInt()
            )

            GearData.comments.add(
                edtComment.text.toString()
            )

            Toast.makeText(
                this,
                "Gear Added",
                Toast.LENGTH_SHORT
            ).show()

            finish()
        }
    }
}
