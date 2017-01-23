package works.cae.simplegameenginev1;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by salfl on 20/01/17.
 */

public class SGImageFactory {
    protected Context mContext;

    public SGImageFactory(Context context) {
        mContext = context;
    }

    public SGImage createImage(String fileName) { // Criação de imagem armazenadas em /assets
        Bitmap bitmap = null;

        try { // Tratamento de exceções por ser o carregamento de um arquivo externo
            AssetManager assetManager = mContext.getAssets(); // A instância mContext de Context dá acesso à AssetManager <android.content.res.AssetManager>
            InputStream inputStream = assetManager.open(fileName); // Carregamento da imagem aberta pelo inputStream
            bitmap = BitmapFactory.decodeStream(inputStream); // BitmapFactory é uma API do Android e decodifica a imagem e retorna uma instância de Bitmap que vai ser desenhada
            inputStream.close();
        } catch (IOException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SGImageFactory.createImage(): arquivo ");
            stringBuilder.append(fileName);
            stringBuilder.append(" não encontrado.");

            Log.d("SimpleGameEngine", stringBuilder.toString());

            return null;
        }

        SGImage image = new SGImage(bitmap);

        return image;
    }

    public SGImage createImage(int sourceId) {
        // TODO preencher o método

        return null;
    }

    public Context getmContext() { // Retorna o contexto
        return mContext;
    }
}
