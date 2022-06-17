plugins {
    application
    kotlin("jvm") version "1.5.10"
}

group = "com.danielqueiroz"
version = "1.0-SNAPSHOT"

application {
//    mainClass.set("io.ktor.server.netty.EngineMain")
    mainClass.set("com.danielqueiroz.ApplicationKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation("io.ktor:ktor-server-core:1.6.8")
    implementation("io.ktor:ktor-server-netty:1.6.8")
    implementation("io.ktor:ktor-html-builder:1.6.8")
    implementation("ch.qos.logback:logback-classic:1.2.5")
}
