package com.kp.fizzbuzz

import org.junit.Assert
import org.junit.Test

class FizzBuzzTest {

    private val fizzBuzz = FizzBuzz()

    @Test
    fun `Given test function returns value when we pass Integer in argument`(){
        val value = "1"
        Assert.assertEquals(value, fizzBuzz.convert(1))
        Assert.assertNotEquals(value, fizzBuzz.convert(2))
    }

    @Test
    fun `Given convert function should not return Fizz when any value passed which is not divisible by 3`(){
        Assert.assertTrue(fizzBuzz.convert(1) != "Fizz")
    }

    @Test
    fun `Given convert function should return Fizz when we pass any value which is divisible by 3`(){
        Assert.assertTrue(fizzBuzz.convert(3) == "Fizz")
    }

    @Test
    fun `Given convert function should not return Buzz when any value which is not divisible by 5`(){
        Assert.assertFalse(fizzBuzz.convert(3) == "Buzz")
    }

    @Test
    fun `Given convert function should return Buzz when any value which is divisible by 5`(){
        Assert.assertTrue(fizzBuzz.convert(5) == "Buzz")
        Assert.assertTrue(fizzBuzz.convert(10) == "Buzz")
    }

    @Test
    fun `Given convert function should not return FizzBuzz when any value which is not divisible by 15`(){
        Assert.assertFalse(fizzBuzz.convert(3) == "FizzBuzz")
    }

    @Test
    fun `Given convert function should return FizzBuzz when any value which is divisible by 15`(){
        Assert.assertTrue(fizzBuzz.convert(15) == "FizzBuzz")
        Assert.assertTrue(fizzBuzz.convert(45) == "FizzBuzz")
    }

    @Test
    fun `Given convert function should return Buzz when any value which is divisible 5 or any value which has 5 in it`(){
        // Value is divisible by 5
        Assert.assertTrue(fizzBuzz.convert(5) == "Buzz")
        // Value is not divisible by 5, but it has 5 in it
        Assert.assertTrue(fizzBuzz.convert(52) == "Buzz")
    }

    @Test
    fun `Given convert function should return Fizz when any value which is divisible 3 or any value which has 3 in it`(){
        // Value is divisible by 3
        Assert.assertTrue(fizzBuzz.convert(18) == "Fizz")
        // Value is not divisible by 3, but it has 3 in it
        Assert.assertTrue(fizzBuzz.convert(31) == "Fizz")
    }

    @Test
    fun `Check acceptance criteria with passing multiple test`(){
        Assert.assertEquals("1", fizzBuzz.convert(1))
        Assert.assertEquals("2", fizzBuzz.convert(2))
        Assert.assertEquals("Fizz", fizzBuzz.convert(3))
        Assert.assertEquals("4", fizzBuzz.convert(4))
        Assert.assertEquals("Buzz", fizzBuzz.convert(5))
        Assert.assertEquals("Fizz", fizzBuzz.convert(6))
        Assert.assertEquals("7", fizzBuzz.convert(7))
        Assert.assertEquals("8", fizzBuzz.convert(8))
        Assert.assertEquals("Fizz", fizzBuzz.convert(9))
        Assert.assertEquals("Buzz", fizzBuzz.convert(10))
        Assert.assertEquals("11", fizzBuzz.convert(11))
        Assert.assertEquals("Fizz", fizzBuzz.convert(12))
        Assert.assertEquals("Fizz", fizzBuzz.convert(13))
        Assert.assertEquals("14", fizzBuzz.convert(14))
        Assert.assertEquals("FizzBuzz", fizzBuzz.convert(15))
        Assert.assertEquals("16", fizzBuzz.convert(16))
        Assert.assertEquals("Buzz", fizzBuzz.convert(100))

    }
}