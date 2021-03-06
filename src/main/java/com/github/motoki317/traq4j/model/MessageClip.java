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
 * メッセージクリップ
 */
@ApiModel(description = "メッセージクリップ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-18T11:58:46.174904Z[Etc/UTC]")
public class MessageClip {
    public static final String SERIALIZED_NAME_FOLDER_ID = "folderId";
    @SerializedName(SERIALIZED_NAME_FOLDER_ID)
    private UUID folderId;

    public static final String SERIALIZED_NAME_CLIPPED_AT = "clippedAt";
    @SerializedName(SERIALIZED_NAME_CLIPPED_AT)
    private OffsetDateTime clippedAt;


    public MessageClip folderId(UUID folderId) {

        this.folderId = folderId;
        return this;
    }

    /**
     * クリップされているフォルダのID
     *
     * @return folderId
     **/
    @ApiModelProperty(required = true, value = "クリップされているフォルダのID")

    public UUID getFolderId() {
        return folderId;
    }


    public void setFolderId(UUID folderId) {
        this.folderId = folderId;
    }


    public MessageClip clippedAt(OffsetDateTime clippedAt) {

        this.clippedAt = clippedAt;
        return this;
    }

    /**
     * クリップされた日時
     *
     * @return clippedAt
     **/
    @ApiModelProperty(required = true, value = "クリップされた日時")

    public OffsetDateTime getClippedAt() {
        return clippedAt;
    }


    public void setClippedAt(OffsetDateTime clippedAt) {
        this.clippedAt = clippedAt;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessageClip messageClip = (MessageClip) o;
        return Objects.equals(this.folderId, messageClip.folderId) &&
                Objects.equals(this.clippedAt, messageClip.clippedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(folderId, clippedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageClip {\n");
        sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
        sb.append("    clippedAt: ").append(toIndentedString(clippedAt)).append("\n");
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

