/*
 * traQ v3
 * traQ v3 API
 *
 * The version of the OpenAPI document: 3.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.motoki317.traq4j.model;

import java.util.Objects;
import java.util.Arrays;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.UUID;

import org.threeten.bp.OffsetDateTime;

/**
 * Webhook情報
 */
@ApiModel(description = "Webhook情報")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-18T11:58:46.174904Z[Etc/UTC]")
public class Webhook {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private UUID id;

    public static final String SERIALIZED_NAME_BOT_USER_ID = "botUserId";
    @SerializedName(SERIALIZED_NAME_BOT_USER_ID)
    private UUID botUserId;

    public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
    private String displayName;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_SECURE = "secure";
    @SerializedName(SERIALIZED_NAME_SECURE)
    private Boolean secure;

    public static final String SERIALIZED_NAME_CHANNEL_ID = "channelId";
    @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
    private UUID channelId;

    public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
    @SerializedName(SERIALIZED_NAME_OWNER_ID)
    private UUID ownerId;

    public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private OffsetDateTime createdAt;

    public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    private OffsetDateTime updatedAt;


    public Webhook id(UUID id) {

        this.id = id;
        return this;
    }

    /**
     * WebhookUUID
     *
     * @return id
     **/
    @ApiModelProperty(required = true, value = "WebhookUUID")

    public UUID getId() {
        return id;
    }


    public void setId(UUID id) {
        this.id = id;
    }


    public Webhook botUserId(UUID botUserId) {

        this.botUserId = botUserId;
        return this;
    }

    /**
     * WebhookユーザーUUID
     *
     * @return botUserId
     **/
    @ApiModelProperty(required = true, value = "WebhookユーザーUUID")

    public UUID getBotUserId() {
        return botUserId;
    }


    public void setBotUserId(UUID botUserId) {
        this.botUserId = botUserId;
    }


    public Webhook displayName(String displayName) {

        this.displayName = displayName;
        return this;
    }

    /**
     * Webhookユーザー表示名
     *
     * @return displayName
     **/
    @ApiModelProperty(required = true, value = "Webhookユーザー表示名")

    public String getDisplayName() {
        return displayName;
    }


    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }


    public Webhook description(String description) {

        this.description = description;
        return this;
    }

    /**
     * 説明
     *
     * @return description
     **/
    @ApiModelProperty(required = true, value = "説明")

    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public Webhook secure(Boolean secure) {

        this.secure = secure;
        return this;
    }

    /**
     * セキュアWebhookかどうか
     *
     * @return secure
     **/
    @ApiModelProperty(required = true, value = "セキュアWebhookかどうか")

    public Boolean getSecure() {
        return secure;
    }


    public void setSecure(Boolean secure) {
        this.secure = secure;
    }


    public Webhook channelId(UUID channelId) {

        this.channelId = channelId;
        return this;
    }

    /**
     * デフォルトの投稿先チャンネルUUID
     *
     * @return channelId
     **/
    @ApiModelProperty(required = true, value = "デフォルトの投稿先チャンネルUUID")

    public UUID getChannelId() {
        return channelId;
    }


    public void setChannelId(UUID channelId) {
        this.channelId = channelId;
    }


    public Webhook ownerId(UUID ownerId) {

        this.ownerId = ownerId;
        return this;
    }

    /**
     * オーナーUUID
     *
     * @return ownerId
     **/
    @ApiModelProperty(required = true, value = "オーナーUUID")

    public UUID getOwnerId() {
        return ownerId;
    }


    public void setOwnerId(UUID ownerId) {
        this.ownerId = ownerId;
    }


    public Webhook createdAt(OffsetDateTime createdAt) {

        this.createdAt = createdAt;
        return this;
    }

    /**
     * 作成日時
     *
     * @return createdAt
     **/
    @ApiModelProperty(required = true, value = "作成日時")

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }


    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }


    public Webhook updatedAt(OffsetDateTime updatedAt) {

        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新日時
     *
     * @return updatedAt
     **/
    @ApiModelProperty(required = true, value = "更新日時")

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }


    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Webhook webhook = (Webhook) o;
        return Objects.equals(this.id, webhook.id) &&
                Objects.equals(this.botUserId, webhook.botUserId) &&
                Objects.equals(this.displayName, webhook.displayName) &&
                Objects.equals(this.description, webhook.description) &&
                Objects.equals(this.secure, webhook.secure) &&
                Objects.equals(this.channelId, webhook.channelId) &&
                Objects.equals(this.ownerId, webhook.ownerId) &&
                Objects.equals(this.createdAt, webhook.createdAt) &&
                Objects.equals(this.updatedAt, webhook.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, botUserId, displayName, description, secure, channelId, ownerId, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Webhook {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    botUserId: ").append(toIndentedString(botUserId)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    secure: ").append(toIndentedString(secure)).append("\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

