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
import com.github.motoki317.traq4j.model.WebRTCUserStateSessions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * WebRTC状態
 */
@ApiModel(description = "WebRTC状態")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-05T14:52:47.663Z[GMT]")
public class WebRTCUserState {
  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;

  public static final String SERIALIZED_NAME_CHANNEL_ID = "channelId";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
  private UUID channelId;

  public static final String SERIALIZED_NAME_SESSIONS = "sessions";
  @SerializedName(SERIALIZED_NAME_SESSIONS)
  private List<WebRTCUserStateSessions> sessions = new ArrayList<>();


  public WebRTCUserState userId(UUID userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * ユーザーUUID
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "ユーザーUUID")

  public UUID getUserId() {
    return userId;
  }


  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  public WebRTCUserState channelId(UUID channelId) {
    
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


  public WebRTCUserState sessions(List<WebRTCUserStateSessions> sessions) {
    
    this.sessions = sessions;
    return this;
  }

  public WebRTCUserState addSessionsItem(WebRTCUserStateSessions sessionsItem) {
    this.sessions.add(sessionsItem);
    return this;
  }

   /**
   * セッションの配列
   * @return sessions
  **/
  @ApiModelProperty(required = true, value = "セッションの配列")

  public List<WebRTCUserStateSessions> getSessions() {
    return sessions;
  }


  public void setSessions(List<WebRTCUserStateSessions> sessions) {
    this.sessions = sessions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebRTCUserState webRTCUserState = (WebRTCUserState) o;
    return Objects.equals(this.userId, webRTCUserState.userId) &&
        Objects.equals(this.channelId, webRTCUserState.channelId) &&
        Objects.equals(this.sessions, webRTCUserState.sessions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, channelId, sessions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebRTCUserState {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
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
