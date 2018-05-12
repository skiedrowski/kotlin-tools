package com.github.skiedrowski.tools.kt.lang

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.present
import org.junit.Test
import java.io.FileNotFoundException

class LangKtTest {

    @Test
    fun getResourceFile() {
        val resourceFile = LangKtTest::class.java.getResourceFile("LangKtTestResource.txt")
        assertThat(resourceFile, present())
    }

    @Test(expected = FileNotFoundException::class)
    fun getResourceFileNonexistant() {
        LangKtTest::class.java.getResourceFile("LangKtTestResourceXXXXXX.txt")
    }

}