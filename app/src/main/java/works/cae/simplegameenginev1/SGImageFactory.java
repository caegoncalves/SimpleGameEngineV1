package works.cae.simplegameenginev1;

import android.content.Context;

/**
 * Created by salfl on 20/01/17.
 */

public class SGImageFactory {
    protected Context mContext;

    public SGImageFactory(Context context) {
        mContext = context;
    }

    public SGImage createImage(String fileName) { // Criação de imagem armazenadas em /drawable*
        // TODO preencher o método

        return null;
    }

    public SGImage createImage(int sourceId) { // Criação da imagem armazenada em /assets
        // TODO preencher o método

        return null;
    }

    public Context getmContext() { // Retorna o contexto
        return mContext;
    }
}
