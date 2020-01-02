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

    private fun convert(convertToFizzBuzz: Int): String {

        if(convertToFizzBuzz % (15) == 0)
            return "FizzBuzz"
        if (convertToFizzBuzz % 5 == 0)
            return "Buzz"
        if (convertToFizzBuzz % 3 == 0)
            return "Fizz"

        return convertToFizzBuzz.toString()
    }
}