package works.cae.simplegameenginev1;

import android.os.SystemClock;

/**
 * Created by salfl on 18/01/17.
 */

public class SGStepwatch {
    protected long mCurrentTime; // Timestamp atual
    protected long mLastTime; // Timestamp anterior
    protected float mEleapsedTime; // Intervalo entre Timestamps

    protected float tick() {
        if(mCurrentTime == 0) { // Se mCurrentTime for 0, precisam ser atribuídos valores ao mCurrentTime e m LastTime, aqui atribuiremos o Timestamp atual
            mLastTime = mCurrentTime = SystemClock.uptimeMillis(); // Método uptimeMillis() retorna um timestamp que será usado para definir a velocidade do movimento dos elementos em tela e inicia o mLastTime no Timestamp atual
        } else {
            mCurrentTime = SystemClock.uptimeMillis(); // Atribui o tempo atual do cronômetro ao mCurrentTime
        }

        mEleapsedTime = (mCurrentTime - mLastTime) / 1000.0f; // Derterminação do intervalo do ciclo de atualização da tela, importante para determinação da velocidade do jogo
        mLastTime = mCurrentTime; // Atribui o novo valor para mLastTime que é a última leitura anterior ao tempo atual

        return mEleapsedTime; // Retorna o tempo transcorrido

    }
}
