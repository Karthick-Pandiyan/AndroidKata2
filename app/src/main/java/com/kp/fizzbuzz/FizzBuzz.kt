package com.kp.fizzbuzz

class FizzBuzz {

    fun convert(convertToFizzBuzz: Int): String {

        return when{
            convertToFizzBuzz % 15 == 0 -> return "FizzBuzz"
            convertToFizzBuzz % 5 == 0 || has5InIt(convertToFizzBuzz) -> return "Buzz"
            convertToFizzBuzz % 3 == 0 || has3InIt(convertToFizzBuzz) -> return "Fizz"
            else -> convertToFizzBuzz.toString()
        }
    }

    private fun has3InIt(convertToFizzBuzz: Int) = convertToFizzBuzz.toString().contains("3")

    private fun has5InIt(convertToFizzBuzz: Int) = convertToFizzBuzz.toString().contains("5")
}