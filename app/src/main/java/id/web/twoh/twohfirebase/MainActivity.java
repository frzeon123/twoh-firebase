package id.web.twoh.twohfirebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btAnalytics;
    private Button btAuth;
    private Button btFBDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btAnalytics = (Button) findViewById(R.id.bt_fbanalytics);
        btAnalytics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(MainActivity.this, FirebaseAnalyticsActivity.class));
            }
        });

        btAuth = (Button) findViewById(R.id.bt_fbauth);
        btAuth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(MainActivity.this, FirebaseAuthActivity.class));
            }
        });

        btFBDatabase = (Button) findViewById(R.id.bt_fbdatabase);
        btFBDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(MainActivity.this, FirebaseDBActivity.class));
            }
        });
    }
}
