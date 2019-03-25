package com.example.android.animalinfo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

    }
    public void submitInfo(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String animalName = ((EditText) findViewById(R.id.animal_name)).getText().toString();
        int numberOfLegs = Integer.parseInt(((EditText) findViewById(R.id.number_of_legs)).getText().toString());
        String moreInfo = ((EditText) findViewById(R.id.more_information)).getText().toString();
        CheckBox furCheckBox = findViewById(R.id.has_fur);
        boolean hasFur = furCheckBox.isChecked();


        Animal animal = new Animal(animalName, numberOfLegs, moreInfo, hasFur);
        intent.putExtra(Keys.ANIMAL_KEY, animal);
        setResult(RESULT_OK, intent);
        finish();

    }

}
