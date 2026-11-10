package com.example.lamquen_2415141122111

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.lamquen_2415141122111.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnKiemTra.setOnClickListener {
            thucHienKiemTra()
        }

        binding.btnXoa.setOnClickListener {
            thucHienXoa()
        }
    }

    private fun thucHienKiemTra() {
        val ten = binding.edtTen.text.toString().trim()
        val soLuongStr = binding.edtSoLuong.text.toString().trim()
        binding.tvKetQua.text = ""

        if (ten.isEmpty()) {
            Toast.makeText(this, "Lỗi: Tên không được để rỗng!", Toast.LENGTH_SHORT).show()
            return
        }

        val soLuong = soLuongStr.toIntOrNull()
        if (soLuong == null || soLuong !in 1..9) {
            Toast.makeText(this, "Lỗi: Số lượng phải là số nguyên từ 1 đến 9!", Toast.LENGTH_SHORT).show()
            return
        }
        binding.tvKetQua.text = "Xin chào $ten, số lượng: $soLuong"
    }

    private fun thucHienXoa() {
        binding.edtTen.setText("")
        binding.edtSoLuong.setText("")
        binding.tvKetQua.text = ""
    }
}