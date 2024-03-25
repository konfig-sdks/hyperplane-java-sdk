# AuthApi

All URIs are relative to *https://api.sandbox-65ebc.chico.ai/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getToken**](AuthApi.md#getToken) | **POST** /auth/token | Get Token |


<a name="getToken"></a>
# **getToken**
> ModelsAuthResponse getToken(modelsAuthRequest).execute();

Get Token

Authenticate a client and get an access token

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Hyperplane;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sandbox-65ebc.chico.ai/v1";
    Hyperplane client = new Hyperplane(configuration);
    String clientId = "clientId_example";
    String clientSecret = "clientSecret_example";
    try {
      ModelsAuthResponse result = client
              .auth
              .getToken(clientId, clientSecret)
              .execute();
      System.out.println(result);
      System.out.println(result.getApiKey());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#getToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelsAuthResponse> response = client
              .auth
              .getToken(clientId, clientSecret)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#getToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelsAuthRequest** | [**ModelsAuthRequest**](ModelsAuthRequest.md)| Request body | |

### Return type

[**ModelsAuthResponse**](ModelsAuthResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

