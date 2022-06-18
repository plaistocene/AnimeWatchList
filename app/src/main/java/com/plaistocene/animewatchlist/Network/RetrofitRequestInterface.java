package com.plaistocene.animewatchlist.Network;

import com.plaistocene.animewatchlist.Model.MovieInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitRequestInterface
{
    @GET("API/AdvancedSearch/k_fzvzszta?genres=animation&locations=Japan")
    Call<MovieInfo> getAllAnime();
}
