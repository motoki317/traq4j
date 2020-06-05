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
import com.github.motoki317.traq4j.model.ActivityTimelineMessage;
import org.junit.Test;
import org.junit.Ignore;

import java.util.List;

/**
 * API tests for ActivityApi
 */
@Ignore
public class ActivityApiTest {

    private final ActivityApi api = new ActivityApi();

    
    /**
     * アクテビティタイムラインを取得
     *
     * パブリックチャンネルの直近の投稿メッセージを作成日時の降順で取得します。 &#x60;all&#x60;が&#x60;true&#x60;でない場合、購読チャンネルのみのタイムラインを取得します
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActivityTimelineTest() throws ApiException {
        Integer limit = null;
        Boolean all = null;
        Boolean perChannel = null;
        List<ActivityTimelineMessage> response = api.getActivityTimeline(limit, all, perChannel);

        // TODO: test validations
    }
    
    /**
     * オンラインユーザーリストを取得
     *
     * 現在オンラインな(SSEまたはWSが接続中)ユーザーのUUIDのリストを返します。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOnlineUsersTest() throws ApiException {
        List<String> response = api.getOnlineUsers();

        // TODO: test validations
    }
    
}
