package com.example.thomaslleonhano.rolardados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public TextView textViewResultado;
    private ImageView imageViewCategoria;
    private ImageView imageViewCategoria2;
    int somaDado1;
    int somaDado2;

    int resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResultado = findViewById(R.id.textViewResultado);
        imageViewCategoria = findViewById(R.id.imageViewDados);
        imageViewCategoria2 = findViewById(R.id.imageViewDado2);

    }
    public void gerar(View v){
        Random rand = new Random();
        int number = rand.nextInt(6) + 1;

        gerar2(v);
        somaDado1 = number;
        resultadoSoma(v);


        if (number == 1){imageViewCategoria.setImageResource(R.drawable.dado1);}
        else if (number == 2){imageViewCategoria.setImageResource(R.drawable.dado2);}
        else if (number == 3){imageViewCategoria.setImageResource(R.drawable.dado3);}
        else if (number == 4){imageViewCategoria.setImageResource(R.drawable.dado4);}
        else if (number == 5){imageViewCategoria.setImageResource(R.drawable.dado5);}
        else if (number == 6){imageViewCategoria.setImageResource(R.drawable.dado6);}
    }
    public void gerar2(View v){
        Random rand = new Random();
        int number = rand.nextInt(6) + 1;
        somaDado2 = number;


        if (number == 1){imageViewCategoria2.setImageResource(R.drawable.dado1);}
        else if (number == 2){imageViewCategoria2.setImageResource(R.drawable.dado2);}
        else if (number == 3){imageViewCategoria2.setImageResource(R.drawable.dado3);}
        else if (number == 4){imageViewCategoria2.setImageResource(R.drawable.dado4);}
        else if (number == 5){imageViewCategoria2.setImageResource(R.drawable.dado5);}
        else if (number == 6){imageViewCategoria2.setImageResource(R.drawable.dado6);}
    }
    public  void resultadoSoma(View v){

        resultado = somaDado1 + somaDado2;
        textViewResultado.setText(Integer.toString(resultado));
    }
}
