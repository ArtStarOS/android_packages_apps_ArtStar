package com.artstar.settings.fragments;

import com.android.internal.logging.nano.MetricsProto;
import android.app.Activity;
import android.content.Context;
import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemProperties;
import android.os.UserHandle;
import android.provider.Settings;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import androidx.preference.Preference.OnPreferenceChangeListener;
import androidx.preference.SwitchPreference;
import com.android.settings.R;

import java.util.Arrays;
import java.util.HashSet;

import com.android.settings.SettingsPreferenceFragment;

public class RecentsSettings extends SettingsPreferenceFragment implements
        OnPreferenceChangeListener {

	private static final String KEY_CATEGORY_SLIM = "slim_recents_category";

	private PreferenceCategory mSlimCat;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        addPreferencesFromResource(R.xml.artstar_settings_recents);

        ContentResolver resolver = getActivity().getContentResolver();

	mSlimCat = (PreferenceCategory) findPreference(KEY_CATEGORY_SLIM);
        updateRecentsState(type);

    }

    public void updateRecentsState(int type) {
        switch(type) {
            case 0:
                mSlimCat.setEnabled(false);
                Settings.System.putInt(getActivity().getContentResolver(),
                Settings.System.USE_SLIM_RECENTS, 0);
                break;
            case 1:
                mSlimCat.setEnabled(false);
                Settings.System.putInt(getActivity().getContentResolver(),
                Settings.System.USE_SLIM_RECENTS, 0);
                break;
            case 2:
                mSlimCat.setEnabled(false);
                Settings.System.putInt(getActivity().getContentResolver(),
                Settings.System.USE_SLIM_RECENTS, 0);
                break;
            case 3:
                mSlimCat.setEnabled(false);
                Settings.System.putInt(getActivity().getContentResolver(),
                Settings.System.USE_SLIM_RECENTS, 0);
                break;
            case 4:
                mSlimCat.setEnabled(true);
                Settings.System.putInt(getActivity().getContentResolver(),
                Settings.System.USE_SLIM_RECENTS, 1);
                break;
            default:
                break;
        }
    }

    @Override
    public boolean onPreferenceChange(Preference preference, Object objValue) {

    return false;

    }

    @Override
    public int getMetricsCategory() {
        return MetricsProto.MetricsEvent.ARTSTAR;
    }
}
