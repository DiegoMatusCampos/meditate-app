plugins {
    alias(libs.plugins.meditationapp.android.library)
    alias(libs.plugins.meditationapp.android.room)
}

android {
    namespace = "com.dm.core.database"
}

dependencies {

    implementation(projects.core.domain)

}