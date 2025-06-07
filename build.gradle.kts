plugins {
    id("org.springframework.boot") version "3.5.0"
    `java-library`
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    api(libs.com.google.code.gson)
    api(libs.org.springframework.boot.spring.boot.starter.data.jpa)
    api(libs.org.springframework.boot.spring.boot.starter.security)
    api(libs.org.springframework.boot.spring.boot.starter.web)
    api(libs.org.springframework.boot.spring.boot.configuration.processor)
    api(libs.javax.validation.validation.api)
    api(libs.org.springframework.boot.spring.boot.starter.validation)
    api(libs.org.liquibase.liquibase.core)
    api(libs.org.meilisearch.sdk.meilisearch.java)
    api(libs.com.squareup.okhttp3)
    implementation(libs.com.google.code.guava)
    developmentOnly(libs.org.springframework.boot.spring.boot.devtools)
    runtimeOnly(libs.org.mariadb.jdbc.mariadb.java.client)
    testImplementation(libs.org.springframework.boot.spring.boot.starter.test)
    testImplementation(libs.org.springframework.security.spring.security.test)
}

group = "com.imjustdoom.myboot"
version = "1.0-SNAPSHOT"
description = "MyBoot"
java.sourceCompatibility = JavaVersion.VERSION_24

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc>() {
    options.encoding = "UTF-8"
}
