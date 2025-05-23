package io.github.vikulin.opengammakit.view

import android.content.Context
import android.widget.TextView
import com.github.mikephil.charting.components.MarkerView
import com.github.mikephil.charting.utils.MPPointF
import io.github.vikulin.opengammakit.R

class ResolutionMarkerView(context: Context, layoutResource: Int) : MarkerView(context, layoutResource) {
    private val resolutionText: TextView = findViewById(R.id.valueTextView)

    fun setResolution(value: Float, textColor: Int) {
        resolutionText.text = "Res: %.2f%%".format(value)
        resolutionText.setTextColor(textColor)
    }

    override fun getOffset(): MPPointF {
        // Position top-right of the cross
        return MPPointF(0f+20, -height.toFloat()-20)
    }
}
