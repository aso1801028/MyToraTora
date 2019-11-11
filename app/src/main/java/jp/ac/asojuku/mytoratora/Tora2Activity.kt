package jp.ac.asojuku.mytoratora

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_tora2.*

class Tora2Activity : AppCompatActivity() {

    val tora =0
    val SBBA = 1
    val katoukiyomasa = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tora2)
        val id = intent.getIntExtra("P_HAND",0)

        val myHand:Int


        myHand = when(id){
            R.id.ToraButton -> {
                PHand.setImageResource(R.drawable.tora)
            tora}
            R.id.katoukiyomasaButton -> {
                PHand.setImageResource(R.drawable.katoukiyomasa)
                katoukiyomasa
            }
            R.id.SBBAButton -> {
                PHand.setImageResource(R.drawable.bba)
                SBBA
            }
            else -> tora
        }

        val comHand = (Math.random() *3).toInt()

        when(comHand){
            tora -> comHandImage.setImageResource(R.drawable.ctora)
            SBBA -> comHandImage.setImageResource(R.drawable.cbba)
            katoukiyomasa -> comHandImage.setImageResource(R.drawable.ckatou)
        }

        val gameResult = (comHand - myHand + 3) %3

        when(gameResult){
            /*0 -> Resulttxt.setText(R.string.result_drow)
            1 -> Resulttxt.setText(R.string.result_lose)
            2 -> Resulttxt.setText(R.string.result_win)*/
            //val CA = findViewById()<ImageView>(R.id.imageView)
            //勝敗及びここで画像を切り替える
            //一緒にまとめると上にあるのが優先されて動かないので別々にする
            0 -> CA.setImageResource(R.drawable.cdrow)
            1 -> CA.setImageResource(R.drawable.comlose)
            2 -> CA.setImageResource(R.drawable.comwin)
        }

        //文字用に切り分けたもの
        when(gameResult){
            0 -> Resulttxt.setText(R.string.result_drow)
            1 -> Resulttxt.setText(R.string.result_lose)
            2 -> Resulttxt.setText(R.string.result_win)
        }

    }


}
