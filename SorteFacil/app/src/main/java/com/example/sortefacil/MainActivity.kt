package com.example.sortefacil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.sortefacil.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.button.setOnClickListener {
            // Criando a lógica para sortear os números
            // Criando Collection Set
            val numeros: MutableSet<Int> = mutableSetOf()

            // Adicionando numero random no Set numeros
            for (i in 0..5) {

                // Todo pensar em melhorar a lógica para não rodar o random dentro do for
                val random = (1..60).random()

                if (numeros.contains(random)) {
                    var num = (1..60).random()
                    numeros.add(num)
                } else {
                    numeros.add(random)
                }
            }

            // Imprimindo uma posição da lista em ordem crescente
            val num1 = numeros.sorted().toList()[0]
            val num2 = numeros.sorted().toList()[1]
            val num3 = numeros.sorted().toList()[2]
            val num4 = numeros.sorted().toList()[3]
            val num5 = numeros.sorted().toList()[4]
            val num6 = numeros.sorted().toList()[5]

            // Exibindo números sorteados

            // Encontrando textView no layout e armazenando a TextView na val resultTextView
            val resultTextView1 = binding.textView1
            val resultTextView2 = binding.textView2
            val resultTextView3 = binding.textView3
            val resultTextView4 = binding.textView4
            val resultTextView5 = binding.textView5
            val resultTextView6 = binding.textView6

            // Definindo o texto em resultTextView como sendo um número sorteado
            resultTextView1.text = num1.toString()
            resultTextView2.text = num2.toString()
            resultTextView3.text = num3.toString()
            resultTextView4.text = num4.toString()
            resultTextView5.text = num5.toString()
            resultTextView6.text = num6.toString()
        }

        setContentView(binding.root)
    }
}