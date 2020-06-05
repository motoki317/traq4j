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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * スタンプパレット情報
 */
@ApiModel(description = "スタンプパレット情報")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-05T14:52:47.663Z[GMT]")
public class StampPalette {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STAMPS = "stamps";
  @SerializedName(SERIALIZED_NAME_STAMPS)
  private List<UUID> stamps = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATOR_ID = "creatorId";
  @SerializedName(SERIALIZED_NAME_CREATOR_ID)
  private UUID creatorId;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;


  public StampPalette id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * スタンプパレットUUID
   * @return id
  **/
  @ApiModelProperty(required = true, value = "スタンプパレットUUID")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public StampPalette name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * パレット名
   * @return name
  **/
  @ApiModelProperty(required = true, value = "パレット名")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public StampPalette stamps(List<UUID> stamps) {
    
    this.stamps = stamps;
    return this;
  }

  public StampPalette addStampsItem(UUID stampsItem) {
    this.stamps.add(stampsItem);
    return this;
  }

   /**
   * パレット内のスタンプのUUID配列
   * @return stamps
  **/
  @ApiModelProperty(required = true, value = "パレット内のスタンプのUUID配列")

  public List<UUID> getStamps() {
    return stamps;
  }


  public void setStamps(List<UUID> stamps) {
    this.stamps = stamps;
  }


  public StampPalette creatorId(UUID creatorId) {
    
    this.creatorId = creatorId;
    return this;
  }

   /**
   * 作成者UUID
   * @return creatorId
  **/
  @ApiModelProperty(required = true, value = "作成者UUID")

  public UUID getCreatorId() {
    return creatorId;
  }


  public void setCreatorId(UUID creatorId) {
    this.creatorId = creatorId;
  }


  public StampPalette createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * パレット作成日時
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "パレット作成日時")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public StampPalette updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * パレット更新日時
   * @return updatedAt
  **/
  @ApiModelProperty(required = true, value = "パレット更新日時")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public StampPalette description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * パレット説明
   * @return description
  **/
  @ApiModelProperty(required = true, value = "パレット説明")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StampPalette stampPalette = (StampPalette) o;
    return Objects.equals(this.id, stampPalette.id) &&
        Objects.equals(this.name, stampPalette.name) &&
        Objects.equals(this.stamps, stampPalette.stamps) &&
        Objects.equals(this.creatorId, stampPalette.creatorId) &&
        Objects.equals(this.createdAt, stampPalette.createdAt) &&
        Objects.equals(this.updatedAt, stampPalette.updatedAt) &&
        Objects.equals(this.description, stampPalette.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, stamps, creatorId, createdAt, updatedAt, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StampPalette {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    stamps: ").append(toIndentedString(stamps)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

