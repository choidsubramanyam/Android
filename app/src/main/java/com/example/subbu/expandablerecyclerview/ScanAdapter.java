package com.example.subbu.expandablerecyclerview;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.subbu.expandablerecyclerview.databinding.ScanviewBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saravanan on 17-Aug-17.
 */

class ScanAdapter extends RecyclerView.Adapter<ScanAdapter.MyViewHolder> {
    Context context;
    ScanviewBinding scanviewBinding;
    List<Scan> scan=new ArrayList<>();
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
        if (scaner!=null) {
            Log.e("scanner",""+scaner);
            holder.scanviewBinding.setScan(scaner);
            holder.scanviewBinding.executePendingBindings();
        }
    }

    public void updateData(List<Scan> result){
        ScanDiffutilClass scanDiffutilClass=new ScanDiffutilClass(result,this.scan);
        DiffUtil.DiffResult diffResult=DiffUtil.calculateDiff(scanDiffutilClass);
        Log.e("shui",""+result.size());
        this.scan.clear();
        this.scan.addAll(result);
        diffResult.dispatchUpdatesTo(this);

    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return (scan!=null && scan.size()>0)?scan.size():0;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        ScanviewBinding scanviewBinding;
        public MyViewHolder(View itemView) {
            super(itemView);
            scanviewBinding=DataBindingUtil.bind(itemView);
        }
    }
}
