package info.gravitypianist.lifecounter.view

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.widget.Button

/**
 * 上下反転したButton.
 * 相手側の表示で使う
 * Created by hyata on 2015/11/23.
 */
class FlipButton(context: Context, attrs: AttributeSet) : Button(context, attrs) {
    override fun onDraw(canvas: Canvas) {
        canvas.rotate(180f, width.toFloat() / 2, height.toFloat() / 2)
        super.onDraw(canvas)
    }
}