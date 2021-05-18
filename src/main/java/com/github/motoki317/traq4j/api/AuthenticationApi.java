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

import com.github.motoki317.traq4j.ApiCallback;
import com.github.motoki317.traq4j.ApiClient;
import com.github.motoki317.traq4j.ApiException;
import com.github.motoki317.traq4j.ApiResponse;
import com.github.motoki317.traq4j.Configuration;
import com.github.motoki317.traq4j.Pair;
import com.github.motoki317.traq4j.ProgressRequestBody;
import com.github.motoki317.traq4j.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.github.motoki317.traq4j.model.ExternalProviderUser;
import com.github.motoki317.traq4j.model.LoginSession;
import com.github.motoki317.traq4j.model.PostLinkExternalAccount;
import com.github.motoki317.traq4j.model.PostLoginRequest;
import com.github.motoki317.traq4j.model.PostUnlinkExternalAccount;

import java.net.URI;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthenticationApi {
    private ApiClient localVarApiClient;

    public AuthenticationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AuthenticationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getMyExternalAccounts
     *
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getMyExternalAccountsCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/me/ex-accounts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"OAuth2"};
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getMyExternalAccountsValidateBeforeCall(final ApiCallback _callback) throws ApiException {


        okhttp3.Call localVarCall = getMyExternalAccountsCall(_callback);
        return localVarCall;

    }

    /**
     * 外部ログインアカウント一覧を取得
     * 自分に紐付けられている外部ログインアカウント一覧を取得します。
     *
     * @return List&lt;ExternalProviderUser&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * </table>
     */
    public List<ExternalProviderUser> getMyExternalAccounts() throws ApiException {
        ApiResponse<List<ExternalProviderUser>> localVarResp = getMyExternalAccountsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * 外部ログインアカウント一覧を取得
     * 自分に紐付けられている外部ログインアカウント一覧を取得します。
     *
     * @return ApiResponse&lt;List&lt;ExternalProviderUser&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<List<ExternalProviderUser>> getMyExternalAccountsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getMyExternalAccountsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<ExternalProviderUser>>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 外部ログインアカウント一覧を取得 (asynchronously)
     * 自分に紐付けられている外部ログインアカウント一覧を取得します。
     *
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getMyExternalAccountsAsync(final ApiCallback<List<ExternalProviderUser>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMyExternalAccountsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<ExternalProviderUser>>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getMySessions
     *
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getMySessionsCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/me/sessions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"OAuth2"};
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getMySessionsValidateBeforeCall(final ApiCallback _callback) throws ApiException {


        okhttp3.Call localVarCall = getMySessionsCall(_callback);
        return localVarCall;

    }

    /**
     * 自分のログインセッションリストを取得
     * 自分のログインセッションのリストを取得します。
     *
     * @return List&lt;LoginSession&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * </table>
     */
    public List<LoginSession> getMySessions() throws ApiException {
        ApiResponse<List<LoginSession>> localVarResp = getMySessionsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * 自分のログインセッションリストを取得
     * 自分のログインセッションのリストを取得します。
     *
     * @return ApiResponse&lt;List&lt;LoginSession&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<List<LoginSession>> getMySessionsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getMySessionsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<LoginSession>>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 自分のログインセッションリストを取得 (asynchronously)
     * 自分のログインセッションのリストを取得します。
     *
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getMySessionsAsync(final ApiCallback<List<LoginSession>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMySessionsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<LoginSession>>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for linkExternalAccount
     *
     * @param postLinkExternalAccount (optional)
     * @param _callback               Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 302 </td><td> Found 外部サービスの認証画面に遷移します。 </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call linkExternalAccountCall(PostLinkExternalAccount postLinkExternalAccount, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = postLinkExternalAccount;

        // create path and map variables
        String localVarPath = "/users/me/ex-accounts/link";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {

        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"OAuth2"};
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call linkExternalAccountValidateBeforeCall(PostLinkExternalAccount postLinkExternalAccount, final ApiCallback _callback) throws ApiException {


        okhttp3.Call localVarCall = linkExternalAccountCall(postLinkExternalAccount, _callback);
        return localVarCall;

    }

    /**
     * 外部ログインアカウントを紐付ける
     * 自分に外部ログインアカウントを紐付けます。 指定した&#x60;providerName&#x60;がサーバー側で有効である必要があります。 リクエストが受理された場合、外部サービスの認証画面にリダイレクトされ、認証される必要があります。
     *
     * @param postLinkExternalAccount (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 302 </td><td> Found 外部サービスの認証画面に遷移します。 </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * </table>
     */
    public void linkExternalAccount(PostLinkExternalAccount postLinkExternalAccount) throws ApiException {
        linkExternalAccountWithHttpInfo(postLinkExternalAccount);
    }

    /**
     * 外部ログインアカウントを紐付ける
     * 自分に外部ログインアカウントを紐付けます。 指定した&#x60;providerName&#x60;がサーバー側で有効である必要があります。 リクエストが受理された場合、外部サービスの認証画面にリダイレクトされ、認証される必要があります。
     *
     * @param postLinkExternalAccount (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 302 </td><td> Found 外部サービスの認証画面に遷移します。 </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> linkExternalAccountWithHttpInfo(PostLinkExternalAccount postLinkExternalAccount) throws ApiException {
        okhttp3.Call localVarCall = linkExternalAccountValidateBeforeCall(postLinkExternalAccount, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * 外部ログインアカウントを紐付ける (asynchronously)
     * 自分に外部ログインアカウントを紐付けます。 指定した&#x60;providerName&#x60;がサーバー側で有効である必要があります。 リクエストが受理された場合、外部サービスの認証画面にリダイレクトされ、認証される必要があります。
     *
     * @param postLinkExternalAccount (optional)
     * @param _callback               The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 302 </td><td> Found 外部サービスの認証画面に遷移します。 </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call linkExternalAccountAsync(PostLinkExternalAccount postLinkExternalAccount, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = linkExternalAccountValidateBeforeCall(postLinkExternalAccount, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    /**
     * Build call for login
     *
     * @param redirect         リダイレクト先 (optional)
     * @param postLoginRequest (optional)
     * @param _callback        Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content ログインしました。 </td><td>  -  </td></tr>
     * <tr><td> 302 </td><td> Found ログインしました。リダイレクトします。 </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized 認証情報が間違っています。 </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden ログインを試行したユーザーアカウントに問題があります。 </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call loginCall(URI redirect, PostLoginRequest postLoginRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = postLoginRequest;

        // create path and map variables
        String localVarPath = "/login";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (redirect != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("redirect", redirect));
        }

        final String[] localVarAccepts = {

        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"OAuth2"};
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call loginValidateBeforeCall(URI redirect, PostLoginRequest postLoginRequest, final ApiCallback _callback) throws ApiException {


        okhttp3.Call localVarCall = loginCall(redirect, postLoginRequest, _callback);
        return localVarCall;

    }

    /**
     * ログイン
     * ログインします。
     *
     * @param redirect         リダイレクト先 (optional)
     * @param postLoginRequest (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content ログインしました。 </td><td>  -  </td></tr>
     * <tr><td> 302 </td><td> Found ログインしました。リダイレクトします。 </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized 認証情報が間違っています。 </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden ログインを試行したユーザーアカウントに問題があります。 </td><td>  -  </td></tr>
     * </table>
     */
    public void login(URI redirect, PostLoginRequest postLoginRequest) throws ApiException {
        loginWithHttpInfo(redirect, postLoginRequest);
    }

    /**
     * ログイン
     * ログインします。
     *
     * @param redirect         リダイレクト先 (optional)
     * @param postLoginRequest (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content ログインしました。 </td><td>  -  </td></tr>
     * <tr><td> 302 </td><td> Found ログインしました。リダイレクトします。 </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized 認証情報が間違っています。 </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden ログインを試行したユーザーアカウントに問題があります。 </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> loginWithHttpInfo(URI redirect, PostLoginRequest postLoginRequest) throws ApiException {
        okhttp3.Call localVarCall = loginValidateBeforeCall(redirect, postLoginRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * ログイン (asynchronously)
     * ログインします。
     *
     * @param redirect         リダイレクト先 (optional)
     * @param postLoginRequest (optional)
     * @param _callback        The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content ログインしました。 </td><td>  -  </td></tr>
     * <tr><td> 302 </td><td> Found ログインしました。リダイレクトします。 </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized 認証情報が間違っています。 </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden ログインを試行したユーザーアカウントに問題があります。 </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call loginAsync(URI redirect, PostLoginRequest postLoginRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = loginValidateBeforeCall(redirect, postLoginRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    /**
     * Build call for logout
     *
     * @param redirect  リダイレクト先 (optional)
     * @param all       全てのセッションでログアウトするかどうか (optional, default to false)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content ログアウトしました。 </td><td>  -  </td></tr>
     * <tr><td> 302 </td><td> Found ログアウトしました。リダイレクトします。 </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call logoutCall(URI redirect, Boolean all, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/logout";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (redirect != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("redirect", redirect));
        }

        if (all != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("all", all));
        }

        final String[] localVarAccepts = {

        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"OAuth2"};
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call logoutValidateBeforeCall(URI redirect, Boolean all, final ApiCallback _callback) throws ApiException {


        okhttp3.Call localVarCall = logoutCall(redirect, all, _callback);
        return localVarCall;

    }

    /**
     * ログアウト
     * ログアウトします。
     *
     * @param redirect リダイレクト先 (optional)
     * @param all      全てのセッションでログアウトするかどうか (optional, default to false)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content ログアウトしました。 </td><td>  -  </td></tr>
     * <tr><td> 302 </td><td> Found ログアウトしました。リダイレクトします。 </td><td>  -  </td></tr>
     * </table>
     */
    public void logout(URI redirect, Boolean all) throws ApiException {
        logoutWithHttpInfo(redirect, all);
    }

    /**
     * ログアウト
     * ログアウトします。
     *
     * @param redirect リダイレクト先 (optional)
     * @param all      全てのセッションでログアウトするかどうか (optional, default to false)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content ログアウトしました。 </td><td>  -  </td></tr>
     * <tr><td> 302 </td><td> Found ログアウトしました。リダイレクトします。 </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> logoutWithHttpInfo(URI redirect, Boolean all) throws ApiException {
        okhttp3.Call localVarCall = logoutValidateBeforeCall(redirect, all, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * ログアウト (asynchronously)
     * ログアウトします。
     *
     * @param redirect  リダイレクト先 (optional)
     * @param all       全てのセッションでログアウトするかどうか (optional, default to false)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content ログアウトしました。 </td><td>  -  </td></tr>
     * <tr><td> 302 </td><td> Found ログアウトしました。リダイレクトします。 </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call logoutAsync(URI redirect, Boolean all, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = logoutValidateBeforeCall(redirect, all, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    /**
     * Build call for revokeMySession
     *
     * @param sessionId セッションUUID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content 無効化しました。 </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call revokeMySessionCall(UUID sessionId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/me/sessions/{sessionId}"
                .replaceAll("\\{" + "sessionId" + "\\}", localVarApiClient.escapeString(sessionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {

        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"OAuth2"};
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call revokeMySessionValidateBeforeCall(UUID sessionId, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new ApiException("Missing the required parameter 'sessionId' when calling revokeMySession(Async)");
        }


        okhttp3.Call localVarCall = revokeMySessionCall(sessionId, _callback);
        return localVarCall;

    }

    /**
     * セッションを無効化
     * 指定した自分のセッションを無効化(ログアウト)します。 既に存在しない・無効化されているセッションを指定した場合も&#x60;204&#x60;を返します。
     *
     * @param sessionId セッションUUID (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content 無効化しました。 </td><td>  -  </td></tr>
     * </table>
     */
    public void revokeMySession(UUID sessionId) throws ApiException {
        revokeMySessionWithHttpInfo(sessionId);
    }

    /**
     * セッションを無効化
     * 指定した自分のセッションを無効化(ログアウト)します。 既に存在しない・無効化されているセッションを指定した場合も&#x60;204&#x60;を返します。
     *
     * @param sessionId セッションUUID (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content 無効化しました。 </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> revokeMySessionWithHttpInfo(UUID sessionId) throws ApiException {
        okhttp3.Call localVarCall = revokeMySessionValidateBeforeCall(sessionId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * セッションを無効化 (asynchronously)
     * 指定した自分のセッションを無効化(ログアウト)します。 既に存在しない・無効化されているセッションを指定した場合も&#x60;204&#x60;を返します。
     *
     * @param sessionId セッションUUID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content 無効化しました。 </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call revokeMySessionAsync(UUID sessionId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = revokeMySessionValidateBeforeCall(sessionId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    /**
     * Build call for unlinkExternalAccount
     *
     * @param postUnlinkExternalAccount (optional)
     * @param _callback                 Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content 紐付けを解除しました。 </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call unlinkExternalAccountCall(PostUnlinkExternalAccount postUnlinkExternalAccount, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = postUnlinkExternalAccount;

        // create path and map variables
        String localVarPath = "/users/me/ex-accounts/unlink";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {

        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"OAuth2"};
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call unlinkExternalAccountValidateBeforeCall(PostUnlinkExternalAccount postUnlinkExternalAccount, final ApiCallback _callback) throws ApiException {


        okhttp3.Call localVarCall = unlinkExternalAccountCall(postUnlinkExternalAccount, _callback);
        return localVarCall;

    }

    /**
     * 外部ログインアカウントの紐付けを解除
     * 自分に紐付けられている外部ログインアカウントの紐付けを解除します。
     *
     * @param postUnlinkExternalAccount (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content 紐付けを解除しました。 </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * </table>
     */
    public void unlinkExternalAccount(PostUnlinkExternalAccount postUnlinkExternalAccount) throws ApiException {
        unlinkExternalAccountWithHttpInfo(postUnlinkExternalAccount);
    }

    /**
     * 外部ログインアカウントの紐付けを解除
     * 自分に紐付けられている外部ログインアカウントの紐付けを解除します。
     *
     * @param postUnlinkExternalAccount (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content 紐付けを解除しました。 </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> unlinkExternalAccountWithHttpInfo(PostUnlinkExternalAccount postUnlinkExternalAccount) throws ApiException {
        okhttp3.Call localVarCall = unlinkExternalAccountValidateBeforeCall(postUnlinkExternalAccount, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * 外部ログインアカウントの紐付けを解除 (asynchronously)
     * 自分に紐付けられている外部ログインアカウントの紐付けを解除します。
     *
     * @param postUnlinkExternalAccount (optional)
     * @param _callback                 The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content 紐付けを解除しました。 </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call unlinkExternalAccountAsync(PostUnlinkExternalAccount postUnlinkExternalAccount, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = unlinkExternalAccountValidateBeforeCall(postUnlinkExternalAccount, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
