package com.xiahai.unittestapp.test

import com.xiahai.unittestapp.test.Umbrella
import com.xiahai.unittestapp.test.Weather

/**
 * @ClassName: Order
 * @Description:
 * @Date: 2021/2/18 2:39 PM
 * @History:
 * <date> <version> <desc>
 */
class Order {

    fun insertOrder(email: String,quantity: Int, price: Int,emailUtil: IEmailUtil){
        val weather = Weather()
        val umbrella = Umbrella()
        umbrella.totalPrice(weather, quantity, price)

        //send email
        emailUtil.sendCustomer(email)
    }
}