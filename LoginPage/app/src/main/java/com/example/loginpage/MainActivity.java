package com.example.loginpage;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView txt = findViewById(R.id.TextView);

        EditText user = findViewById(R.id.Username);
        EditText pass = findViewById(R.id.password);
        Button btn = findViewById(R.id.button);
        String DefaultText = txt.getText().toString();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = user.getText().toString();
                if(name.isBlank())
                {
                    txt.setText(DefaultText);
                }
                else{
                    txt.setText(name);
                }

            }
        });
    }
}