package com.evdokimov.dobropomosh.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.evdokimov.dobropomosh.R

class MainActivity : AppCompatActivity() {

    private lateinit var vm: MainViewModal

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val retrofit = Retrofit.Builder().baseUrl("https://api.openweathermap.org/data/2.5/")
//            .addConverterFactory(GsonConverterFactory.create()).build()
//        val productApi = retrofit.create(IProductApi::class.java)
//        val btn = findViewById<Button>(R.id.getWeather)
//        btn.setOnClickListener {
//            CoroutineScope(Dispatchers.IO).launch {
//                try {
////                    var product = productApi.getProduct(30.0, 60.0)
////                    Log.d("CoroutineScope", product.main.toString())
//                }
//                catch(e: Exception){
//                    Log.d("CoroutineScope", e.message.toString())
//                }
//                runOnUiThread {
//
//                }
//            }
//        }

//        vm = ViewModelProvider(this, MainViewModalFactory(applicationContext)).get(MainViewModal::class.java)
        val textView = findViewById<TextView>(R.id.dataTextView)

//        vm.resultLive.observe(this) {
//            textView.text = it
//        }
//
//        findViewById<Button>(R.id.sendBtn).setOnClickListener {
//            val editText = findViewById<EditText>(R.id.editTextView).text.toString()
//            vm.save(editText)
//        }
//
//        findViewById<Button>(R.id.receiveBtn).setOnClickListener {
//            vm.load()
//        }
    }
}