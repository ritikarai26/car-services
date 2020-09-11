package view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import androidx.appcompat.app.AppCompatDelegate
import com.example.carservice.R

class SplashhActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_splashh)
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
        Handler().postDelayed({
            val intent = Intent(this, FirstActivity::class.java)

            startActivity(intent)
            finish()
        } ,3000)
    }
}