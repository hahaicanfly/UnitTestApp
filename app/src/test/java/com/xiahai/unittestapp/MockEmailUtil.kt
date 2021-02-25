package com.xiahai.unittestapp

import com.xiahai.unittestapp.test.IEmailUtil

class MockEmailUtil : IEmailUtil {
    var receiveEmail: String? = null

    override fun sendCustomer(email: String) {
        receiveEmail = email
    }
}