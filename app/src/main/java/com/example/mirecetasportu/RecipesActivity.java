package com.example.mirecetasportu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;

public class RecipesActivity extends AppCompatActivity {
    public static final String TAG = RecipesActivity.class.getSimpleName();
    @BindView(R.id.foodTypeTextView) TextView mFoodTypeTextView;
    @BindView(R.id.listView) ListView mListView;

    private String[] dessertRecipes = new String[] {"Jell-O", "Pancakes",
            "Pies", "CupCakes", "Granola Bars", "Ice cream",
            "Cakes", "Pudding", "Souffle", "Frozen Yogurt",
            "Tart", "Beignets", "Banana Bread", "Cookies"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        mFoodTypeTextView = (TextView) findViewById(R.id.foodTypeTextView);

        mListView = (ListView) findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, dessertRecipes);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String dessert = ((TextView)view).getText().toString();
                Toast.makeText(RecipesActivity.this, dessert, Toast.LENGTH_LONG).show();
            }
        });

        Intent intent = getIntent();
        String foodType = intent.getStringExtra("foodType");
        mFoodTypeTextView.setText("Here are all the related recipes: " + foodType);
    }
}