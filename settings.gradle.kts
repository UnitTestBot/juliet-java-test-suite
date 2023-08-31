rootProject.name = "juliet"

plugins {
    `gradle-enterprise`
    id("org.ajoberstar.reckon.settings") version "0.18.0"
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.6.0"
}

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
    }
}

extensions.configure<org.ajoberstar.reckon.gradle.ReckonExtension> {
    setDefaultInferredScope("patch")
    snapshots()
    setScopeCalc(calcScopeFromProp().or(calcScopeFromCommitMessages()))
    setStageCalc(calcStageFromProp())
}

fun myInclude(name: String) {
    include(name)
    project(":$name").projectDir = file("${rootProject.name}-$name")
}

myInclude("support")
myInclude("cwe15")
myInclude("cwe23")
myInclude("cwe36")
myInclude("cwe78")
myInclude("cwe80")
myInclude("cwe81")
myInclude("cwe83")
myInclude("cwe89")
myInclude("cwe90")
myInclude("cwe111")
myInclude("cwe113")
myInclude("cwe114")
myInclude("cwe129")
myInclude("cwe134")
myInclude("cwe190")
myInclude("cwe191")
myInclude("cwe193")
myInclude("cwe197")
myInclude("cwe209")
myInclude("cwe226")
myInclude("cwe248")
myInclude("cwe252")
myInclude("cwe253")
myInclude("cwe256")
myInclude("cwe259")
myInclude("cwe315")
myInclude("cwe319")
myInclude("cwe321")
myInclude("cwe325")
myInclude("cwe327")
myInclude("cwe328")
myInclude("cwe329")
myInclude("cwe336")
myInclude("cwe338")
myInclude("cwe369")
myInclude("cwe378")
myInclude("cwe379")
myInclude("cwe382")
myInclude("cwe383")
myInclude("cwe390")
myInclude("cwe395")
myInclude("cwe396")
myInclude("cwe397")
myInclude("cwe398")
myInclude("cwe400")
myInclude("cwe404")
myInclude("cwe459")
myInclude("cwe470")
myInclude("cwe476")
myInclude("cwe477")
myInclude("cwe478")
myInclude("cwe481")
myInclude("cwe482")
myInclude("cwe483")
myInclude("cwe484")
myInclude("cwe486")
myInclude("cwe491")
myInclude("cwe499")
myInclude("cwe500")
myInclude("cwe506")
myInclude("cwe510")
myInclude("cwe511")
myInclude("cwe523")
myInclude("cwe526")
myInclude("cwe533")
myInclude("cwe534")
myInclude("cwe535")
myInclude("cwe539")
myInclude("cwe546")
myInclude("cwe549")
myInclude("cwe561")
myInclude("cwe563")
myInclude("cwe566")
myInclude("cwe568")
myInclude("cwe570")
myInclude("cwe571")
myInclude("cwe572")
myInclude("cwe579")
myInclude("cwe580")
myInclude("cwe581")
myInclude("cwe582")
myInclude("cwe584")
myInclude("cwe585")
myInclude("cwe586")
myInclude("cwe597")
myInclude("cwe598")
myInclude("cwe600")
myInclude("cwe601")
myInclude("cwe605")
myInclude("cwe606")
myInclude("cwe607")
myInclude("cwe609")
myInclude("cwe613")
myInclude("cwe614")
myInclude("cwe615")
myInclude("cwe617")
myInclude("cwe643")
myInclude("cwe667")
myInclude("cwe674")
myInclude("cwe681")
myInclude("cwe690")
myInclude("cwe690")
myInclude("cwe698")
myInclude("cwe759")
myInclude("cwe760")
myInclude("cwe764")
myInclude("cwe765")
myInclude("cwe772")
myInclude("cwe775")
myInclude("cwe789")
myInclude("cwe832")
myInclude("cwe833")
myInclude("cwe835")