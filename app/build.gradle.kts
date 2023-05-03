plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "architex.labs.coffeedrop"
    compileSdk = 33

    defaultConfig {
        applicationId = "architex.labs.coffeedrop"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.6"
    }
    packagingOptions.resources.excludes.add("META-INF/{AL2.0,LGPL2.1}")
}

dependencies {
    val coreVersion = "1.10.0"
    val lifecycleVersion = "2.6.1"
    val activityComposeVersion = "1.7.1"
    val splashScreenVersion = "1.0.1"
    val viewModelVersion = "2.6.1"
    val navigationComposeVersion = "2.5.3"
    val daggerVersion = "2.46"
    val hiltVersion = "1.0.0"

    implementation ("androidx.core:core-ktx:$coreVersion")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion")
    implementation ("androidx.activity:activity-compose:$activityComposeVersion")
    implementation (platform("androidx.compose:compose-bom:2023.04.01"))
    implementation ("androidx.compose.ui:ui")
    implementation ("androidx.compose.ui:ui-graphics")
    implementation ("androidx.compose.ui:ui-tooling-preview")
    implementation ("androidx.compose.material3:material3")
    implementation ("androidx.core:core-splashscreen:$splashScreenVersion")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-compose:$viewModelVersion")
    implementation ("androidx.navigation:navigation-compose:$navigationComposeVersion")
    implementation ("com.google.dagger:hilt-android:$daggerVersion")
    kapt ("com.google.dagger:hilt-android-compiler:$daggerVersion")
    implementation ("androidx.hilt:hilt-navigation-compose:$hiltVersion")

    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation (platform ("androidx.compose:compose-bom:2023.04.01"))
    androidTestImplementation ("androidx.compose.ui:ui-test-junit4")
    debugImplementation ("androidx.compose.ui:ui-tooling")
    debugImplementation ("androidx.compose.ui:ui-test-manifest")
}

kapt {
    correctErrorTypes = true
}