package com.example.mirecetasportu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;

public class RecipesActivity extends AppCompatActivity {
    public static final String TAG = RecipesActivity.class.getSimpleName();
    @BindView(R.id.foodTypeTextView) TextView mFoodTypeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        Intent intent = getIntent();
        String foodType = intent.getStringExtra("foodType");
        mFoodTypeTextView.setText("Here are all the related recipes: " + foodType);

    }
}