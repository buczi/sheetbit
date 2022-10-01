
plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    kotlin("jvm")
    kotlin("plugin.spring")
    kotlin("plugin.jpa")
}

group = "com.buczi.sheetbit"
version = "0.0.1"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    // Spring boot
    api(libs.spring.boot.jdbc)
    api(libs.spring.boot.jpa)
    api(libs.spring.boot.web)

    // Kotlin
    api(libs.kotlin.jackson)
    api(libs.kotlin.reflect)
    api(libs.kotlin.stdlib)

    // Spring cloud
    api(platform(libs.spring.cloud))
    api(libs.spring.cloud.feign)
    api(libs.eureka.client)

    // Postgres
    api(libs.postgres)

    // Swagger
    api(libs.springdoc.openapi.ui)

    // Testing
    api(libs.spring.boot.test)
}

description = "sheetbit-bom"