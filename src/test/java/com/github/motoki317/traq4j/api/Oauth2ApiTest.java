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
import com.github.motoki317.traq4j.model.ActiveOAuth2Token;
import com.github.motoki317.traq4j.model.OAuth2Client;
import com.github.motoki317.traq4j.model.OAuth2ClientDetail;
import com.github.motoki317.traq4j.model.OAuth2Prompt;
import com.github.motoki317.traq4j.model.OAuth2ResponseType;
import com.github.motoki317.traq4j.model.OAuth2Token;
import com.github.motoki317.traq4j.model.PatchClientRequest;
import com.github.motoki317.traq4j.model.PostClientRequest;
import com.github.motoki317.traq4j.model.PostOAuth2Revoke;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.List;

/**
 * API tests for Oauth2Api
 */
@Ignore
public class Oauth2ApiTest {

    private final Oauth2Api api = new Oauth2Api();

    
    /**
     * OAuth2クライアントを作成
     *
     * OAuth2クライアントを作成します。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createClientTest() throws ApiException {
        PostClientRequest postClientRequest = null;
        OAuth2ClientDetail response = api.createClient(postClientRequest);

        // TODO: test validations
    }
    
    /**
     * OAuth2クライアントを削除
     *
     * 指定したOAuth2クライアントを削除します。 対象のクライアントの管理権限が必要です。正常に削除された場合、このクライアントに対する認可は全て取り消されます。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteClientTest() throws ApiException {
        String clientId = null;
        api.deleteClient(clientId);

        // TODO: test validations
    }
    
    /**
     * OAuth2クライアント情報を変更
     *
     * 指定したOAuth2クライアントの情報を変更します。 対象のクライアントの管理権限が必要です。 クライアント開発者UUIDを変更した場合は、変更先ユーザーにクライアント管理権限が移譲され、自分自身は権限を失います。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editClientTest() throws ApiException {
        String clientId = null;
        PatchClientRequest patchClientRequest = null;
        api.editClient(clientId, patchClientRequest);

        // TODO: test validations
    }
    
    /**
     * OAuth2クライアント情報を取得
     *
     * 指定したOAuth2クライアントの情報を取得します。 詳細情報の取得には対象のクライアントの管理権限が必要です。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClientTest() throws ApiException {
        String clientId = null;
        Boolean detail = null;
        Object response = api.getClient(clientId, detail);

        // TODO: test validations
    }
    
    /**
     * OAuth2クライアントのリストを取得
     *
     * 自身が開発者のOAuth2クライアントのリストを取得します。 &#x60;all&#x60;が&#x60;true&#x60;の場合、全開発者の全クライアントのリストを返します。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClientsTest() throws ApiException {
        Boolean all = null;
        List<OAuth2Client> response = api.getClients(all);

        // TODO: test validations
    }
    
    /**
     * 有効トークンのリストを取得
     *
     * 有効な自分に発行されたOAuth2トークンのリストを取得します。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMyTokensTest() throws ApiException {
        List<ActiveOAuth2Token> response = api.getMyTokens();

        // TODO: test validations
    }
    
    /**
     * OAuth2 認可エンドポイント
     *
     * OAuth2 認可エンドポイント
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOAuth2AuthorizeTest() throws ApiException {
        String clientId = null;
        OAuth2ResponseType responseType = null;
        String redirectUri = null;
        String scope = null;
        String state = null;
        String codeChallenge = null;
        String codeChallengeMethod = null;
        String nonce = null;
        OAuth2Prompt prompt = null;
        api.getOAuth2Authorize(clientId, responseType, redirectUri, scope, state, codeChallenge, codeChallengeMethod, nonce, prompt);

        // TODO: test validations
    }
    
    /**
     * OAuth2 認可エンドポイント
     *
     * OAuth2 認可エンドポイント
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postOAuth2AuthorizeTest() throws ApiException {
        String clientId = null;
        OAuth2ResponseType responseType = null;
        String redirectUri = null;
        String scope = null;
        String state = null;
        String codeChallenge = null;
        String codeChallengeMethod = null;
        String nonce = null;
        OAuth2Prompt prompt = null;
        api.postOAuth2Authorize(clientId, responseType, redirectUri, scope, state, codeChallenge, codeChallengeMethod, nonce, prompt);

        // TODO: test validations
    }
    
    /**
     * OAuth2 認可承諾API
     *
     * OAuth2 認可承諾
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postOAuth2AuthorizeDecideTest() throws ApiException {
        String submit = null;
        api.postOAuth2AuthorizeDecide(submit);

        // TODO: test validations
    }
    
    /**
     * OAuth2 トークンエンドポイント
     *
     * OAuth2 トークンエンドポイント
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postOAuth2TokenTest() throws ApiException {
        String grantType = null;
        String code = null;
        String redirectUri = null;
        String clientId = null;
        String codeVerifier = null;
        String username = null;
        String password = null;
        String scope = null;
        String refreshToken = null;
        String clientSecret = null;
        OAuth2Token response = api.postOAuth2Token(grantType, code, redirectUri, clientId, codeVerifier, username, password, scope, refreshToken, clientSecret);

        // TODO: test validations
    }
    
    /**
     * トークンの認可を取り消す
     *
     * 自分の指定したトークンの認可を取り消します。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void revokeMyTokenTest() throws ApiException {
        UUID tokenId = null;
        api.revokeMyToken(tokenId);

        // TODO: test validations
    }
    
    /**
     * OAuth2 トークン無効化エンドポイント
     *
     * OAuth2 トークン無効化エンドポイント
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void revokeOAuth2TokenTest() throws ApiException {
        PostOAuth2Revoke postOAuth2Revoke = null;
        api.revokeOAuth2Token(postOAuth2Revoke);

        // TODO: test validations
    }
    
}
