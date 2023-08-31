# Juliet Java Test Suite

[![CI](https://github.com/UnitTestBot/juliet-java-test-suite/actions/workflows/ci.yml/badge.svg)](https://github.com/UnitTestBot/juliet-java-test-suite/actions/workflows/ci.yml)
[![JitPack](https://jitpack.io/v/UnitTestBot/juliet-java-test-suite.svg)](https://jitpack.io/p/UnitTestBot/juliet-java-test-suite)
![License](https://img.shields.io/github/license/UnitTestBot/juliet-java-test-suite)

A collection of test cases in the Java language.
It contains examples organized under 112 different CWEs.

The Juliet Java 1.3 test suite is taken from the [NIST website](https://samate.nist.gov/SARD/test-suites)

## Build

To build the Juliet Java Test Suite, simply execute the following command:

```sh
./gradlew build
```

Once built, you can locate the compiled JARs within `juliet-*/build/libs/*.jar` directories.

## Gradle dependency

Each CWE is available as a separate artifact on [JitPack](https://jitpack.io/):

```
repositories {
    maven(url = "https://jitpack.io/")
}

dependencies {
    // CWE476: NULL Pointer Dereference
    implementation("com.github.UnitTestBot.juliet-java-test-suite:cwe476:$version")

    // Include the `support` module, if needed:
    implementation("com.github.UnitTestBot.juliet-java-test-suite:support:$version")
}
```

You also have the option to include the entire repository as a dependency
by adding `com.github.UnitTestBot:juliet-java-test-suite:$version` to your project.
However, please be aware that the complete artifact, which includes all CWEs,
is quite substantial in size, exceeding 60MB.
