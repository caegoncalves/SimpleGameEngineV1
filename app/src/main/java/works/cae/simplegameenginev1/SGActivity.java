package works.cae.simplegameenginev1;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.nfc.Tag;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import static android.R.attr.breadCrumbShortTitle;
import static android.R.attr.orientation;
import static works.cae.simplegameenginev1.SGActivity.SGOrientation.LANDSCAPE;
import static works.cae.simplegameenginev1.SGActivity.SGOrientation.PORTRAIT;

/**
 * Created by salfl on 16/12/16.
 */

public class SGActivity extends Activity {

    public static final String TAG = "SimpleGameEngine";

    public enum SGOrientation {
        LANDSCAPE,
        PORTRAIT
    }

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

    public void enableKeepScreenOn() {
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }

    public void setOrientation(SGOrientation) {
        switch(orientation) {
            case LANDSCAPE:
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
                break;

            case PORTRAIT:
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                break;
        }
    }

    public void enableFullScreen() {
        Window window = getWindow();
        window.addFlags((WindowManager.LayoutParams.FLAG_FULLSCREEN));
        window.requestFeature(Window.FEATURE_NO_TITLE);

        if(Build.VERSION.SDK_INT >= 19) {
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    }

}
