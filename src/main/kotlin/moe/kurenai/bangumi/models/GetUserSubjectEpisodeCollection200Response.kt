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

import moe.kurenai.bangumi.models.UserEpisodeCollection

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param total 
 * @param limit 
 * @param offset 
 * @param `data` 
 */
@Serializable

data class GetUserSubjectEpisodeCollection200Response (

    @SerialName(value = "total")
    val total: kotlin.Int,

    @SerialName(value = "limit")
    val limit: kotlin.Int,

    @SerialName(value = "offset")
    val offset: kotlin.Int,

    @SerialName(value = "data")
    val `data`: kotlin.collections.List<UserEpisodeCollection>? = null

) {


}

