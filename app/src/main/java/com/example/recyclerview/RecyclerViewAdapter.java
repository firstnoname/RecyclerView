package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Book> mData;

    public RecyclerViewAdapter(Context mContext, List<Book> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_book, viewGroup, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int i) {
        holder.tv_book_title.setText(mData.get(i).getTitle());
        holder.img_book_thumbnail.setImageResource(mData.get(i).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, BookActivity.class);
                //Passing data to the book activity
                intent.putExtra("Title", mData.get(i).getTitle());
                intent.putExtra("Description", mData.get(i).getDescription());
                intent.putExtra("Thumbnail", mData.get(i).getThumbnail());
                //Start the activity
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_book_title;
        ImageView img_book_thumbnail;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_book_title = itemView.findViewById(R.id.book_title);
            img_book_thumbnail = itemView.findViewById(R.id.book_img);
            cardView = itemView.findViewById(R.id.cardview_id);
        }
    }
}
