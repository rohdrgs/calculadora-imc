package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recuperar componentes EditText
        // Criar uma variavel e associar (=) o componente de UI <EditText>



        val edtPeso = findViewById<TextInputEditText>(R.id.edit_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)

        val btnCalcular = findViewById<Button>(R.id.btn_Calcular)



        btnCalcular.setOnClickListener {
            val peso = edtPeso.text
            val altura = edtAltura.text


            println("RODRIGO ASSUNÇÃO" + altura)
        }


        }








}