package com.xiahai.unittestapp

import com.xiahai.unittestapp.test.Math
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MathTest {

    private lateinit var math: Math

    @Before
    fun setup() {
        math = Math()
    }

    @Test
    fun addTest() {
        val expected = 3
        val actual = math.add(1, 2)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun test_Num1_Less_Num2() {
        val expected = math.minimun(1, 3)
        val actual = 1
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun text_Num2_Less_Num1() {
        val expected = math.minimun(3, 1)
        val actual = 1
        Assert.assertEquals(expected, actual)
    }

}