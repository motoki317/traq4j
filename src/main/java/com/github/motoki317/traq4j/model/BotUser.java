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

/**
 * BOTユーザー対
 */
@ApiModel(description = "BOTユーザー対")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-18T11:58:46.174904Z[Etc/UTC]")
public class BotUser {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private UUID id;

    public static final String SERIALIZED_NAME_BOT_USER_ID = "botUserId";
    @SerializedName(SERIALIZED_NAME_BOT_USER_ID)
    private UUID botUserId;


    public BotUser id(UUID id) {

        this.id = id;
        return this;
    }

    /**
     * BOT UUID
     *
     * @return id
     **/
    @ApiModelProperty(required = true, value = "BOT UUID")

    public UUID getId() {
        return id;
    }


    public void setId(UUID id) {
        this.id = id;
    }


    public BotUser botUserId(UUID botUserId) {

        this.botUserId = botUserId;
        return this;
    }

    /**
     * BOTユーザーUUID
     *
     * @return botUserId
     **/
    @ApiModelProperty(required = true, value = "BOTユーザーUUID")

    public UUID getBotUserId() {
        return botUserId;
    }


    public void setBotUserId(UUID botUserId) {
        this.botUserId = botUserId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BotUser botUser = (BotUser) o;
        return Objects.equals(this.id, botUser.id) &&
                Objects.equals(this.botUserId, botUser.botUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, botUserId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BotUser {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    botUserId: ").append(toIndentedString(botUserId)).append("\n");
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

