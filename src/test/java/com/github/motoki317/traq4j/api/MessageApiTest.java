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
import com.github.motoki317.traq4j.model.Message;
import com.github.motoki317.traq4j.model.MessageClip;
import com.github.motoki317.traq4j.model.MessagePin;
import com.github.motoki317.traq4j.model.MessageStamp;
import org.threeten.bp.OffsetDateTime;
import com.github.motoki317.traq4j.model.PostMessageRequest;
import com.github.motoki317.traq4j.model.PostMessageStampRequest;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessageApi
 */
@Ignore
public class MessageApiTest {

    private final MessageApi api = new MessageApi();

    
    /**
     * スタンプを押す
     *
     * 指定したメッセージに指定したスタンプを押します。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addMessageStampTest() throws ApiException {
        UUID messageId = null;
        UUID stampId = null;
        PostMessageStampRequest postMessageStampRequest = null;
        api.addMessageStamp(messageId, stampId, postMessageStampRequest);

        // TODO: test validations
    }
    
    /**
     * ピン留めする
     *
     * 指定したメッセージをピン留めします。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPinTest() throws ApiException {
        UUID messageId = null;
        MessagePin response = api.createPin(messageId);

        // TODO: test validations
    }
    
    /**
     * メッセージを削除
     *
     * 指定したメッセージを削除します。 自身が投稿したメッセージと自身が管理権限を持つWebhookとBOTが投稿したメッセージのみ削除することができます。 アーカイブされているチャンネルのメッセージを編集することは出来ません。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMessageTest() throws ApiException {
        UUID messageId = null;
        api.deleteMessage(messageId);

        // TODO: test validations
    }
    
    /**
     * メッセージを編集
     *
     * 指定したメッセージを編集します。 自身が投稿したメッセージと自身が管理権限を持つWebhookとBOTが投稿したメッセージのみ編集することができます。 アーカイブされているチャンネルのメッセージを編集することは出来ません。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editMessageTest() throws ApiException {
        UUID messageId = null;
        PostMessageRequest postMessageRequest = null;
        Message response = api.editMessage(messageId, postMessageRequest);

        // TODO: test validations
    }
    
    /**
     * ダイレクトメッセージのリストを取得
     *
     * 指定したユーザーとのダイレクトメッセージのリストを取得します。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDirectMessagesTest() throws ApiException {
        UUID userId = null;
        Integer limit = null;
        Integer offset = null;
        OffsetDateTime since = null;
        OffsetDateTime until = null;
        Boolean inclusive = null;
        String order = null;
        List<Message> response = api.getDirectMessages(userId, limit, offset, since, until, inclusive, order);

        // TODO: test validations
    }
    
    /**
     * メッセージを取得
     *
     * 指定したメッセージを取得します。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMessageTest() throws ApiException {
        UUID messageId = null;
        Message response = api.getMessage(messageId);

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
     * メッセージのスタンプリストを取得
     *
     * 指定したメッセージに押されているスタンプのリストを取得します。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMessageStampsTest() throws ApiException {
        UUID messageId = null;
        List<MessageStamp> response = api.getMessageStamps(messageId);

        // TODO: test validations
    }
    
    /**
     * チャンネルメッセージのリストを取得
     *
     * 指定したチャンネルのメッセージのリストを取得します。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMessagesTest() throws ApiException {
        UUID channelId = null;
        Integer limit = null;
        Integer offset = null;
        OffsetDateTime since = null;
        OffsetDateTime until = null;
        Boolean inclusive = null;
        String order = null;
        List<Message> response = api.getMessages(channelId, limit, offset, since, until, inclusive, order);

        // TODO: test validations
    }
    
    /**
     * ピン留めを取得
     *
     * 指定したメッセージのピン留め情報を取得します。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPinTest() throws ApiException {
        UUID messageId = null;
        MessagePin response = api.getPin(messageId);

        // TODO: test validations
    }
    
    /**
     * ダイレクトメッセージを送信
     *
     * 指定したユーザーにダイレクトメッセージを送信します。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postDirectMessageTest() throws ApiException {
        UUID userId = null;
        PostMessageRequest postMessageRequest = null;
        Message response = api.postDirectMessage(userId, postMessageRequest);

        // TODO: test validations
    }
    
    /**
     * チャンネルにメッセージを投稿
     *
     * 指定したチャンネルにメッセージを投稿します。 embedをtrueに指定すると、メッセージ埋め込みが自動で行われます。 アーカイブされているチャンネルに投稿することはできません。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postMessageTest() throws ApiException {
        UUID channelId = null;
        PostMessageRequest postMessageRequest = null;
        Message response = api.postMessage(channelId, postMessageRequest);

        // TODO: test validations
    }
    
    /**
     * スタンプを消す
     *
     * 指定したメッセージから指定した自身が押したスタンプを削除します。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeMessageStampTest() throws ApiException {
        UUID messageId = null;
        UUID stampId = null;
        api.removeMessageStamp(messageId, stampId);

        // TODO: test validations
    }
    
    /**
     * ピン留めを外す
     *
     * 指定したメッセージのピン留めを外します。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removePinTest() throws ApiException {
        UUID messageId = null;
        api.removePin(messageId);

        // TODO: test validations
    }
    
}
