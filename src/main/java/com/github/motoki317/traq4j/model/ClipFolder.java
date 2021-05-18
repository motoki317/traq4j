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
 * クリップフォルダ情報
 */
@ApiModel(description = "クリップフォルダ情報")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-18T11:58:46.174904Z[Etc/UTC]")
public class ClipFolder {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private UUID id;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private OffsetDateTime createdAt;

    public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
    @SerializedName(SERIALIZED_NAME_OWNER_ID)
    private UUID ownerId;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;


    public ClipFolder id(UUID id) {

        this.id = id;
        return this;
    }

    /**
     * フォルダUUID
     *
     * @return id
     **/
    @ApiModelProperty(required = true, value = "フォルダUUID")

    public UUID getId() {
        return id;
    }


    public void setId(UUID id) {
        this.id = id;
    }


    public ClipFolder name(String name) {

        this.name = name;
        return this;
    }

    /**
     * フォルダ名
     *
     * @return name
     **/
    @ApiModelProperty(required = true, value = "フォルダ名")

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public ClipFolder createdAt(OffsetDateTime createdAt) {

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


    public ClipFolder ownerId(UUID ownerId) {

        this.ownerId = ownerId;
        return this;
    }

    /**
     * フォルダ所有者UUID
     *
     * @return ownerId
     **/
    @ApiModelProperty(required = true, value = "フォルダ所有者UUID")

    public UUID getOwnerId() {
        return ownerId;
    }


    public void setOwnerId(UUID ownerId) {
        this.ownerId = ownerId;
    }


    public ClipFolder description(String description) {

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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClipFolder clipFolder = (ClipFolder) o;
        return Objects.equals(this.id, clipFolder.id) &&
                Objects.equals(this.name, clipFolder.name) &&
                Objects.equals(this.createdAt, clipFolder.createdAt) &&
                Objects.equals(this.ownerId, clipFolder.ownerId) &&
                Objects.equals(this.description, clipFolder.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, createdAt, ownerId, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClipFolder {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

