package ca.bart.mobile.guipicard.demoempty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import ca.bart.mobile.guipicard.demoempty.databinding.ActivityMainBinding
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG = "MainActivity"


    }
//    val button : Button? by lazy { findViewById(R.id.hello) }
//    val helloworld: TextView? by lazy { findViewById(R.id.hello) }
    val binding: ActivityMainBinding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(TAG, "onCreate($savedInstanceState)")


        setContentView(binding.root)

        setContentView(R.layout.activity_main)

        binding.button?.setOnClickListener {
            Log.d(TAG, "Pressed")
            binding.button?.text = "I was pressed <3"
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy()")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putString("buttonText", binding.button.text.toString())
    }


    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        savedInstanceState.getString("buttonText")?.let {
            binding.button.text = it
        }


    }

}