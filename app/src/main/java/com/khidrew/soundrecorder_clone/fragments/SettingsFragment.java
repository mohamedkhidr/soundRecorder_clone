package com.khidrew.soundrecorder_clone.fragments;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import com.khidrew.soundrecorder_clone.R;

public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey);
    }
}