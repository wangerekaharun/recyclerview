package com.wangerekaharun.recycleview.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wangerekaharun.recycleview.Models.Counties;
import com.wangerekaharun.recycleview.R;

import java.util.List;

/**
 * Created by harun on 5/8/17.
 */

public class CountiesAdapter extends RecyclerView.Adapter<CountiesAdapter.MyViewHolder> {
    private List<Counties>countiesList;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView county_name;

        public MyViewHolder(View itemView) {
            super(itemView);
            county_name=(TextView)itemView.findViewById(R.id.county_name);
        }
    }
    public CountiesAdapter(List<Counties>countiesList){
        this.countiesList=countiesList;
    }

    @Override
    public CountiesAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.county_details, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CountiesAdapter.MyViewHolder holder, int position) {
        Counties counties=countiesList.get(position);
        holder.county_name.setText(counties.getCounty_name());

    }

    @Override
    public int getItemCount() {
        return countiesList.size();
    }
}
