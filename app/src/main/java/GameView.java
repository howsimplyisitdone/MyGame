import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by dominic.m.condes on 28 Nov 2016.
 */

public class GameView extends GLSurfaceView {
    private final GameRenderer gameRenderer;
    public GameView(Context context) {
        super(context);

        setEGLContextClientVersion(2);

        gameRenderer = new GameRenderer(context);

        setRenderer(gameRenderer);
    }
}
