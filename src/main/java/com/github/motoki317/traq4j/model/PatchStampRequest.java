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
 * スタンプ情報変更リクエスト
 */
@ApiModel(description = "スタンプ情報変更リクエスト")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-05T14:52:47.663Z[GMT]")
public class PatchStampRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATOR_ID = "creatorId";
  @SerializedName(SERIALIZED_NAME_CREATOR_ID)
  private UUID creatorId;


  public PatchStampRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * スタンプ名
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "スタンプ名")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PatchStampRequest creatorId(UUID creatorId) {
    
    this.creatorId = creatorId;
    return this;
  }

   /**
   * 作成者UUID
   * @return creatorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "作成者UUID")

  public UUID getCreatorId() {
    return creatorId;
  }


  public void setCreatorId(UUID creatorId) {
    this.creatorId = creatorId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchStampRequest patchStampRequest = (PatchStampRequest) o;
    return Objects.equals(this.name, patchStampRequest.name) &&
        Objects.equals(this.creatorId, patchStampRequest.creatorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, creatorId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchStampRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
