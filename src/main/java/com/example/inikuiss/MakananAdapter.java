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

public class MakananAdapter extends RecyclerView.Adapter <MakananAdapter.MakananViewHolder> {
    private Context mCtx;
    private List<Makanan> makananList;

    public MakananAdapter(Context mCtx, List<Makanan> makananList) {
        this.mCtx = mCtx;
        this.makananList = makananList;
    }

    public MakananAdapter(List<Makanan> makananList) {

    }

    @NonNull
    @Override
    public MakananViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout_makanan, viewGroup, false);
        return new MakananViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MakananViewHolder makananViewHolder, int i) {
        Makanan makanan = makananList.get(i);

        makananViewHolder.textViewTitle.setText(makanan.getTitle());
        makananViewHolder.textViewDesc.setText(makanan.getDescribe());
        makananViewHolder.textViewRating.setText(String.valueOf(makanan.getRating()));
        makananViewHolder.textViewPrice.setText(String.valueOf(makanan.getPrice()));

        makananViewHolder.imageView.setImageDrawable(mCtx.getResources().getDrawable(makanan.getImage()));
    }

    @Override
    public int getItemCount() {
        return makananList.size();
    }


    public class MakananViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewTitle,textViewDesc, textViewRating, textViewPrice;
        public ImageView imageView;
        public MakananViewHolder(View view) {
            super(view);
            imageView = itemView.findViewById(R.id.imageView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);


        }
    }
}

