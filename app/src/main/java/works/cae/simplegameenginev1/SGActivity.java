package works.cae.simplegameenginev1;

import android.app.Activity;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by salfl on 16/12/16.
 */

public class SGActivity extends Activity {

    public static final String TAG = "SimpleGameEngine";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() chamado.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() chamado.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart( chamado");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart( chamado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume chamado");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop( chamado");
    }

}
