plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    kotlin("plugin.serialization") version "1.9.0"
}
buildscript {
    dependencies {
        // Use the same version in the error
        classpath(libs.atomicfu.gradle.plugin)
    }
}

allprojects {
    apply(plugin = "kotlinx-atomicfu")
}

android {
    namespace = "com.labs.manga_verse"
//    compileSdkVersion(JavaVersion.VERSION_17)

    defaultConfig {
        applicationId = "com.labs.manga_verse"
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
        minSdk = 21
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
//    packaging {
//        resources {
//            excludes += "/META-INF/{AL2.0,LGPL2.1}"
//        }
//    }
    compileSdk = 34
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.ktor.serializaiton)
    implementation(libs.ktor.content.negotiation)
    implementation(libs.ktor.client.okhttp)
    implementation(libs.ktor.core)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.navigation)
    implementation("io.coil-kt:coil-compose:2.1.0")
//    implementation("com.google.accompanist:accompanist-glide:0.28.0")
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    implementation(libs.ktor.client.android)
    runtimeOnly(libs.kotlinx.coroutines.core)
//    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.7")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.7")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.google.code.gson:gson:2.8.6")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
}
