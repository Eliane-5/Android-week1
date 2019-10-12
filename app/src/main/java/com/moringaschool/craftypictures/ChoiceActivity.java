package com.moringaschool.craftypictures;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ChoiceActivity extends AppCompatActivity {
    @BindView(R.id.userNameTextView) TextView mUserNameTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");
        mUserNameTextView.setText("Hello "+  userName +", Please select a button to choose the type of pictures you would like to browse:");
    }
}
