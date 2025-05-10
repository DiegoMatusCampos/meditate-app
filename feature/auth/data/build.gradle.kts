plugins {
    alias(libs.plugins.meditationapp.android.library)
}

android {
    namespace = "com.dm.feature.auth.data"
}

dependencies {

    implementation(projects.core.domain)
    implementation(projects.core.data)
    implementation(projects.feature.auth.domain)
}