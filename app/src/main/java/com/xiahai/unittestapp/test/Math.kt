package com.xiahai.unittestapp.test

/**
 * @ClassName: Math
 * @Description:
 * @Date: 2021/2/17 5:53 PM
 * @History:
 * <date> <version> <desc>
 */
class Math {
    fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun minimun(num1: Int, num2: Int): Int {
        return if (num1 > num2) num1 else num2
    }
}