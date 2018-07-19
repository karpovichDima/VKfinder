package com.example.dekar.vk_client;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.net.URL;

import static com.example.dekar.vk_client.utils.NetworkUtils.generateURL;

public class MainActivity extends AppCompatActivity {

    private EditText searchField;
    private Button searchButton;
    private TextView results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchField = findViewById(R.id.et_search_field);
        searchButton = findViewById(R.id.b_search_vk);
        results = findViewById(R.id.tv_result);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                URL generatedURL = generateURL(searchField.getText().toString());
                results.setText(generatedURL.toString());
            }
        };
        searchButton.setOnClickListener(onClickListener);
    }
}
