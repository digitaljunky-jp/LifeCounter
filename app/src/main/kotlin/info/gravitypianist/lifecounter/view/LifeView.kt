package info.gravitypianist.lifecounter.view

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import butterknife.bindView
import info.gravitypianist.lifecounter.R
import java.util.logging.Logger

/**

 * Created by hyata on 2015/11/19.
 */
class LifeView(context: Context, attrs: AttributeSet) : RelativeLayout(context, attrs) {

    val valueText : TextView by bindView(R.id.value_text)

    val plus1Button : Button by bindView(R.id.plus_1_button)

    val minus1Button : Button by bindView(R.id.minus_1_button)

    val plus5Button : Button by bindView(R.id.plus_5_button)

    val minus5Button : Button by bindView(R.id.minus_5_button)


    var value:Int = 0
    set(n){
        field = n
        valueText.text = field.toString()
    }

    init {
        val array = context.obtainStyledAttributes(attrs, R.styleable.LifeView)
        val type = array.getInt(R.styleable.LifeView_type, 0)
        inflateLayout(context, type, this)
        value = array.getInt(R.styleable.LifeView_value, 0)
        array.recycle()

        plus1Button.setOnClickListener { view -> value += 1 }
        plus5Button.setOnClickListener { view -> value += 5 }

        minus1Button.setOnClickListener { view -> value -= 1 }
        minus5Button.setOnClickListener { view -> value -= 5 }
    }

    private fun inflateLayout(context: Context, type: Int, layout: RelativeLayout): View {
        when (type) {
            1 -> return LayoutInflater.from(context).inflate(R.layout.view_life_type2, layout)
            else -> return LayoutInflater.from(context).inflate(R.layout.view_life_type1, layout)
        }
    }
}
