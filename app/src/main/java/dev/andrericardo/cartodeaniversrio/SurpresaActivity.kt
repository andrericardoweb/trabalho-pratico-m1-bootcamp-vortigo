package dev.andrericardo.cartodeaniversrio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SurpresaActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "IGTILog"
        private const val ACTIVITY = "SurpresaActivity::"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_surpresa)
        Log.i(TAG, "${ACTIVITY}onCreate")

        acaoBotaoVoltar()
    }

    private fun acaoBotaoVoltar() {
        val button = findViewById<Button>(R.id.btnBack)
        button.setOnClickListener {
            finish()
        }
    }


    override fun onResume() {
        super.onResume()
        Log.i(TAG, "${ACTIVITY}onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "${ACTIVITY}onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "${ACTIVITY}onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "${ACTIVITY}onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "${ACTIVITY}onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "${ACTIVITY}onDestroy")
    }
}