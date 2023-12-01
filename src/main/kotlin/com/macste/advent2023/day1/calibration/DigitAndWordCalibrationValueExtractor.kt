package com.macste.advent2023.day1.calibration

class DigitAndWordCalibrationValueExtractor: CalibrationValueExtractor {

    private val allowedValues = Regex("(?=(\\d|one|two|three|four|five|six|seven|eight|nine))")
    private val digits =  mapOf(
        "1" to 1,
        "2" to 2,
        "3" to 3,
        "4" to 4,
        "5" to 5,
        "6" to 6,
        "7" to 7,
        "8" to 8,
        "9" to 9,
        "one" to 1,
        "two" to 2,
        "three" to 3,
        "four" to 4,
        "five" to 5,
        "six" to 6,
        "seven" to 7,
        "eight" to 8,
        "nine" to 9
    )

    override fun extractFrom(text: String): Int {
        val res1 = allowedValues.findAll(text)
        val firstDigit = res1.first().groupValues.first { it.isNotEmpty() }
        val secondDigit = res1.last().groupValues.first { it.isNotEmpty() }
        return digits[firstDigit]!! * 10 + digits[secondDigit]!!
    }
}