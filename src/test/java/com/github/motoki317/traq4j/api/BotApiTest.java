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
import com.github.motoki317.traq4j.model.Bot;
import com.github.motoki317.traq4j.model.BotDetail;
import com.github.motoki317.traq4j.model.BotEventLog;
import com.github.motoki317.traq4j.model.BotTokens;
import com.github.motoki317.traq4j.model.BotUser;
import java.io.File;
import com.github.motoki317.traq4j.model.GetBot200Response;
import com.github.motoki317.traq4j.model.PatchBotRequest;
import com.github.motoki317.traq4j.model.PostBotActionJoinRequest;
import com.github.motoki317.traq4j.model.PostBotActionLeaveRequest;
import com.github.motoki317.traq4j.model.PostBotRequest;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BotApi
 */
@Disabled
public class BotApiTest {

    private final BotApi api = new BotApi();

    /**
     * BOTをアクティベート
     *
     * 指定したBOTを有効化します。 対象のBOTの管理権限が必要です。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void activateBotTest() throws ApiException {
        UUID botId = null;
        api.activateBot(botId);
        // TODO: test validations
    }

    /**
     * BOTのアイコン画像を変更
     *
     * 指定したBOTのアイコン画像を変更を変更します。 対象のBOTの管理権限が必要です。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void changeBotIconTest() throws ApiException {
        UUID botId = null;
        File _file = null;
        api.changeBotIcon(botId, _file);
        // TODO: test validations
    }

    /**
     * WebSocket Mode BOT用通知ストリームに接続します
     *
     * # BOT WebSocketプロトコル  ## 送信  &#x60;コマンド:引数1:引数2:...&#x60; のような形式のTextMessageをサーバーに送信することで、このWebSocketセッションに対する設定が実行できます。  ### &#x60;rtcstate&#x60;コマンド 自分のWebRTC状態を変更します。 他のコネクションが既に状態を保持している場合、変更することができません。  &#x60;rtcstate:{チャンネルID}:({状態}:{セッションID})*&#x60;  チャンネルIDにnullもしくは空文字を指定するか、状態にnullもしくは空文字を指定した場合、WebRTC状態はリセットされます。  &#x60;rtcstate:null&#x60;, &#x60;rtcstate:&#x60;, &#x60;rtcstate:channelId:null&#x60;, &#x60;rtcstate:channelId:&#x60;  コネクションが切断された場合、自分のWebRTC状態はリセットされます。  ## 受信  TextMessageとして各種イベントが&#x60;type&#x60;、&#x60;reqId&#x60;、&#x60;body&#x60;を持つJSONとして非同期に送られます。 &#x60;body&#x60;の内容はHTTP Modeの場合のRequest Bodyと同様です。 例外として&#x60;ERROR&#x60;イベントは&#x60;reqId&#x60;を持ちません。  例: PINGイベント &#x60;{\&quot;type\&quot;:\&quot;PING\&quot;,\&quot;reqId\&quot;:\&quot;requestId\&quot;,\&quot;body\&quot;:{\&quot;eventTime\&quot;:\&quot;2019-05-07T04:50:48.582586882Z\&quot;}}&#x60;  ### &#x60;ERROR&#x60;  コマンドの引数が不正などの理由でコマンドが受理されなかった場合に送られます。 非同期に送られるため、必ずしもコマンドとの対応関係を確定できないことに注意してください。 本番環境ではERRORが送られないようにすることが望ましいです。  &#x60;{\&quot;type\&quot;:\&quot;ERROR\&quot;,\&quot;body\&quot;:\&quot;message\&quot;}&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void connectBotWSTest() throws ApiException {
        api.connectBotWS();
        // TODO: test validations
    }

    /**
     * BOTを作成
     *
     * BOTを作成します。 作成後に購読イベントの設定を行う必要があります。 さらにHTTP Modeの場合はアクティベーションを行う必要があります。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createBotTest() throws ApiException {
        PostBotRequest postBotRequest = null;
        BotDetail response = api.createBot(postBotRequest);
        // TODO: test validations
    }

    /**
     * BOTを削除
     *
     * 指定したBOTを削除します。 対象のBOTの管理権限が必要です。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteBotTest() throws ApiException {
        UUID botId = null;
        api.deleteBot(botId);
        // TODO: test validations
    }

    /**
     * BOT情報を変更
     *
     * 指定したBOTの情報を変更します。 対象のBOTの管理権限が必要です。 BOT開発者UUIDを変更した場合は、変更先ユーザーにBOT管理権限が移譲され、自分自身は権限を失います。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void editBotTest() throws ApiException {
        UUID botId = null;
        PatchBotRequest patchBotRequest = null;
        api.editBot(botId, patchBotRequest);
        // TODO: test validations
    }

    /**
     * BOT情報を取得
     *
     * 指定したBOTのBOT情報を取得します。 BOT詳細情報を取得する場合は、対象のBOTの管理権限が必要です。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBotTest() throws ApiException {
        UUID botId = null;
        Boolean detail = null;
        GetBot200Response response = api.getBot(botId, detail);
        // TODO: test validations
    }

    /**
     * BOTのアイコン画像を取得
     *
     * 指定したBOTのアイコン画像を取得を取得します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBotIconTest() throws ApiException {
        UUID botId = null;
        File response = api.getBotIcon(botId);
        // TODO: test validations
    }

    /**
     * BOTのイベントログを取得
     *
     * 指定したBOTのイベントログを取得します。 対象のBOTの管理権限が必要です。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBotLogsTest() throws ApiException {
        UUID botId = null;
        Integer limit = null;
        Integer offset = null;
        List<BotEventLog> response = api.getBotLogs(botId, limit, offset);
        // TODO: test validations
    }

    /**
     * BOTリストを取得
     *
     * BOT情報のリストを取得します。 allを指定しない場合、自分が開発者のBOTのみを返します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBotsTest() throws ApiException {
        Boolean all = null;
        List<Bot> response = api.getBots(all);
        // TODO: test validations
    }

    /**
     * チャンネル参加中のBOTのリストを取得
     *
     * 指定したチャンネルに参加しているBOTのリストを取得します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getChannelBotsTest() throws ApiException {
        UUID channelId = null;
        List<BotUser> response = api.getChannelBots(channelId);
        // TODO: test validations
    }

    /**
     * BOTをインアクティベート
     *
     * 指定したBOTを無効化します。対象のBOTの管理権限が必要です。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void inactivateBotTest() throws ApiException {
        UUID botId = null;
        api.inactivateBot(botId);
        // TODO: test validations
    }

    /**
     * BOTをチャンネルに参加させる
     *
     * 指定したBOTを指定したチャンネルに参加させます。 チャンネルに参加したBOTは、そのチャンネルの各種イベントを受け取るようになります。 対象のBOTの管理権限が必要です。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void letBotJoinChannelTest() throws ApiException {
        UUID botId = null;
        PostBotActionJoinRequest postBotActionJoinRequest = null;
        api.letBotJoinChannel(botId, postBotActionJoinRequest);
        // TODO: test validations
    }

    /**
     * BOTをチャンネルから退出させる
     *
     * 指定したBOTを指定したチャンネルから退出させます。 対象のBOTの管理権限が必要です。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void letBotLeaveChannelTest() throws ApiException {
        UUID botId = null;
        PostBotActionLeaveRequest postBotActionLeaveRequest = null;
        api.letBotLeaveChannel(botId, postBotActionLeaveRequest);
        // TODO: test validations
    }

    /**
     * BOTのトークンを再発行
     *
     * 指定したBOTの現在の各種トークンを無効化し、再発行を行います。 対象のBOTの管理権限が必要です。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reissueBotTest() throws ApiException {
        UUID botId = null;
        BotTokens response = api.reissueBot(botId);
        // TODO: test validations
    }

}
