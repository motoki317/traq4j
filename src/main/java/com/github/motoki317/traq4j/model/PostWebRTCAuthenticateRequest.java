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
 * skyway用認証リクエスト
 */
@ApiModel(description = "skyway用認証リクエスト")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-21T02:01:01.991892Z[Etc/UTC]")
public class PostWebRTCAuthenticateRequest {
  public static final String SERIALIZED_NAME_PEER_ID = "peerId";
  @SerializedName(SERIALIZED_NAME_PEER_ID)
  private String peerId;

  public PostWebRTCAuthenticateRequest() { 
  }

  public PostWebRTCAuthenticateRequest peerId(String peerId) {
    
    this.peerId = peerId;
    return this;
  }

   /**
   * ピアID
   * @return peerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ピアID")

  public String getPeerId() {
    return peerId;
  }


  public void setPeerId(String peerId) {
    this.peerId = peerId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostWebRTCAuthenticateRequest postWebRTCAuthenticateRequest = (PostWebRTCAuthenticateRequest) o;
    return Objects.equals(this.peerId, postWebRTCAuthenticateRequest.peerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(peerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostWebRTCAuthenticateRequest {\n");
    sb.append("    peerId: ").append(toIndentedString(peerId)).append("\n");
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
    openapiFields.add("peerId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("peerId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PostWebRTCAuthenticateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PostWebRTCAuthenticateRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostWebRTCAuthenticateRequest is not found in the empty JSON string", PostWebRTCAuthenticateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PostWebRTCAuthenticateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PostWebRTCAuthenticateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PostWebRTCAuthenticateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("peerId") != null && !jsonObj.get("peerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `peerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("peerId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostWebRTCAuthenticateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostWebRTCAuthenticateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostWebRTCAuthenticateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostWebRTCAuthenticateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PostWebRTCAuthenticateRequest>() {
           @Override
           public void write(JsonWriter out, PostWebRTCAuthenticateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PostWebRTCAuthenticateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PostWebRTCAuthenticateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PostWebRTCAuthenticateRequest
  * @throws IOException if the JSON string is invalid with respect to PostWebRTCAuthenticateRequest
  */
  public static PostWebRTCAuthenticateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostWebRTCAuthenticateRequest.class);
  }

 /**
  * Convert an instance of PostWebRTCAuthenticateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

