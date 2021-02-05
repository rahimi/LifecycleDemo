package de.hsba.app.lifecycledemo.listitem;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class ListItemClass implements Parcelable {

    int counter = 0;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(counter);
    }
}
