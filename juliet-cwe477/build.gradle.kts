plugins {
    `java-library`
}

dependencies {
    implementation(project(":support"))
    compileOnly(Libs.JavaxServlet.javax_servlet_api)
}
