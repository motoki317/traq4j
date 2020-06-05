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
 * ユーザーグループメンバー編集リクエスト
 */
@ApiModel(description = "ユーザーグループメンバー編集リクエスト")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-05T13:16:54.379Z[GMT]")
public class PatchGroupMemberRequest {
  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;


  public PatchGroupMemberRequest role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * ユーザーの役割
   * @return role
  **/
  @ApiModelProperty(required = true, value = "ユーザーの役割")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchGroupMemberRequest patchGroupMemberRequest = (PatchGroupMemberRequest) o;
    return Objects.equals(this.role, patchGroupMemberRequest.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchGroupMemberRequest {\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

