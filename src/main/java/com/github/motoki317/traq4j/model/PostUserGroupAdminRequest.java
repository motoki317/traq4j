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
 * グループ管理者追加リクエスト
 */
@ApiModel(description = "グループ管理者追加リクエスト")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-18T11:58:46.174904Z[Etc/UTC]")
public class PostUserGroupAdminRequest {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private UUID id;


    public PostUserGroupAdminRequest id(UUID id) {

        this.id = id;
        return this;
    }

    /**
     * 追加するユーザーのUUID
     *
     * @return id
     **/
    @ApiModelProperty(required = true, value = "追加するユーザーのUUID")

    public UUID getId() {
        return id;
    }


    public void setId(UUID id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostUserGroupAdminRequest postUserGroupAdminRequest = (PostUserGroupAdminRequest) o;
        return Objects.equals(this.id, postUserGroupAdminRequest.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostUserGroupAdminRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

