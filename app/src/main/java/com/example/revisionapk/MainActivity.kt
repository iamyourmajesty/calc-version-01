package com.example.revisionapk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var str:String ?= null

        //method - 1
//        val btton = findViewById(R.id.button2) as Button
//        val x=findViewById(R.id.num1) as EditText
//        val y=findViewById(R.id.num2) as EditText
//        var opt=findViewById(R.id.op) as EditText
//        val result=findViewById(R.id.textView4) as TextView
//        btton.setOnClickListener{
//            var a:Int=0;var b:Int=0
//             a=x.text.toString().toInt()
//             b=y.text.toString().toInt()
//            var res:Int;
//
//           when(opt.text.toString()){
//               "+" -> {res=a+b}
//               "-" -> {res=a-b}
//               "*" -> {res=a*b}
//               "/" -> {res=a/b}
//               "%" -> {res=a%b}
//               else -> {res=a+b}
//
//           }
//

//  simply adding two numbers//           res=a+b;
//            result.text=res.toString()
//
//        }

        //method - 2

        op.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.radioButton) {
                Toast.makeText(
                    this,
                    radioButton.text.toString() + "  SELECTED",
                    Toast.LENGTH_SHORT
                ).show()
                str="+"
            }
            else if(checkedId == R.id.radioButton2)
            {
                Toast.makeText(this,radioButton2.text.toString() + "  SELECTED",Toast.LENGTH_SHORT).show()
                str="-"
            }
            else if(checkedId==R.id.radioButton3)
            {
                Toast.makeText(this,radioButton3.text.toString() + "  SELECTED",Toast.LENGTH_SHORT).show()
                str="*"
            }
            else if(checkedId == R.id.radioButton4)
            {
                Toast.makeText(this,radioButton4.text.toString() +"  SELECTED",Toast.LENGTH_SHORT).show()
                str="/"
            }
            else if(checkedId == R.id.radioButton5)
            {
                Toast.makeText(this,radioButton5.text.toString() + "  SELECTED",Toast.LENGTH_SHORT).show()
                str="%"
            }
        }


            button2.setOnClickListener{
                var a:Int
                var b:Int
                 if(TextUtils.isEmpty(num1.text.toString()) && TextUtils.isEmpty(num2.text.toString()))
            {
                Toast.makeText(this,"Enter the numbers first",Toast.LENGTH_SHORT).show()
            }
              else  if(TextUtils.isEmpty(num1.text.toString()))
                {
                    Toast.makeText(this,"Enter first number",Toast.LENGTH_SHORT).show()
                }
                else if(TextUtils.isEmpty(num2.text.toString()))
                {
                    Toast.makeText(this,"Enter second number",Toast.LENGTH_SHORT).show()
                }
                else
                {
                    a=num1.text.toString().toInt()
                    b = num2.text.toString().toInt()

                    var res=0
                    //
                    when(str){
                        "+" -> {res=a+b}
                        "-" -> {res=a-b}
                        "*" -> {res=a*b}
                        "/" -> {res=a/b}
                        "%" -> {res=a%b}
                        else -> {res=a+b}

                    }





                    textView4.text=res.toString()
                    Toast.makeText(this,"Output is " + textView4.text.toString(),Toast.LENGTH_SHORT).show()
                }

            }


    }
}