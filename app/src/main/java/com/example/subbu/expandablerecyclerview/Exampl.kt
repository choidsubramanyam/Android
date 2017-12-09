package com.example.subbu.expandablerecyclerview

import com.google.gson.annotations.SerializedName

/**
 * Created by saravanan on 10-Sep-17.
 */
data class Exampl (@SerializedName("isSuccess") val isSuccess: Int,
                   @SerializedName("message") val message:String,
                   @SerializedName("status") val status:String,
                   @SerializedName("result") val result:List<List<Scan>>)
