/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package moe.kurenai.bangumi.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * 电影类型 - `0` 为 其他 - `1` 为 日剧 - `2` 为 欧美剧 - `3` 为 华语剧 - `6001` 为 电视剧 - `6002` 为 电影 - `6003` 为 演出 - `6004` 为 综艺
 *
 * Values: Other,JP,EN,CN,TV,Movie,Live,Show
 */
@Serializable
enum class SubjectRealCategory(val value: kotlin.Int) {

    @SerialName(value = "0")
    Other(0),

    @SerialName(value = "1")
    JP(1),

    @SerialName(value = "2")
    EN(2),

    @SerialName(value = "3")
    CN(3),

    @SerialName(value = "6001")
    TV(6001),

    @SerialName(value = "6002")
    Movie(6002),

    @SerialName(value = "6003")
    Live(6003),

    @SerialName(value = "6004")
    Show(6004);

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value.toString()

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is SubjectRealCategory) "$data" else null

        /**
         * Returns a valid [SubjectRealCategory] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): SubjectRealCategory? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

