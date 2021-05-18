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

/**
 * FCMデバイス登録リクエスト
 */
@ApiModel(description = "FCMデバイス登録リクエスト")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-18T11:58:46.174904Z[Etc/UTC]")
public class PostMyFCMDeviceRequest {
    public static final String SERIALIZED_NAME_TOKEN = "token";
    @SerializedName(SERIALIZED_NAME_TOKEN)
    private String token;


    public PostMyFCMDeviceRequest token(String token) {

        this.token = token;
        return this;
    }

    /**
     * FCMのデバイストークン
     *
     * @return token
     **/
    @ApiModelProperty(example = "bk3RNwTe3H0:CI2k_HHwgIpoDKCIZvvDMExUdFQ3P1", required = true, value = "FCMのデバイストークン")

    public String getToken() {
        return token;
    }


    public void setToken(String token) {
        this.token = token;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostMyFCMDeviceRequest postMyFCMDeviceRequest = (PostMyFCMDeviceRequest) o;
        return Objects.equals(this.token, postMyFCMDeviceRequest.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostMyFCMDeviceRequest {\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

