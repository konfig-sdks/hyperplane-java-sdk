/*
 * Hyperplane API Gateway
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.ModelsAuthRequest;
import com.konfigthis.client.model.ModelsAuthResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthApi
 */
@Disabled
public class AuthApiTest {

    private static AuthApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AuthApi(apiClient);
    }

    /**
     * Get Token
     *
     * Authenticate a client and get an access token
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTokenTest() throws ApiException {
        String clientId = null;
        String clientSecret = null;
        ModelsAuthResponse response = api.getToken(clientId, clientSecret)
                .execute();
        // TODO: test validations
    }

}