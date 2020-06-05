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
import com.github.motoki317.traq4j.model.ClipFolder;
import com.github.motoki317.traq4j.model.ClippedMessage;
import com.github.motoki317.traq4j.model.MessageClip;
import com.github.motoki317.traq4j.model.PatchClipFolderRequest;
import com.github.motoki317.traq4j.model.PostClipFolderMessageRequest;
import com.github.motoki317.traq4j.model.PostClipFolderRequest;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.List;

/**
 * API tests for ClipApi
 */
@Ignore
public class ClipApiTest {

    private final ClipApi api = new ClipApi();

    
    /**
     * メッセージをクリップフォルダに追加
     *
     * 指定したメッセージを指定したクリップフォルダに追加します。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clipMessageTest() throws ApiException {
        UUID folderId = null;
        PostClipFolderMessageRequest postClipFolderMessageRequest = null;
        ClippedMessage response = api.clipMessage(folderId, postClipFolderMessageRequest);

        // TODO: test validations
    }
    
    /**
     * クリップフォルダを作成
     *
     * クリップフォルダを作成します。 既にあるフォルダと同名のフォルダを作成することは可能です。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createClipFolderTest() throws ApiException {
        PostClipFolderRequest postClipFolderRequest = null;
        ClipFolder response = api.createClipFolder(postClipFolderRequest);

        // TODO: test validations
    }
    
    /**
     * クリップフォルダを削除
     *
     * 指定したクリップフォルダを削除します。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteClipFolderTest() throws ApiException {
        UUID folderId = null;
        api.deleteClipFolder(folderId);

        // TODO: test validations
    }
    
    /**
     * クリップフォルダ情報を編集
     *
     * 指定したクリップフォルダの情報を編集します。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editClipFolderTest() throws ApiException {
        UUID folderId = null;
        PatchClipFolderRequest patchClipFolderRequest = null;
        api.editClipFolder(folderId, patchClipFolderRequest);

        // TODO: test validations
    }
    
    /**
     * クリップフォルダ情報を取得
     *
     * 指定したクリップフォルダの情報を取得します。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClipFolderTest() throws ApiException {
        UUID folderId = null;
        ClipFolder response = api.getClipFolder(folderId);

        // TODO: test validations
    }
    
    /**
     * クリップフォルダのリストを取得
     *
     * 自身が所有するクリップフォルダのリストを取得します。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClipFoldersTest() throws ApiException {
        List<ClipFolder> response = api.getClipFolders();

        // TODO: test validations
    }
    
    /**
     * フォルダ内のクリップのリストを取得
     *
     * 指定したフォルダ内のクリップのリストを取得します。 &#x60;order&#x60;を指定しない場合、クリップした日時の新しい順で返されます。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClipsTest() throws ApiException {
        UUID folderId = null;
        Integer limit = null;
        Integer offset = null;
        String order = null;
        List<ClippedMessage> response = api.getClips(folderId, limit, offset, order);

        // TODO: test validations
    }
    
    /**
     * 自分のクリップを取得
     *
     * 対象のメッセージの自分のクリップの一覧を返します。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMessageClipsTest() throws ApiException {
        UUID messageId = null;
        List<MessageClip> response = api.getMessageClips(messageId);

        // TODO: test validations
    }
    
    /**
     * メッセージをクリップフォルダから除外
     *
     * 指定したフォルダから指定したメッセージのクリップを除外します。 既に外されているメッセージを指定した場合は204を返します。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void unclipMessageTest() throws ApiException {
        UUID folderId = null;
        UUID messageId = null;
        api.unclipMessage(folderId, messageId);

        // TODO: test validations
    }
    
}
