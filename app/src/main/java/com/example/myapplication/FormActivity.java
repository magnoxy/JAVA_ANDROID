package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

public class FormActivity extends AppCompatActivity {

    private Spinner spinnerSupplier;
    private RadioGroup radioGroupSection;
    private EditText editTextPrice;
    private EditText editTextQuantity;
    private EditText editTextDate;
    private Button buttonSave;
    private Button buttonClose;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        spinnerSupplier = findViewById(R.id.spinnerSupplier);
        radioGroupSection = findViewById(R.id.radioGroupSection);
        editTextPrice = findViewById(R.id.editTextPrice);
        editTextQuantity = findViewById(R.id.editTextQuantity);
        editTextDate = findViewById(R.id.editTextDate);
        buttonSave = findViewById(R.id.buttonSave);
        buttonClose = findViewById(R.id.buttonClose);

        String[] suppliers = {"Supplier 1", "Supplier 2", "Supplier 3"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, suppliers);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSupplier.setAdapter(adapter);

        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(FormActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedSupplier = spinnerSupplier.getSelectedItem().toString();
                int selectedRadioButtonId = radioGroupSection.getCheckedRadioButtonId();
                RadioButton selectedRadioButton = findViewById(selectedRadioButtonId);
                String selectedSection = selectedRadioButton.getText().toString();
                String price = editTextPrice.getText().toString();
                String quantity = editTextQuantity.getText().toString();
                String date = editTextDate.getText().toString();

                Intent intent = new Intent(FormActivity.this, DysplayActivity.class);
                intent.putExtra("supplier", selectedSupplier);
                intent.putExtra("section", selectedSection);
                intent.putExtra("price", price);
                intent.putExtra("quantity", quantity);
                intent.putExtra("date", date);
                startActivity(intent);
            }
        });
    }
}
