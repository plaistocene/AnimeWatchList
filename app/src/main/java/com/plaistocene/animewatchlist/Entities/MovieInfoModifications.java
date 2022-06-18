package com.plaistocene.animewatchlist.Entities;

import com.google.gson.Gson;
import com.plaistocene.animewatchlist.Model.MovieInfo;
import com.plaistocene.animewatchlist.Model.Result;

public class MovieInfoModifications
{
    public Result[] getResultsFromMovieInfo(MovieInfo movieInfo){
        Result[] results;
        results = movieInfo.getResults().toArray(new Result[0]);
        return results;
    }

}
