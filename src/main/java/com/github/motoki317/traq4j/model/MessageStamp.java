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
 * メッセージに押されたスタンプ
 */
@ApiModel(description = "メッセージに押されたスタンプ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-05T14:52:47.663Z[GMT]")
public class MessageStamp {
  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;

  public static final String SERIALIZED_NAME_STAMP_ID = "stampId";
  @SerializedName(SERIALIZED_NAME_STAMP_ID)
  private UUID stampId;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;


  public MessageStamp userId(UUID userId) {
    
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


  public MessageStamp stampId(UUID stampId) {
    
    this.stampId = stampId;
    return this;
  }

   /**
   * スタンプUUID
   * @return stampId
  **/
  @ApiModelProperty(required = true, value = "スタンプUUID")

  public UUID getStampId() {
    return stampId;
  }


  public void setStampId(UUID stampId) {
    this.stampId = stampId;
  }


  public MessageStamp count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * スタンプ数
   * @return count
  **/
  @ApiModelProperty(required = true, value = "スタンプ数")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public MessageStamp createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * スタンプが最初に押された日時
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "スタンプが最初に押された日時")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public MessageStamp updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * スタンプが最後に押された日時
   * @return updatedAt
  **/
  @ApiModelProperty(required = true, value = "スタンプが最後に押された日時")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageStamp messageStamp = (MessageStamp) o;
    return Objects.equals(this.userId, messageStamp.userId) &&
        Objects.equals(this.stampId, messageStamp.stampId) &&
        Objects.equals(this.count, messageStamp.count) &&
        Objects.equals(this.createdAt, messageStamp.createdAt) &&
        Objects.equals(this.updatedAt, messageStamp.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, stampId, count, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageStamp {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    stampId: ").append(toIndentedString(stampId)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

