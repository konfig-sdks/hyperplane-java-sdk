# ClientApi

All URIs are relative to *https://api.sandbox-65ebc.chico.ai/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByAccessKey**](ClientApi.md#getByAccessKey) | **GET** /client/{access_key_id} | Get Client |


<a name="getByAccessKey"></a>
# **getByAccessKey**
> ModelsClientResponse getByAccessKey(accessKeyId).execute();

Get Client

Fetch a client by its access key ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Hyperplane;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClientApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sandbox-65ebc.chico.ai/v1";
    
    configuration.pASETO  = "YOUR API KEY";
    Hyperplane client = new Hyperplane(configuration);
    String accessKeyId = "accessKeyId_example"; // Access Key ID
    try {
      ModelsClientResponse result = client
              .client
              .getByAccessKey(accessKeyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessKeyId());
      System.out.println(result.getIsDisabled());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#getByAccessKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelsClientResponse> response = client
              .client
              .getByAccessKey(accessKeyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#getByAccessKey");
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
| **accessKeyId** | **String**| Access Key ID | |

### Return type

[**ModelsClientResponse**](ModelsClientResponse.md)

### Authorization

[PASETO](../README.md#PASETO)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

