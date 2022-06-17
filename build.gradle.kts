plugins {
    application
    kotlin("jvm") version "1.5.10"
}

group = "com.danielqueiroz"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("com.danielqueiroz.ApplicationKt")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=true")
}

repositories {
    mavenCentral()
    maven {
        url = uri("https://maven.pkg.jetbrains.space/public/p/ktor/eap")
        name = "ktor-eap"
    }
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation("ch.qos.logback:logback-classic:1.2.5")
    implementation("io.ktor:ktor-server-core-jvm:2.0.0-eap-256")
    implementation("io.ktor:ktor-server-netty-jvm:2.0.0-eap-256")
    implementation("io.ktor:ktor-server-html-builder-jvm:2.0.0-eap-256")
}
