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


package com.github.motoki317.traq4j.api;

import com.github.motoki317.traq4j.ApiException;
import com.github.motoki317.traq4j.model.PatchUserTagRequest;
import com.github.motoki317.traq4j.model.PostUserTagRequest;
import com.github.motoki317.traq4j.model.Tag;
import java.util.UUID;
import com.github.motoki317.traq4j.model.UserTag;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserTagApi
 */
@Disabled
public class UserTagApiTest {

    private final UserTagApi api = new UserTagApi();

    /**
     * 自分にタグを追加
     *
     * 自分に新しくタグを追加します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addMyUserTagTest() throws ApiException {
        PostUserTagRequest postUserTagRequest = null;
        UserTag response = api.addMyUserTag(postUserTagRequest);
        // TODO: test validations
    }

    /**
     * ユーザーにタグを追加
     *
     * 指定したユーザーに指定したタグを追加します。 Webhookユーザーにタグを追加することは出来ません。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addUserTagTest() throws ApiException {
        UUID userId = null;
        PostUserTagRequest postUserTagRequest = null;
        UserTag response = api.addUserTag(userId, postUserTagRequest);
        // TODO: test validations
    }

    /**
     * 自分のタグを編集
     *
     * 自分の指定したタグの状態を変更します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void editMyUserTagTest() throws ApiException {
        UUID tagId = null;
        PatchUserTagRequest patchUserTagRequest = null;
        api.editMyUserTag(tagId, patchUserTagRequest);
        // TODO: test validations
    }

    /**
     * ユーザーのタグを編集
     *
     * 指定したユーザーの指定したタグの状態を変更します。 他人の状態は変更できません。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void editUserTagTest() throws ApiException {
        UUID userId = null;
        UUID tagId = null;
        PatchUserTagRequest patchUserTagRequest = null;
        api.editUserTag(userId, tagId, patchUserTagRequest);
        // TODO: test validations
    }

    /**
     * 自分のタグリストを取得
     *
     * 自分に付けられているタグの配列を取得します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMyUserTagsTest() throws ApiException {
        List<UserTag> response = api.getMyUserTags();
        // TODO: test validations
    }

    /**
     * タグ情報を取得
     *
     * 指定したタグの情報を取得します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTagTest() throws ApiException {
        UUID tagId = null;
        Tag response = api.getTag(tagId);
        // TODO: test validations
    }

    /**
     * ユーザーのタグリストを取得
     *
     * 指定したユーザーのタグリストを取得します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserTagsTest() throws ApiException {
        UUID userId = null;
        List<UserTag> response = api.getUserTags(userId);
        // TODO: test validations
    }

    /**
     * 自分からタグを削除します
     *
     * 既に存在しないタグを削除しようとした場合は204を返します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeMyUserTagTest() throws ApiException {
        UUID tagId = null;
        api.removeMyUserTag(tagId);
        // TODO: test validations
    }

    /**
     * ユーザーからタグを削除します
     *
     * 既に存在しないタグを削除しようとした場合は204を返します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeUserTagTest() throws ApiException {
        UUID userId = null;
        UUID tagId = null;
        api.removeUserTag(userId, tagId);
        // TODO: test validations
    }

}
