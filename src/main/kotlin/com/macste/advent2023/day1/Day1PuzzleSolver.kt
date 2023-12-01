package com.macste.advent2023.day1

import com.macste.advent2023.PuzzleSolver
import com.macste.advent2023.day1.calibration.DigitAndWordCalibrationValueExtractor
import com.macste.advent2023.day1.calibration.DigitOnlyCalibrationValueExtractor
import java.io.File

class Day1PuzzleSolver
    : PuzzleSolver {

    override val partOneFile = File("inputs/day-1/input.txt")
    override val partOneExampleFile = File("inputs/day-1/example-1.txt")
    override val partTwoFile = File("inputs/day-1/input.txt")
    override val partTwoExampleFile = File("inputs/day-1/example-2.txt")

    override fun solveForPartOne(inputData: File): Int {
        val calibrationValueExtractor = DigitOnlyCalibrationValueExtractor()
        return inputData.readLines().sumOf { calibrationValueExtractor.extractFrom(it) }
    }

    override fun solveForPartTwo(inputData: File): Int {
        val calibrationValueExtractor = DigitAndWordCalibrationValueExtractor()
        return inputData.readLines().sumOf { calibrationValueExtractor.extractFrom(it) }
    }
}