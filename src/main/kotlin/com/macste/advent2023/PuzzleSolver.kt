package com.macste.advent2023

import java.io.File

interface PuzzleSolver {
    val partOneFile: File
    val partOneExampleFile: File
    val partTwoFile: File
    val partTwoExampleFile: File

    fun solveForPartOne(inputData: File): Int

    fun solveForPartTwo(inputData: File): Int
}