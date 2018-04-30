package com.example.lisaluo.kotlinproject;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public final class MainActivity extends Activity {

    @BindView(R.id.content) View content;
    @BindView(R.id.emoji) ImageView emoji;
    @BindView(R.id.speaker_name) TextView name;

    private int currentColor;

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        currentColor = Color.WHITE;
    }

    public void configureWith(@NonNull final Person person) {
        // set the bigger emoji image
        emoji.setImageResource(person.getEmojiImageId());

        // set the name
        name.setText(person.getFirstName());

        // start the background color animation
        final int color = ContextCompat.getColor(this, person.getFavoriteColor());
        AnimationUtils.INSTANCE.backgroundColorAnimation(content, currentColor, color).start();
        currentColor = color;
    }

    @OnClick(R.id.lisa)
    public void dancerClicked() {
        configureWith(Person.LISA);
    }

    @OnClick(R.id.izzy)
    public void sleuthOrSpyClicked() {
        configureWith(Person.IZZY);
    }

    @OnClick(R.id.kevin)
    public void thinkingFaceClicked() {
        configureWith(Person.KEVIN);
    }
}
