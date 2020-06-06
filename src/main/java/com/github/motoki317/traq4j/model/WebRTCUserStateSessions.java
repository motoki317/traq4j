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
 * WebRTCUserStateSessions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-05T14:52:47.663Z[GMT]")
public class WebRTCUserStateSessions {
  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_SESSION_ID = "sessionId";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private String sessionId;


  public WebRTCUserStateSessions state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * 状態
   * @return state
  **/
  @ApiModelProperty(required = true, value = "状態")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public WebRTCUserStateSessions sessionId(String sessionId) {
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * セッションID
   * @return sessionId
  **/
  @ApiModelProperty(required = true, value = "セッションID")

  public String getSessionId() {
    return sessionId;
  }


  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebRTCUserStateSessions webRTCUserStateSessions = (WebRTCUserStateSessions) o;
    return Objects.equals(this.state, webRTCUserStateSessions.state) &&
        Objects.equals(this.sessionId, webRTCUserStateSessions.sessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, sessionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebRTCUserStateSessions {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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
