package com.example.mirecetasportu;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityInstrumentationTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void validateEditText() {
        onView(withId(R.id.foodTypeEditText)).perform(typeText("Desserts"))
                .check(matches(withText("Desserts")));
    }

    /*@Test
    public void foodTypeIsSentToRecipesActivity() {
        String foodType = "Desserts";
        onView(withId(R.id.foodTypeEditText)).perform(typeText(foodType)).perform(closeSoftKeyboard());
        try {
            Thread.sleep(250);
        } catch (InterruptedException e){
            System.out.println("got interrupted!");
        }
        onView(withId(R.id.findRecipesButton)).perform(click());
        onView(withId(R.id.foodTypeTextView)).check(matches
                (withText("Here are all the related recipes: " + foodType)));
    }*/
}
