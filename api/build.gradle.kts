import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.1.6.RELEASE"
    id("org.jetbrains.kotlin.jvm") version "1.3.41"
    id("org.jetbrains.kotlin.plugin.spring") version "1.3.41"
    id("org.jetbrains.kotlin.kapt") version "1.3.41"
    id("com.github.ben-manes.versions") version "0.21.0"
    id("io.gitlab.arturbosch.detekt") version "1.0.0-RC16"
    id("nu.studer.jooq") version "3.0.3"
    id("java")
    id("jacoco")
    id("io.spring.dependency-management")
    id("idea")
}

defaultTasks("bootRun")

//sourceCompatibility = 1.8
//targetCompatibility = 1.8

tasks.getByName<KotlinCompile>("compileKotlin") {
    kotlinOptions.jvmTarget = "1.8"
    kotlinOptions.freeCompilerArgs += listOf("-Xjsr305=strict")
}

tasks.getByName<KotlinCompile>("compileTestKotlin") {
    kotlinOptions.jvmTarget = "1.8"
    kotlinOptions.freeCompilerArgs += listOf("-Xjsr305=strict")
}

//sourceSets {
//    integrationTest {
//        kotlin {
//            srcDirs += "src/it/kotlin"
//            compileClasspath += main.output + test.output
//            runtimeClasspath += main.output + test.output
//        }
//        resources.srcDirs += "src/it/resources"
//    }
//    main.java.srcDirs += "src/main/generated"
//}

//task integrationTest(group: "verification", type: Test, description: "Runs integration tests.") {
//    testClassesDirs = sourceSets.integrationTest.output.classesDirs
//    classpath = sourceSets.integrationTest.runtimeClasspath
//}

//configurations {
//    integrationTestCompile.extendsFrom(testCompile)
//    integrationTestRuntime.extendsFrom(testRuntime)
//}

//task stage(dependsOn: ["assemble"])

//jacoco {
//    toolVersion = "0.8.2"
//}

//jacocoTestReport {
//    reports {
//        csv.enabled = false
//        html.enabled = true
//        xml.enabled = true
//    }
//    dependsOn(test)
//}

//detekt {
//    config = files("detekt.yml")
//    input = files(
//        "src/main/kotlin",
//        "src/test/kotlin",
//        "src/it/kotlin",
//    )
//}

//check.dependsOn(integrationTest)

//idea {
//    module {
//        sourceDirs += file("build/generated/source/kapt/main")
//        generatedSourceDirs += file("build/generated/source/kapt/main")
//
//        sourceDirs += file("src/main/generated/")
//        generatedSourceDirs += file("src/main/generated/")
//    }
//}

//jooq {
//    version = "3.11.11"
//    softwareberg(sourceSets.main) {
//        jdbc {
//            driver = "org.postgresql.Driver"
//            url = "jdbc:postgresql://localhost:5432/softwareberg"
//            user = "softwareberg"
//            password = "softwareberg"
//        }
//        generator {
//            database {
//                name = "org.jooq.meta.postgres.PostgresDatabase"
//                inputSchema = "public"
//                forcedTypes {
//                    forcedType {
//                        name = "varchar"
//                        expression = ".*"
//                        types = "JSONB?"
//                    }
//                    forcedType {
//                        name = "varchar"
//                        expression = ".*"
//                        types = "INET"
//                    }
//                }
//                properties{
//                    excludes = "flyway_schema_history"
//                }
//            }
//            generate {
//                relations = true
//                deprecated = false
//                records = true
//                fluentSetters = true
//                validationAnnotations = true
//            }
//            target {
//                packageName = "com.softwareberg.thehub.jooq"
//                directory = "src/generated/java/"
//            }
//        }
//    }
//}

repositories {
    mavenCentral()
    jcenter()
    maven { url = uri("https://oss.sonatype.org/content/repositories/snapshots/") }
    maven { url = uri("http://dl.bintray.com/kotlin/kotlinx.coroutines") }
    maven { url = uri("http://dl.bintray.com/kotlin/kotlin-eap") }
    maven { url = uri("https://jitpack.io") }
}

dependencies {
// TODO
//    ext.kotlinxcoroutines = "0.30.1"
//    ext.querydsl = "4.2.1"

    compile("org.springframework.boot:spring-boot-starter-web")
    compile("org.springframework.boot:spring-boot-starter-data-jpa")

    compile("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    compile("org.jetbrains.kotlin:kotlin-reflect")
    compile("org.jetbrains.kotlin:kotlin-stdlib-common:1.3.41")
    compile("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.0-M2")

    compile("org.postgresql:postgresql:42.2.6")
    compile("org.hibernate:hibernate-core")
    compile("javax.validation:validation-api:2.0.1.Final")
    compile("org.flywaydb:flyway-core")
    compile("com.querydsl:querydsl-jpa:4.2.1")
    kapt("com.querydsl:querydsl-apt:4.2.1:jpa")
    jooqRuntime("org.postgresql:postgresql:42.2.6")
    compile("org.jooq:jooq")
    compile("org.jooq:jooq-meta")
    compile("org.jooq:jooq-codegen")

    compile("com.fasterxml.jackson.module:jackson-module-kotlin")
    compile("org.jsoup:jsoup:1.12.1")
    compile("org.apache.commons:commons-text:1.5")

    testCompile("org.springframework.boot:spring-boot-starter-test")
    testCompile("io.projectreactor:reactor-test")
    testCompile("com.nhaarman:mockito-kotlin:1.6.0")
    testCompile("org.powermock:powermock-api-mockito2:2.0.2")
    testCompile("org.assertj:assertj-core:3.12.2")

//    integrationTestCompile("com.jayway.jsonpath:json-path:2.4.0")

    detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.0.0-RC16")
}

//wrapper {
//    gradleVersion = "5.5.1"
//}
