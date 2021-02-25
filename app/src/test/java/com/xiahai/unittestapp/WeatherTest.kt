package com.xiahai.unittestapp

import com.xiahai.unittestapp.test.IWeather
import com.xiahai.unittestapp.test.Umbrella
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

/**
 * @ClassName: WeatherTest
 * @Description:
 * @Date: 2021/2/18 11:57 AM
 * @History:
 * <date> <version> <desc>
 */
class WeatherTest {

    lateinit var umbrella: Umbrella

    @Before
    fun setUp() {
        umbrella = Umbrella()
    }

    @Test
    fun totalPrice_sunnyDay(){
        //1. fake weather
        val weather = StubWeather()
        //2. return sunny
        weather.fakeIsSunny = true

        //3. test case
        val actual = umbrella.totalPrice(weather,3,100)
        val expected = 270
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun totalPrice_rainingDay(){
        val weather = StubWeather()
        weather.fakeIsSunny = false

        val actual = umbrella.totalPrice(weather,3,100)
        val expected = 300

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun test_totalPrice_sunnyDay_by_mokito(){

        //1. mock()
        val weather = mock(IWeather::class.java)
        //2. return value
        `when`(weather.isSunny()).thenReturn(true)

        //3. test case
        val actual = umbrella.totalPrice(weather,3,100)
        val expected = 270

        Assert.assertEquals(expected, actual)
    }
}