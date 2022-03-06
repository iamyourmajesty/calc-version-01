package com.example.revisionapk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btton = findViewById(R.id.button2) as Button
        val x=findViewById(R.id.num1) as EditText
        val y=findViewById(R.id.num2) as EditText
        var opt=findViewById(R.id.op) as EditText
        val result=findViewById(R.id.textView4) as TextView
        btton.setOnClickListener{
            var a:Int=0;var b:Int=0
             a=x.text.toString().toInt()
             b=y.text.toString().toInt()
            var res:Int;

           when(opt.text.toString()){
               "+" -> {res=a+b}
               "-" -> {res=a-b}
               "*" -> {res=a*b}
               "/" -> {res=a/b}
               "%" -> {res=a%b}
               else -> {res=a+b}

           }






//           res=a+b;
            result.text=res.toString()

        }
    }
}