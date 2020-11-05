package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button2)

        spinnerSetup()
        spinner2Setup("Mercedes")
        button.setOnClickListener { //textView.setText(editText.getText().toString());
            ispisi()
        }
    }

    fun ispisi() {
        val spinner2 = findViewById<Spinner>(R.id.spinner2)
        val message = spinner2.selectedItem.toString()
        val intent = Intent(this@MainActivity, MainActivity2::class.java)
        intent.putExtra("message", message)
        startActivity(intent)
    }


    fun spinnerSetup(){
        val spinner = findViewById<Spinner>(R.id.spinner)
        val adapter = ArrayAdapter.createFromResource(this, R.array.cars, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent:AdapterView<*>, view: View, position:Int, id:Long) {
                val selectedItem = parent.getItemAtPosition(position).toString()
                spinner2Setup(selectedItem)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }

    fun spinner2Setup(type:String){
        val spinner = findViewById<Spinner>(R.id.spinner2)
        var adapter = ArrayAdapter.createFromResource(this, R.array.cars, android.R.layout.simple_spinner_item)

        when (type) {
            "Mercedes" -> {
                adapter = ArrayAdapter.createFromResource(this, R.array.mercedes, android.R.layout.simple_spinner_item)
            }
            "BMW" -> {
                adapter = ArrayAdapter.createFromResource(this, R.array.BMW, android.R.layout.simple_spinner_item)
            }
            "Audi" -> {
                adapter = ArrayAdapter.createFromResource(this, R.array.audi, android.R.layout.simple_spinner_item)
            }
        }

        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        spinner.adapter = adapter
    }
}