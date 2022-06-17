package com.plaistocene.animewatchlist.Model;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Star implements Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    public final static Creator<Star> CREATOR = new Creator<Star>()
    {


        @SuppressWarnings({
                "unchecked"
        })
        public Star createFromParcel(android.os.Parcel in)
        {
            return new Star(in);
        }

        public Star[] newArray(int size)
        {
            return (new Star[size]);
        }

    };

    protected Star(android.os.Parcel in)
    {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Star()
    {
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void writeToParcel(android.os.Parcel dest, int flags)
    {
        dest.writeValue(id);
        dest.writeValue(name);
    }

    public int describeContents()
    {
        return 0;
    }

}