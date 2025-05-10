import com.example.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class JvmFirebaseConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        target.run {

            dependencies {
                "implementation"(libs.findBundle("firebase").get())
            }
        }
    }
}