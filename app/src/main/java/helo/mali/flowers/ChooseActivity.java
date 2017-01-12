package helo.mali.flowers;


import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ChooseActivity extends AppCompatActivity implements ChooseFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        // Adding fragment that alows the user to choose a flower for details
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.activity_choose, new ChooseFragment())
                .commit();

    }

    @Override
    public void onFragmentInteraction(int itemId) {
        // In single-pane mode, simply start the detail activity
        // for the selected item ID.
        Intent detailIntent = new Intent(this, SeeActivity.class);
        detailIntent.putExtra(SeeFragment.ARG_ITEM_INDEX, itemId);
        startActivity(detailIntent);
    }
}
