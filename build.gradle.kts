plugins {
    kotlin("jvm") version com.smile.mvvmtemplate.buildsrc.Depends.Versions.kotlinVersion
    id("org.sonarqube") version 3.4.0.2513
    detekt
    id("com.github.ben-manes.versions") version com.smile.mvvmtemplate.buildsrc.Depends.Versions.checkDependencyVersionsVersion
    id("com.osacky.doctor") version com.smile.mvvmtemplate.buildsrc.Depends.Versions.gradleDoctorVersion
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(com.smile.mvvmtemplate.buildsrc.Depends.ClassPaths.gradle)
        classpath(
            kotlin(
                com.smile.mvvmtemplate.buildsrc.Depends.ClassPaths.kotlin_gradle_plugin,
                version = com.smile.mvvmtemplate.buildsrc.Depends.Versions.kotlinVersion
            )
        )
        classpath(com.smile.mvvmtemplate.buildsrc.Depends.ClassPaths.navigation_safe_args_gradle_plugin)
        classpath(com.smile.mvvmtemplate.buildsrc.Depends.ClassPaths.hilt_android_gradle_plugin)
        classpath(com.smile.mvvmtemplate.buildsrc.Depends.ClassPaths.sonarqube_gradle_plugin)
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.google.com/")
        maven("https://jitpack.io")
        maven("https://plugins.gradle.org/m2/")
    }
}
