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


import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param large 
 * @param common 
 * @param medium 
 * @param small 
 * @param grid 
 */
@Serializable

data class Images (

    @SerialName(value = "large")
    val large: kotlin.String,

    @SerialName(value = "common")
    val common: kotlin.String,

    @SerialName(value = "medium")
    val medium: kotlin.String,

    @SerialName(value = "small")
    val small: kotlin.String,

    @SerialName(value = "grid")
    val grid: kotlin.String

) {


}

