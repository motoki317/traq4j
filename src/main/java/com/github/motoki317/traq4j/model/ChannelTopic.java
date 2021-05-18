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
 * チャンネルトピック
 */
@ApiModel(description = "チャンネルトピック")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-18T11:58:46.174904Z[Etc/UTC]")
public class ChannelTopic {
    public static final String SERIALIZED_NAME_TOPIC = "topic";
    @SerializedName(SERIALIZED_NAME_TOPIC)
    private String topic;


    public ChannelTopic topic(String topic) {

        this.topic = topic;
        return this;
    }

    /**
     * トピック
     *
     * @return topic
     **/
    @ApiModelProperty(required = true, value = "トピック")

    public String getTopic() {
        return topic;
    }


    public void setTopic(String topic) {
        this.topic = topic;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChannelTopic channelTopic = (ChannelTopic) o;
        return Objects.equals(this.topic, channelTopic.topic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChannelTopic {\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
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

