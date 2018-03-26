package com.example.joe.instagramclone;

/**
 * Created by joe on 3/25/18.
 */

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostViewHolder> {

    private List<Post> posts;
    private Context context;

    public PostAdapter(List<Post> posts, Context context) {
        this.posts = posts;
        this.context = context;
    }

    @Override
    public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post, parent, false);
        return new PostViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(PostViewHolder holder, int position) {
        Post post = posts.get(position);
        holder.profilePic.setImageResource(post.userPhotoId);
        holder.userName.setText(post.userName);
        holder.userLocation.setText(post.userLocation);
        holder.postImage.setImageResource(post.postPhotoId);
        holder.postText.setText(post.postText);
        holder.isPostLiked = post.isLiked;
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

}