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
 * 自分のユーザー情報変更リクエスト
 */
@ApiModel(description = "自分のユーザー情報変更リクエスト")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-21T02:01:01.991892Z[Etc/UTC]")
public class PatchMeRequest {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_TWITTER_ID = "twitterId";
  @SerializedName(SERIALIZED_NAME_TWITTER_ID)
  private String twitterId;

  public static final String SERIALIZED_NAME_BIO = "bio";
  @SerializedName(SERIALIZED_NAME_BIO)
  private String bio;

  public static final String SERIALIZED_NAME_HOME_CHANNEL = "homeChannel";
  @SerializedName(SERIALIZED_NAME_HOME_CHANNEL)
  private UUID homeChannel;

  public PatchMeRequest() { 
  }

  public PatchMeRequest displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * 新しい表示名
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "新しい表示名")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public PatchMeRequest twitterId(String twitterId) {
    
    this.twitterId = twitterId;
    return this;
  }

   /**
   * TwitterID
   * @return twitterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TwitterID")

  public String getTwitterId() {
    return twitterId;
  }


  public void setTwitterId(String twitterId) {
    this.twitterId = twitterId;
  }


  public PatchMeRequest bio(String bio) {
    
    this.bio = bio;
    return this;
  }

   /**
   * 自己紹介(biography)
   * @return bio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "自己紹介(biography)")

  public String getBio() {
    return bio;
  }


  public void setBio(String bio) {
    this.bio = bio;
  }


  public PatchMeRequest homeChannel(UUID homeChannel) {
    
    this.homeChannel = homeChannel;
    return this;
  }

   /**
   * ホームチャンネルのUUID &#x60;00000000-0000-0000-0000-000000000000&#x60;を指定すると、ホームチャンネルが&#x60;null&#x60;に設定されます
   * @return homeChannel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ホームチャンネルのUUID `00000000-0000-0000-0000-000000000000`を指定すると、ホームチャンネルが`null`に設定されます")

  public UUID getHomeChannel() {
    return homeChannel;
  }


  public void setHomeChannel(UUID homeChannel) {
    this.homeChannel = homeChannel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchMeRequest patchMeRequest = (PatchMeRequest) o;
    return Objects.equals(this.displayName, patchMeRequest.displayName) &&
        Objects.equals(this.twitterId, patchMeRequest.twitterId) &&
        Objects.equals(this.bio, patchMeRequest.bio) &&
        Objects.equals(this.homeChannel, patchMeRequest.homeChannel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, twitterId, bio, homeChannel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchMeRequest {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    twitterId: ").append(toIndentedString(twitterId)).append("\n");
    sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
    sb.append("    homeChannel: ").append(toIndentedString(homeChannel)).append("\n");
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
    openapiFields.add("displayName");
    openapiFields.add("twitterId");
    openapiFields.add("bio");
    openapiFields.add("homeChannel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PatchMeRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PatchMeRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PatchMeRequest is not found in the empty JSON string", PatchMeRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PatchMeRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PatchMeRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if (jsonObj.get("twitterId") != null && !jsonObj.get("twitterId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `twitterId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("twitterId").toString()));
      }
      if (jsonObj.get("bio") != null && !jsonObj.get("bio").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bio` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bio").toString()));
      }
      if (jsonObj.get("homeChannel") != null && !jsonObj.get("homeChannel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `homeChannel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("homeChannel").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PatchMeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PatchMeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PatchMeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PatchMeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PatchMeRequest>() {
           @Override
           public void write(JsonWriter out, PatchMeRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PatchMeRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PatchMeRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PatchMeRequest
  * @throws IOException if the JSON string is invalid with respect to PatchMeRequest
  */
  public static PatchMeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PatchMeRequest.class);
  }

 /**
  * Convert an instance of PatchMeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

