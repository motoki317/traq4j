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
import org.threeten.bp.OffsetDateTime;

/**
 * ピン情報
 */
@ApiModel(description = "ピン情報")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-05T14:52:47.663Z[GMT]")
public class MessagePin {
  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;

  public static final String SERIALIZED_NAME_PINNED_AT = "pinnedAt";
  @SerializedName(SERIALIZED_NAME_PINNED_AT)
  private OffsetDateTime pinnedAt;


  public MessagePin userId(UUID userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * ピン留めしたユーザーUUID
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "ピン留めしたユーザーUUID")

  public UUID getUserId() {
    return userId;
  }


  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  public MessagePin pinnedAt(OffsetDateTime pinnedAt) {
    
    this.pinnedAt = pinnedAt;
    return this;
  }

   /**
   * ピン留めされた日時
   * @return pinnedAt
  **/
  @ApiModelProperty(required = true, value = "ピン留めされた日時")

  public OffsetDateTime getPinnedAt() {
    return pinnedAt;
  }


  public void setPinnedAt(OffsetDateTime pinnedAt) {
    this.pinnedAt = pinnedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagePin messagePin = (MessagePin) o;
    return Objects.equals(this.userId, messagePin.userId) &&
        Objects.equals(this.pinnedAt, messagePin.pinnedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, pinnedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagePin {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    pinnedAt: ").append(toIndentedString(pinnedAt)).append("\n");
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
