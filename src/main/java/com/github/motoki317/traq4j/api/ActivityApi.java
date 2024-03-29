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


import com.github.motoki317.traq4j.model.ActivityTimelineMessage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ActivityApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ActivityApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ActivityApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getActivityTimeline
     * @param limit 取得する件数 (optional, default to 50)
     * @param all 全てのチャンネルのタイムラインを取得する (optional, default to false)
     * @param perChannel 同じチャンネルのメッセージは最新のもののみ取得するか (optional, default to false)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getActivityTimelineCall(Integer limit, Boolean all, Boolean perChannel, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/activity/timeline";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (all != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("all", all));
        }

        if (perChannel != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("per_channel", perChannel));
        }

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth2", "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getActivityTimelineValidateBeforeCall(Integer limit, Boolean all, Boolean perChannel, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getActivityTimelineCall(limit, all, perChannel, _callback);
        return localVarCall;

    }

    /**
     * アクテビティタイムラインを取得
     * パブリックチャンネルの直近の投稿メッセージを作成日時の降順で取得します。 &#x60;all&#x60;が&#x60;true&#x60;でない場合、購読チャンネルのみのタイムラインを取得します
     * @param limit 取得する件数 (optional, default to 50)
     * @param all 全てのチャンネルのタイムラインを取得する (optional, default to false)
     * @param perChannel 同じチャンネルのメッセージは最新のもののみ取得するか (optional, default to false)
     * @return List&lt;ActivityTimelineMessage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public List<ActivityTimelineMessage> getActivityTimeline(Integer limit, Boolean all, Boolean perChannel) throws ApiException {
        ApiResponse<List<ActivityTimelineMessage>> localVarResp = getActivityTimelineWithHttpInfo(limit, all, perChannel);
        return localVarResp.getData();
    }

    /**
     * アクテビティタイムラインを取得
     * パブリックチャンネルの直近の投稿メッセージを作成日時の降順で取得します。 &#x60;all&#x60;が&#x60;true&#x60;でない場合、購読チャンネルのみのタイムラインを取得します
     * @param limit 取得する件数 (optional, default to 50)
     * @param all 全てのチャンネルのタイムラインを取得する (optional, default to false)
     * @param perChannel 同じチャンネルのメッセージは最新のもののみ取得するか (optional, default to false)
     * @return ApiResponse&lt;List&lt;ActivityTimelineMessage&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ActivityTimelineMessage>> getActivityTimelineWithHttpInfo(Integer limit, Boolean all, Boolean perChannel) throws ApiException {
        okhttp3.Call localVarCall = getActivityTimelineValidateBeforeCall(limit, all, perChannel, null);
        Type localVarReturnType = new TypeToken<List<ActivityTimelineMessage>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * アクテビティタイムラインを取得 (asynchronously)
     * パブリックチャンネルの直近の投稿メッセージを作成日時の降順で取得します。 &#x60;all&#x60;が&#x60;true&#x60;でない場合、購読チャンネルのみのタイムラインを取得します
     * @param limit 取得する件数 (optional, default to 50)
     * @param all 全てのチャンネルのタイムラインを取得する (optional, default to false)
     * @param perChannel 同じチャンネルのメッセージは最新のもののみ取得するか (optional, default to false)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getActivityTimelineAsync(Integer limit, Boolean all, Boolean perChannel, final ApiCallback<List<ActivityTimelineMessage>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getActivityTimelineValidateBeforeCall(limit, all, perChannel, _callback);
        Type localVarReturnType = new TypeToken<List<ActivityTimelineMessage>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getOnlineUsers
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getOnlineUsersCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/activity/onlines";

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth2", "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getOnlineUsersValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getOnlineUsersCall(_callback);
        return localVarCall;

    }

    /**
     * オンラインユーザーリストを取得
     * 現在オンラインな(SSEまたはWSが接続中)ユーザーのUUIDのリストを返します。
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<String> getOnlineUsers() throws ApiException {
        ApiResponse<List<String>> localVarResp = getOnlineUsersWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * オンラインユーザーリストを取得
     * 現在オンラインな(SSEまたはWSが接続中)ユーザーのUUIDのリストを返します。
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<String>> getOnlineUsersWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getOnlineUsersValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * オンラインユーザーリストを取得 (asynchronously)
     * 現在オンラインな(SSEまたはWSが接続中)ユーザーのUUIDのリストを返します。
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getOnlineUsersAsync(final ApiCallback<List<String>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getOnlineUsersValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
