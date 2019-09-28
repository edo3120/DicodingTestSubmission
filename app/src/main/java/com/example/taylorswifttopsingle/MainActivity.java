package com.example.taylorswifttopsingle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvSongs;
    private ArrayList<Song> list= new ArrayList<>();
    private String title = "Song Lists";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvSongs = findViewById(R.id.rv_songs);
        rvSongs.setHasFixedSize(true);

        list.addAll(SongsData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvSongs.setLayoutManager(new LinearLayoutManager(this));
        ListSongAdapter listSongAdapter = new ListSongAdapter(list);
        rvSongs.setAdapter(listSongAdapter);

        listSongAdapter.setOnItemClickCallBack(new ListSongAdapter.OnItemClickCallBack() {
            @Override
            public void onItemClicked(Song data) {
                showSelectedSong(data);
            }
        });
    }
//    code for About menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode){
        switch (selectedMode){
            case R.id.about:
                Intent moveIntent = new Intent(MainActivity.this, About.class);
                startActivity(moveIntent);
                break;
        }
    }
    private void showSelectedSong(Song song){
        Toast.makeText(this,"You Choose " + song.getTitle(), Toast.LENGTH_SHORT).show();
        Intent moveWithData = new Intent(MainActivity.this,Detail.class);
        moveWithData.putExtra(Detail.EXTRA_TITLE,song.getTitle());
        moveWithData.putExtra(Detail.EXTRA_YEAR,song.getYear());
        moveWithData.putExtra(Detail.EXTRA_DETAIL,song.getDetail());
        moveWithData.putExtra(Detail.EXTRA_IMAGE,song.getPhoto());
        startActivity(moveWithData);


    }
    private void setActionBarTitle(String title){
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(title);
        }
    }
}

