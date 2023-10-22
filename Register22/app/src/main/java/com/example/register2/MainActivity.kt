package com.example.register2

import android.app.ProgressDialog.show
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.register2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnRegister.setOnClickListener {
            if (!CheckOK()){
                val toast2 = Toast.makeText(this, "You have not filled in enough information", Toast.LENGTH_SHORT)
                toast2.show()

            }
        }

    }
    fun CheckOK() : Boolean{
        val firstName = binding.firstnameEdit.text.isNotEmpty()
        val lastName = binding.lastnameEdit.text.isNotEmpty()
        val maleCheck = binding.maleOption.isChecked
        val femaleCheck = binding.femaleOption.isChecked
        val birthdayCheck = binding.birthdayEdit.text.isNotEmpty()
        val addressCheck = binding.addressEdit.text.isNotEmpty()
        val emailCheck = binding.emailEdit.text.isNotEmpty()
        val boxCheck = binding.checkbox.isChecked
        var generCheck = maleCheck|| femaleCheck
        return firstName&&lastName&&generCheck&&birthdayCheck&&addressCheck&&emailCheck&&boxCheck




    }
}