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

import com.github.motoki317.traq4j.model.ChannelSubscribeLevel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;

/**
 * チャンネル購読レベル変更リクエスト
 */
@ApiModel(description = "チャンネル購読レベル変更リクエスト")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-18T11:58:46.174904Z[Etc/UTC]")
public class PutChannelSubscribeLevelRequest {
    public static final String SERIALIZED_NAME_LEVEL = "level";
    @SerializedName(SERIALIZED_NAME_LEVEL)
    private ChannelSubscribeLevel level;


    public PutChannelSubscribeLevelRequest level(ChannelSubscribeLevel level) {

        this.level = level;
        return this;
    }

    /**
     * Get level
     *
     * @return level
     **/
    @ApiModelProperty(required = true, value = "")

    public ChannelSubscribeLevel getLevel() {
        return level;
    }


    public void setLevel(ChannelSubscribeLevel level) {
        this.level = level;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PutChannelSubscribeLevelRequest putChannelSubscribeLevelRequest = (PutChannelSubscribeLevelRequest) o;
        return Objects.equals(this.level, putChannelSubscribeLevelRequest.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(level);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutChannelSubscribeLevelRequest {\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

