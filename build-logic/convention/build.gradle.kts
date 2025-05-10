plugins {
    `kotlin-dsl`
}

group = "com.dm.meditationapp.buildlogic"

dependencies{
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
    compileOnly(libs.room.gradlePlugin)
}

gradlePlugin {
    plugins{
        register("androidApplication"){
            id = "meditationapp.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("androidApplicationCompose"){
            id = "meditationapp.android.application.compose"
            implementationClass ="AndroidApplicationComposeConventionPlugin"
        }
        register("androidLibrary"){
            id = "meditationapp.android.library"
            implementationClass ="AndroidLibraryConventionPlugin"
        }

        register("androidLibraryCompose"){
            id ="meditationapp.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }
        register("androidFeatureUi"){
            id ="meditationapp.android.feature.ui"
            implementationClass = "AndroidFeatureUiConventionPlugin"
        }
        register("androidRoom"){
            id ="meditationapp.android.room"
            implementationClass = "AndroidRoomConventionPlugin"
        }

        register("jvmLibrary"){
            id ="meditationapp.jvm.library"
            implementationClass = "JvmLibraryConventionPlugin"
        }

        register("jvmFirebase"){
            id ="meditationapp.jvm.firebase"
            implementationClass = "JvmFirebaseConventionPlugin"
        }
    }
}

