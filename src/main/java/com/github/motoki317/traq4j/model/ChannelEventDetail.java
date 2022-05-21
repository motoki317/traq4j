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
import com.github.motoki317.traq4j.model.ChildCreatedEvent;
import com.github.motoki317.traq4j.model.ForcedNotificationChangedEvent;
import com.github.motoki317.traq4j.model.NameChangedEvent;
import com.github.motoki317.traq4j.model.ParentChangedEvent;
import com.github.motoki317.traq4j.model.PinAddedEvent;
import com.github.motoki317.traq4j.model.PinRemovedEvent;
import com.github.motoki317.traq4j.model.SubscribersChangedEvent;
import com.github.motoki317.traq4j.model.TopicChangedEvent;
import com.github.motoki317.traq4j.model.VisibilityChangedEvent;
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
public class ChannelEventDetail extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ChannelEventDetail.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ChannelEventDetail.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ChannelEventDetail' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ChildCreatedEvent> adapterChildCreatedEvent = gson.getDelegateAdapter(this, TypeToken.get(ChildCreatedEvent.class));
            final TypeAdapter<ForcedNotificationChangedEvent> adapterForcedNotificationChangedEvent = gson.getDelegateAdapter(this, TypeToken.get(ForcedNotificationChangedEvent.class));
            final TypeAdapter<NameChangedEvent> adapterNameChangedEvent = gson.getDelegateAdapter(this, TypeToken.get(NameChangedEvent.class));
            final TypeAdapter<ParentChangedEvent> adapterParentChangedEvent = gson.getDelegateAdapter(this, TypeToken.get(ParentChangedEvent.class));
            final TypeAdapter<PinAddedEvent> adapterPinAddedEvent = gson.getDelegateAdapter(this, TypeToken.get(PinAddedEvent.class));
            final TypeAdapter<PinRemovedEvent> adapterPinRemovedEvent = gson.getDelegateAdapter(this, TypeToken.get(PinRemovedEvent.class));
            final TypeAdapter<SubscribersChangedEvent> adapterSubscribersChangedEvent = gson.getDelegateAdapter(this, TypeToken.get(SubscribersChangedEvent.class));
            final TypeAdapter<TopicChangedEvent> adapterTopicChangedEvent = gson.getDelegateAdapter(this, TypeToken.get(TopicChangedEvent.class));
            final TypeAdapter<VisibilityChangedEvent> adapterVisibilityChangedEvent = gson.getDelegateAdapter(this, TypeToken.get(VisibilityChangedEvent.class));

            return (TypeAdapter<T>) new TypeAdapter<ChannelEventDetail>() {
                @Override
                public void write(JsonWriter out, ChannelEventDetail value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ChildCreatedEvent`
                    if (value.getActualInstance() instanceof ChildCreatedEvent) {
                        JsonObject obj = adapterChildCreatedEvent.toJsonTree((ChildCreatedEvent)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ForcedNotificationChangedEvent`
                    if (value.getActualInstance() instanceof ForcedNotificationChangedEvent) {
                        JsonObject obj = adapterForcedNotificationChangedEvent.toJsonTree((ForcedNotificationChangedEvent)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `NameChangedEvent`
                    if (value.getActualInstance() instanceof NameChangedEvent) {
                        JsonObject obj = adapterNameChangedEvent.toJsonTree((NameChangedEvent)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ParentChangedEvent`
                    if (value.getActualInstance() instanceof ParentChangedEvent) {
                        JsonObject obj = adapterParentChangedEvent.toJsonTree((ParentChangedEvent)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `PinAddedEvent`
                    if (value.getActualInstance() instanceof PinAddedEvent) {
                        JsonObject obj = adapterPinAddedEvent.toJsonTree((PinAddedEvent)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `PinRemovedEvent`
                    if (value.getActualInstance() instanceof PinRemovedEvent) {
                        JsonObject obj = adapterPinRemovedEvent.toJsonTree((PinRemovedEvent)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `SubscribersChangedEvent`
                    if (value.getActualInstance() instanceof SubscribersChangedEvent) {
                        JsonObject obj = adapterSubscribersChangedEvent.toJsonTree((SubscribersChangedEvent)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `TopicChangedEvent`
                    if (value.getActualInstance() instanceof TopicChangedEvent) {
                        JsonObject obj = adapterTopicChangedEvent.toJsonTree((TopicChangedEvent)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `VisibilityChangedEvent`
                    if (value.getActualInstance() instanceof VisibilityChangedEvent) {
                        JsonObject obj = adapterVisibilityChangedEvent.toJsonTree((VisibilityChangedEvent)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ChildCreatedEvent, ForcedNotificationChangedEvent, NameChangedEvent, ParentChangedEvent, PinAddedEvent, PinRemovedEvent, SubscribersChangedEvent, TopicChangedEvent, VisibilityChangedEvent");
                }

                @Override
                public ChannelEventDetail read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ChildCreatedEvent
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ChildCreatedEvent.validateJsonObject(jsonObject);
                        actualAdapter = adapterChildCreatedEvent;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ChildCreatedEvent'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ChildCreatedEvent failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ChildCreatedEvent'", e);
                    }

                    // deserialize ForcedNotificationChangedEvent
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ForcedNotificationChangedEvent.validateJsonObject(jsonObject);
                        actualAdapter = adapterForcedNotificationChangedEvent;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ForcedNotificationChangedEvent'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ForcedNotificationChangedEvent failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ForcedNotificationChangedEvent'", e);
                    }

                    // deserialize NameChangedEvent
                    try {
                        // validate the JSON object to see if any exception is thrown
                        NameChangedEvent.validateJsonObject(jsonObject);
                        actualAdapter = adapterNameChangedEvent;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'NameChangedEvent'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for NameChangedEvent failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'NameChangedEvent'", e);
                    }

                    // deserialize ParentChangedEvent
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ParentChangedEvent.validateJsonObject(jsonObject);
                        actualAdapter = adapterParentChangedEvent;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ParentChangedEvent'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ParentChangedEvent failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ParentChangedEvent'", e);
                    }

                    // deserialize PinAddedEvent
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PinAddedEvent.validateJsonObject(jsonObject);
                        actualAdapter = adapterPinAddedEvent;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'PinAddedEvent'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for PinAddedEvent failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'PinAddedEvent'", e);
                    }

                    // deserialize PinRemovedEvent
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PinRemovedEvent.validateJsonObject(jsonObject);
                        actualAdapter = adapterPinRemovedEvent;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'PinRemovedEvent'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for PinRemovedEvent failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'PinRemovedEvent'", e);
                    }

                    // deserialize SubscribersChangedEvent
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SubscribersChangedEvent.validateJsonObject(jsonObject);
                        actualAdapter = adapterSubscribersChangedEvent;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'SubscribersChangedEvent'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for SubscribersChangedEvent failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'SubscribersChangedEvent'", e);
                    }

                    // deserialize TopicChangedEvent
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TopicChangedEvent.validateJsonObject(jsonObject);
                        actualAdapter = adapterTopicChangedEvent;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TopicChangedEvent'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TopicChangedEvent failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TopicChangedEvent'", e);
                    }

                    // deserialize VisibilityChangedEvent
                    try {
                        // validate the JSON object to see if any exception is thrown
                        VisibilityChangedEvent.validateJsonObject(jsonObject);
                        actualAdapter = adapterVisibilityChangedEvent;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'VisibilityChangedEvent'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for VisibilityChangedEvent failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'VisibilityChangedEvent'", e);
                    }

                    if (match == 1) {
                        ChannelEventDetail ret = new ChannelEventDetail();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ChannelEventDetail: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ChannelEventDetail() {
        super("oneOf", Boolean.FALSE);
    }

    public ChannelEventDetail(ChildCreatedEvent o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ChannelEventDetail(ForcedNotificationChangedEvent o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ChannelEventDetail(NameChangedEvent o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ChannelEventDetail(ParentChangedEvent o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ChannelEventDetail(PinAddedEvent o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ChannelEventDetail(PinRemovedEvent o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ChannelEventDetail(SubscribersChangedEvent o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ChannelEventDetail(TopicChangedEvent o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ChannelEventDetail(VisibilityChangedEvent o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ChildCreatedEvent", new GenericType<ChildCreatedEvent>() {
        });
        schemas.put("ForcedNotificationChangedEvent", new GenericType<ForcedNotificationChangedEvent>() {
        });
        schemas.put("NameChangedEvent", new GenericType<NameChangedEvent>() {
        });
        schemas.put("ParentChangedEvent", new GenericType<ParentChangedEvent>() {
        });
        schemas.put("PinAddedEvent", new GenericType<PinAddedEvent>() {
        });
        schemas.put("PinRemovedEvent", new GenericType<PinRemovedEvent>() {
        });
        schemas.put("SubscribersChangedEvent", new GenericType<SubscribersChangedEvent>() {
        });
        schemas.put("TopicChangedEvent", new GenericType<TopicChangedEvent>() {
        });
        schemas.put("VisibilityChangedEvent", new GenericType<VisibilityChangedEvent>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ChannelEventDetail.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ChildCreatedEvent, ForcedNotificationChangedEvent, NameChangedEvent, ParentChangedEvent, PinAddedEvent, PinRemovedEvent, SubscribersChangedEvent, TopicChangedEvent, VisibilityChangedEvent
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ChildCreatedEvent) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ForcedNotificationChangedEvent) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof NameChangedEvent) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ParentChangedEvent) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PinAddedEvent) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PinRemovedEvent) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SubscribersChangedEvent) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TopicChangedEvent) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof VisibilityChangedEvent) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ChildCreatedEvent, ForcedNotificationChangedEvent, NameChangedEvent, ParentChangedEvent, PinAddedEvent, PinRemovedEvent, SubscribersChangedEvent, TopicChangedEvent, VisibilityChangedEvent");
    }

    /**
     * Get the actual instance, which can be the following:
     * ChildCreatedEvent, ForcedNotificationChangedEvent, NameChangedEvent, ParentChangedEvent, PinAddedEvent, PinRemovedEvent, SubscribersChangedEvent, TopicChangedEvent, VisibilityChangedEvent
     *
     * @return The actual instance (ChildCreatedEvent, ForcedNotificationChangedEvent, NameChangedEvent, ParentChangedEvent, PinAddedEvent, PinRemovedEvent, SubscribersChangedEvent, TopicChangedEvent, VisibilityChangedEvent)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ChildCreatedEvent`. If the actual instance is not `ChildCreatedEvent`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ChildCreatedEvent`
     * @throws ClassCastException if the instance is not `ChildCreatedEvent`
     */
    public ChildCreatedEvent getChildCreatedEvent() throws ClassCastException {
        return (ChildCreatedEvent)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ForcedNotificationChangedEvent`. If the actual instance is not `ForcedNotificationChangedEvent`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ForcedNotificationChangedEvent`
     * @throws ClassCastException if the instance is not `ForcedNotificationChangedEvent`
     */
    public ForcedNotificationChangedEvent getForcedNotificationChangedEvent() throws ClassCastException {
        return (ForcedNotificationChangedEvent)super.getActualInstance();
    }

    /**
     * Get the actual instance of `NameChangedEvent`. If the actual instance is not `NameChangedEvent`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `NameChangedEvent`
     * @throws ClassCastException if the instance is not `NameChangedEvent`
     */
    public NameChangedEvent getNameChangedEvent() throws ClassCastException {
        return (NameChangedEvent)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ParentChangedEvent`. If the actual instance is not `ParentChangedEvent`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ParentChangedEvent`
     * @throws ClassCastException if the instance is not `ParentChangedEvent`
     */
    public ParentChangedEvent getParentChangedEvent() throws ClassCastException {
        return (ParentChangedEvent)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PinAddedEvent`. If the actual instance is not `PinAddedEvent`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PinAddedEvent`
     * @throws ClassCastException if the instance is not `PinAddedEvent`
     */
    public PinAddedEvent getPinAddedEvent() throws ClassCastException {
        return (PinAddedEvent)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PinRemovedEvent`. If the actual instance is not `PinRemovedEvent`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PinRemovedEvent`
     * @throws ClassCastException if the instance is not `PinRemovedEvent`
     */
    public PinRemovedEvent getPinRemovedEvent() throws ClassCastException {
        return (PinRemovedEvent)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SubscribersChangedEvent`. If the actual instance is not `SubscribersChangedEvent`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SubscribersChangedEvent`
     * @throws ClassCastException if the instance is not `SubscribersChangedEvent`
     */
    public SubscribersChangedEvent getSubscribersChangedEvent() throws ClassCastException {
        return (SubscribersChangedEvent)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TopicChangedEvent`. If the actual instance is not `TopicChangedEvent`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TopicChangedEvent`
     * @throws ClassCastException if the instance is not `TopicChangedEvent`
     */
    public TopicChangedEvent getTopicChangedEvent() throws ClassCastException {
        return (TopicChangedEvent)super.getActualInstance();
    }

    /**
     * Get the actual instance of `VisibilityChangedEvent`. If the actual instance is not `VisibilityChangedEvent`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `VisibilityChangedEvent`
     * @throws ClassCastException if the instance is not `VisibilityChangedEvent`
     */
    public VisibilityChangedEvent getVisibilityChangedEvent() throws ClassCastException {
        return (VisibilityChangedEvent)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChannelEventDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with ChildCreatedEvent
    try {
      ChildCreatedEvent.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ChildCreatedEvent failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ForcedNotificationChangedEvent
    try {
      ForcedNotificationChangedEvent.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ForcedNotificationChangedEvent failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with NameChangedEvent
    try {
      NameChangedEvent.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for NameChangedEvent failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ParentChangedEvent
    try {
      ParentChangedEvent.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ParentChangedEvent failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PinAddedEvent
    try {
      PinAddedEvent.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PinAddedEvent failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PinRemovedEvent
    try {
      PinRemovedEvent.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PinRemovedEvent failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with SubscribersChangedEvent
    try {
      SubscribersChangedEvent.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for SubscribersChangedEvent failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with TopicChangedEvent
    try {
      TopicChangedEvent.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for TopicChangedEvent failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with VisibilityChangedEvent
    try {
      VisibilityChangedEvent.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for VisibilityChangedEvent failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for ChannelEventDetail with oneOf schemas: ChildCreatedEvent, ForcedNotificationChangedEvent, NameChangedEvent, ParentChangedEvent, PinAddedEvent, PinRemovedEvent, SubscribersChangedEvent, TopicChangedEvent, VisibilityChangedEvent. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of ChannelEventDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChannelEventDetail
  * @throws IOException if the JSON string is invalid with respect to ChannelEventDetail
  */
  public static ChannelEventDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChannelEventDetail.class);
  }

 /**
  * Convert an instance of ChannelEventDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

