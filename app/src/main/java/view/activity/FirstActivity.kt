package view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.carservice.R

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val button_login=findViewById<Button>(R.id.button_Login)

        button_login.setOnClickListener {
            val i=Intent(this,  VerifyActivity::class.java)
            startActivity(i)
            finish()
        }
    }
}