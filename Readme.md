# Collection (not yet) of Kotlin-related tools

published in my bintray repo

	repositories {
    	maven { url "https://dl.bintray.com/skiedrowski/maven" }
    }
    	
    dependencies {
     	compile "com.github.skiedrowski.tools:kotlin-tools:$ver.kt_tools"
    }
    
Bintray file upload path: `com/github/skiedrowski/tools/kotlin-tools/VERSION`

## Annotations for compiler plugins

see http://kotlinlang.org/docs/reference/compiler-plugins.html

Configuration in `build.gradle`

	buildscript {
		ext.kotlin_version = '1.2.0'

		repositories {
			mavenCentral()
		}

		dependencies {
			classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
			classpath "org.jetbrains.kotlin:kotlin-allopen:$kotlin_version"
			classpath "org.jetbrains.kotlin:kotlin-noarg:$kotlin_version"
		}
	}

	apply plugin: 'kotlin'
	
	apply plugin: 'kotlin-allopen'
	apply plugin: 'kotlin-noarg'

	allOpen {
		annotation('com.github.skiedrowski.tools.kt.compiler.allopen.AllOpen')
	}

	noArg {
		annotation('com.github.skiedrowski.tools.kt.compiler.noarg.NoArg')
	}