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

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * チャンネル購読者編集リクエスト
 */
@ApiModel(description = "チャンネル購読者編集リクエスト")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-05T13:16:54.379Z[GMT]")
public class PatchChannelSubscribersRequest {
  public static final String SERIALIZED_NAME_ON = "on";
  @SerializedName(SERIALIZED_NAME_ON)
  private List<UUID> on = null;

  public static final String SERIALIZED_NAME_OFF = "off";
  @SerializedName(SERIALIZED_NAME_OFF)
  private List<UUID> off = null;


  public PatchChannelSubscribersRequest on(List<UUID> on) {
    
    this.on = on;
    return this;
  }

  public PatchChannelSubscribersRequest addOnItem(UUID onItem) {
    if (this.on == null) {
      this.on = new ArrayList<UUID>();
    }
    this.on.add(onItem);
    return this;
  }

   /**
   * 通知をオンにするユーザーのUUID配列
   * @return on
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "通知をオンにするユーザーのUUID配列")

  public List<UUID> getOn() {
    return on;
  }


  public void setOn(List<UUID> on) {
    this.on = on;
  }


  public PatchChannelSubscribersRequest off(List<UUID> off) {
    
    this.off = off;
    return this;
  }

  public PatchChannelSubscribersRequest addOffItem(UUID offItem) {
    if (this.off == null) {
      this.off = new ArrayList<UUID>();
    }
    this.off.add(offItem);
    return this;
  }

   /**
   * 通知をオフにするユーザーのUUID配列
   * @return off
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "通知をオフにするユーザーのUUID配列")

  public List<UUID> getOff() {
    return off;
  }


  public void setOff(List<UUID> off) {
    this.off = off;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchChannelSubscribersRequest patchChannelSubscribersRequest = (PatchChannelSubscribersRequest) o;
    return Objects.equals(this.on, patchChannelSubscribersRequest.on) &&
        Objects.equals(this.off, patchChannelSubscribersRequest.off);
  }

  @Override
  public int hashCode() {
    return Objects.hash(on, off);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchChannelSubscribersRequest {\n");
    sb.append("    on: ").append(toIndentedString(on)).append("\n");
    sb.append("    off: ").append(toIndentedString(off)).append("\n");
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

