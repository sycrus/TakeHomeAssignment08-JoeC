package com.example.joe.instagramclone;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PostViewHolder extends RecyclerView.ViewHolder {

    public CardView cardView;
    public ImageView profilePic;
    public TextView userName;
    public TextView userLocation;
    public ImageView postImage;
    public TextView postText;
    public ImageView likeIcon;
    public boolean isPostLiked;

    public PostViewHolder(View itemView, final Context context) {

        super(itemView);

        profilePic = (ImageView) itemView.findViewById(R.id.profile_image);
        userName = (TextView) itemView.findViewById(R.id.username);
        userLocation = (TextView) itemView.findViewById(R.id.user_location);
        postImage = (ImageView) itemView.findViewById(R.id.post_image);
        postText = (TextView) itemView.findViewById(R.id.post_text);
        likeIcon = (ImageView) itemView.findViewById(R.id.like_icon);

        cardView = (CardView) itemView.findViewById(R.id.card_view);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int messageId = 0;

                if (isPostLiked) {
                    isPostLiked = !isPostLiked;
                    likeIcon.setImageResource(R.drawable.like);
                    messageId = R.string.unliked_toast;

                } else {
                    isPostLiked = !isPostLiked;
                    likeIcon.setImageResource(R.drawable.liked);
                    messageId = R.string.liked_toast;;
                }
                Toast.makeText(context, messageId, Toast.LENGTH_SHORT).show();
            }
        });
    }
}







