package helo.mali.flowers;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SeeActivity extends AppCompatActivity implements SeeFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see);

        //Create seeFragment
        SeeFragment seeFragment = new SeeFragment();
        seeFragment.setArguments(getIntent().getExtras());

        // Add fragment that shows datails about a flower
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.activity_see, seeFragment)
                .commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
