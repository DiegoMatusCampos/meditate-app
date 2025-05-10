plugins {
    alias(libs.plugins.meditationapp.android.library.compose)
}

android {
    namespace = "com.dm.core.presentation.designsystem"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    debugImplementation(libs.androidx.ui.tooling)
    implementation(libs.androidx.ui.tooling.preview)
    api(libs.androidx.material3)


}