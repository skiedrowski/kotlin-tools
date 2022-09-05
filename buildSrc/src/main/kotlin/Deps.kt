object Ver {
    const val kotlin = "1.7.10" //also update buildSrc/build.gradle.kts

    //test
    const val junit = "4.+"
    const val hamkrest = "1.4.+"
    const val mockito = "2.9.+"
    const val mockito_kotlin = "1.5.+"
}

object Deps {
    const val kt_stdlib_jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Ver.kotlin}"

    const val junit = "junit:junit:${Ver.junit}"
    const val mockito_kotlin = "com.nhaarman:mockito-kotlin:${Ver.mockito_kotlin}"

    // kotlin-reflect is (just) used by mockito-kotlin
    const val kt_reflect = "org.jetbrains.kotlin:kotlin-reflect:${Ver.kotlin}"
    const val hamkrest = "com.natpryce:hamkrest:${Ver.hamkrest}"
    const val mockito = "org.mockito:mockito-core:${Ver.mockito}"
}
