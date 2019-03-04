package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> listBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listBook = new ArrayList<>();
        listBook.add(new Book("The blott", "Categories Book",
                "Description book 'The blott'", R.drawable.img_blott));
        listBook.add(new Book("Pimp my fiction", "Categories Book",
                "Description book 'Pimp my fiction'", R.drawable.img_pimp_my_fiction));
        listBook.add(new Book("The Dry", "Categories Book",
                "Description book 'The Dry'", R.drawable.img_the_dry));
        listBook.add(new Book("This is how it begins", "Categories Book",
                "Description book 'This is how it begins'", R.drawable.img_this_is_how_it_begins));

        RecyclerView mRecyclerView = findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter mAdapter = new RecyclerViewAdapter(this, listBook);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        mRecyclerView.setAdapter(mAdapter);

    }
}
