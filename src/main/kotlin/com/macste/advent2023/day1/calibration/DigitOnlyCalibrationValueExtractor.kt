package com.macste.advent2023.day1.calibration

class DigitOnlyCalibrationValueExtractor : CalibrationValueExtractor {
    override fun extractFrom(text: String): Int {
        val firstDigit = text.first { char -> char.isDigit() }.digitToInt()
        val secondDigit = text.last { char -> char.isDigit() }.digitToInt()
        return firstDigit * 10 + secondDigit
    }
}