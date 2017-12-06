package com.example.subbu.expandablerecyclerview;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

/**
 * Created by saravanan on 16-Aug-17.
 */

public class ScanViewModel extends AndroidViewModel {
    private final LiveData<Exampl> scanobservsble;
    public ScanViewModel(Application application) {
        super(application);
        Dataservice dataservice=new Dataservice();
        scanobservsble=dataservice.getscandata();
    }

    public LiveData<Exampl> getScanobservsble() {
        return scanobservsble;
    }
}
