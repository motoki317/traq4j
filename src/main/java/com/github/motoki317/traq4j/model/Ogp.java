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

import com.github.motoki317.traq4j.model.OgpMedia;
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

/**
 * OGPの情報
 */
@ApiModel(description = "OGPの情報")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-18T11:58:46.174904Z[Etc/UTC]")
public class Ogp {
    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;

    public static final String SERIALIZED_NAME_TITLE = "title";
    @SerializedName(SERIALIZED_NAME_TITLE)
    private String title;

    public static final String SERIALIZED_NAME_URL = "url";
    @SerializedName(SERIALIZED_NAME_URL)
    private String url;

    public static final String SERIALIZED_NAME_IMAGES = "images";
    @SerializedName(SERIALIZED_NAME_IMAGES)
    private List<OgpMedia> images = null;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_VIDEOS = "videos";
    @SerializedName(SERIALIZED_NAME_VIDEOS)
    private List<OgpMedia> videos = null;


    public Ogp type(String type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public Ogp title(String title) {

        this.title = title;
        return this;
    }

    /**
     * Get title
     *
     * @return title
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public Ogp url(String url) {

        this.url = url;
        return this;
    }

    /**
     * Get url
     *
     * @return url
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getUrl() {
        return url;
    }


    public void setUrl(String url) {
        this.url = url;
    }


    public Ogp images(List<OgpMedia> images) {

        this.images = images;
        return this;
    }

    public Ogp addImagesItem(OgpMedia imagesItem) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(imagesItem);
        return this;
    }

    /**
     * Get images
     *
     * @return images
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<OgpMedia> getImages() {
        return images;
    }


    public void setImages(List<OgpMedia> images) {
        this.images = images;
    }


    public Ogp description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public Ogp videos(List<OgpMedia> videos) {

        this.videos = videos;
        return this;
    }

    public Ogp addVideosItem(OgpMedia videosItem) {
        if (this.videos == null) {
            this.videos = new ArrayList<>();
        }
        this.videos.add(videosItem);
        return this;
    }

    /**
     * Get videos
     *
     * @return videos
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<OgpMedia> getVideos() {
        return videos;
    }


    public void setVideos(List<OgpMedia> videos) {
        this.videos = videos;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ogp ogp = (Ogp) o;
        return Objects.equals(this.type, ogp.type) &&
                Objects.equals(this.title, ogp.title) &&
                Objects.equals(this.url, ogp.url) &&
                Objects.equals(this.images, ogp.images) &&
                Objects.equals(this.description, ogp.description) &&
                Objects.equals(this.videos, ogp.videos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, title, url, images, description, videos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Ogp {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    images: ").append(toIndentedString(images)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
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

