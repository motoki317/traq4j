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

/**
 * スター追加リクエスト
 */
@ApiModel(description = "スター追加リクエスト")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-18T11:58:46.174904Z[Etc/UTC]")
public class PostStarRequest {
    public static final String SERIALIZED_NAME_CHANNEL_ID = "channelId";
    @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
    private UUID channelId;


    public PostStarRequest channelId(UUID channelId) {

        this.channelId = channelId;
        return this;
    }

    /**
     * チャンネルUUID
     *
     * @return channelId
     **/
    @ApiModelProperty(required = true, value = "チャンネルUUID")

    public UUID getChannelId() {
        return channelId;
    }


    public void setChannelId(UUID channelId) {
        this.channelId = channelId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostStarRequest postStarRequest = (PostStarRequest) o;
        return Objects.equals(this.channelId, postStarRequest.channelId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostStarRequest {\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
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

