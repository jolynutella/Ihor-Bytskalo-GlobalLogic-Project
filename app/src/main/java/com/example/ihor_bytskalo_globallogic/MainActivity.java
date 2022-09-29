package com.example.ihor_bytskalo_globallogic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText input; // Переменная, куда будет сохраняться введеный текст из editText

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main); // Передача разметки activity_main

        input = findViewById(R.id.enterText); // Получение id editText и введенного текста

        Button click = findViewById(R.id.button2); // Получение id кнопки

        // Слушаем кнопку и при ее нажатии выводим Toast с текстом из editText
        click.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(), input.getText().toString(), Toast.LENGTH_SHORT)
                    .show();
            Log.v("Log", input.getText().toString()); // Выводим введенный текст в Logcat
        });
    }
}