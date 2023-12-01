package com.macste.advent2023.day1.calibration

import io.kotest.matchers.ints.shouldBeExactly
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource


class DigitAndWordCalibrationValueExtractorTest {
    companion object {
        @JvmStatic
        fun correctCalibrationValues() = listOf(
            Arguments.of("two1nine", 29),
            Arguments.of("eightwothree", 83),
            Arguments.of("abcone2threexyz", 13),
            Arguments.of("xtwone3four", 24),
            Arguments.of("4nineeightseven2", 42),
            Arguments.of("zoneight234", 14),
            Arguments.of("7pqrstsixteen", 76),
            Arguments.of("eighthree", 83),
            Arguments.of("sevenine", 79),
            Arguments.of("seven", 77),
        )
    }

    private val digitAndWordCalibrationValueExtractor = DigitAndWordCalibrationValueExtractor()


    @ParameterizedTest
    @MethodSource("correctCalibrationValues")
    fun `should extract calibration values correctly`(text: String, calibrationValue: Int) {
        digitAndWordCalibrationValueExtractor.extractFrom(text) shouldBeExactly calibrationValue
    }
}