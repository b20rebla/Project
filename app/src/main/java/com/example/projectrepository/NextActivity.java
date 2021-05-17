package com.example.projectrepository;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        String hej = new String("Målgruppen för denna app är vegetarianer som vill vara mer medvetna om varifrån i världen frukter och bär är producerade.");
        Log.d("TAG", "hej");
        Toast.makeText(NextActivity.this, hej, Toast.LENGTH_SHORT).show();

        Button close = findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NextActivity.this, MainActivity.class);
                startActivity(intent);
                Log.d("TAG", "Stänger aktivitet");
                finish();
            }
        });
    }
}