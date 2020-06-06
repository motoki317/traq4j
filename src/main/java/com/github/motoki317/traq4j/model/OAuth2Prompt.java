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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets OAuth2Prompt
 */
@JsonAdapter(OAuth2Prompt.Adapter.class)
public enum OAuth2Prompt {
  
  NONE("none");

  private String value;

  OAuth2Prompt(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OAuth2Prompt fromValue(String value) {
    for (OAuth2Prompt b : OAuth2Prompt.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OAuth2Prompt> {
    @Override
    public void write(final JsonWriter jsonWriter, final OAuth2Prompt enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OAuth2Prompt read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OAuth2Prompt.fromValue(value);
    }
  }
}
