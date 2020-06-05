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
import com.github.motoki317.traq4j.model.FileInfo;
import org.threeten.bp.OffsetDateTime;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FileApi
 */
@Ignore
public class FileApiTest {

    private final FileApi api = new FileApi();

    
    /**
     * ファイルを削除
     *
     * 指定したファイルを削除します。 指定したファイルの削除権限が必要です。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFileTest() throws ApiException {
        UUID fileId = null;
        api.deleteFile(fileId);

        // TODO: test validations
    }
    
    /**
     * ファイルをダウンロード
     *
     * 指定したファイル本体を取得します。 指定したファイルへのアクセス権限が必要です。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileTest() throws ApiException {
        UUID fileId = null;
        Integer dl = null;
        File response = api.getFile(fileId, dl);

        // TODO: test validations
    }
    
    /**
     * ファイルメタを取得
     *
     * 指定したファイルのメタ情報を取得します。 指定したファイルへのアクセス権限が必要です。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileMetaTest() throws ApiException {
        UUID fileId = null;
        FileInfo response = api.getFileMeta(fileId);

        // TODO: test validations
    }
    
    /**
     * ファイルメタのリストを取得
     *
     * 指定したクエリでファイルメタのリストを取得します。 クエリパラメータ&#x60;channelId&#x60;, &#x60;mine&#x60;の少なくともいずれかが必須です。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFilesTest() throws ApiException {
        UUID channelId = null;
        Integer limit = null;
        Integer offset = null;
        OffsetDateTime since = null;
        OffsetDateTime until = null;
        Boolean inclusive = null;
        String order = null;
        Boolean mine = null;
        List<FileInfo> response = api.getFiles(channelId, limit, offset, since, until, inclusive, order, mine);

        // TODO: test validations
    }
    
    /**
     * サムネイル画像を取得
     *
     * 指定したファイルのサムネイル画像を取得します。 指定したファイルへのアクセス権限が必要です。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getThumbnailImageTest() throws ApiException {
        UUID fileId = null;
        File response = api.getThumbnailImage(fileId);

        // TODO: test validations
    }
    
    /**
     * ファイルをアップロード
     *
     * 指定したチャンネルにファイルをアップロードします。 アーカイブされているチャンネルにはアップロード出来ません。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postFileTest() throws ApiException {
        File file = null;
        UUID channelId = null;
        FileInfo response = api.postFile(file, channelId);

        // TODO: test validations
    }
    
}
