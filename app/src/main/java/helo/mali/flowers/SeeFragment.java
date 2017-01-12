package helo.mali.flowers;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SeeFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SeeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SeeFragment extends Fragment {

    // the fragment initialization parameters.
    // parameter for the id of a flower, used to get a flower from
    // a flower set
    public static final String ARG_ITEM_INDEX = "itemIndex";

    // types of parameters
    private int mItemIndex;

    private OnFragmentInteractionListener mListener;

    public SeeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param itemIndex index of flower in flowersSet.
     * @return A new instance of fragment SeeFragment.
     */
    public static SeeFragment newInstance(int itemIndex) {
        SeeFragment fragment = new SeeFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_ITEM_INDEX, itemIndex);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mItemIndex = getArguments().getInt(ARG_ITEM_INDEX);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View rootView  = inflater.inflate(R.layout.fragment_see, container, false);

        // Find position textView
        TextView posTextView = (TextView) rootView.findViewById(R.id.position_text_view);
        posTextView.setText("Item postion is.." + mItemIndex);

        return  rootView;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
