package com.xiahai.unittestapp.test

/**
 * @ClassName: Umbrella
 * @Description:
 * @Date: 2021/2/17 5:59 PM
 * @History:
 * <date> <version> <desc>
 */

fun main() {
    val weather: IWeather = Weather()
    val umbrella = Umbrella()

    umbrella.totalPrice(weather,1,500)
}

class Umbrella {
    fun totalPrice(weather: IWeather,quantity: Int, price: Int): Int {

        val isSunny = weather.isSunny()
        var totalPrice = quantity * price

        if (isSunny) {
            totalPrice = (0.9 * totalPrice).toInt()
        }

        return totalPrice
    }
}