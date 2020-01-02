package com.kp.fizzbuzz

import org.junit.Assert
import org.junit.Test

class FizzBuzzTest {

    @Test
    fun `Given test function returns value when we pass Integer in argument`(){
        val value = "1"
        Assert.assertEquals(value, convert(1))
        Assert.assertNotEquals(value, convert(2))
    }

    @Test
    fun `Given convert function should not return Fizz when any value passed which is not divisible by 3`(){
        Assert.assertTrue(convert(1) != "Fizz")
    }

    @Test
    fun `Given convert function should return Fizz when we pass any value which is divisible by 3`(){
        Assert.assertTrue(convert(3) == "Fizz")
    }

    @Test
    fun `Given convert function should not return Buzz when any value which is not divisible by 5`(){
        Assert.assertFalse(convert(3) == "Buzz")
    }

    @Test
    fun `Given convert function should return Buzz when any value which is divisible by 5`(){
        Assert.assertTrue(convert(5) == "Buzz")
        Assert.assertTrue(convert(10) == "Buzz")
    }

    @Test
    fun `Given convert function should not return FizzBuzz when any value which is not divisible by 15`(){
        Assert.assertFalse(convert(3) == "FizzBuzz")
    }

    @Test
    fun `Given convert function should return FizzBuzz when any value which is divisible by 15`(){
        Assert.assertTrue(convert(15) == "FizzBuzz")
        Assert.assertTrue(convert(45) == "FizzBuzz")
    }

    @Test
    fun `Given convert function should return Buzz when any value which is divisible 5 or any value which has 5 in it`(){
        // Value is divisible by 5
        Assert.assertTrue(convert(5) == "Buzz")
        // Value is not divisible by 5, but it has 5 in it
        Assert.assertTrue(convert(52) == "Buzz")
    }

    @Test
    fun `Given convert function should return Fizz when any value which is divisible 3 or any value which has 3 in it`(){
        // Value is divisible by 3
        Assert.assertTrue(convert(18) == "Fizz")
        // Value is not divisible by 3, but it has 3 in it
        Assert.assertTrue(convert(31) == "Fizz")
    }

    @Test
    fun `Check acceptance criteria with passing multiple test`(){
        Assert.assertEquals("1", convert(1))
        Assert.assertEquals("2", convert(2))
        Assert.assertEquals("Fizz", convert(3))
        Assert.assertEquals("4", convert(4))
        Assert.assertEquals("Buzz", convert(5))
        Assert.assertEquals("Fizz", convert(6))
        Assert.assertEquals("7", convert(7))
        Assert.assertEquals("8", convert(8))
        Assert.assertEquals("Fizz", convert(9))
        Assert.assertEquals("Buzz", convert(10))
        Assert.assertEquals("11", convert(11))
        Assert.assertEquals("Fizz", convert(12))
        Assert.assertEquals("Fizz", convert(13))
        Assert.assertEquals("14", convert(14))
        Assert.assertEquals("FizzBuzz", convert(15))
        Assert.assertEquals("16", convert(16))
        Assert.assertEquals("Buzz", convert(100))

    }

    private fun convert(convertToFizzBuzz: Int): String {

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