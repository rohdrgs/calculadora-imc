package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.widget.Button
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import com.google.android.material.snackbar.Snackbar
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

            val pesoStr: String = edtPeso.text.toString()
            val alturaStr: String = edtAltura.text.toString()

            if (pesoStr == "" || alturaStr == "") {
                // Mostrar mensagem para usuário

             Snackbar
                 .make(
                     edtPeso,
                     " Preencha todos os dados",
                     Snackbar.LENGTH_LONG

             )
                 .show()



            } else {


                val peso = pesoStr.toFloat()
                val altura = alturaStr.toFloat()

                val alturaQ2 = altura * altura
                val resultado = peso / alturaQ2


                val intent = Intent (this, ResultActivity::class.java )
                intent.putExtra( KEY_RESULT_IMC, resultado)
                startActivity(intent)


                println("RODRIGO ASSUNÇÃO" + resultado)
            }
        }


        }








}