package com.example.moon.movies;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieAdapterViewHoldr> {

    @Override
    public MovieAdapter.MovieAdapterViewHoldr onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.MovieAdapterViewHoldr holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MovieAdapterViewHoldr extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView mDataImage;

        public MovieAdapterViewHoldr(View itemView) {
            super(itemView);
            mDataImage = (ImageView) itemView.findViewById(R.id.image_data);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            int adapterPosition = getAdapterPosition();

        }
    }
}
