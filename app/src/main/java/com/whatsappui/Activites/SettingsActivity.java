package com.whatsappui.Activites;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.whatsappui.R;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView backArrow;
    private RelativeLayout relativeLayout002, relativeLayout003;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        viewsSetup();


        backArrow.setOnClickListener(this);
        relativeLayout002.setOnClickListener(this);
        relativeLayout003.setOnClickListener(this);

    }

    private void viewsSetup(){
        backArrow = findViewById(R.id.backArrow);
        relativeLayout002 = findViewById(R.id.realativeLayout002);
        relativeLayout003 = findViewById(R.id.realativeLayout003);
        RelativeLayout relativeLayout004 = findViewById(R.id.realativeLayout004);
        RelativeLayout relativeLayout005 = findViewById(R.id.realativeLayout005);
        RelativeLayout relativeLayout006 = findViewById(R.id.realativeLayout006);
        RelativeLayout relativeLayout007 = findViewById(R.id.realativeLayout007);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.realativeLayout002:
                Intent accountSettings =
                        new Intent(SettingsActivity.this, AccountSettingsActivity.class);
                startActivity(accountSettings);
                break;

            case R.id.backArrow:
                finish();
                break;

            case R.id.realativeLayout003:
                Intent chatSettings =
                        new Intent(SettingsActivity.this, ChatsSettingsActivity.class);
                startActivity(chatSettings);
                break;
        }

    }
}
