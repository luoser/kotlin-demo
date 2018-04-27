package com.example.lisaluo.kotlinproject;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public final class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void configureWith(@NonNull final Person person) {
        // set the bigger emoji image

        // set the name

        // start the background color animation
    }

    public void dancerClicked() {
        configureWith(Person.LISA);
    }

    public void sleuthOrSpyClicked() {
        configureWith(Person.IZZY);
    }

    public void thinkingFaceClicked() {
        configureWith(Person.KEVIN);
    }
}
