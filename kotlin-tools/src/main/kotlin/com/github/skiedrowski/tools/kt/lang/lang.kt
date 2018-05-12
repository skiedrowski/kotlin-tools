package com.github.skiedrowski.tools.kt.lang

import java.io.File
import java.io.FileNotFoundException

fun Class<*>.getResourceFile(resourceFilePath: String): File {
    val exampleLogsUrl = getResource(resourceFilePath)
    if (exampleLogsUrl == null) {
        throw FileNotFoundException("file not found $resourceFilePath")
    }
    val schemeSpecificPart = exampleLogsUrl.toURI().getSchemeSpecificPart()!!
    return File(schemeSpecificPart)
}