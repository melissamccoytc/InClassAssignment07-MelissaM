package com.example.android.animalinfo2;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.example.android.animalinfo2.InfoActivity;
import com.example.android.animalinfo2.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void addAnimal(View view) {
        Animal animal = new Animal("Dog", 4, "Best animal ever", true);
        Intent data = new Intent(this, InfoActivity.class);
        data.putExtra(Keys.ANIMAL_KEY, animal);
        setResult(RESULT_OK, data);
        startActivityForResult(data, 123);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 123 && resultCode == RESULT_OK) {
            Animal animal = (Animal) data.getSerializableExtra(Keys.ANIMAL_KEY);
            TextView textView = findViewById(R.id.text_view);
            String storedAnimal;
            storedAnimal = textView.getText().toString();
            textView.setText(storedAnimal + animal.toString() + "\n" + "\n");

        }
    }

}