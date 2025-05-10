plugins {
    alias(libs.plugins.meditationapp.jvm.library)
}

dependencies {
    implementation(projects.core.domain)
}
