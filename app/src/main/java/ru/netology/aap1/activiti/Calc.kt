package ru.netology.aap1.activiti

import android.annotation.SuppressLint
import android.icu.text.DecimalFormat
import kotlin.math.floor

object Calc {
    fun intToText(like: Int): String {
        return when {
            like < 1000 -> like.toString()
            like < 1100 -> "1K"
            like < 10000 -> formatWithDecimals(like.toDouble() / 1000, 1) + "K"
            like < 1000000 -> formatWithDecimals(like.toDouble() / 1000, 0) + "K"
            like < 1000000000 -> formatWithDecimals(like.toDouble() / 1000000, 1) + "M"
            else -> "Более 1 Billion"
        }
    }

    @SuppressLint("DefaultLocale")
    private fun formatWithDecimals(number: Double, decimals: Int): String {
        return try {
            val pattern = if (decimals == 1) "#,##0.#" else "#,##0"
            DecimalFormat(pattern).format(number)
        } catch (_: Exception) {
            if (decimals == 1) {
                String.format("%.1f", number)
            } else {
                floor(number).toInt().toString()
            }
        }
    }
}



