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
 * 親チャンネル変更イベント
 */
@ApiModel(description = "親チャンネル変更イベント")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-05T14:52:47.663Z[GMT]")
public class ParentChangedEvent {
  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;

  public static final String SERIALIZED_NAME_BEFORE = "before";
  @SerializedName(SERIALIZED_NAME_BEFORE)
  private UUID before;

  public static final String SERIALIZED_NAME_AFTER = "after";
  @SerializedName(SERIALIZED_NAME_AFTER)
  private UUID after;


  public ParentChangedEvent userId(UUID userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 変更者UUID
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "変更者UUID")

  public UUID getUserId() {
    return userId;
  }


  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  public ParentChangedEvent before(UUID before) {
    
    this.before = before;
    return this;
  }

   /**
   * 変更前親チャンネルUUID
   * @return before
  **/
  @ApiModelProperty(required = true, value = "変更前親チャンネルUUID")

  public UUID getBefore() {
    return before;
  }


  public void setBefore(UUID before) {
    this.before = before;
  }


  public ParentChangedEvent after(UUID after) {
    
    this.after = after;
    return this;
  }

   /**
   * 変更後親チャンネルUUID
   * @return after
  **/
  @ApiModelProperty(required = true, value = "変更後親チャンネルUUID")

  public UUID getAfter() {
    return after;
  }


  public void setAfter(UUID after) {
    this.after = after;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParentChangedEvent parentChangedEvent = (ParentChangedEvent) o;
    return Objects.equals(this.userId, parentChangedEvent.userId) &&
        Objects.equals(this.before, parentChangedEvent.before) &&
        Objects.equals(this.after, parentChangedEvent.after);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, before, after);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParentChangedEvent {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
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

