package net.pilsfree.vibrator

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import android.view.MotionEvent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var vibrator: Vibrator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator

        obrazovka.setOnTouchListener { v, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> vibrator.vibrate(1000000L)
                MotionEvent.ACTION_UP -> vibrator.cancel()
            }
            return@setOnTouchListener true
        }
    }
}
