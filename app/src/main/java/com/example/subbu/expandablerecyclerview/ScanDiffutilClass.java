package com.example.subbu.expandablerecyclerview;

import android.support.v7.util.DiffUtil;

import java.util.List;
import java.util.Objects;

/**
 * Created by Subramanyam on 12/5/2017.
 */

class ScanDiffutilClass extends DiffUtil.Callback {
    private List<Scan> newList,oldList;
    public ScanDiffutilClass(List<Scan> newList, List<Scan> oldList) {
        this.newList=newList;
        this.oldList=oldList;
    }

    @Override
    public int getOldListSize() {
        return oldList.size();
    }

    @Override
    public int getNewListSize() {
        return newList.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return Objects.equals(oldList.get(oldItemPosition).getPatientScanId(), newList.get(newItemPosition).getPatientScanId());
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return oldList.get(oldItemPosition).equals(newList.get(newItemPosition));
    }
}
