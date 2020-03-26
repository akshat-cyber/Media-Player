package com.fatdevs.media;
import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.MediaController;
import android.widget.VideoView;
public class MainActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = new MenuInflater(this);
        menuInflater.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView videoView = findViewById(R.id.videoView);
        Uri videoUri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.vid); // path of file
         videoView.setVideoURI(videoUri);
  MediaController mediaPlayer = new MediaController(this);
  mediaPlayer.setAnchorView(videoView);
  videoView.bringToFront(); // brings to the front]\
         videoView.requestFocus();
  videoView.start();
    }
}