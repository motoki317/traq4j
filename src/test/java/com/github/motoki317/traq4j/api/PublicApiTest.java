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
import java.io.File;
import com.github.motoki317.traq4j.model.Version;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PublicApi
 */
@Ignore
public class PublicApiTest {

    private final PublicApi api = new PublicApi();

    
    /**
     * ユーザーのアイコン画像を取得
     *
     * ユーザーのアイコン画像を取得します。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPublicUserIconTest() throws ApiException {
        String username = null;
        File response = api.getPublicUserIcon(username);

        // TODO: test validations
    }
    
    /**
     * バージョンを取得
     *
     * サーバーバージョン及びサーバーフラグ情報を取得します。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getServerVersionTest() throws ApiException {
        Version response = api.getServerVersion();

        // TODO: test validations
    }
    
}