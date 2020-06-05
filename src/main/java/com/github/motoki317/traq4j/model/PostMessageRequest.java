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
 * メッセージ投稿リクエスト
 */
@ApiModel(description = "メッセージ投稿リクエスト")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-05T14:52:47.663Z[GMT]")
public class PostMessageRequest {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_EMBED = "embed";
  @SerializedName(SERIALIZED_NAME_EMBED)
  private Boolean embed = false;


  public PostMessageRequest content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * メッセージ本文
   * @return content
  **/
  @ApiModelProperty(required = true, value = "メッセージ本文")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public PostMessageRequest embed(Boolean embed) {
    
    this.embed = embed;
    return this;
  }

   /**
   * メンション・チャンネルリンクを自動埋め込みするか
   * @return embed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "メンション・チャンネルリンクを自動埋め込みするか")

  public Boolean getEmbed() {
    return embed;
  }


  public void setEmbed(Boolean embed) {
    this.embed = embed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostMessageRequest postMessageRequest = (PostMessageRequest) o;
    return Objects.equals(this.content, postMessageRequest.content) &&
        Objects.equals(this.embed, postMessageRequest.embed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, embed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostMessageRequest {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    embed: ").append(toIndentedString(embed)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

