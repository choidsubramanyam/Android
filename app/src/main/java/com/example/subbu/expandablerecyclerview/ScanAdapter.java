package com.example.subbu.expandablerecyclerview;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.subbu.expandablerecyclerview.databinding.ScanviewBinding;

import java.util.List;

/**
 * Created by saravanan on 17-Aug-17.
 */

class ScanAdapter extends RecyclerView.Adapter<ScanAdapter.MyViewHolder> {
    Context context;
    ScanviewBinding scanviewBinding;
    List<Scan> scan;
    public ScanAdapter(Context context, List<Scan> result) {
        this.context=context;
        this.scan=result;

    }

    @Override
    public ScanAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        scanviewBinding= DataBindingUtil.inflate(LayoutInflater.from(context),R.layout.scanview,parent,false);
        return new MyViewHolder(scanviewBinding.getRoot());
    }

    @Override
    public void onBindViewHolder(ScanAdapter.MyViewHolder holder, int position) {
        Scan scaner=scan.get(position);
        holder.scanviewBinding.setScan(scaner);
        holder.scanviewBinding.executePendingBindings();

    }

    @Override
    public int getItemCount() {
        return scan.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        ScanviewBinding scanviewBinding;
        public MyViewHolder(View itemView) {
            super(itemView);
            scanviewBinding=DataBindingUtil.bind(itemView);
        }
    }
}
