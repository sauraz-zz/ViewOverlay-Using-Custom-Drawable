package beer.com.ondraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import static android.graphics.Paint.ANTI_ALIAS_FLAG;

/**
 * Created by 1405473 on 24-01-2017.
 */

public class custom extends Drawable  {


    private Paint paint;
    private Context context;

    public custom(Context context) {
        this.context = context;
        initPaint();
    }

    private void initPaint() {
        paint = new Paint();
        paint.setColor(Color.CYAN);
        paint.setAntiAlias(true);
    }

    @Override
    public void draw(@NonNull Canvas canvas) {
        canvas.drawColor(Color.parseColor("#CCFFFFFF"));
        canvas.drawCircle(canvas.getWidth()/2, canvas.getHeight()/2, 100, paint);
    }

    @Override
    public void setAlpha(int i) {

    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {

    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;
    }

}
