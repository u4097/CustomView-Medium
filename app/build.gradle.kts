plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion (26)
    defaultConfig {
        applicationId="com.iacovelli.customview"
        minSdkVersion(19)
        targetSdkVersion(26)
        versionCode=1
        versionName="1.0"
        testInstrumentationRunner="android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
       getByName("release") {
            isMinifyEnabled=false
        }
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.20")
    implementation("com.android.support:appcompat-v7:26.1.0")
    implementation("com.android.support.constraint:constraint-layout:1.1.3")
    testImplementation("junit:junit:4.12")
    androidTestImplementation("com.android.support.test:runner:1.0.2")
    androidTestImplementation("com.android.support.test.espresso:espresso-core:3.0.2")
}
