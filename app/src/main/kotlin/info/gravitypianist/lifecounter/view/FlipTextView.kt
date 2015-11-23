package info.gravitypianist.lifecounter.view

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.widget.TextView

/**
 * 上下反転したTextView.
 * 相手側の表示で使う
 * Created by hyata on 2015/11/23.
 */
class FlipTextView(context: Context, attrs: AttributeSet) : TextView(context, attrs) {
    override fun onDraw(canvas: Canvas) {
        canvas.rotate(180f, width.toFloat() / 2, height.toFloat() / 2)
        super.onDraw(canvas)
    }
}