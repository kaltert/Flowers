package helo.mali.flowers;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * This class represents an Andapter that offers Views to a ListView.
 * The View contains a ImageView ( i.e image of a flower ),
 * a TextView ( i.e flower name ), and
 * a TextView ( i.e flower description ).
 */

public class FlowerAdapter extends ArrayAdapter<Flower> {


    /**
     * Create a new {@link FlowerAdapter} object.
     *
     * @param context is the current context (i.e. Fragment) that the adapter is being created in.
     * @param flowers is the list of {@link Flower}s to be displayed.
     */
    public FlowerAdapter(Context context, ArrayList<Flower> flowers) {
        super(context, 0, flowers);
    }

    /**
     * This method returns a ViewGroup that contains a ImageView ( i.e image of a flower ),
     * a TextView ( i.e flower name ),
     * and a TextView ( i.e flower description ).
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_list_flowers, parent, false);
        }

        // current flower
        Flower flower = getItem(position);

        // Find name TextView
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.text_view_fname);

        // Find description TextView
        TextView descTextView = (TextView) listItemView.findViewById(R.id.text_view_fdescr);

        // Set name and description
        nameTextView.setText(flower.getName());
        descTextView.setText(flower.getDescription());

        return listItemView;

    }
}
