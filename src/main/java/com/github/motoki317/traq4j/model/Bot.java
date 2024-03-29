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
import com.github.motoki317.traq4j.model.BotMode;
import com.github.motoki317.traq4j.model.BotState;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
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
 * BOT情報
 */
@ApiModel(description = "BOT情報")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-21T02:01:01.991892Z[Etc/UTC]")
public class Bot {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_BOT_USER_ID = "botUserId";
  @SerializedName(SERIALIZED_NAME_BOT_USER_ID)
  private UUID botUserId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DEVELOPER_ID = "developerId";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_ID)
  private UUID developerId;

  public static final String SERIALIZED_NAME_SUBSCRIBE_EVENTS = "subscribeEvents";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBE_EVENTS)
  private List<String> subscribeEvents = new ArrayList<>();

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private BotMode mode;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private BotState state;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public Bot() { 
  }

  public Bot id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * BOT UUID
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "BOT UUID")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public Bot botUserId(UUID botUserId) {
    
    this.botUserId = botUserId;
    return this;
  }

   /**
   * BOTユーザーUUID
   * @return botUserId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "BOTユーザーUUID")

  public UUID getBotUserId() {
    return botUserId;
  }


  public void setBotUserId(UUID botUserId) {
    this.botUserId = botUserId;
  }


  public Bot description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 説明
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "説明")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Bot developerId(UUID developerId) {
    
    this.developerId = developerId;
    return this;
  }

   /**
   * BOT開発者UUID
   * @return developerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "BOT開発者UUID")

  public UUID getDeveloperId() {
    return developerId;
  }


  public void setDeveloperId(UUID developerId) {
    this.developerId = developerId;
  }


  public Bot subscribeEvents(List<String> subscribeEvents) {
    
    this.subscribeEvents = subscribeEvents;
    return this;
  }

  public Bot addSubscribeEventsItem(String subscribeEventsItem) {
    this.subscribeEvents.add(subscribeEventsItem);
    return this;
  }

   /**
   * BOTが購読しているイベントの配列
   * @return subscribeEvents
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "BOTが購読しているイベントの配列")

  public List<String> getSubscribeEvents() {
    return subscribeEvents;
  }


  public void setSubscribeEvents(List<String> subscribeEvents) {
    this.subscribeEvents = subscribeEvents;
  }


  public Bot mode(BotMode mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BotMode getMode() {
    return mode;
  }


  public void setMode(BotMode mode) {
    this.mode = mode;
  }


  public Bot state(BotState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BotState getState() {
    return state;
  }


  public void setState(BotState state) {
    this.state = state;
  }


  public Bot createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * 作成日時
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "作成日時")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Bot updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * 更新日時
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "更新日時")

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
    Bot bot = (Bot) o;
    return Objects.equals(this.id, bot.id) &&
        Objects.equals(this.botUserId, bot.botUserId) &&
        Objects.equals(this.description, bot.description) &&
        Objects.equals(this.developerId, bot.developerId) &&
        Objects.equals(this.subscribeEvents, bot.subscribeEvents) &&
        Objects.equals(this.mode, bot.mode) &&
        Objects.equals(this.state, bot.state) &&
        Objects.equals(this.createdAt, bot.createdAt) &&
        Objects.equals(this.updatedAt, bot.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, botUserId, description, developerId, subscribeEvents, mode, state, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bot {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    botUserId: ").append(toIndentedString(botUserId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    developerId: ").append(toIndentedString(developerId)).append("\n");
    sb.append("    subscribeEvents: ").append(toIndentedString(subscribeEvents)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
    openapiFields.add("botUserId");
    openapiFields.add("description");
    openapiFields.add("developerId");
    openapiFields.add("subscribeEvents");
    openapiFields.add("mode");
    openapiFields.add("state");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("botUserId");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("developerId");
    openapiRequiredFields.add("subscribeEvents");
    openapiRequiredFields.add("mode");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("updatedAt");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Bot
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Bot.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Bot is not found in the empty JSON string", Bot.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Bot.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Bot` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Bot.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("botUserId") != null && !jsonObj.get("botUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `botUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("botUserId").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("developerId") != null && !jsonObj.get("developerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `developerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("developerId").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("subscribeEvents") != null && !jsonObj.get("subscribeEvents").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscribeEvents` to be an array in the JSON string but got `%s`", jsonObj.get("subscribeEvents").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Bot.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Bot' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Bot> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Bot.class));

       return (TypeAdapter<T>) new TypeAdapter<Bot>() {
           @Override
           public void write(JsonWriter out, Bot value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Bot read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Bot given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Bot
  * @throws IOException if the JSON string is invalid with respect to Bot
  */
  public static Bot fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Bot.class);
  }

 /**
  * Convert an instance of Bot to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

