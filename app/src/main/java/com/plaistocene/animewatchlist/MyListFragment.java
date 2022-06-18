package com.plaistocene.animewatchlist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.plaistocene.animewatchlist.Entities.MovieInfoModifications;
import com.plaistocene.animewatchlist.Model.MovieInfo;
import com.plaistocene.animewatchlist.Model.Result;
import com.plaistocene.animewatchlist.Network.RetrofitRequestInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MyListFragment extends Fragment
{
    View view;
    MovieInfo movieInfo;
    Result[] results;
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {

        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_my_list, container, false);

        recyclerView = view.findViewById(R.id.my_list_rc);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));


        allAnimeRequest();


        return view;
    }

    public void allAnimeRequest()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://imdb-api.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RetrofitRequestInterface retrofitRequestInterface = retrofit.create(RetrofitRequestInterface.class);

        Call<MovieInfo> movieInfoCall = retrofitRequestInterface.getAllAnime();

        movieInfoCall.enqueue(new Callback<MovieInfo>()
        {
            @Override
            public void onResponse(Call<MovieInfo> call, Response<MovieInfo> response)
            {
                MovieInfoModifications mim = new MovieInfoModifications();

                if (response.isSuccessful())
                {
                    movieInfo = response.body();
                    System.out.println(movieInfo);
                    results = mim.getResultsFromMovieInfo(movieInfo);

                    recyclerView.setAdapter(new ListAdapter(results));
                } else
                {
                    Log.e("error", "the network call on allAnimeRequest Failed");
                }
            }

            @Override
            public void onFailure(Call<MovieInfo> call, Throwable t)
            {
                Log.e("error", "the network call on allAnimeRequest Failed");
            }
        });
//    }
    }
}