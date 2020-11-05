package com.xellitix.commons.encoding.base64

import dev.misfitlabs.kotlinguice4.KotlinModule

/**
 * [Base64] Guice module.
 */
class Base64Module : KotlinModule() {

    override fun configure() {
        bind<Base64>()
    }
}
