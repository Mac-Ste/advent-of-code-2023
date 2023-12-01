package com.macste.advent2023

import io.kotest.matchers.ints.shouldBeExactly
import org.junit.jupiter.api.Test

abstract class PuzzleTest(
    private val puzzleSolver: PuzzleSolver,
    private val partOneResult: Int,
    private val partTwoResult: Int,
    private val partOneExampleResult: Int,
    private val partTwoExampleResult: Int
) {

    @Test
    fun `should solve part one of the puzzle for input data`() {
        puzzleSolver.solveForPartOne(puzzleSolver.partOneFile) shouldBeExactly partOneResult
    }

    @Test
    fun `should solve part one of the puzzle for example data`() {
        puzzleSolver.solveForPartOne(puzzleSolver.partOneExampleFile) shouldBeExactly partOneExampleResult
    }

    @Test
    fun `should solve part two of the puzzle for input data`() {
        puzzleSolver.solveForPartTwo(puzzleSolver.partTwoFile) shouldBeExactly partTwoResult
    }

    @Test
    fun `should solve part two of the puzzle for example data`() {
        puzzleSolver.solveForPartTwo(puzzleSolver.partTwoExampleFile) shouldBeExactly partTwoExampleResult
    }
}