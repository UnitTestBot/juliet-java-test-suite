plugins {
    `java-library`
}

dependencies {
    implementation(project(":support"))
    compileOnly(Libs.JavaxServlet.javax_servlet_api)
    implementation(Libs.JavaxMail.mail)
    implementation(Libs.CommonsCodec.commons_codec)
}
