package com.diva.sbuxlist

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Sbux (
        var name : String,
        var desc : String,
        var photo : String
        ): Parcelable