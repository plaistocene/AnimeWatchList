package com.plaistocene.animewatchlist.Model;

import java.util.List;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result implements Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("runtimeStr")
    @Expose
    private String runtimeStr;
    @SerializedName("genres")
    @Expose
    private String genres;
    @SerializedName("genreList")
    @Expose
    private List<Genre> genreList = null;
    @SerializedName("contentRating")
    @Expose
    private String contentRating;
    @SerializedName("imDbRating")
    @Expose
    private String imDbRating;
    @SerializedName("imDbRatingVotes")
    @Expose
    private String imDbRatingVotes;
    @SerializedName("metacriticRating")
    @Expose
    private Object metacriticRating;
    @SerializedName("plot")
    @Expose
    private String plot;
    @SerializedName("stars")
    @Expose
    private String stars;
    @SerializedName("starList")
    @Expose
    private List<Star> starList = null;
    public final static Creator<Result> CREATOR = new Creator<Result>()
    {


        @SuppressWarnings({
                "unchecked"
        })
        public Result createFromParcel(android.os.Parcel in)
        {
            return new Result(in);
        }

        public Result[] newArray(int size)
        {
            return (new Result[size]);
        }

    };

    protected Result(android.os.Parcel in)
    {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.image = ((String) in.readValue((String.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.runtimeStr = ((String) in.readValue((String.class.getClassLoader())));
        this.genres = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.genreList, (com.plaistocene.animewatchlist.Model.Genre.class.getClassLoader()));
        this.contentRating = ((String) in.readValue((String.class.getClassLoader())));
        this.imDbRating = ((String) in.readValue((String.class.getClassLoader())));
        this.imDbRatingVotes = ((String) in.readValue((String.class.getClassLoader())));
        this.metacriticRating = ((Object) in.readValue((Object.class.getClassLoader())));
        this.plot = ((String) in.readValue((String.class.getClassLoader())));
        this.stars = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.starList, (com.plaistocene.animewatchlist.Model.Star.class.getClassLoader()));
    }

    public Result()
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

    public String getImage()
    {
        return image;
    }

    public void setImage(String image)
    {
        this.image = image;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getRuntimeStr()
    {
        return runtimeStr;
    }

    public void setRuntimeStr(String runtimeStr)
    {
        this.runtimeStr = runtimeStr;
    }

    public String getGenres()
    {
        return genres;
    }

    public void setGenres(String genres)
    {
        this.genres = genres;
    }

    public List<Genre> getGenreList()
    {
        return genreList;
    }

    public void setGenreList(List<Genre> genreList)
    {
        this.genreList = genreList;
    }

    public String getContentRating()
    {
        return contentRating;
    }

    public void setContentRating(String contentRating)
    {
        this.contentRating = contentRating;
    }

    public String getImDbRating()
    {
        return imDbRating;
    }

    public void setImDbRating(String imDbRating)
    {
        this.imDbRating = imDbRating;
    }

    public String getImDbRatingVotes()
    {
        return imDbRatingVotes;
    }

    public void setImDbRatingVotes(String imDbRatingVotes)
    {
        this.imDbRatingVotes = imDbRatingVotes;
    }

    public Object getMetacriticRating()
    {
        return metacriticRating;
    }

    public void setMetacriticRating(Object metacriticRating)
    {
        this.metacriticRating = metacriticRating;
    }

    public String getPlot()
    {
        return plot;
    }

    public void setPlot(String plot)
    {
        this.plot = plot;
    }

    public String getStars()
    {
        return stars;
    }

    public void setStars(String stars)
    {
        this.stars = stars;
    }

    public List<Star> getStarList()
    {
        return starList;
    }

    public void setStarList(List<Star> starList)
    {
        this.starList = starList;
    }

    public void writeToParcel(android.os.Parcel dest, int flags)
    {
        dest.writeValue(id);
        dest.writeValue(image);
        dest.writeValue(title);
        dest.writeValue(description);
        dest.writeValue(runtimeStr);
        dest.writeValue(genres);
        dest.writeList(genreList);
        dest.writeValue(contentRating);
        dest.writeValue(imDbRating);
        dest.writeValue(imDbRatingVotes);
        dest.writeValue(metacriticRating);
        dest.writeValue(plot);
        dest.writeValue(stars);
        dest.writeList(starList);
    }

    public int describeContents()
    {
        return 0;
    }

}