package android.example.birthdaygreet;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class BirthdayGreetingActivity extends AppCompatActivity {
TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_greeting);

        getSupportActionBar().hide();
        tv=findViewById(R.id.birthdayGreet);

        String rec = getIntent().getStringExtra("dataname");
        tv.setText("Happy birthday\n"+rec);
    }
}