package com.example.cardiacrecorder;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import android.os.SystemClock;

import androidx.test.espresso.Espresso;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest

public class SignUpActUITest {
    @Rule
    public ActivityScenarioRule<RegisterActivity> activityRule =
            new ActivityScenarioRule<>(RegisterActivity.class);

    @Test
    public void testSignUpAct(){
        //onView(withId(R.id.signuptitle)).check(matches(isDisplayed()));
        SystemClock.sleep(2000);
        onView(withId(R.id.emailRegister)).perform(typeText("test@gmail.com"));
        onView(withId(R.id.username)).perform(typeText("Anik"));
        Espresso.pressBack();
        //onView(withId(R.id.emailRegister)).perform(click());

        onView(withId(R.id.phone)).perform(typeText("123456"));
        Espresso.pressBack();
        onView(withId(R.id.password)).perform(typeText("1234567890"));
        Espresso.pressBack();
        onView(withId(R.id.repassword)).perform(typeText("1234567890"));
    }

}
