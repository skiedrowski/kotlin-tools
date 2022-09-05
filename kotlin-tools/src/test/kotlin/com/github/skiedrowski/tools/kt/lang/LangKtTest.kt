package com.github.skiedrowski.tools.kt.lang

import io.kotest.matchers.shouldNotBe
import org.junit.Test
import java.io.FileNotFoundException

class LangKtTest {

    @Test
    fun getResourceFile() {
        val resourceFile = LangKtTest::class.java.getResourceFile("LangKtTestResource.txt")
        resourceFile shouldNotBe null
    }

    @Test(expected = FileNotFoundException::class)
    fun getResourceFileNonexistant() {
        LangKtTest::class.java.getResourceFile("LangKtTestResourceXXXXXX.txt")
    }
}