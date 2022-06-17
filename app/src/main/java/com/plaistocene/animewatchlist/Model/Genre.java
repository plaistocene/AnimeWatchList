package com.plaistocene.animewatchlist.Model;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Genre implements Parcelable
{

    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("value")
    @Expose
    private String value;
    public final static Creator<Genre> CREATOR = new Creator<Genre>()
    {


        @SuppressWarnings({
                "unchecked"
        })
        public Genre createFromParcel(android.os.Parcel in)
        {
            return new Genre(in);
        }

        public Genre[] newArray(int size)
        {
            return (new Genre[size]);
        }

    };

    protected Genre(android.os.Parcel in)
    {
        this.key = ((String) in.readValue((String.class.getClassLoader())));
        this.value = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Genre()
    {
    }

    public String getKey()
    {
        return key;
    }

    public void setKey(String key)
    {
        this.key = key;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public void writeToParcel(android.os.Parcel dest, int flags)
    {
        dest.writeValue(key);
        dest.writeValue(value);
    }

    public int describeContents()
    {
        return 0;
    }

}