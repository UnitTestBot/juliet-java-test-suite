plugins {
    `java-library`
    `maven-publish`
    with(Plugins.Shadow) { id(id) version (version) }
}

group = "com.github.Lipen"

subprojects {
    group = "${rootProject.group}.${rootProject.name}"
    version = rootProject.version
}

allprojects {
    apply(plugin = "java-library")
    apply(plugin = "maven-publish")

    repositories {
        mavenCentral()
    }

    java {
        toolchain.languageVersion.set(JavaLanguageVersion.of(8))

        withSourcesJar()
        // withJavadocJar()
    }

    publishing {
        publications {
            create<MavenPublication>("maven") {
                from(components["java"])
            }
        }
        repositories {
            maven(url = uri(layout.buildDirectory.dir("repository")))
        }
    }
}

dependencies {
    for (p in subprojects) {
        implementation(p)
    }
}

tasks.wrapper {
    gradleVersion = "8.3"
    distributionType = Wrapper.DistributionType.ALL
}
