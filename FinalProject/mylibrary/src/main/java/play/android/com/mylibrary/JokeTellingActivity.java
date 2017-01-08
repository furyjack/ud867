package play.android.com.mylibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class JokeTellingActivity extends AppCompatActivity {

    String Joke;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_telling);
        Joke=getIntent().getStringExtra("joke");
        Toast.makeText(this, Joke, Toast.LENGTH_SHORT).show();
    }
}
