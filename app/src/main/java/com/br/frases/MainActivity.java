package com.br.frases;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Função responsável por gerar a frase
    public void gerarNovaFrase(View view){

        // Armazenando as frases que podem ser geradas
        String[] frases = {
                "Vida longa e próspera(Sr. Spock - StarTrek)", // Posição 0
                "Eu tenho a força!(He-man)", // Posição 01
                "Que a Força esteja com você!(StarWars)", // Posição 02
                "Você não passará!(Gandalf)", // Posição 03
                "Ao infinito, e além!(BuzzLightyear)", // Posição 04
                "Com grandes poderes, vem grandes responsabilidades!(Tio Ben - Spiderman)", // Posição 05
                "Meu Precioso!(Smeagol)", // Posição 06
                "Bazinga!(Shedon Cooper - The Big Bang Theory)", // Posição 07
                "Que é que há, velhinho?(Pernalonga)" // Posição 08
        };

        // VAR responsável por gerar os valores aleatórios
        // que serão utilizados para indicar a posição no vetor frases(acima)
        int numero = new Random().nextInt(9);

        // Mostrando a frase com base na posição sorteada
        TextView frase = findViewById(R.id.txtFraseGerada);
        frase.setText(frases[numero]);

    } // Fechamento da função GerarNovaFrase




}