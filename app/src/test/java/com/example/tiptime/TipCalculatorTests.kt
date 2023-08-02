package com.example.tiptime

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {
    @Test
    fun `calculates tip with default values for tipPercentage and roundUp`() {
        val amount = 100.0
        val expectedTip = NumberFormat.getCurrencyInstance().format(15)
        val actualTip = calculateTip(amount)
        assertEquals(expectedTip, actualTip)
    }
}
