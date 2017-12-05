package com.example.subbu.expandablerecyclerview;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.util.Log;

/**
 * Created by saravanan on 16-Aug-17.
 */

public class ScanViewModel extends AndroidViewModel {
    private final LiveData<Example> scanobservsble;
    public ScanViewModel(Application application) {
        super(application);
        scanobservsble=Dataservice.getInstance().getscandata();
        Log.e("da",""+scanobservsble);
    }

    public LiveData<Example> getScanobservsble() {
        return scanobservsble;
    }
}
