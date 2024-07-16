plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.register("author") {
    val author: String by project
    doLast {
        println("Author ${author}")
    }
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}