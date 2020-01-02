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
    fun `Given convert function should not return Fizz when 1 is passed to test`(){
        Assert.assertTrue(convert(1) != "Fizz")
    }

    private fun convert(convertTOFizzBuss: Int): String {

        if (convertTOFizzBuss % 3 == 0)
            return "Fizz"

        return convertTOFizzBuss.toString()
    }
}