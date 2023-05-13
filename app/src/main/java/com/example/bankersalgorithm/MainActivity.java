package com.example.bankersalgorithm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText1 = findViewById(R.id.alpha);
        EditText editText2 = findViewById(R.id.process);
        Button button = findViewById(R.id.butt);

        button.setOnClickListener(View -> {

            String value1 = editText1.getText().toString();
            String value2 = editText2.getText().toString();
            Intent in = new Intent(this, MainActivity2.class);
            Bundle bundle = new Bundle();
            bundle.putString("col", value1);
            bundle.putString("row", value2);
            in.putExtras(bundle);
            startActivity(in);
            finish();;
        });
    }
}