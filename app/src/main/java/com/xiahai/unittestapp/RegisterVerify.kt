package com.xiahai.unittestapp

class RegisterVerify {

    fun isLoginIdVerify(loginId: String): Boolean =
        (loginId.length >= 6 && loginId.toUpperCase().first() in 'A'..'Z')

//    fun isLoginIdVerify(loginId: String): Boolean {
//        var isLoginIdOK = false
//        //帳號至少6碼，第1碼為英文，j
//        if (loginId.length >= 6) {
//            if (loginId.toUpperCase().first() in 'A'..'Z') {
//                isLoginIdOK = true
//            }
//        }
//        isLoginIdOK = (loginId.length >= 6 && loginId.toUpperCase().first() in 'A'..'Z')
//        return isLoginIdOK
//    }
}