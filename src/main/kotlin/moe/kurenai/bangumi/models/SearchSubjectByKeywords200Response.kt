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

import moe.kurenai.bangumi.models.LegacySubjectLarge
import moe.kurenai.bangumi.models.SearchSubjectByKeywords200ResponseOneOf
import moe.kurenai.bangumi.models.SearchSubjectByKeywords200ResponseOneOf1
import moe.kurenai.bangumi.models.SearchSubjectByKeywords200ResponseOneOf2

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param results 总条数
 * @param list 结果列表
 */
@Serializable

data class SearchSubjectByKeywords200Response (

    /* 总条数 */
    @SerialName(value = "results")
    val results: kotlin.Int? = null,

    /* 结果列表 */
    @SerialName(value = "list")
    val list: kotlin.collections.List<LegacySubjectLarge>? = null

) {


}

