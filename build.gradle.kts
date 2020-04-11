subprojects {

    repositories {
        mavenCentral()
    }

    plugins.withType<JavaPlugin> {
        extensions.configure<JavaPluginExtension> {
            sourceCompatibility = JavaVersion.VERSION_12
            targetCompatibility = JavaVersion.VERSION_12
        }
    }
}
