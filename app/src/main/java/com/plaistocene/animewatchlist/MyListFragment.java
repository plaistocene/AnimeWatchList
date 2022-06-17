package com.plaistocene.animewatchlist;

import static com.plaistocene.animewatchlist.Network.PostmanNetworkRequestResult.*;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.plaistocene.animewatchlist.Model.MovieInfo;
import com.plaistocene.animewatchlist.Model.Result;
import com.plaistocene.animewatchlist.Network.PostmanNetworkRequestResult;


public class MyListFragment extends Fragment
{
    View view;
    MovieInfo movieInfo;
    Result[] results;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_my_list, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.my_list_rc);

        createTestValsForRC();
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView.setAdapter(new ListAdapter(results));

        return view;
    }

    public void createTestValsForRC(){
        Gson gson = new Gson();
        movieInfo = gson.fromJson(network_request_result, MovieInfo.class);
        results = movieInfo.getResults().toArray(new Result[0]);
    }
}