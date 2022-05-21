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
 * メッセージ引用通知設定リクエスト
 */
@ApiModel(description = "メッセージ引用通知設定リクエスト")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-21T02:01:01.991892Z[Etc/UTC]")
public class PutNotifyCitationRequest {
  public static final String SERIALIZED_NAME_NOTIFY_CITATION = "notifyCitation";
  @SerializedName(SERIALIZED_NAME_NOTIFY_CITATION)
  private Boolean notifyCitation;

  public PutNotifyCitationRequest() { 
  }

  public PutNotifyCitationRequest notifyCitation(Boolean notifyCitation) {
    
    this.notifyCitation = notifyCitation;
    return this;
  }

   /**
   * メッセージ引用通知の設定情報
   * @return notifyCitation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "メッセージ引用通知の設定情報")

  public Boolean getNotifyCitation() {
    return notifyCitation;
  }


  public void setNotifyCitation(Boolean notifyCitation) {
    this.notifyCitation = notifyCitation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutNotifyCitationRequest putNotifyCitationRequest = (PutNotifyCitationRequest) o;
    return Objects.equals(this.notifyCitation, putNotifyCitationRequest.notifyCitation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifyCitation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutNotifyCitationRequest {\n");
    sb.append("    notifyCitation: ").append(toIndentedString(notifyCitation)).append("\n");
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
    openapiFields.add("notifyCitation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("notifyCitation");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PutNotifyCitationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PutNotifyCitationRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PutNotifyCitationRequest is not found in the empty JSON string", PutNotifyCitationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PutNotifyCitationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PutNotifyCitationRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PutNotifyCitationRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PutNotifyCitationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PutNotifyCitationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PutNotifyCitationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PutNotifyCitationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PutNotifyCitationRequest>() {
           @Override
           public void write(JsonWriter out, PutNotifyCitationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PutNotifyCitationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PutNotifyCitationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PutNotifyCitationRequest
  * @throws IOException if the JSON string is invalid with respect to PutNotifyCitationRequest
  */
  public static PutNotifyCitationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PutNotifyCitationRequest.class);
  }

 /**
  * Convert an instance of PutNotifyCitationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

