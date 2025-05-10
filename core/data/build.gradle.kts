plugins {
    alias(libs.plugins.meditationapp.android.library)
}

android {
    namespace = "com.dm.core.data"
}

dependencies {

    implementation(projects.core.database)
    implementation(projects.core.domain)

}