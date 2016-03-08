package com.shohiebsense.samplechanginglanguage;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by Shohieb on 3/8/2016.
 */
public class SettingFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.preferences);
    }
}
