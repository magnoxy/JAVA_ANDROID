package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DysplayActivity extends AppCompatActivity {

    private TextView textViewDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        textViewDisplay = findViewById(R.id.textViewDisplay);

        // Receber os dados da primeira Activity
        String supplier = getIntent().getStringExtra("supplier");
        String section = getIntent().getStringExtra("section");
        String price = getIntent().getStringExtra("price");
        String quantity = getIntent().getStringExtra("quantity");
        String date = getIntent().getStringExtra("date");

        // Exibir os dados na tela
        textViewDisplay.setText(
                "Supplier: " + supplier + "\n" +
                        "Section: " + section + "\n" +
                        "Price: " + price + "\n" +
                        "Quantity: " + quantity + "\n" +
                        "Date: " + date
        );
    }
}
