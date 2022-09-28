rootProject.name = "sheetbit"

include(":sheetbit-social-manager")
include(":sheetbit-game-engine")
include(":sheetbit-rules-provider")
include(":sheetbit-statistic-engine")
include(":sheetbit-liquibase")
include(":sheetbit-eureka-server")
include(":sheetbit-core")

pluginManagement {
    plugins {
        id("org.springframework.boot").version("2.7.4")
        id("io.spring.dependency-management").version( "1.0.14.RELEASE")
        kotlin("jvm").version("1.6.21")
        kotlin("plugin.spring").version( "1.6.21")
    }
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            version("spring-cloud", "2021.0.4")

            // Spring boot
            library("spring-boot-web","org.springframework.boot","spring-boot-starter-web").withoutVersion()

            library("kotlin-reflect", "org.jetbrains.kotlin", "kotlin-reflect").withoutVersion()
            library("kotlin-stdlib", "org.jetbrains.kotlin", "kotlin-stdlib-jdk8").withoutVersion()
            library("kotlin-jackson", "com.fasterxml.jackson.module", "jackson-module-kotlin").withoutVersion()
            library("spring-cloud", "org.springframework.cloud", "spring-cloud-dependencies").versionRef("spring-cloud")
            library("spring-cloud-feign", "org.springframework.cloud", "spring-cloud-starter-openfeign").withoutVersion()
            library("eureka-server", "org.springframework.cloud", "spring-cloud-starter-netflix-eureka-server").withoutVersion()
            library("eureka-client", "org.springframework.cloud", "spring-cloud-starter-netflix-eureka-client").withoutVersion()

            // Testing libraries
            library("spring-boot-test", "org.springframework.boot", "spring-boot-starter-test").withoutVersion()

        }
    }
}