package jp.techacademy.taro.kirameki.aisatsuapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.app.TimePickerDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        showTimePickerDialog()
    }
    private fun showTimePickerDialog(){
        val timePickerDialog = TimePickerDialog(this,TimePickerDialog.OnTimeSetListener{
            view, hour,minute ->
            when(hour){
                2, 3, 4, 5, 6, 7, 8, 9 -> Log.d("UI_PARTS","おはよう")
                10,11,12,13,14,15,16,17 -> Log.d("UT_PARTS","こんにちは")
                else -> Log.d("UT_PARTS","こんばんは")
            }
        },13,0,true)
        timePickerDialog.show()



    }
}
