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
 * スタンプ情報
 */
@ApiModel(description = "スタンプ情報")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-18T11:58:46.174904Z[Etc/UTC]")
public class Stamp {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private UUID id;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_CREATOR_ID = "creatorId";
    @SerializedName(SERIALIZED_NAME_CREATOR_ID)
    private UUID creatorId;

    public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private OffsetDateTime createdAt;

    public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    private OffsetDateTime updatedAt;

    public static final String SERIALIZED_NAME_FILE_ID = "fileId";
    @SerializedName(SERIALIZED_NAME_FILE_ID)
    private UUID fileId;

    public static final String SERIALIZED_NAME_IS_UNICODE = "isUnicode";
    @SerializedName(SERIALIZED_NAME_IS_UNICODE)
    private Boolean isUnicode;


    public Stamp id(UUID id) {

        this.id = id;
        return this;
    }

    /**
     * スタンプUUID
     *
     * @return id
     **/
    @ApiModelProperty(required = true, value = "スタンプUUID")

    public UUID getId() {
        return id;
    }


    public void setId(UUID id) {
        this.id = id;
    }


    public Stamp name(String name) {

        this.name = name;
        return this;
    }

    /**
     * スタンプ名
     *
     * @return name
     **/
    @ApiModelProperty(required = true, value = "スタンプ名")

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Stamp creatorId(UUID creatorId) {

        this.creatorId = creatorId;
        return this;
    }

    /**
     * 作成者UUID
     *
     * @return creatorId
     **/
    @ApiModelProperty(required = true, value = "作成者UUID")

    public UUID getCreatorId() {
        return creatorId;
    }


    public void setCreatorId(UUID creatorId) {
        this.creatorId = creatorId;
    }


    public Stamp createdAt(OffsetDateTime createdAt) {

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


    public Stamp updatedAt(OffsetDateTime updatedAt) {

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


    public Stamp fileId(UUID fileId) {

        this.fileId = fileId;
        return this;
    }

    /**
     * ファイルUUID
     *
     * @return fileId
     **/
    @ApiModelProperty(required = true, value = "ファイルUUID")

    public UUID getFileId() {
        return fileId;
    }


    public void setFileId(UUID fileId) {
        this.fileId = fileId;
    }


    public Stamp isUnicode(Boolean isUnicode) {

        this.isUnicode = isUnicode;
        return this;
    }

    /**
     * Unicode絵文字か
     *
     * @return isUnicode
     **/
    @ApiModelProperty(required = true, value = "Unicode絵文字か")

    public Boolean getIsUnicode() {
        return isUnicode;
    }


    public void setIsUnicode(Boolean isUnicode) {
        this.isUnicode = isUnicode;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Stamp stamp = (Stamp) o;
        return Objects.equals(this.id, stamp.id) &&
                Objects.equals(this.name, stamp.name) &&
                Objects.equals(this.creatorId, stamp.creatorId) &&
                Objects.equals(this.createdAt, stamp.createdAt) &&
                Objects.equals(this.updatedAt, stamp.updatedAt) &&
                Objects.equals(this.fileId, stamp.fileId) &&
                Objects.equals(this.isUnicode, stamp.isUnicode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, creatorId, createdAt, updatedAt, fileId, isUnicode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Stamp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    isUnicode: ").append(toIndentedString(isUnicode)).append("\n");
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

