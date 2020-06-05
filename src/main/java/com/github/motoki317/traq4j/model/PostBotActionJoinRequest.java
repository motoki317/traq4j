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
 * BOTチャンネル参加リクエスト
 */
@ApiModel(description = "BOTチャンネル参加リクエスト")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-05T13:16:54.379Z[GMT]")
public class PostBotActionJoinRequest {
  public static final String SERIALIZED_NAME_CHANNEL_ID = "channelId";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
  private UUID channelId;


  public PostBotActionJoinRequest channelId(UUID channelId) {
    
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
    PostBotActionJoinRequest postBotActionJoinRequest = (PostBotActionJoinRequest) o;
    return Objects.equals(this.channelId, postBotActionJoinRequest.channelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostBotActionJoinRequest {\n");
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

