package com.sklinn.addtocart

import com.google.gson.annotations.SerializedName

data class Photo(
    @SerializedName("filename")
    var filename: String? = null
)