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
import java.time.OffsetDateTime;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.github.motoki317.traq4j.JSON;

/**
 * Timelineアクテビティ用メッセージ
 */
@ApiModel(description = "Timelineアクテビティ用メッセージ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-21T02:01:01.991892Z[Etc/UTC]")
public class ActivityTimelineMessage {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;

  public static final String SERIALIZED_NAME_CHANNEL_ID = "channelId";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
  private UUID channelId;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public ActivityTimelineMessage() { 
  }

  public ActivityTimelineMessage id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * メッセージUUID
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "メッセージUUID")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public ActivityTimelineMessage userId(UUID userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 投稿者UUID
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "投稿者UUID")

  public UUID getUserId() {
    return userId;
  }


  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  public ActivityTimelineMessage channelId(UUID channelId) {
    
    this.channelId = channelId;
    return this;
  }

   /**
   * チャンネルUUID
   * @return channelId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "チャンネルUUID")

  public UUID getChannelId() {
    return channelId;
  }


  public void setChannelId(UUID channelId) {
    this.channelId = channelId;
  }


  public ActivityTimelineMessage content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * メッセージ本文
   * @return content
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "メッセージ本文")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public ActivityTimelineMessage createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * 投稿日時
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "投稿日時")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ActivityTimelineMessage updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * 編集日時
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "編集日時")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityTimelineMessage activityTimelineMessage = (ActivityTimelineMessage) o;
    return Objects.equals(this.id, activityTimelineMessage.id) &&
        Objects.equals(this.userId, activityTimelineMessage.userId) &&
        Objects.equals(this.channelId, activityTimelineMessage.channelId) &&
        Objects.equals(this.content, activityTimelineMessage.content) &&
        Objects.equals(this.createdAt, activityTimelineMessage.createdAt) &&
        Objects.equals(this.updatedAt, activityTimelineMessage.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, channelId, content, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityTimelineMessage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("userId");
    openapiFields.add("channelId");
    openapiFields.add("content");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("userId");
    openapiRequiredFields.add("channelId");
    openapiRequiredFields.add("content");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("updatedAt");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ActivityTimelineMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ActivityTimelineMessage.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActivityTimelineMessage is not found in the empty JSON string", ActivityTimelineMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ActivityTimelineMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActivityTimelineMessage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ActivityTimelineMessage.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if (jsonObj.get("channelId") != null && !jsonObj.get("channelId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channelId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channelId").toString()));
      }
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActivityTimelineMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActivityTimelineMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActivityTimelineMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActivityTimelineMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<ActivityTimelineMessage>() {
           @Override
           public void write(JsonWriter out, ActivityTimelineMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActivityTimelineMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ActivityTimelineMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ActivityTimelineMessage
  * @throws IOException if the JSON string is invalid with respect to ActivityTimelineMessage
  */
  public static ActivityTimelineMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActivityTimelineMessage.class);
  }

 /**
  * Convert an instance of ActivityTimelineMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

