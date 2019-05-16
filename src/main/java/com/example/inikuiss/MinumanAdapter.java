package com.example.inikuiss;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.text.BreakIterator;
import java.util.List;

public class MinumanAdapter extends RecyclerView.Adapter <MinumanAdapter.MinumanViewHolder> {
    private Context mCtx;
    private List<Minuman> minumanList;

    public MinumanAdapter(Context mCtx, List<Minuman> minumanList) {
        this.mCtx = mCtx;
        this.minumanList = minumanList;
    }

    public MinumanAdapter(List<Minuman> minumanList) {

    }

    @NonNull
    @Override
    public MinumanViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout_minuman, viewGroup, false);
        return new MinumanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MinumanViewHolder minumanViewHolder, int i) {
        Minuman minuman = minumanList.get(i);

        minumanViewHolder.textViewTitle.setText(minuman.getTitle());
        minumanViewHolder.textViewDesc.setText(minuman.getDescribe());
        minumanViewHolder.textViewRating.setText(String.valueOf(minuman.getRating()));
        minumanViewHolder.textViewPrice.setText(String.valueOf(minuman.getPrice()));

        minumanViewHolder.imageView.setImageDrawable(mCtx.getResources().getDrawable(minuman.getImage()));
    }

    @Override
    public int getItemCount() {
        return minumanList.size();
    }


    public class MinumanViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewTitle,textViewDesc, textViewRating, textViewPrice;
        public ImageView imageView;
        public MinumanViewHolder(View view) {
            super(view);
            imageView = itemView.findViewById(R.id.imageView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);


        }
    }
}

