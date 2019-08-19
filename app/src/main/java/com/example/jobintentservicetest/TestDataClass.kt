package com.example.jobintentservicetest

import android.os.Parcel
import android.os.Parcelable

data class TestDataClass(val testMessage: String?, val randomId: Int?): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt()
    )

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(testMessage)
        dest?.writeInt(randomId?: ID_NOT_ADDED)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TestDataClass> {
        const val ID_NOT_ADDED = -1

        override fun createFromParcel(parcel: Parcel): TestDataClass {
            return TestDataClass(parcel)
        }

        override fun newArray(size: Int): Array<TestDataClass?> {
            return arrayOfNulls(size)
        }
    }

}