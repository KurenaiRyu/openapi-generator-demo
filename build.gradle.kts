import org.openapitools.generator.gradle.plugin.tasks.GenerateTask

plugins {
    id("org.openapi.generator") version "7.9.0"
    idea
    kotlin("jvm") version "2.0.0"
    kotlin("plugin.serialization") version "2.0.0"
}

group = "moe.kurenai.demo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    implementation("io.ktor:ktor-client-okhttp:3.0.0")
    implementation("io.ktor:ktor-client-content-negotiation:3.0.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.3")
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.6.1")

    testImplementation(kotlin("test"))
}

idea {
    module {
        generatedSourceDirs.add(file("src/main/gen"))
    }
}

val generatedRoot = "generated/openapi"

fun generateAction(specPath: String, pkgName: String = "moe.kurenai.bangumi", apiSuffix: String = "BangumiApi"): Action<GenerateTask> {
    return Action<GenerateTask> {
        generatorName.set("kotlin")
        inputSpec.set(specPath)
        outputDir.set(layout.buildDirectory.file(generatedRoot).get().asFile.absolutePath)
        packageName.set(pkgName)
        apiNameSuffix.set(apiSuffix)
        removeOperationIdPrefix = true

        additionalProperties.set(
            mapOf(
                "apiSuffix" to apiSuffix,
                "library" to "jvm-ktor",
                "dateLibrary" to "java8",
                "serializationLibrary" to "kotlinx_serialization",
                "enumPropertyNaming" to "UPPERCASE",
//            "generateOneOfAnyOfWrappers" to "true",
                "omitGradleWrapper" to "true",
            ),
        )

        generateModelTests.set(true)
        generateApiTests.set(true)
        generateApiDocumentation.set(false)
        generateModelDocumentation.set(false)
    }
}

val generateApi0 = tasks.register("generateApi0", GenerateTask::class, generateAction("$projectDir/openapi.json"))
val generateApiOauth = tasks.register("generateApiOauth", GenerateTask::class, generateAction("$projectDir/oauth.yaml"))

val copyGenerateApiToSrc = tasks.register("copyGenerateApiToSrc", Copy::class) {
    dependsOn(generateApi0)
    dependsOn(generateApiOauth)
    from(layout.buildDirectory.dir("$generatedRoot/src"))
    into("${projectDir}/src")
}

tasks.register("generateApi") {
    dependsOn(copyGenerateApiToSrc)
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}