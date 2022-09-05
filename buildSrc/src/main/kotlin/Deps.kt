object Ver {
    const val kotlin = "1.7.10" //also update buildSrc/build.gradle.kts

    //test
    const val junit = "4.+"
    const val mockk = "1.12.7"
    const val kotest_assertions = "5.4.2"
}

object Deps {
    const val kt_stdlib_jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Ver.kotlin}"

    const val junit = "junit:junit:${Ver.junit}"

    const val mockk = "io.mockk:mockk:${Ver.mockk}"
    const val kotest_assertions = "io.kotest:kotest-assertions-core:${Ver.kotest_assertions}"
}