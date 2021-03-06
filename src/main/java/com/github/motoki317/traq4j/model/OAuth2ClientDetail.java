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

import com.github.motoki317.traq4j.model.OAuth2Scope;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * OAuth2クライアント詳細情報
 */
@ApiModel(description = "OAuth2クライアント詳細情報")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-18T11:58:46.174904Z[Etc/UTC]")
public class OAuth2ClientDetail {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_DEVELOPER_ID = "developerId";
    @SerializedName(SERIALIZED_NAME_DEVELOPER_ID)
    private UUID developerId;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_SCOPES = "scopes";
    @SerializedName(SERIALIZED_NAME_SCOPES)
    private List<OAuth2Scope> scopes = new ArrayList<>();

    public static final String SERIALIZED_NAME_CALLBACK_URL = "callbackUrl";
    @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
    private URI callbackUrl;

    public static final String SERIALIZED_NAME_SECRET = "secret";
    @SerializedName(SERIALIZED_NAME_SECRET)
    private String secret;


    public OAuth2ClientDetail id(String id) {

        this.id = id;
        return this;
    }

    /**
     * クライアントUUID
     *
     * @return id
     **/
    @ApiModelProperty(required = true, value = "クライアントUUID")

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public OAuth2ClientDetail developerId(UUID developerId) {

        this.developerId = developerId;
        return this;
    }

    /**
     * クライアント開発者UUID
     *
     * @return developerId
     **/
    @ApiModelProperty(required = true, value = "クライアント開発者UUID")

    public UUID getDeveloperId() {
        return developerId;
    }


    public void setDeveloperId(UUID developerId) {
        this.developerId = developerId;
    }


    public OAuth2ClientDetail description(String description) {

        this.description = description;
        return this;
    }

    /**
     * 説明
     *
     * @return description
     **/
    @ApiModelProperty(required = true, value = "説明")

    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public OAuth2ClientDetail name(String name) {

        this.name = name;
        return this;
    }

    /**
     * クライアント名
     *
     * @return name
     **/
    @ApiModelProperty(required = true, value = "クライアント名")

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public OAuth2ClientDetail scopes(List<OAuth2Scope> scopes) {

        this.scopes = scopes;
        return this;
    }

    public OAuth2ClientDetail addScopesItem(OAuth2Scope scopesItem) {
        this.scopes.add(scopesItem);
        return this;
    }

    /**
     * 要求スコープの配列
     *
     * @return scopes
     **/
    @ApiModelProperty(required = true, value = "要求スコープの配列")

    public List<OAuth2Scope> getScopes() {
        return scopes;
    }


    public void setScopes(List<OAuth2Scope> scopes) {
        this.scopes = scopes;
    }


    public OAuth2ClientDetail callbackUrl(URI callbackUrl) {

        this.callbackUrl = callbackUrl;
        return this;
    }

    /**
     * コールバックURL
     *
     * @return callbackUrl
     **/
    @ApiModelProperty(required = true, value = "コールバックURL")

    public URI getCallbackUrl() {
        return callbackUrl;
    }


    public void setCallbackUrl(URI callbackUrl) {
        this.callbackUrl = callbackUrl;
    }


    public OAuth2ClientDetail secret(String secret) {

        this.secret = secret;
        return this;
    }

    /**
     * クライアントシークレット
     *
     * @return secret
     **/
    @ApiModelProperty(required = true, value = "クライアントシークレット")

    public String getSecret() {
        return secret;
    }


    public void setSecret(String secret) {
        this.secret = secret;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OAuth2ClientDetail oauth2ClientDetail = (OAuth2ClientDetail) o;
        return Objects.equals(this.id, oauth2ClientDetail.id) &&
                Objects.equals(this.developerId, oauth2ClientDetail.developerId) &&
                Objects.equals(this.description, oauth2ClientDetail.description) &&
                Objects.equals(this.name, oauth2ClientDetail.name) &&
                Objects.equals(this.scopes, oauth2ClientDetail.scopes) &&
                Objects.equals(this.callbackUrl, oauth2ClientDetail.callbackUrl) &&
                Objects.equals(this.secret, oauth2ClientDetail.secret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, developerId, description, name, scopes, callbackUrl, secret);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OAuth2ClientDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    developerId: ").append(toIndentedString(developerId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
        sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
        sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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

