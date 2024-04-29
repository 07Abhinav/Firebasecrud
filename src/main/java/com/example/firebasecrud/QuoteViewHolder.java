package com.example.firebasecrud;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class QuoteViewHolder extends RecyclerView.ViewHolder {
    public TextView quotesTv, authorTv;
    public QuoteViewHolder(@NonNull View itemView){
        super(itemView);
        quotesTv = itemView.findViewById(R.id.quote_tv);
        authorTv = itemView.findViewById(R.id.author_tv);
    }

}
