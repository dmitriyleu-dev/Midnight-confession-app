plugins {
    id("com.android.application") version "8.7.3"
}

android {
    namespace = "com.midnightconfession.host"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.midnightconfession.host"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "0.1"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
dependencies {}
