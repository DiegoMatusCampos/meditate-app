plugins {
    alias(libs.plugins.meditationapp.android.library)
    alias(libs.plugins.meditationapp.jvm.firebase)
}

android {
    namespace = "com.dm.feature.meditation.data"
}

dependencies {

    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.androidx.work)
    implementation(libs.koin.android.workmanager)
    implementation(libs.kotlinx.serialization.json)

    implementation(projects.core.domain)
    implementation(projects.core.data)
    implementation(projects.core.database)
    implementation(projects.feature.meditation.domain)

}