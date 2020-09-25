package android.example.birthdaygreet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.nameInput);
    }

    public void createBirthdayCard(View view) {
        String data =tv.getText().toString();
        Intent intent = new Intent(this ,BirthdayGreetingActivity.class);
        intent.putExtra("dataname",data);
        startActivity(intent);
    }
}