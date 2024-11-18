package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText emailin  = findViewById(R.id.emailin);
        EditText passin = findViewById(R.id.passin);
        EditText repass = findViewById(R.id.repass);
        TextView autor = findViewById(R.id.autor);
        Button sumbitButton = findViewById(R.id.submitButton);

        sumbitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email  = emailin.getText().toString();
                String password = passin.getText().toString();
                String repassword = repass.getText().toString();

                if(!email.contains("@")) {
                    autor.setText("nieprawidlowy adres email");
            } else if (!password.equals(repassword)) {
                    autor.setText("hasła sie róznią");
                } else {
                    autor.setText("Witaj " + email);
                }
            }
        });
    }
}