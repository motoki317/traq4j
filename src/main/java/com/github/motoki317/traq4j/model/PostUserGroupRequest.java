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
 * ユーザーグループ作成リクエスト
 */
@ApiModel(description = "ユーザーグループ作成リクエスト")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-05T14:52:47.663Z[GMT]")
public class PostUserGroupRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public PostUserGroupRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * グループ名
   * @return name
  **/
  @ApiModelProperty(required = true, value = "グループ名")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PostUserGroupRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 説明
   * @return description
  **/
  @ApiModelProperty(required = true, value = "説明")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PostUserGroupRequest type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * グループタイプ
   * @return type
  **/
  @ApiModelProperty(required = true, value = "グループタイプ")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostUserGroupRequest postUserGroupRequest = (PostUserGroupRequest) o;
    return Objects.equals(this.name, postUserGroupRequest.name) &&
        Objects.equals(this.description, postUserGroupRequest.description) &&
        Objects.equals(this.type, postUserGroupRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostUserGroupRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
