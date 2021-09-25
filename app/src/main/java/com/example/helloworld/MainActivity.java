package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hitung(View v){
        // Define variable for component
        EditText eTextBilangan1 = findViewById(R.id.bilangan1);
        EditText eTextBilangan2 = findViewById(R.id.bilangan2);
        EditText eTextHasil     = findViewById(R.id.hasil);

        // Get value from edittext
        double bilangan1 = Double.parseDouble(String.valueOf(eTextBilangan1.getText()));
        double bilangan2 = Double.parseDouble(String.valueOf(eTextBilangan2.getText()));

        // Counting and Show result to edittext result
        if(v.getId() == R.id.btn_tambah){
            double hasil = bilangan1 + bilangan2;
            eTextHasil.setText(""+hasil);
        }else if(v.getId() == R.id.btn_kurang){
            double hasil = bilangan1 - bilangan2;
            eTextHasil.setText(""+hasil);
        }else if(v.getId() == R.id.btn_kali){
            double hasil = bilangan1 * bilangan2;
            eTextHasil.setText(""+hasil);
        }else{
            double hasil = bilangan1 / bilangan2;
            eTextHasil.setText(""+hasil);
        }
    }
}