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

/**
 * OAuth2Token
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-18T11:58:46.174904Z[Etc/UTC]")
public class OAuth2Token {
    public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
    @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
    private String accessToken;

    public static final String SERIALIZED_NAME_TOKEN_TYPE = "token_type";
    @SerializedName(SERIALIZED_NAME_TOKEN_TYPE)
    private String tokenType;

    public static final String SERIALIZED_NAME_EXPIRES_IN = "expires_in";
    @SerializedName(SERIALIZED_NAME_EXPIRES_IN)
    private Integer expiresIn;

    public static final String SERIALIZED_NAME_REFRESH_TOKEN = "refresh_token";
    @SerializedName(SERIALIZED_NAME_REFRESH_TOKEN)
    private String refreshToken;

    public static final String SERIALIZED_NAME_SCOPE = "scope";
    @SerializedName(SERIALIZED_NAME_SCOPE)
    private String scope;

    public static final String SERIALIZED_NAME_ID_TOKEN = "id_token";
    @SerializedName(SERIALIZED_NAME_ID_TOKEN)
    private String idToken;


    public OAuth2Token accessToken(String accessToken) {

        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get accessToken
     *
     * @return accessToken
     **/
    @ApiModelProperty(required = true, value = "")

    public String getAccessToken() {
        return accessToken;
    }


    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }


    public OAuth2Token tokenType(String tokenType) {

        this.tokenType = tokenType;
        return this;
    }

    /**
     * Get tokenType
     *
     * @return tokenType
     **/
    @ApiModelProperty(required = true, value = "")

    public String getTokenType() {
        return tokenType;
    }


    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }


    public OAuth2Token expiresIn(Integer expiresIn) {

        this.expiresIn = expiresIn;
        return this;
    }

    /**
     * Get expiresIn
     *
     * @return expiresIn
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getExpiresIn() {
        return expiresIn;
    }


    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }


    public OAuth2Token refreshToken(String refreshToken) {

        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * Get refreshToken
     *
     * @return refreshToken
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getRefreshToken() {
        return refreshToken;
    }


    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }


    public OAuth2Token scope(String scope) {

        this.scope = scope;
        return this;
    }

    /**
     * Get scope
     *
     * @return scope
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getScope() {
        return scope;
    }


    public void setScope(String scope) {
        this.scope = scope;
    }


    public OAuth2Token idToken(String idToken) {

        this.idToken = idToken;
        return this;
    }

    /**
     * Get idToken
     *
     * @return idToken
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getIdToken() {
        return idToken;
    }


    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OAuth2Token oauth2Token = (OAuth2Token) o;
        return Objects.equals(this.accessToken, oauth2Token.accessToken) &&
                Objects.equals(this.tokenType, oauth2Token.tokenType) &&
                Objects.equals(this.expiresIn, oauth2Token.expiresIn) &&
                Objects.equals(this.refreshToken, oauth2Token.refreshToken) &&
                Objects.equals(this.scope, oauth2Token.scope) &&
                Objects.equals(this.idToken, oauth2Token.idToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessToken, tokenType, expiresIn, refreshToken, scope, idToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OAuth2Token {\n");
        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
        sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
        sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
        sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    idToken: ").append(toIndentedString(idToken)).append("\n");
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

