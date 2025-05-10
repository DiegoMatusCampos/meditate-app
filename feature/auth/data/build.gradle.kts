plugins {
    alias(libs.plugins.meditationapp.android.library)
    alias(libs.plugins.meditationapp.jvm.firebase)
}

android {
    namespace = "com.dm.feature.auth.data"
}

dependencies {

    implementation(projects.core.domain)
    implementation(projects.core.data)
    implementation(projects.feature.auth.domain)
}