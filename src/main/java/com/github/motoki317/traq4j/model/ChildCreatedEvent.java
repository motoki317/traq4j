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

import java.util.UUID;

/**
 * 子チャンネル作成イベント
 */
@ApiModel(description = "子チャンネル作成イベント")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-05T13:16:54.379Z[GMT]")
public class ChildCreatedEvent {
  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;

  public static final String SERIALIZED_NAME_CHANNEL_ID = "channelId";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
  private UUID channelId;


  public ChildCreatedEvent userId(UUID userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 作成者UUID
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "作成者UUID")

  public UUID getUserId() {
    return userId;
  }


  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  public ChildCreatedEvent channelId(UUID channelId) {
    
    this.channelId = channelId;
    return this;
  }

   /**
   * チャンネルUUID
   * @return channelId
  **/
  @ApiModelProperty(required = true, value = "チャンネルUUID")

  public UUID getChannelId() {
    return channelId;
  }


  public void setChannelId(UUID channelId) {
    this.channelId = channelId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChildCreatedEvent childCreatedEvent = (ChildCreatedEvent) o;
    return Objects.equals(this.userId, childCreatedEvent.userId) &&
        Objects.equals(this.channelId, childCreatedEvent.channelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, channelId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChildCreatedEvent {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
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

