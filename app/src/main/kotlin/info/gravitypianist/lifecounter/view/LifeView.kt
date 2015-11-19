package info.gravitypianist.lifecounter.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import info.gravitypianist.lifecounter.R

/**

 * Created by hyata on 2015/11/19.
 */
class LifeView(context: Context, attrs: AttributeSet) : RelativeLayout(context, attrs) {
    init {
        val array = context.obtainStyledAttributes(attrs, R.styleable.LifeView)
        val type = array.getInt(R.styleable.LifeView_type, 0)
        val layout = inflateLayout(context, type, this)
        array.recycle()
    }

    private fun inflateLayout(context: Context, type: Int, layout: RelativeLayout): View {
        when (type) {
            1 -> return LayoutInflater.from(context).inflate(R.layout.view_life_type2, layout)
            else -> return LayoutInflater.from(context).inflate(R.layout.view_life_type1, layout)
        }
    }
}
