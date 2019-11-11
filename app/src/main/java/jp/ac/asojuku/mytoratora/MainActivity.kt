package jp.ac.asojuku.mytoratora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToraButton.setOnClickListener{ onJankenButtonTapped(it) }
        SBBAButton.setOnClickListener { onJankenButtonTapped(it) }
        katoukiyomasaButton.setOnClickListener { onJankenButtonTapped(it) }

    }

    fun onJankenButtonTapped(view: View?){
        val intent = Intent(this,Tora2Activity::class.java)
        intent.putExtra("P_HAND",view?.id)
        startActivity(intent)
    }



}
