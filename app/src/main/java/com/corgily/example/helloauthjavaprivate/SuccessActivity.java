package com.corgily.example.helloauthjavaprivate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SuccessActivity extends AppCompatActivity {

    private Button logoutButton;
    private TextView successTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        logoutButton = findViewById(R.id.logoutButton);
        successTextView = findViewById(R.id.successTextView);

        String success = getString(R.string.hello) + " " + getIntent().getStringExtra("com.cogily.example.helloauth.name");

        successTextView.setText(success);

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainActivity = new Intent(getApplicationContext(), MainActivity.class);
                mainActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(mainActivity);
                finish();
            }
        });

    }
}
