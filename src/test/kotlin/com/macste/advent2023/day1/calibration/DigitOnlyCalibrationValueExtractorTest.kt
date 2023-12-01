package com.macste.advent2023.day1.calibration

import io.kotest.matchers.ints.shouldBeExactly
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource


class DigitOnlyCalibrationValueExtractorTest {
    companion object {
        @JvmStatic
        fun correctCalibrationValues() = listOf(
            Arguments.of("sfa2kjhbkdjfhs8", 28),
            Arguments.of("1", 11),
            Arguments.of("treb7uchet", 77),
            Arguments.of("1abc2", 12),
            Arguments.of("pqr3stu8vwx", 38),
            Arguments.of("a1b2c3d4e5f", 15),
            Arguments.of("nu892nda0321", 81),
            Arguments.of("2143564575664", 24)
        )
    }

    private val digitOnlyCalibrationValueExtractor = DigitOnlyCalibrationValueExtractor()


    @ParameterizedTest
    @MethodSource("correctCalibrationValues")
    fun `should extract calibration values correctly`(text: String, calibrationValue: Int) {
        digitOnlyCalibrationValueExtractor.extractFrom(text) shouldBeExactly calibrationValue
    }
}