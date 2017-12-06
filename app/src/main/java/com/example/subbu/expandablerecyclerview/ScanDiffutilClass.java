package com.example.subbu.expandablerecyclerview;

import android.support.v7.util.DiffUtil;

import java.util.List;
import java.util.Objects;

/**
 * Created by saravanan on 23-Sep-17.
 */

public class ScanDiffutilClass extends DiffUtil.Callback {
    private List<Scan> oldlist,newlist;
    public ScanDiffutilClass(List<Scan> result, List<Scan> scan) {
        this.oldlist=scan;
        this.newlist=result;
    }

    @Override
    public int getOldListSize() {
        return oldlist.size();
    }

    @Override
    public int getNewListSize() {
        return newlist.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return Objects.equals(oldlist.get(oldItemPosition).getScanId(), newlist.get(newItemPosition).getScanId());
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {

        return Objects.equals(oldlist.get(oldItemPosition).getScanId(), newlist.get(newItemPosition).getScanId());
    }
}
