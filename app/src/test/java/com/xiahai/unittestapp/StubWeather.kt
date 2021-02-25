package com.xiahai.unittestapp

import com.xiahai.unittestapp.test.IWeather

/**
 * @ClassName: SubWeather
 * @Description:
 * @Date: 2021/2/18 11:54 AM
 * @History:
 * <date> <version> <desc>
 */
class StubWeather : IWeather {
    var fakeIsSunny = false

    override fun isSunny(): Boolean {
        //回傳假定天氣
        return fakeIsSunny
    }
}