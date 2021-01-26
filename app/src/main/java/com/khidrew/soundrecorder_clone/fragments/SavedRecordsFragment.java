package com.khidrew.soundrecorder_clone.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.khidrew.soundrecorder_clone.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SavedRecordsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SavedRecordsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String POSITION = "position";
    private int position  ;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SavedRecordsFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static RecordFragment newInstance(int position) {
        RecordFragment fragment = new RecordFragment();
        Bundle args = new Bundle();
        args.putInt(POSITION, position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            position = getArguments().getInt(POSITION);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_saved_records, container, false);
    }
}