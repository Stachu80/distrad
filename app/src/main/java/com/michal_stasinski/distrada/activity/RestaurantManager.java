package com.michal_stasinski.distrada.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.michal_stasinski.distrada.Blog.BlogPost.PostActivity;
import com.michal_stasinski.distrada.InfoPanel.InfoActivity;
import com.michal_stasinski.distrada.R;

public class RestaurantManager extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_manager);

        Button createNotification = (Button) findViewById(R.id.create_notification);
        Button createPost = (Button) findViewById(R.id.create_post);

       createNotification.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(RestaurantManager.this, NotificationActivity.class);
                startActivity(intent);
                overridePendingTransition(R.animator.right_in,R.animator.left_out);
            }
        });

        createPost.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(RestaurantManager.this, PostActivity.class);
                startActivity(intent);
                overridePendingTransition(R.animator.right_in,R.animator.left_out);
            }
        });
    }
}
