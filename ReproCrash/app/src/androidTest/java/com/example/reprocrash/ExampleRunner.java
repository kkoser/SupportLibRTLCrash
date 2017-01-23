package com.example.reprocrash;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnitRunner;

import java.util.Locale;

public class ExampleRunner extends AndroidJUnitRunner {

    @Override
    public void onStart() {
        setLocale("ar", "QA", InstrumentationRegistry.getTargetContext());

        super.onStart();
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    private static void setLocale(@NonNull String language, @NonNull String country, @NonNull Context context) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN_MR1) {
            throw new IllegalStateException("Cannot change locale before API 17");
        }

        context = context.getApplicationContext();
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(new Locale(language, country));
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }
}
