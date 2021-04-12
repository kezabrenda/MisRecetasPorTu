package com.example.mirecetasportu;

import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RecipesIngredientsFragment extends DialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_recipes_ingredients_fragment, container, false);
        getDialog().setTitle("Simple Dialog");
        return rootView;
    }
}