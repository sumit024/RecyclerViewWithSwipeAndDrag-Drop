package com.app_devs.recyclerview.models

import android.os.Parcel
import android.os.Parcelable

data class EntryModel(
    val image:String="",
    val name:String=""
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(image)
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<EntryModel> {
        override fun createFromParcel(parcel: Parcel): EntryModel {
            return EntryModel(parcel)
        }

        override fun newArray(size: Int): Array<EntryModel?> {
            return arrayOfNulls(size)
        }
    }
}
