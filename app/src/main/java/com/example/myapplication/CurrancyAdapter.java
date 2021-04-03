package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DieHard_04 on 03-04-2021.
 */
public class CurrancyAdapter extends RecyclerView.Adapter<CurrancyAdapter.MyViewHolder> {

    private List<CurrecnyModel> models = new ArrayList<>();
    private Context context;
    public CurrancyAdapter(Context context, List<CurrecnyModel> models) {
        this.models = models;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_currency, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.tvCurrency.setText(models.get(position).getCurrancyName());
        holder.tvCurrency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "currance Name: " + models.get(position).getCurrancyName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvCurrency;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCurrency = itemView.findViewById(R.id.tvCurrency);
        }
    }
}
