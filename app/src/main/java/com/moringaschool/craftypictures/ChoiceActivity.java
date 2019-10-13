package com.moringaschool.craftypictures;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ChoiceActivity extends AppCompatActivity {
    @BindView(R.id.userNameTextView) TextView mUserNameTextView;
    @BindView(R.id.blackAndWhite) Button mblackAndWhiteButton;
    @BindView(R.id.colorful) Button mColorfulButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");
        mUserNameTextView.setText("Hello "+  userName +", Please select a button to choose the type of pictures you would like to browse:");

        mblackAndWhiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChoiceActivity.this, BlackAndWhiteActivity.class);
                startActivity(intent);
            }
        });

        mColorfulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChoiceActivity.this, ColorfulActivity.class);
                startActivity(intent);
            }
        });

    }
}
