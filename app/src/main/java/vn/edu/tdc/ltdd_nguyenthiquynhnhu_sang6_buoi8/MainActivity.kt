package vn.edu.tdc.ltdd_nguyenthiquynhnhu_sang6_buoi8

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btndonuong: Button
    private lateinit var btndouong: Button
    private lateinit var btncom: Button
    private lateinit var btndothem: Button
    private lateinit var btnlau: Button
    private lateinit var btntrangmieng: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.giaodienmenu)
        setControl()
        setEvent()
    }
    private fun setControl(){
        btndonuong = findViewById(R.id.btndonuong)
        btndouong = findViewById(R.id.btndouong)
        btncom  = findViewById(R.id.btncom)
        btndothem = findViewById(R.id.btndothem)
        btnlau = findViewById(R.id.btnlau)
        btntrangmieng = findViewById(R.id.btntrangmieng)
    }
    private fun setEvent(){
        btndonuong.setOnClickListener {
            val intent = Intent(this, main_menu_donuong::class.java)
            startActivity(intent)  // Thêm dòng này
        }
        btndouong.setOnClickListener {
            val intent = Intent(this, main_menu_douong::class.java)
            startActivity(intent)  // Thêm dòng này
        }
        btncom .setOnClickListener {
            val intent = Intent(this, main_menu_com::class.java)
            startActivity(intent)  // Thêm dòng này
        }
        btndothem .setOnClickListener {
            val intent = Intent(this, main_menu_dothem::class.java)
            startActivity(intent)  // Thêm dòng này
        }
        btnlau .setOnClickListener {
            val intent = Intent(this, main_menu_lau::class.java)
            startActivity(intent)  // Thêm dòng này
        }
        btntrangmieng .setOnClickListener {
            val intent = Intent(this, main_menu_trangmieng::class.java)
            startActivity(intent)  // Thêm dòng này
        }
    }
}