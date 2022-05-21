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
import com.github.motoki317.traq4j.model.UserTag;
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
 * ユーザー詳細情報
 */
@ApiModel(description = "ユーザー詳細情報")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-21T02:01:01.991892Z[Etc/UTC]")
public class UserDetail {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private UserAccountState state;

  public static final String SERIALIZED_NAME_BOT = "bot";
  @SerializedName(SERIALIZED_NAME_BOT)
  private Boolean bot;

  public static final String SERIALIZED_NAME_ICON_FILE_ID = "iconFileId";
  @SerializedName(SERIALIZED_NAME_ICON_FILE_ID)
  private UUID iconFileId;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TWITTER_ID = "twitterId";
  @SerializedName(SERIALIZED_NAME_TWITTER_ID)
  private String twitterId;

  public static final String SERIALIZED_NAME_LAST_ONLINE = "lastOnline";
  @SerializedName(SERIALIZED_NAME_LAST_ONLINE)
  private OffsetDateTime lastOnline;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<UserTag> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<UUID> groups = new ArrayList<>();

  public static final String SERIALIZED_NAME_BIO = "bio";
  @SerializedName(SERIALIZED_NAME_BIO)
  private String bio;

  public static final String SERIALIZED_NAME_HOME_CHANNEL = "homeChannel";
  @SerializedName(SERIALIZED_NAME_HOME_CHANNEL)
  private UUID homeChannel;

  public UserDetail() { 
  }

  public UserDetail id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * ユーザーUUID
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ユーザーUUID")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public UserDetail state(UserAccountState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserAccountState getState() {
    return state;
  }


  public void setState(UserAccountState state) {
    this.state = state;
  }


  public UserDetail bot(Boolean bot) {
    
    this.bot = bot;
    return this;
  }

   /**
   * BOTかどうか
   * @return bot
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "BOTかどうか")

  public Boolean getBot() {
    return bot;
  }


  public void setBot(Boolean bot) {
    this.bot = bot;
  }


  public UserDetail iconFileId(UUID iconFileId) {
    
    this.iconFileId = iconFileId;
    return this;
  }

   /**
   * アイコンファイルUUID
   * @return iconFileId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "アイコンファイルUUID")

  public UUID getIconFileId() {
    return iconFileId;
  }


  public void setIconFileId(UUID iconFileId) {
    this.iconFileId = iconFileId;
  }


  public UserDetail displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * ユーザー表示名
   * @return displayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ユーザー表示名")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public UserDetail name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * ユーザー名
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ユーザー名")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UserDetail twitterId(String twitterId) {
    
    this.twitterId = twitterId;
    return this;
  }

   /**
   * Twitter ID
   * @return twitterId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Twitter ID")

  public String getTwitterId() {
    return twitterId;
  }


  public void setTwitterId(String twitterId) {
    this.twitterId = twitterId;
  }


  public UserDetail lastOnline(OffsetDateTime lastOnline) {
    
    this.lastOnline = lastOnline;
    return this;
  }

   /**
   * 最終オンライン日時
   * @return lastOnline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "最終オンライン日時")

  public OffsetDateTime getLastOnline() {
    return lastOnline;
  }


  public void setLastOnline(OffsetDateTime lastOnline) {
    this.lastOnline = lastOnline;
  }


  public UserDetail updatedAt(OffsetDateTime updatedAt) {
    
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


  public UserDetail tags(List<UserTag> tags) {
    
    this.tags = tags;
    return this;
  }

  public UserDetail addTagsItem(UserTag tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * タグリスト
   * @return tags
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "タグリスト")

  public List<UserTag> getTags() {
    return tags;
  }


  public void setTags(List<UserTag> tags) {
    this.tags = tags;
  }


  public UserDetail groups(List<UUID> groups) {
    
    this.groups = groups;
    return this;
  }

  public UserDetail addGroupsItem(UUID groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * 所属グループのUUIDの配列
   * @return groups
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "所属グループのUUIDの配列")

  public List<UUID> getGroups() {
    return groups;
  }


  public void setGroups(List<UUID> groups) {
    this.groups = groups;
  }


  public UserDetail bio(String bio) {
    
    this.bio = bio;
    return this;
  }

   /**
   * 自己紹介(biography)
   * @return bio
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "自己紹介(biography)")

  public String getBio() {
    return bio;
  }


  public void setBio(String bio) {
    this.bio = bio;
  }


  public UserDetail homeChannel(UUID homeChannel) {
    
    this.homeChannel = homeChannel;
    return this;
  }

   /**
   * ホームチャンネル
   * @return homeChannel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "ホームチャンネル")

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
    UserDetail userDetail = (UserDetail) o;
    return Objects.equals(this.id, userDetail.id) &&
        Objects.equals(this.state, userDetail.state) &&
        Objects.equals(this.bot, userDetail.bot) &&
        Objects.equals(this.iconFileId, userDetail.iconFileId) &&
        Objects.equals(this.displayName, userDetail.displayName) &&
        Objects.equals(this.name, userDetail.name) &&
        Objects.equals(this.twitterId, userDetail.twitterId) &&
        Objects.equals(this.lastOnline, userDetail.lastOnline) &&
        Objects.equals(this.updatedAt, userDetail.updatedAt) &&
        Objects.equals(this.tags, userDetail.tags) &&
        Objects.equals(this.groups, userDetail.groups) &&
        Objects.equals(this.bio, userDetail.bio) &&
        Objects.equals(this.homeChannel, userDetail.homeChannel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, bot, iconFileId, displayName, name, twitterId, lastOnline, updatedAt, tags, groups, bio, homeChannel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDetail {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    bot: ").append(toIndentedString(bot)).append("\n");
    sb.append("    iconFileId: ").append(toIndentedString(iconFileId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    twitterId: ").append(toIndentedString(twitterId)).append("\n");
    sb.append("    lastOnline: ").append(toIndentedString(lastOnline)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("state");
    openapiFields.add("bot");
    openapiFields.add("iconFileId");
    openapiFields.add("displayName");
    openapiFields.add("name");
    openapiFields.add("twitterId");
    openapiFields.add("lastOnline");
    openapiFields.add("updatedAt");
    openapiFields.add("tags");
    openapiFields.add("groups");
    openapiFields.add("bio");
    openapiFields.add("homeChannel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("bot");
    openapiRequiredFields.add("iconFileId");
    openapiRequiredFields.add("displayName");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("twitterId");
    openapiRequiredFields.add("lastOnline");
    openapiRequiredFields.add("updatedAt");
    openapiRequiredFields.add("tags");
    openapiRequiredFields.add("groups");
    openapiRequiredFields.add("bio");
    openapiRequiredFields.add("homeChannel");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UserDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserDetail is not found in the empty JSON string", UserDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UserDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserDetail.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("iconFileId") != null && !jsonObj.get("iconFileId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconFileId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconFileId").toString()));
      }
      if (jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("twitterId") != null && !jsonObj.get("twitterId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `twitterId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("twitterId").toString()));
      }
      JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
      if (jsonArraytags != null) {
        // ensure the json data is an array
        if (!jsonObj.get("tags").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
        }

        // validate the optional field `tags` (array)
        for (int i = 0; i < jsonArraytags.size(); i++) {
          UserTag.validateJsonObject(jsonArraytags.get(i).getAsJsonObject());
        };
      }
      // ensure the json data is an array
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
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
       if (!UserDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<UserDetail>() {
           @Override
           public void write(JsonWriter out, UserDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserDetail
  * @throws IOException if the JSON string is invalid with respect to UserDetail
  */
  public static UserDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserDetail.class);
  }

 /**
  * Convert an instance of UserDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

