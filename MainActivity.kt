package com.example.dice
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var count = 0;
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textview = findViewById<TextView>(R.id.count)
        val increase = findViewById<Button>(R.id.submit)
        val decrease = findViewById<Button>(R.id.decrease)
        increase.setOnClickListener{
            ++count
            textview.text = count.toString()
            var message = textview.text
            Toast.makeText(this,"Count increase $message",Toast.LENGTH_SHORT).show()
        }
        decrease.setOnClickListener{
            --count
            textview.text = count.toString()
            var message1 = textview.text
            Toast.makeText(this,"Count decrease $message1",Toast.LENGTH_SHORT).show()
        }
    }
}