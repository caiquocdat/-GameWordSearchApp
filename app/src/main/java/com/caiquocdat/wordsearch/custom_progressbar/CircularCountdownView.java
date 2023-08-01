package com.caiquocdat.wordsearch.custom_progressbar;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import com.caiquocdat.wordsearch.R;

public class CircularCountdownView extends View {

    private final Paint paint;
    private float angle;

    public CircularCountdownView(Context context, AttributeSet attrs) {
        super(context, attrs);

        paint = new Paint();
        paint.setColor(0xFF00FF00); // Màu sắc của vòng đếm ngược. Bạn có thể thay đổi màu này theo ý muốn.
        paint.setStrokeWidth(10); // Độ dày của vòng đếm ngược. Bạn cũng có thể thay đổi giá trị này.
        paint.setStyle(Paint.Style.STROKE);

        angle = 360; // Bắt đầu từ 360 độ, tương ứng với một vòng tròn đầy đủ.
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();

        int contentWidth = getWidth() - paddingLeft - paddingRight;
        int contentHeight = getHeight() - paddingTop - paddingBottom;

        // Giảm kích thước của hình tròn để tạo ra không gian cho đường viền
        float radius = Math.min(contentWidth, contentHeight) / 2f - paint.getStrokeWidth() / 2f;
        float centerX = paddingLeft + contentWidth / 2f;
        float centerY = paddingTop + contentHeight / 2f;

        if (angle == 0) {
            paint.setColor(0xFFFA0000);
            // Khi đếm ngược xong, vẽ một hình tròn đầy đủ
            canvas.drawCircle(centerX, centerY, radius, paint);
            paint.setColor(0xFF00FF00);
        } else {
            // Khi đang đếm ngược, vẽ một phần của hình tròn
            canvas.drawArc(centerX - radius, centerY - radius, centerX + radius, centerY + radius,
                    90, angle, false, paint);
        }
    }

    // Cập nhật góc và vẽ lại view.
    public void update(float seconds, float maxSeconds) {
        angle = 360 * (seconds / maxSeconds);
        TextView countdownText = ((Activity) getContext()).findViewById(R.id.countdownText);
        countdownText.setText(String.valueOf((int)seconds));
        invalidate();
    }
}

