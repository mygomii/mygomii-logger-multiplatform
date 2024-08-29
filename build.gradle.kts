plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.jetbrainsCompose) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.kotlinJvm) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
    id("maven-publish")
}

afterEvaluate {
    publishing {
        publications {
            register<MavenPublication>("release") {
//                from(components["release"])
                groupId = "github.com.mygomii"
                artifactId = "mygomii-logger-multiplatform"
                version = "1.0.0"

                pom {
                    name.set("logger")
                    description.set("multiplatform logger")
                }
            }
        }
    }
}