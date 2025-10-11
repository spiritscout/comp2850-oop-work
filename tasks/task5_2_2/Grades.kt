// Task 5.2.2: conversion of marks into grades, using a function

fun main(args: Array<String>) {
    for (n in 0..(args.size - 1)) {
        var mark = args[n].toInt()
        var wGrade = grade(mark)
        println("$mark is a $wGrade")
    }
}


fun grade(mark: Int) = when (mark) {
    in 0..39   -> "Fail"
    in 40..69  -> "Pass"
    in 70..100 -> "Distinction"
    else       -> "?"
}
