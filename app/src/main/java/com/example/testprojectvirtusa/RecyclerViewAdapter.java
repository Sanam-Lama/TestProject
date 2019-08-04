package com.example.testprojectvirtusa;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    ArrayList<String> textArray;

    public RecyclerViewAdapter(ArrayList<String> textArray) {
        this.textArray = textArray;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycle_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder viewHolder, int i) {
//        viewHolder.textView.setText("Sanam");
        viewHolder.textView.setText(textArray.get(i));
    }

    @Override
    public int getItemCount() {
        return textArray.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CustomTextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = (CustomTextView) itemView.findViewById(R.id.textView);
        }
    }
}


