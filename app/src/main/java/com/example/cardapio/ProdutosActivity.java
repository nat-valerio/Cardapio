package com.example.cardapio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.cardapio.modelos.Produto;

import java.util.ArrayList;

public class ProdutosActivity extends AppCompatActivity {

    private TextView textView;
    private ArrayList<Produto> produtos = new ArrayList<>();
    private LinearLayout linearLayout;
    private ImageView imageViewCategoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);

        Intent intent = getIntent();
        String titulo = intent.getStringExtra(MainActivity.TITULO);

        textView = findViewById(R.id.text_view_produto);

        linearLayout = findViewById(R.id.layout);
        imageViewCategoria = findViewById(R.id.image_view_categoria);

        criarProdutos(titulo);
        listarProdutos();
    }

    public void criarProdutos(String titulo) {
        if(titulo.equals("Hamburgueres")) {
            imageViewCategoria.setImageResource(R.drawable.hamburguer);
            produtos.add(new Produto(
                    "Hamburguer de Picanha",
                    32.90,
                    "Hamburguer",
                    "2 carnes de picanha, queijo cheddar, cebola crispy"));

            produtos.add(new Produto(
                    "Hamburguer de Lombo",
                    30.50,
                    "Hamburguer",
                    "2 carnes de Lombo, queijo, tomate e rúcula"));
        }

        else if(titulo.equals("Macarrão")) {
            imageViewCategoria.setImageResource(R.drawable.macarrao);
            produtos.add(new Produto(
                    "Macarrão",
                    25.50,
                    "Macarrão",
                    "Macarrão com molho de tomate e almôndegas"));

            produtos.add(new Produto(
                    "Carbonnara",
                    27.50,
                    "Macarrão",
                    "Macarrão com bacon, pimenta, cebola, queijo"));
        }

        else if (titulo.equals("Sorvete")) {
            imageViewCategoria.setImageResource(R.drawable.sorvete);
            produtos.add(new Produto(
                    "Sorvete de chocolate",
                    10.50,
                    "Sorvete",
                    "Sorvete de chocolate"));

            produtos.add(new Produto(
                    "Sorvete de Ferrero Rocher",
                    12.50,
                    "Sorvete",
                    "Sorvete de Ferrero Rocher"));

        }

        else if (titulo.equals("Suco")){
            imageViewCategoria.setImageResource(R.drawable.suco);
            produtos.add(new Produto(
                    "Suco de morango",
                    5.75,
                    "Suco",
                    "Suco de morango"));

            produtos.add(new Produto(
                    "Suco de maracujá",
                    4.95,
                    "Suco",
                    "Suco de maracujá"));
        }



    }

    public void listarProdutos()
    {

        for (int i=0; i<produtos.size(); i++) {

            Double preco = Double.parseDouble(textView.getText().toString().
                    replace(",", "."));

            TextView textViewNome = new TextView(this);
            TextView textViewPreco = new TextView (this);
            TextView textViewDescricao = new TextView(this);

            textViewNome.setText(produtos.get(i).getNome());
            textViewNome.setTextSize(18);

            textViewPreco.setText(produtos.get(i).getPreco().toString());

            textViewDescricao.setText(produtos.get(i).getDescricao().toString());

            linearLayout.addView(textViewNome);
            linearLayout.addView(textViewPreco);
            linearLayout.addView(textViewDescricao);
        }
    }

}
