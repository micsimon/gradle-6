plugins {
    `java-platform`
}

group = "io.michaelsimon.gradle.platform"

dependencies {
    constraints {

        // hier geht nur api, da dies durch das Plugin java-platform vorgegeben ist, es gibt kein implementation
        api("com.google.guava:guava:24.1.1-jre!!")

        // hier ist definiert, dass die Version 3.7 verwendet wird, aber falls transitiv eine höhere Version hinzukommt
        // darf gradle nicht die 3.8 verwenden
        // require und reject sind "rich version" gradle kann hier also ein auto update vornehmen
        // strictly verbietet gradle, die Version automatisch abzudaten
        api("org.apache.commons:commons-lang3") {
            version {
//                require("3.7")
//                reject("3.8")
                strictly("3.7")
            }
            because("3.8 will be bugged")
        }
    }
}
