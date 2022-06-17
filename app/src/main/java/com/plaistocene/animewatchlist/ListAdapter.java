package com.plaistocene.animewatchlist;

import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.plaistocene.animewatchlist.Model.Result;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder>
{
    static Result[] results;

    public ListAdapter(Result[] results)
    {
        this.results = results;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items_rc, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
        holder.movie_poster_image_view.setImageURI(Uri.parse("results[position].getImage()"));
        holder.movie_title_text_view.setText(results[position].getTitle());
        holder.movie_description_text_view.setText(results[position].getDescription());
    }

    @Override
    public int getItemCount()
    {
        return results.length;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder
    {
        ImageView movie_poster_image_view;
        TextView movie_title_text_view;
        TextView movie_description_text_view;
        Button add_to_my_watch_list_btn;

        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);
            movie_poster_image_view = itemView.findViewById(R.id.movie_poster_image_view);
            movie_title_text_view = itemView.findViewById(R.id.movie_title_text_view);
            movie_description_text_view = itemView.findViewById(R.id.movie_description_text_view);
            add_to_my_watch_list_btn = itemView.findViewById(R.id.add_to_my_watch_list_btn);

            itemView.findViewById(R.id.add_to_my_watch_list_btn).setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    addToMyWatchlist();
                }
            });
        }

        private void addToMyWatchlist()
        {
            Log.d("test", "Add to my watchlist called for movie " + results[getAdapterPosition()].getTitle());
        }
    }
}
