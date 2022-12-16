package com.example.mygameapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Привязали ссылку text к id textDescription из xml файла
        text = findViewById(R.id.textDescription);
    }

    /**
     * Метод срабатывающий после нажатия кнопки
     * @param view View
     */
    public void showDescription(View view) {
        Log.i("info", "Была нажата кнопка НАЖМИ");
        text.setText("С Новым годом! Волшебства, \n" +
                "Смеха, счастья и тепла, \n" +
                "Мира, радостей, достатка \n" +
                "И во всех делах порядка!");
    }
}