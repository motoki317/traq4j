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
 * チャンネル作成リクエスト
 */
@ApiModel(description = "チャンネル作成リクエスト")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-18T11:58:46.174904Z[Etc/UTC]")
public class PostChannelRequest {
    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_PARENT = "parent";
    @SerializedName(SERIALIZED_NAME_PARENT)
    private UUID parent;


    public PostChannelRequest name(String name) {

        this.name = name;
        return this;
    }

    /**
     * チャンネル名
     *
     * @return name
     **/
    @ApiModelProperty(required = true, value = "チャンネル名")

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public PostChannelRequest parent(UUID parent) {

        this.parent = parent;
        return this;
    }

    /**
     * 親チャンネルのUUID ルートに作成する場合はnullを指定
     *
     * @return parent
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(required = true, value = "親チャンネルのUUID ルートに作成する場合はnullを指定")

    public UUID getParent() {
        return parent;
    }


    public void setParent(UUID parent) {
        this.parent = parent;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostChannelRequest postChannelRequest = (PostChannelRequest) o;
        return Objects.equals(this.name, postChannelRequest.name) &&
                Objects.equals(this.parent, postChannelRequest.parent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, parent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostChannelRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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

