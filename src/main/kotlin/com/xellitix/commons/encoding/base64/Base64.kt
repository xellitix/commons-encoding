package com.xellitix.commons.encoding.base64

import com.google.inject.Singleton
import java.nio.charset.Charset

/**
 * Base64 encoder and decoder.
 */
@Singleton
class Base64 {

    // Dependencies
    private val encoder: java.util.Base64.Encoder = java.util.Base64.getEncoder()
    private val decoder: java.util.Base64.Decoder = java.util.Base64.getDecoder()

    /**
     * Encodes text using base64.
     */
    fun encodeToString(text: String, charset: Charset = Charsets.UTF_8): String {
        return encodeToString(text.toByteArray(charset), charset)
    }

    /**
     * Encodes bytes using base64.
     */
    fun encodeToString(data: ByteArray, charset: Charset = Charsets.UTF_8): String {
        return String(encodeToBytes(data), charset)
    }

    /**
     * Encodes text using base64.
     */
    fun encodeToBytes(text: String, charset: Charset = Charsets.UTF_8): ByteArray {
        return encoder.encode(text.toByteArray(charset))
    }

    /**
     * Encodes bytes using base64.
     */
    fun encodeToBytes(data: ByteArray): ByteArray {
        return encoder.encode(data)
    }

    /**
     * Decodes base64 encoded text.
     */
    fun decodeToString(encodedText: String, charset: Charset = Charsets.UTF_8): String {
        return decodeToString(encodedText.toByteArray(charset), charset)
    }

    /**
     * Decodes base64 encoded bytes.
     */
    fun decodeToString(encodedData: ByteArray, charset: Charset = Charsets.UTF_8): String {
        return String(decodeToBytes(encodedData), charset)
    }

    /**
     * Decodes base64 encoded text.
     */
    fun decodeToBytes(encodedText: String, charset: Charset = Charsets.UTF_8): ByteArray {
        return decodeToBytes(encodedText.toByteArray(charset))
    }

    /**
     * Decodes base64 encoded bytes.
     */
    fun decodeToBytes(encodedData: ByteArray): ByteArray {
        return decoder.decode(encodedData)
    }
}
