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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * BOT状態 0: 停止 1: 有効 2: 一時停止
 */
@JsonAdapter(BotState.Adapter.class)
public enum BotState {
  
  /**
   * 停止
   */
  deactivated(0),
  
  /**
   * 有効
   */
  active(1),
  
  /**
   * 一時停止
   */
  suspended(2);

  private Integer value;

  BotState(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BotState fromValue(Integer value) {
    for (BotState b : BotState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BotState> {
    @Override
    public void write(final JsonWriter jsonWriter, final BotState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BotState read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return BotState.fromValue(value);
    }
  }
}

