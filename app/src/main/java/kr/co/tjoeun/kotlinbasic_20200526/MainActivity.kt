package kr.co.tjoeun.kotlinbasic_20200526

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        okBtn.setOnClickListener {

//            var num = 10
//            num = 20.5

//            var num = 10
//            num = 20
//
//            var num2 = 10
//            num2 = 50

            val inputContent = contentEdt.text.toString()

            resultTxt.text = inputContent

        }

    }
}
