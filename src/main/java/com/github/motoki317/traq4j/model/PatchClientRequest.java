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
import java.net.URI;
import java.util.UUID;

/**
 * OAuth2クライアント情報変更リクエスト
 */
@ApiModel(description = "OAuth2クライアント情報変更リクエスト")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-18T11:58:46.174904Z[Etc/UTC]")
public class PatchClientRequest {
    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_CALLBACK_URL = "callbackUrl";
    @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
    private URI callbackUrl;

    public static final String SERIALIZED_NAME_DEVELOPER_ID = "developerId";
    @SerializedName(SERIALIZED_NAME_DEVELOPER_ID)
    private UUID developerId;


    public PatchClientRequest name(String name) {

        this.name = name;
        return this;
    }

    /**
     * クライアント名
     *
     * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "クライアント名")

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public PatchClientRequest description(String description) {

        this.description = description;
        return this;
    }

    /**
     * 説明
     *
     * @return description
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "説明")

    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public PatchClientRequest callbackUrl(URI callbackUrl) {

        this.callbackUrl = callbackUrl;
        return this;
    }

    /**
     * コールバックURL
     *
     * @return callbackUrl
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "コールバックURL")

    public URI getCallbackUrl() {
        return callbackUrl;
    }


    public void setCallbackUrl(URI callbackUrl) {
        this.callbackUrl = callbackUrl;
    }


    public PatchClientRequest developerId(UUID developerId) {

        this.developerId = developerId;
        return this;
    }

    /**
     * クライアント開発者UUID
     *
     * @return developerId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "クライアント開発者UUID")

    public UUID getDeveloperId() {
        return developerId;
    }


    public void setDeveloperId(UUID developerId) {
        this.developerId = developerId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PatchClientRequest patchClientRequest = (PatchClientRequest) o;
        return Objects.equals(this.name, patchClientRequest.name) &&
                Objects.equals(this.description, patchClientRequest.description) &&
                Objects.equals(this.callbackUrl, patchClientRequest.callbackUrl) &&
                Objects.equals(this.developerId, patchClientRequest.developerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, callbackUrl, developerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PatchClientRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
        sb.append("    developerId: ").append(toIndentedString(developerId)).append("\n");
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

