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
 * Gets or Sets OAuth2ResponseType
 */
@JsonAdapter(OAuth2ResponseType.Adapter.class)
public enum OAuth2ResponseType {
  
  CODE("code"),
  
  TOKEN("token"),
  
  NONE("none");

  private String value;

  OAuth2ResponseType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OAuth2ResponseType fromValue(String value) {
    for (OAuth2ResponseType b : OAuth2ResponseType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OAuth2ResponseType> {
    @Override
    public void write(final JsonWriter jsonWriter, final OAuth2ResponseType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OAuth2ResponseType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OAuth2ResponseType.fromValue(value);
    }
  }
}
