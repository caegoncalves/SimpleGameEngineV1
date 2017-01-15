package works.cae.simplegameenginev1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.view.View;

/**
 * Created by salfl on 15/01/17.
 */

public class SGView extends View {
    private Point mDimensions = new Point();
    private boolean mHasStarted;

    public SGView(Context context){
        super(context);
    }

    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawColor(Color.LTGRAY);

        step(canvas);
    }

    public void step(Canvas canvas) {
    }

    @Override
    protected void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
        mDimensions.set(width, height);

        if(!mHasStarted) {
            setup();

            mHasStarted = true;
        }
    }

    protected void setup() {
    }

    public Point getDimensions() {
        return mDimensions;
    }
}
