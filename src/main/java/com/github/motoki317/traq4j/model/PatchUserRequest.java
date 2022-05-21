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
import com.github.motoki317.traq4j.model.UserAccountState;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * ユーザー情報編集リクエスト
 */
@ApiModel(description = "ユーザー情報編集リクエスト")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-21T02:01:01.991892Z[Etc/UTC]")
public class PatchUserRequest {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_TWITTER_ID = "twitterId";
  @SerializedName(SERIALIZED_NAME_TWITTER_ID)
  private String twitterId;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private UserAccountState state;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public PatchUserRequest() { 
  }

  public PatchUserRequest displayName(String displayName) {
    
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


  public PatchUserRequest twitterId(String twitterId) {
    
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


  public PatchUserRequest state(UserAccountState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserAccountState getState() {
    return state;
  }


  public void setState(UserAccountState state) {
    this.state = state;
  }


  public PatchUserRequest role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * ユーザーロール
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ユーザーロール")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchUserRequest patchUserRequest = (PatchUserRequest) o;
    return Objects.equals(this.displayName, patchUserRequest.displayName) &&
        Objects.equals(this.twitterId, patchUserRequest.twitterId) &&
        Objects.equals(this.state, patchUserRequest.state) &&
        Objects.equals(this.role, patchUserRequest.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, twitterId, state, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchUserRequest {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    twitterId: ").append(toIndentedString(twitterId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
    openapiFields.add("state");
    openapiFields.add("role");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PatchUserRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PatchUserRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PatchUserRequest is not found in the empty JSON string", PatchUserRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PatchUserRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PatchUserRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if (jsonObj.get("twitterId") != null && !jsonObj.get("twitterId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `twitterId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("twitterId").toString()));
      }
      if (jsonObj.get("role") != null && !jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PatchUserRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PatchUserRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PatchUserRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PatchUserRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PatchUserRequest>() {
           @Override
           public void write(JsonWriter out, PatchUserRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PatchUserRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PatchUserRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PatchUserRequest
  * @throws IOException if the JSON string is invalid with respect to PatchUserRequest
  */
  public static PatchUserRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PatchUserRequest.class);
  }

 /**
  * Convert an instance of PatchUserRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

