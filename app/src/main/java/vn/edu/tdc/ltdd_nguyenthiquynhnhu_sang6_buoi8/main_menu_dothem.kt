package vn.edu.tdc.ltdd_nguyenthiquynhnhu_sang6_buoi8

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class main_menu_dothem : AppCompatActivity() {
    private lateinit var btnback : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.menudothem)
        setControl()
        setEvent()
    }
    private fun setControl(){
        btnback = findViewById(R.id.btnback)
    }
    private fun setEvent(){
        btnback.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()  // Để tránh việc quay lại trang này khi bấm back
        }

    }
}