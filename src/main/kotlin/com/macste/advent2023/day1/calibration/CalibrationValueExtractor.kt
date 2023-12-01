package com.macste.advent2023.day1.calibration

interface CalibrationValueExtractor {
    fun extractFrom(text: String): Int
}