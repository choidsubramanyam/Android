package com.example.subbu.expandablerecyclerview;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by saravanan on 16-Aug-17.
 */

public interface Scandetails {
    @GET("doctor/rest/api/67/scandetails?examinationDate=2017-08-16")
    Call<Example> getscandetails();

}
