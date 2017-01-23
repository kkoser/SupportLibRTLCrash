package com.example.reprocrash;

import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExampleInstrumentedTest {

    @Rule public ActivityTestRule<MainActivity> rule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        assertEquals("com.example.reprocrash", InstrumentationRegistry.getTargetContext().getPackageName());
    }
}
