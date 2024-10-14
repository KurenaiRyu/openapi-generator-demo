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

import moe.kurenai.bangumi.models.LegacySubjectMediumAllOfCrt
import moe.kurenai.bangumi.models.LegacySubjectMediumAllOfStaff
import moe.kurenai.bangumi.models.LegacySubjectSmallCollection
import moe.kurenai.bangumi.models.LegacySubjectSmallImages
import moe.kurenai.bangumi.models.LegacySubjectSmallRating

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param id 条目 ID
 * @param url 条目地址
 * @param type 条目类型 - `1` 为 书籍 - `2` 为 动画 - `3` 为 音乐 - `4` 为 游戏 - `6` 为 三次元  没有 `5`
 * @param name 条目名称
 * @param nameCn 条目中文名称
 * @param summary 剧情简介
 * @param airDate 放送开始日期
 * @param airWeekday 放送星期
 * @param images 
 * @param eps 话数
 * @param epsCount 话数
 * @param rating 
 * @param rank 排名
 * @param collection 
 * @param crt 角色信息
 * @param staff 制作人员信息
 */
@Serializable

data class LegacySubjectMedium (

    /* 条目 ID */
    @SerialName(value = "id")
    val id: kotlin.Int? = null,

    /* 条目地址 */
    @SerialName(value = "url")
    val url: kotlin.String? = null,

    /* 条目类型 - `1` 为 书籍 - `2` 为 动画 - `3` 为 音乐 - `4` 为 游戏 - `6` 为 三次元  没有 `5` */
    @SerialName(value = "type")
    val type: LegacySubjectMedium.Type? = null,

    /* 条目名称 */
    @SerialName(value = "name")
    val name: kotlin.String? = null,

    /* 条目中文名称 */
    @SerialName(value = "name_cn")
    val nameCn: kotlin.String? = null,

    /* 剧情简介 */
    @SerialName(value = "summary")
    val summary: kotlin.String? = null,

    /* 放送开始日期 */
    @SerialName(value = "air_date")
    val airDate: kotlin.String? = null,

    /* 放送星期 */
    @SerialName(value = "air_weekday")
    val airWeekday: kotlin.Int? = null,

    @SerialName(value = "images")
    val images: LegacySubjectSmallImages? = null,

    /* 话数 */
    @SerialName(value = "eps")
    val eps: kotlin.Int? = null,

    /* 话数 */
    @SerialName(value = "eps_count")
    val epsCount: kotlin.Int? = null,

    @SerialName(value = "rating")
    val rating: LegacySubjectSmallRating? = null,

    /* 排名 */
    @SerialName(value = "rank")
    val rank: kotlin.Int? = null,

    @SerialName(value = "collection")
    val collection: LegacySubjectSmallCollection? = null,

    /* 角色信息 */
    @SerialName(value = "crt")
    val crt: kotlin.collections.List<LegacySubjectMediumAllOfCrt>? = null,

    /* 制作人员信息 */
    @SerialName(value = "staff")
    val staff: kotlin.collections.List<LegacySubjectMediumAllOfStaff>? = null

) {

    /**
     * 条目类型 - `1` 为 书籍 - `2` 为 动画 - `3` 为 音乐 - `4` 为 游戏 - `6` 为 三次元  没有 `5`
     *
     * Values: Book,Anime,Music,Game,Real
     */
    @Serializable
    enum class Type(val value: kotlin.Int) {
        @SerialName(value = "1") Book(1),
        @SerialName(value = "2") Anime(2),
        @SerialName(value = "3") Music(3),
        @SerialName(value = "4") Game(4),
        @SerialName(value = "6") Real(6);
    }

}

