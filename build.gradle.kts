// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    alias(libs.plugins.ksp) apply false
    id("org.jetbrains.kotlin.kapt") version "1.9.23" apply false

}
buildscript {
    repositories {
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }
    dependencies {
        classpath(libs.kotlin.gradle.plugin)
    }
}

apply(plugin = "org.jetbrains.kotlin.kapt")
