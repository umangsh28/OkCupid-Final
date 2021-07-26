package com.example.okcupidcopy;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class LikesViewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView name;
    TextView city;

    CardView cardView;
    OnClickListner onClickListner;
    public LikesViewHolder(@NonNull View itemView,OnClickListner onClickListner) {
        super(itemView);
        this.onClickListner=onClickListner;
        initView(itemView);
    }

    private void initView(View itemView) {
        cardView=itemView.findViewById(R.id.cardview);
        image=itemView.findViewById(R.id.imageview);
        name=itemView.findViewById(R.id.nameandage);
        city=itemView.findViewById(R.id.city);
    }
    public void setData(LikesItems items){
        image.setImageResource(items.getImage());
        name.setText(items.getName());
        city.setText(items.getCity());
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickListner.onclick(items,getAdapterPosition());


            }
        });



    }

}