package com.example.taylorswifttopsingle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Detail extends AppCompatActivity {
    public static final String EXTRA_TITLE = "title";
    public static final String EXTRA_YEAR = "year";
    public static final String EXTRA_DETAIL ="detail";
    public static final String EXTRA_IMAGE = "image";
    private String title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        title = getIntent().getStringExtra(EXTRA_TITLE);
        setActionBarTitle(title);

        ImageView imgItemPhoto = findViewById(R.id.img_item_photo);
        TextView tvSongTitle = findViewById(R.id.tv_song_title);
        TextView tvItemYear = findViewById(R.id.tv_item_year);
        TextView tvItemDetail = findViewById(R.id.tv_item_detail);

        String song = getIntent().getStringExtra(EXTRA_TITLE);
        String year = getIntent().getStringExtra(EXTRA_YEAR);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);
        int image = getIntent().getIntExtra(EXTRA_IMAGE,0);

        String text_song = song;
        String text_year = year;
        String text_detail = detail;

        tvSongTitle.setText(text_song);
        tvItemYear.setText(text_year);
        tvItemDetail.setText(text_detail);
        Glide.with(this)
                .load(image)
                .apply(new RequestOptions().override(100,100))
                .into(imgItemPhoto);


    }
    private void setActionBarTitle(String title){
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(title);
        }
    }

}
