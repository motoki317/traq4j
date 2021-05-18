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


import com.github.motoki317.traq4j.model.MessagePin;
import com.github.motoki317.traq4j.model.Pin;

import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PinApi {
    private ApiClient localVarApiClient;

    public PinApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PinApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createPin
     *
     * @param messageId メッセージUUID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 201 </td><td> Created 指定したメッセージがピン留めされました。 </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Forbidden これ以上このメッセージのチャンネルにピン留めすることはできません。 </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found メッセージが見つかりません。 </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createPinCall(UUID messageId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/messages/{messageId}/pin"
                .replaceAll("\\{" + "messageId" + "\\}", localVarApiClient.escapeString(messageId.toString()));

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
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createPinValidateBeforeCall(UUID messageId, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'messageId' is set
        if (messageId == null) {
            throw new ApiException("Missing the required parameter 'messageId' when calling createPin(Async)");
        }


        okhttp3.Call localVarCall = createPinCall(messageId, _callback);
        return localVarCall;

    }

    /**
     * ピン留めする
     * 指定したメッセージをピン留めします。
     *
     * @param messageId メッセージUUID (required)
     * @return MessagePin
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 201 </td><td> Created 指定したメッセージがピン留めされました。 </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Forbidden これ以上このメッセージのチャンネルにピン留めすることはできません。 </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found メッセージが見つかりません。 </td><td>  -  </td></tr>
     * </table>
     */
    public MessagePin createPin(UUID messageId) throws ApiException {
        ApiResponse<MessagePin> localVarResp = createPinWithHttpInfo(messageId);
        return localVarResp.getData();
    }

    /**
     * ピン留めする
     * 指定したメッセージをピン留めします。
     *
     * @param messageId メッセージUUID (required)
     * @return ApiResponse&lt;MessagePin&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 201 </td><td> Created 指定したメッセージがピン留めされました。 </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Forbidden これ以上このメッセージのチャンネルにピン留めすることはできません。 </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found メッセージが見つかりません。 </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<MessagePin> createPinWithHttpInfo(UUID messageId) throws ApiException {
        okhttp3.Call localVarCall = createPinValidateBeforeCall(messageId, null);
        Type localVarReturnType = new TypeToken<MessagePin>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * ピン留めする (asynchronously)
     * 指定したメッセージをピン留めします。
     *
     * @param messageId メッセージUUID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 201 </td><td> Created 指定したメッセージがピン留めされました。 </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Forbidden これ以上このメッセージのチャンネルにピン留めすることはできません。 </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found メッセージが見つかりません。 </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createPinAsync(UUID messageId, final ApiCallback<MessagePin> _callback) throws ApiException {

        okhttp3.Call localVarCall = createPinValidateBeforeCall(messageId, _callback);
        Type localVarReturnType = new TypeToken<MessagePin>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getChannelPins
     *
     * @param channelId チャンネルUUID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found チャンネルが見つかりません。 </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getChannelPinsCall(UUID channelId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/channels/{channelId}/pins"
                .replaceAll("\\{" + "channelId" + "\\}", localVarApiClient.escapeString(channelId.toString()));

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
    private okhttp3.Call getChannelPinsValidateBeforeCall(UUID channelId, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new ApiException("Missing the required parameter 'channelId' when calling getChannelPins(Async)");
        }


        okhttp3.Call localVarCall = getChannelPinsCall(channelId, _callback);
        return localVarCall;

    }

    /**
     * チャンネルピンのリストを取得
     * 指定したチャンネルにピン留めされているピンメッセージのリストを取得します。
     *
     * @param channelId チャンネルUUID (required)
     * @return List&lt;Pin&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found チャンネルが見つかりません。 </td><td>  -  </td></tr>
     * </table>
     */
    public List<Pin> getChannelPins(UUID channelId) throws ApiException {
        ApiResponse<List<Pin>> localVarResp = getChannelPinsWithHttpInfo(channelId);
        return localVarResp.getData();
    }

    /**
     * チャンネルピンのリストを取得
     * 指定したチャンネルにピン留めされているピンメッセージのリストを取得します。
     *
     * @param channelId チャンネルUUID (required)
     * @return ApiResponse&lt;List&lt;Pin&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found チャンネルが見つかりません。 </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<List<Pin>> getChannelPinsWithHttpInfo(UUID channelId) throws ApiException {
        okhttp3.Call localVarCall = getChannelPinsValidateBeforeCall(channelId, null);
        Type localVarReturnType = new TypeToken<List<Pin>>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * チャンネルピンのリストを取得 (asynchronously)
     * 指定したチャンネルにピン留めされているピンメッセージのリストを取得します。
     *
     * @param channelId チャンネルUUID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found チャンネルが見つかりません。 </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getChannelPinsAsync(UUID channelId, final ApiCallback<List<Pin>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getChannelPinsValidateBeforeCall(channelId, _callback);
        Type localVarReturnType = new TypeToken<List<Pin>>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getPin
     *
     * @param messageId メッセージUUID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found 指定したメッセージ、またはピン留めが見つかりません。 </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getPinCall(UUID messageId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/messages/{messageId}/pin"
                .replaceAll("\\{" + "messageId" + "\\}", localVarApiClient.escapeString(messageId.toString()));

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
    private okhttp3.Call getPinValidateBeforeCall(UUID messageId, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'messageId' is set
        if (messageId == null) {
            throw new ApiException("Missing the required parameter 'messageId' when calling getPin(Async)");
        }


        okhttp3.Call localVarCall = getPinCall(messageId, _callback);
        return localVarCall;

    }

    /**
     * ピン留めを取得
     * 指定したメッセージのピン留め情報を取得します。
     *
     * @param messageId メッセージUUID (required)
     * @return MessagePin
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found 指定したメッセージ、またはピン留めが見つかりません。 </td><td>  -  </td></tr>
     * </table>
     */
    public MessagePin getPin(UUID messageId) throws ApiException {
        ApiResponse<MessagePin> localVarResp = getPinWithHttpInfo(messageId);
        return localVarResp.getData();
    }

    /**
     * ピン留めを取得
     * 指定したメッセージのピン留め情報を取得します。
     *
     * @param messageId メッセージUUID (required)
     * @return ApiResponse&lt;MessagePin&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found 指定したメッセージ、またはピン留めが見つかりません。 </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<MessagePin> getPinWithHttpInfo(UUID messageId) throws ApiException {
        okhttp3.Call localVarCall = getPinValidateBeforeCall(messageId, null);
        Type localVarReturnType = new TypeToken<MessagePin>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * ピン留めを取得 (asynchronously)
     * 指定したメッセージのピン留め情報を取得します。
     *
     * @param messageId メッセージUUID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found 指定したメッセージ、またはピン留めが見つかりません。 </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getPinAsync(UUID messageId, final ApiCallback<MessagePin> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPinValidateBeforeCall(messageId, _callback);
        Type localVarReturnType = new TypeToken<MessagePin>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for removePin
     *
     * @param messageId メッセージUUID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content 指定したメッセージのピン留めが外されました。 </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found 指定したメッセージ、またはピン留めが見つかりません。 </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call removePinCall(UUID messageId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/messages/{messageId}/pin"
                .replaceAll("\\{" + "messageId" + "\\}", localVarApiClient.escapeString(messageId.toString()));

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
    private okhttp3.Call removePinValidateBeforeCall(UUID messageId, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'messageId' is set
        if (messageId == null) {
            throw new ApiException("Missing the required parameter 'messageId' when calling removePin(Async)");
        }


        okhttp3.Call localVarCall = removePinCall(messageId, _callback);
        return localVarCall;

    }

    /**
     * ピン留めを外す
     * 指定したメッセージのピン留めを外します。
     *
     * @param messageId メッセージUUID (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content 指定したメッセージのピン留めが外されました。 </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found 指定したメッセージ、またはピン留めが見つかりません。 </td><td>  -  </td></tr>
     * </table>
     */
    public void removePin(UUID messageId) throws ApiException {
        removePinWithHttpInfo(messageId);
    }

    /**
     * ピン留めを外す
     * 指定したメッセージのピン留めを外します。
     *
     * @param messageId メッセージUUID (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content 指定したメッセージのピン留めが外されました。 </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found 指定したメッセージ、またはピン留めが見つかりません。 </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> removePinWithHttpInfo(UUID messageId) throws ApiException {
        okhttp3.Call localVarCall = removePinValidateBeforeCall(messageId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * ピン留めを外す (asynchronously)
     * 指定したメッセージのピン留めを外します。
     *
     * @param messageId メッセージUUID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> No Content 指定したメッセージのピン留めが外されました。 </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found 指定したメッセージ、またはピン留めが見つかりません。 </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call removePinAsync(UUID messageId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = removePinValidateBeforeCall(messageId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
