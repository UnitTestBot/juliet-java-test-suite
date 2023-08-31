@file:Suppress("PublicApiImplicitType", "MemberVisibilityCanBePrivate", "unused", "ConstPropertyName")

object Versions {
    const val commons_codec = "1.16.0"
    const val commons_lang = "2.6"
    const val javax_mail = "1.4.7"
    const val javax_servlet = "4.0.1"
    const val kotlin = "1.9.0"
    const val shadow = "8.1.1"
}

object Libs {
    object JavaxServlet {
        const val version = Versions.javax_servlet
        const val javax_servlet_api = "javax.servlet:javax.servlet-api:$version"
    }

    object JavaxMail {
        const val version = Versions.javax_mail
        const val mail = "javax.mail:mail:$version"
    }

    object CommonsCodec {
        const val version = Versions.commons_codec
        const val commons_codec = "commons-codec:commons-codec:$version"
    }

    object CommonsLang {
        const val version = Versions.commons_lang
        const val commons_lang = "commons-lang:commons-lang:$version"
    }
}

object Plugins {
    // https://github.com/johnrengelman/shadow
    object Shadow {
        const val version = Versions.shadow
        const val id = "com.github.johnrengelman.shadow"
    }
}
