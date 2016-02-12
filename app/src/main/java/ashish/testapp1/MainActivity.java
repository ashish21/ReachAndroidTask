package ashish.testapp1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView headerImage = (ImageView) findViewById(R.id.headerImage);
        final ImageView topImage = (ImageView) findViewById(R.id.topImage);
        final CustomScrollView scrollView = (CustomScrollView) findViewById(R.id.customScrollView);

        scrollView.setAnimatingView(headerImage);
    }
}
