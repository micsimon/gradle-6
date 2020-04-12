plugins {
    `java-library`
}

group = "io.michaelsimon.gradle.service"

dependencies {
    // the java-library plaugin provides implementation and api
    // api because, :service need also :data
    // implementation would only provide the classes from :service and not from :data
    api(project(":data"))
}
