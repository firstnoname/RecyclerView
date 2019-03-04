package com.example.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BookActivity extends AppCompatActivity {

    private TextView tvTitle, tvDesc, tvCategory;
    private ImageView imgInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        tvTitle = findViewById(R.id.txtTitle);
        tvDesc = findViewById(R.id.txtDesc);
        tvCategory = findViewById(R.id.txtCategory);
        imgInfo = findViewById(R.id.bookThumbnail);

        //Receive data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail");

        //Setting values
        tvTitle.setText(Title);
        tvDesc.setText(Description);
        imgInfo.setImageResource(image);
    }
}
