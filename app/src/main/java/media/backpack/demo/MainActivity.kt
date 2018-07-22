package media.backpack.demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var count = 0
    private var countlbl: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countlbl = findViewById(R.id.countLbl)
        //If you don't set the label from xml
        //countlbl!!.text = "count: 0"
    }

    fun BtnClick(v:View){
        count++
        countlbl!!.text = "count: $count"
    }
}
