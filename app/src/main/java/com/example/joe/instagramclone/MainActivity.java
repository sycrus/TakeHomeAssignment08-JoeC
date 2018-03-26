package com.example.joe.instagramclone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Post> posts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new PostAdapter(posts, this));
    }

    private void initialData(){
        posts = new ArrayList<>();
        posts.add(new Post(R.drawable.a_profile, R.string.user_a, R.string.a_location, R.drawable.a_post, R.string.a_post, false));
        posts.add(new Post(R.drawable.b_profile, R.string.user_b, R.string.b_location, R.drawable.b_post, R.string.b_post, false));
        posts.add(new Post(R.drawable.c_profile, R.string.user_c, R.string.c_location, R.drawable.c_post, R.string.c_post, false));
        posts.add(new Post(R.drawable.d_profile, R.string.user_d, R.string.d_location, R.drawable.d_post, R.string.d_post, false));
        posts.add(new Post(R.drawable.e_profile, R.string.user_e, R.string.e_location, R.drawable.e_post, R.string.e_post, false));

    }
}
