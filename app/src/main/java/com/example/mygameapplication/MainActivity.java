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

    private Spinner spinner;
    private TextView text;
    private ImageView image;

    /**
     * Это callback метод при создании Activity
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Наша View подключается
        setContentView(R.layout.activity_main);

        // Добавили выпадающий список и текстовое поле
        spinner = findViewById(R.id.spinnerGame);
        text = findViewById(R.id.textView);
        image = findViewById(R.id.imageView);
    }

    /**
     * Метод, который вызывается при нажатии на кнопку CHOOSE
     * @param view
     */
    public void showDescription(View view) {
        Log.i("info", "click Button showDescription: ");
        int position = spinner.getSelectedItemPosition();

        text.setText(getDescriptionByPosition(position));
        image.setImageResource(getImageByPosition(position));

        // Добавить яблоко
      //  image.setImageResource(R.drawable.swipe);
    }

    /**
     * Метод, выдающий описание по позиции
     * @param pos позиция
     * @return описание
     */
    public String getDescriptionByPosition(int pos) {
        String[] descriptions = getResources().getStringArray(R.array.games_description);

        return descriptions[pos];
    }

    /**
     * Метод, выдающий описание по позиции
     * @param pos позиция
     * @return описание
     */
    public int getImageByPosition(int pos) {
        // Достаем из массива картинок выбранную в спиннере
        TypedArray images = getResources().obtainTypedArray(R.array.images);
        return images.getResourceId(pos, 0);
    }
}