package works.cae.simplegameenginev1;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/**
 * Created by salfl on 18/12/16.
 */

public class SGPreferences {
    private SharedPreferences.Editor mEditor = null;
    private SharedPreferences mPreferences = null;

    public SGPreferences(Activity activity) {
        mPreferences = activity.getPreferences(Context.MODE_PRIVATE);
        mEditor = mPreferences.edit();
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        try {
            return mPreferences.getBoolean(key, defaultValue);
        }
        catch (ClassCastException e) {
            Log.d(SGActivity.TAG, "SGPreferences.getBoolean(): Valor possui um tipo diferente!");
            return defaultValue;
        }
    }
}
