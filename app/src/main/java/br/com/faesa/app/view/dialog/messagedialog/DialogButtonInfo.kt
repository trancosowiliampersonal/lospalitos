package br.com.faesa.app.view.dialog.messagedialog

import android.os.Parcel
import android.os.Parcelable
import br.com.faesa.app.view.component.AppButton

data class DialogButtonInfo(@AppButton.AppButtonType val type: Int, val code: Int, val title: String) : Parcelable {
    constructor(source: Parcel) : this(
            source.readInt(),
            source.readInt(),
            source.readString()
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeInt(type)
        writeInt(code)
        writeString(title)
    }

    companion object {

        @JvmField val CREATOR: Parcelable.Creator<DialogButtonInfo> = object : Parcelable.Creator<DialogButtonInfo> {
            override fun createFromParcel(source: Parcel): DialogButtonInfo = DialogButtonInfo(source)
            override fun newArray(size: Int): Array<DialogButtonInfo?> = arrayOfNulls(size)
        }
    }
}
