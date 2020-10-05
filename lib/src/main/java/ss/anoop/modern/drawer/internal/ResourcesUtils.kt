package ss.anoop.modern.drawer.internal

import android.content.res.Resources
import android.util.TypedValue

fun dpToPx(dp: Int, resources: Resources) = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp.toFloat(), resources.displayMetrics)