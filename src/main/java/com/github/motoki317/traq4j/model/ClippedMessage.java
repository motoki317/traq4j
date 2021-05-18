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

import com.github.motoki317.traq4j.model.Message;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;

import org.threeten.bp.OffsetDateTime;

/**
 * クリップされたメッセージ
 */
@ApiModel(description = "クリップされたメッセージ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-18T11:58:46.174904Z[Etc/UTC]")
public class ClippedMessage {
    public static final String SERIALIZED_NAME_MESSAGE = "message";
    @SerializedName(SERIALIZED_NAME_MESSAGE)
    private Message message;

    public static final String SERIALIZED_NAME_CLIPPED_AT = "clippedAt";
    @SerializedName(SERIALIZED_NAME_CLIPPED_AT)
    private OffsetDateTime clippedAt;


    public ClippedMessage message(Message message) {

        this.message = message;
        return this;
    }

    /**
     * Get message
     *
     * @return message
     **/
    @ApiModelProperty(required = true, value = "")

    public Message getMessage() {
        return message;
    }


    public void setMessage(Message message) {
        this.message = message;
    }


    public ClippedMessage clippedAt(OffsetDateTime clippedAt) {

        this.clippedAt = clippedAt;
        return this;
    }

    /**
     * クリップした日時
     *
     * @return clippedAt
     **/
    @ApiModelProperty(required = true, value = "クリップした日時")

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
        ClippedMessage clippedMessage = (ClippedMessage) o;
        return Objects.equals(this.message, clippedMessage.message) &&
                Objects.equals(this.clippedAt, clippedMessage.clippedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, clippedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClippedMessage {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

