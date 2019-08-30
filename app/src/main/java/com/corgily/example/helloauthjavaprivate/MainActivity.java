package com.corgily.example.helloauthjavaprivate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button loginButton;
    private EditText userEditText;
    private EditText passwordEditText;
    private TextView messageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.loginButton);
        userEditText = findViewById(R.id.userEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        messageTextView = findViewById(R.id.messageTextView);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userEditText.getText().toString().equals("corgily") && passwordEditText.getText().toString().equals("password")){
                    Intent succuessActivity = new Intent(getApplicationContext(), SuccessActivity.class);
                    succuessActivity.putExtra("com.cogily.example.helloauth.name", userEditText.getText().toString());
                    messageTextView.setText("");
                    startActivity(succuessActivity);
                } else {
                    messageTextView.setText(getString(R.string.tryagain));
                }
            }
        });


    }
}
