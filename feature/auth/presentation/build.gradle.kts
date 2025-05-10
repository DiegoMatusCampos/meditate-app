plugins {
    alias(libs.plugins.meditationapp.android.feature.ui)
}

android {
    namespace = "com.dm.feature.auth.presentation"
}

dependencies {

    implementation(projects.feature.auth.domain)
    implementation(projects.core.domain)

}