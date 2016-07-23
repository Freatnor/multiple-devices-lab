package com.example.freatnor.multiple_devices_lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private Button mButton;
    private ImageView mIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.text_view);
        mButton = (Button) findViewById(R.id.button);
        mIcon = (ImageView) findViewById(R.id.icon);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mIcon.setImageResource(R.drawable.ic_mood_black_24dp);
                mTextView.setText(R.string.keep_working);
            }
        });
    }
}
