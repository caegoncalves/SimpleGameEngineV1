package works.cae.simplegameenginev1;

import android.graphics.Bitmap;
import android.graphics.Point;

/**
 * Created by salfl on 20/01/17.
 */

public class SGImage {
    private Bitmap mBitmap = null;
    private Point mDimensions = new Point();

    SGImage(Bitmap bitmap) { // O construtor recebe um parâmetro de Bitmap, portanto essa classe não cria o objeto, só armazena
        mBitmap = bitmap;
        mDimensions.set(mBitmap.getWidth(), mBitmap.getHeight()); // Passando as dimensões da imagem já no construtor
    }

    public Bitmap getmBitmap() {
        return mBitmap;
    }

    public Point getmDimensions() {
        return mDimensions;
    }
}
