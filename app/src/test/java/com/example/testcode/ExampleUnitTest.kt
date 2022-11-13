package com.example.testcode

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    /**
     * 코틀린에서 if는 expression(식)이다.
     * 식이 본문인 함수를 자주 사용한다.
     */

    @Test
    fun max() {
        val a = 10
        val b = 3
        if (a > b) println("max() 함수의 결과 값 : $a") else println("max() 함수의 결과 값 : $b")
    }


    @Test
    fun checkValidation() {
        val name = "신지원"

        if (name == "신지원") println("공주") else println("악마")
    }

}