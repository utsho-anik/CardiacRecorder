package com.example.cardiacrecorder;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest

public class StatisticsUITest {
    @Rule
    public ActivityScenarioRule<Statistics> activityRule =
            new ActivityScenarioRule<>(Statistics.class);

    @Test
    public void testStatistics(){
        onView(withId(R.id.relView)).check(matches(isDisplayed()));
        onView(withId(R.id.UserData)).check(matches(isDisplayed()));
        onView(withId(R.id.line)).check(matches(isDisplayed()));
        onView(withId(R.id.menu_drop)).check(matches(isDisplayed()));
        onView(withId(R.id.drop_item)).check(matches(isDisplayed()));
        onView(withId(R.id.drop_item)).perform(click());
    }

}
