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
import java.util.UUID;

import org.threeten.bp.OffsetDateTime;

/**
 * ユーザー情報
 */
@ApiModel(description = "ユーザー情報")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-18T11:58:46.174904Z[Etc/UTC]")
public class User {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private UUID id;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
    private String displayName;

    public static final String SERIALIZED_NAME_ICON_FILE_ID = "iconFileId";
    @SerializedName(SERIALIZED_NAME_ICON_FILE_ID)
    private UUID iconFileId;

    public static final String SERIALIZED_NAME_BOT = "bot";
    @SerializedName(SERIALIZED_NAME_BOT)
    private Boolean bot;

    public static final String SERIALIZED_NAME_STATE = "state";
    @SerializedName(SERIALIZED_NAME_STATE)
    private UserAccountState state;

    public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    private OffsetDateTime updatedAt;


    public User id(UUID id) {

        this.id = id;
        return this;
    }

    /**
     * ユーザーUUID
     *
     * @return id
     **/
    @ApiModelProperty(required = true, value = "ユーザーUUID")

    public UUID getId() {
        return id;
    }


    public void setId(UUID id) {
        this.id = id;
    }


    public User name(String name) {

        this.name = name;
        return this;
    }

    /**
     * ユーザー名
     *
     * @return name
     **/
    @ApiModelProperty(required = true, value = "ユーザー名")

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public User displayName(String displayName) {

        this.displayName = displayName;
        return this;
    }

    /**
     * ユーザー表示名
     *
     * @return displayName
     **/
    @ApiModelProperty(required = true, value = "ユーザー表示名")

    public String getDisplayName() {
        return displayName;
    }


    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }


    public User iconFileId(UUID iconFileId) {

        this.iconFileId = iconFileId;
        return this;
    }

    /**
     * アイコンファイルUUID
     *
     * @return iconFileId
     **/
    @ApiModelProperty(required = true, value = "アイコンファイルUUID")

    public UUID getIconFileId() {
        return iconFileId;
    }


    public void setIconFileId(UUID iconFileId) {
        this.iconFileId = iconFileId;
    }


    public User bot(Boolean bot) {

        this.bot = bot;
        return this;
    }

    /**
     * BOTかどうか
     *
     * @return bot
     **/
    @ApiModelProperty(required = true, value = "BOTかどうか")

    public Boolean getBot() {
        return bot;
    }


    public void setBot(Boolean bot) {
        this.bot = bot;
    }


    public User state(UserAccountState state) {

        this.state = state;
        return this;
    }

    /**
     * Get state
     *
     * @return state
     **/
    @ApiModelProperty(required = true, value = "")

    public UserAccountState getState() {
        return state;
    }


    public void setState(UserAccountState state) {
        this.state = state;
    }


    public User updatedAt(OffsetDateTime updatedAt) {

        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新日時
     *
     * @return updatedAt
     **/
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
        User user = (User) o;
        return Objects.equals(this.id, user.id) &&
                Objects.equals(this.name, user.name) &&
                Objects.equals(this.displayName, user.displayName) &&
                Objects.equals(this.iconFileId, user.iconFileId) &&
                Objects.equals(this.bot, user.bot) &&
                Objects.equals(this.state, user.state) &&
                Objects.equals(this.updatedAt, user.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, displayName, iconFileId, bot, state, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class User {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    iconFileId: ").append(toIndentedString(iconFileId)).append("\n");
        sb.append("    bot: ").append(toIndentedString(bot)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

}

