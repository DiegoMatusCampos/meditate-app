plugins {
    alias(libs.plugins.meditationapp.android.feature.ui)
}

android {
    namespace = "com.dm.feature.meditation.presentation"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.coil.compose)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.lifecycle.runtime.compose)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    api(libs.androidx.material3)

    implementation(projects.core.domain)
    implementation(projects.feature.meditation.domain)
}