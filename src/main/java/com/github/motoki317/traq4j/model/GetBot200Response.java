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
import com.github.motoki317.traq4j.model.Bot;
import com.github.motoki317.traq4j.model.BotDetail;
import com.github.motoki317.traq4j.model.BotMode;
import com.github.motoki317.traq4j.model.BotState;
import com.github.motoki317.traq4j.model.BotTokens;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import com.github.motoki317.traq4j.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-21T02:01:01.991892Z[Etc/UTC]")
public class GetBot200Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GetBot200Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetBot200Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetBot200Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Bot> adapterBot = gson.getDelegateAdapter(this, TypeToken.get(Bot.class));
            final TypeAdapter<BotDetail> adapterBotDetail = gson.getDelegateAdapter(this, TypeToken.get(BotDetail.class));

            return (TypeAdapter<T>) new TypeAdapter<GetBot200Response>() {
                @Override
                public void write(JsonWriter out, GetBot200Response value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `Bot`
                    if (value.getActualInstance() instanceof Bot) {
                        JsonObject obj = adapterBot.toJsonTree((Bot)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `BotDetail`
                    if (value.getActualInstance() instanceof BotDetail) {
                        JsonObject obj = adapterBotDetail.toJsonTree((BotDetail)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: Bot, BotDetail");
                }

                @Override
                public GetBot200Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize Bot
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Bot.validateJsonObject(jsonObject);
                        actualAdapter = adapterBot;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Bot'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Bot failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Bot'", e);
                    }

                    // deserialize BotDetail
                    try {
                        // validate the JSON object to see if any exception is thrown
                        BotDetail.validateJsonObject(jsonObject);
                        actualAdapter = adapterBotDetail;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'BotDetail'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for BotDetail failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'BotDetail'", e);
                    }

                    if (match == 1) {
                        GetBot200Response ret = new GetBot200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for GetBot200Response: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public GetBot200Response() {
        super("oneOf", Boolean.FALSE);
    }

    public GetBot200Response(Bot o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetBot200Response(BotDetail o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Bot", new GenericType<Bot>() {
        });
        schemas.put("BotDetail", new GenericType<BotDetail>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return GetBot200Response.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Bot, BotDetail
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof Bot) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof BotDetail) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Bot, BotDetail");
    }

    /**
     * Get the actual instance, which can be the following:
     * Bot, BotDetail
     *
     * @return The actual instance (Bot, BotDetail)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Bot`. If the actual instance is not `Bot`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Bot`
     * @throws ClassCastException if the instance is not `Bot`
     */
    public Bot getBot() throws ClassCastException {
        return (Bot)super.getActualInstance();
    }

    /**
     * Get the actual instance of `BotDetail`. If the actual instance is not `BotDetail`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BotDetail`
     * @throws ClassCastException if the instance is not `BotDetail`
     */
    public BotDetail getBotDetail() throws ClassCastException {
        return (BotDetail)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetBot200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with Bot
    try {
      Bot.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for Bot failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with BotDetail
    try {
      BotDetail.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for BotDetail failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for GetBot200Response with oneOf schemas: Bot, BotDetail. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of GetBot200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetBot200Response
  * @throws IOException if the JSON string is invalid with respect to GetBot200Response
  */
  public static GetBot200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetBot200Response.class);
  }

 /**
  * Convert an instance of GetBot200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

