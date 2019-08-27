package com.example.cardapio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TITULO = "br.example.cardapio.TITULO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirHamburguer(View v) {
        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra (TITULO, "Hamburgueres");
        startActivity(intent);
    }

    public void abrirMacarrao(View v) {
        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra(TITULO, "Macarrão");
        startActivity(intent);
    }

    public void abrirSorvete(View v) {
        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra(TITULO, "Sorvete");
        startActivity(intent);
    }

    public void abrirSuco(View v) {
        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra(TITULO, "Suco");
        startActivity(intent);
    }
}
