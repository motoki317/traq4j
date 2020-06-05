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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ユーザーのタグの編集リクエスト
 */
@ApiModel(description = "ユーザーのタグの編集リクエスト")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-05T13:16:54.379Z[GMT]")
public class PatchUserTagRequest {
  public static final String SERIALIZED_NAME_IS_LOCKED = "isLocked";
  @SerializedName(SERIALIZED_NAME_IS_LOCKED)
  private Boolean isLocked;


  public PatchUserTagRequest isLocked(Boolean isLocked) {
    
    this.isLocked = isLocked;
    return this;
  }

   /**
   * タグのロック状態
   * @return isLocked
  **/
  @ApiModelProperty(required = true, value = "タグのロック状態")

  public Boolean getIsLocked() {
    return isLocked;
  }


  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchUserTagRequest patchUserTagRequest = (PatchUserTagRequest) o;
    return Objects.equals(this.isLocked, patchUserTagRequest.isLocked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isLocked);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchUserTagRequest {\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
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

