package com.example.caraoucoroa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_resultado.*
import kotlin.random.Random

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
    }

    var qCara = 0;
    var qCoroa = 0;
    fun sortearMoeda(view: View) {
        image1.visibility=View.VISIBLE
        image2.visibility=View.VISIBLE
        image3.visibility=View.VISIBLE
        val sort1 = rand()
        val sort2 = rand()
        val sort3 = rand()
        if (sort1 == 0) {
            image1.setImageResource(R.drawable.cara)
            qCara++
        }
        else{
            image1.setImageResource(R.drawable.coroa)
            qCoroa++
        }
        if (sort2 == 0) {
            image2.setImageResource(R.drawable.cara)
            qCara++
        }
        else{
            image2.setImageResource(R.drawable.coroa)
            qCoroa++
        }
        if (sort3 == 0) {
            image3.setImageResource(R.drawable.cara)
            qCara++
        }
        else{
            image3.setImageResource(R.drawable.coroa)
            qCoroa++
        }
        qtdCara.setText("Quantidade Cara: " + qCara)
        qtdCoroa.setText("Quantidade Coroa: " + qCoroa)
    }

    fun rand(): Int {
        val numero = Random.nextInt(2)
        return numero
    }
}
