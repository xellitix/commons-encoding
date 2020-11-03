package com.xellitix.commons.encoding.base64

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isTrue
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
object Base64Test : Spek({

    // Constants
    val PLAIN_TEXT = "Hello, world!"
    val PLAIN_BYTES = PLAIN_TEXT.toByteArray(Charsets.UTF_8)

    val ENCODED_TEXT = "SGVsbG8sIHdvcmxkIQ=="
    val ENCODED_BYTES = ENCODED_TEXT.toByteArray(Charsets.UTF_8)

    // Fixtures
    val base64 = Base64()

    describe("Base64 encoding a String to a String") {
        it("Encodes the String") {
            val encoded = base64.encodeToString(PLAIN_TEXT)
            assertThat(encoded).isEqualTo(ENCODED_TEXT)
        }
    }

    describe("Base64 encoding bytes to a String") {
        it("Encodes the bytes") {
            val encoded = base64.encodeToString(PLAIN_BYTES)
            assertThat(encoded).isEqualTo(ENCODED_TEXT)
        }
    }

    describe("Base64 encoding a String to bytes") {
        it("Encodes the String") {
            val encoded = base64.encodeToBytes(PLAIN_TEXT)
            assertThat(encoded.contentEquals(ENCODED_BYTES)).isTrue()
        }
    }

    describe("Base64 encoding bytes to bytes") {
        it("Encodes the bytes") {
            val encoded = base64.encodeToBytes(PLAIN_BYTES)
            assertThat(encoded.contentEquals(ENCODED_BYTES)).isTrue()
        }
    }

    describe("Base64 decoding a String to a String") {
        it("Decodes the String") {
            val decoded = base64.decodeToString(ENCODED_TEXT)
            assertThat(decoded).isEqualTo(PLAIN_TEXT)
        }
    }

    describe("Base64 decoding bytes to a String") {
        it("Decodes the bytes") {
            val decoded = base64.decodeToString(ENCODED_BYTES)
            assertThat(decoded).isEqualTo(PLAIN_TEXT)
        }
    }

    describe("Base64 decoding a String to bytes") {
        it("Decodes the String") {
            val decoded = base64.decodeToBytes(ENCODED_TEXT)
            assertThat(decoded.contentEquals(PLAIN_BYTES)).isTrue()
        }
    }

    describe("Base64 decoding bytes to bytes") {
        it("Decodes the bytes") {
            val decoded = base64.decodeToBytes(ENCODED_BYTES)
            assertThat(decoded.contentEquals(PLAIN_BYTES)).isTrue()
        }
    }
})
