package com.example.taskone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        textView = findViewById(R.id.policy_text);
        String text = "By signing up you accept the <font color =#0072ff>Terms of Services</font> and <font color=#0072ff>Privacy Policy</font>";
        textView.setText(Html.fromHtml(text));

    }
}