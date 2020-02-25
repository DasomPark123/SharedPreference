package com.androidpractice.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String text = PreferenceManager.getString(this,"text");
        if (text.equals("")) {
            text = "저장된 데이터가 없습니다.";
            PreferenceManager.setString(this,"text","숲속의 작은 이야기");
        }

        textView = findViewById(R.id.main_text);
        textView.setText(text);
    }
}
