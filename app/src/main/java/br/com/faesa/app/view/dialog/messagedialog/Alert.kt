package br.com.faesa.app.view.dialog.messagedialog

import android.os.Parcel
import android.os.Parcelable

data class Alert(val title: String, val text: String, val buttons: List<DialogButtonInfo>) : Parcelable {
    constructor(source: Parcel) : this(
            source.readString(),
            source.readString(),
            source.createTypedArrayList(DialogButtonInfo.CREATOR)
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeString(title)
        writeString(text)
        writeTypedList(buttons)
    }

    companion object {
        @JvmField val CREATOR: Parcelable.Creator<Alert> = object : Parcelable.Creator<Alert> {
            override fun createFromParcel(source: Parcel): Alert = Alert(source)
            override fun newArray(size: Int): Array<Alert?> = arrayOfNulls(size)
        }
    }
}