plugins {
    alias(libs.plugins.meditationapp.android.library.compose)
}

android {
    namespace = "com.dm.core.presentation.ui"
}

dependencies {


    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.ui)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.lifecycle.runtime.compose)
    implementation(libs.androidx.lifecycle.viewmodel.compose)

    implementation(projects.core.domain)
    implementation(projects.core.presentation.designsystem)
}