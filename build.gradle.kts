plugins {
    id("java")
    id("org.openapi.generator") version "7.1.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

openApiGenerate {
    generatorName.set("java")
    inputSpec.set("${projectDir}/src/main/resources/swagger-no-generation.json")
    outputDir.set("${buildDir}/generated")
    modelPackage.set("org.example.model.generated")
    globalProperties.put("models", "")
}
