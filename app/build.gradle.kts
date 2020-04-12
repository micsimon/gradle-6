plugins {
    application
}

application {
    mainClassName = "io.michaelsimon.gradle.Appliation"
}

dependencies {
    // das plugin application definiert nur implementation ... es gibt kein api
    implementation(platform(project(":platform")))
    implementation(project(":service"))

    implementation("org.apache.commons:commons-lang3")
}
