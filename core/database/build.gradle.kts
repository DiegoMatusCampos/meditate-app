plugins {
    alias(libs.plugins.meditationapp.android.library)
}

android {
    namespace = "com.dm.core.database"
}

dependencies {

    implementation(projects.core.domain)

}