package com.mitsinsar.peracompactdecimalformat.numberformatter

import com.mitsinsar.peracompactdecimalformat.numberformatter.NumberFormatter.Constants.FORMAT_PATTERN
import java.math.BigDecimal
import java.math.RoundingMode
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale

actual class PeraNumberFormatter(override val localeConstant: String) : NumberFormatter {

    actual override fun format(number: BigDecimal): String {
        return DecimalFormat(FORMAT_PATTERN, DecimalFormatSymbols(Locale(localeConstant))).apply {
            roundingMode = RoundingMode.DOWN
        }.format(number)
    }

    actual companion object {
        actual fun getInstance(localeConstant: String): NumberFormatter = PeraNumberFormatter(localeConstant)
    }
}
