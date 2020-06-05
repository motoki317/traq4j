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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * BOTイベントログ
 */
@ApiModel(description = "BOTイベントログ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-05T13:16:54.379Z[GMT]")
public class BotEventLog {
  public static final String SERIALIZED_NAME_BOT_ID = "botId";
  @SerializedName(SERIALIZED_NAME_BOT_ID)
  private UUID botId;

  public static final String SERIALIZED_NAME_REQUEST_ID = "requestId";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private UUID requestId;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private String event;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Integer code;

  public static final String SERIALIZED_NAME_DATETIME = "datetime";
  @SerializedName(SERIALIZED_NAME_DATETIME)
  private OffsetDateTime datetime;


  public BotEventLog botId(UUID botId) {
    
    this.botId = botId;
    return this;
  }

   /**
   * BOT UUID
   * @return botId
  **/
  @ApiModelProperty(required = true, value = "BOT UUID")

  public UUID getBotId() {
    return botId;
  }


  public void setBotId(UUID botId) {
    this.botId = botId;
  }


  public BotEventLog requestId(UUID requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * リクエストUUID
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "リクエストUUID")

  public UUID getRequestId() {
    return requestId;
  }


  public void setRequestId(UUID requestId) {
    this.requestId = requestId;
  }


  public BotEventLog event(String event) {
    
    this.event = event;
    return this;
  }

   /**
   * イベントタイプ
   * @return event
  **/
  @ApiModelProperty(required = true, value = "イベントタイプ")

  public String getEvent() {
    return event;
  }


  public void setEvent(String event) {
    this.event = event;
  }


  public BotEventLog code(Integer code) {
    
    this.code = code;
    return this;
  }

   /**
   * ステータスコード
   * @return code
  **/
  @ApiModelProperty(required = true, value = "ステータスコード")

  public Integer getCode() {
    return code;
  }


  public void setCode(Integer code) {
    this.code = code;
  }


  public BotEventLog datetime(OffsetDateTime datetime) {
    
    this.datetime = datetime;
    return this;
  }

   /**
   * イベント日時
   * @return datetime
  **/
  @ApiModelProperty(required = true, value = "イベント日時")

  public OffsetDateTime getDatetime() {
    return datetime;
  }


  public void setDatetime(OffsetDateTime datetime) {
    this.datetime = datetime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BotEventLog botEventLog = (BotEventLog) o;
    return Objects.equals(this.botId, botEventLog.botId) &&
        Objects.equals(this.requestId, botEventLog.requestId) &&
        Objects.equals(this.event, botEventLog.event) &&
        Objects.equals(this.code, botEventLog.code) &&
        Objects.equals(this.datetime, botEventLog.datetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(botId, requestId, event, code, datetime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BotEventLog {\n");
    sb.append("    botId: ").append(toIndentedString(botId)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
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

