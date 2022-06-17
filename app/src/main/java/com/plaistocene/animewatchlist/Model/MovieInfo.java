package com.plaistocene.animewatchlist.Model;

import java.util.List;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MovieInfo implements Parcelable
{

    @SerializedName("queryString")
    @Expose
    private String queryString;
    @SerializedName("results")
    @Expose
    private List<Result> results = null;
    @SerializedName("errorMessage")
    @Expose
    private Object errorMessage;
    public final static Creator<MovieInfo> CREATOR = new Creator<MovieInfo>()
    {


        @SuppressWarnings({
                "unchecked"
        })
        public MovieInfo createFromParcel(android.os.Parcel in)
        {
            return new MovieInfo(in);
        }

        public MovieInfo[] newArray(int size)
        {
            return (new MovieInfo[size]);
        }

    };

    protected MovieInfo(android.os.Parcel in)
    {
        this.queryString = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.results, (com.plaistocene.animewatchlist.Model.Result.class.getClassLoader()));
        this.errorMessage = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public MovieInfo()
    {
    }

    public String getQueryString()
    {
        return queryString;
    }

    public void setQueryString(String queryString)
    {
        this.queryString = queryString;
    }

    public List<Result> getResults()
    {
        return results;
    }

    public void setResults(List<Result> results)
    {
        this.results = results;
    }

    public Object getErrorMessage()
    {
        return errorMessage;
    }

    public void setErrorMessage(Object errorMessage)
    {
        this.errorMessage = errorMessage;
    }

    public void writeToParcel(android.os.Parcel dest, int flags)
    {
        dest.writeValue(queryString);
        dest.writeList(results);
        dest.writeValue(errorMessage);
    }

    public int describeContents()
    {
        return 0;
    }

}
