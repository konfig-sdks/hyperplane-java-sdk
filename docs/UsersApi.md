# UsersApi

All URIs are relative to *https://api.sandbox-65ebc.chico.ai/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllFacetAttributes**](UsersApi.md#getAllFacetAttributes) | **POST** /batch/user/personas | Get all the facet attributes for a list of users. |
| [**listUserPersonas**](UsersApi.md#listUserPersonas) | **GET** /users/{user_id}/personas | List personas associated with a user. |


<a name="getAllFacetAttributes"></a>
# **getAllFacetAttributes**
> List&lt;ModelsUserPersonasResponse&gt; getAllFacetAttributes(modelsBatchUserPersonasRequest).moduleId(moduleId).month(month).personaScoreThreshold(personaScoreThreshold).execute();

Get all the facet attributes for a list of users.

Returns all personas associated with a user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Hyperplane;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sandbox-65ebc.chico.ai/v1";
    
    configuration.pASETO  = "YOUR API KEY";
    Hyperplane client = new Hyperplane(configuration);
    List<String> userIds = Arrays.asList(); // All user ids we want to fetch personas for
    String moduleId = "moduleId_example"; // Module ID
    String month = "month_example"; // Reference month for persona scores in `YYYY-MM` format.
    Double personaScoreThreshold = 3.4D; // Minimum user persona score threshold to be included in the response.
    try {
      List<ModelsUserPersonasResponse> result = client
              .users
              .getAllFacetAttributes(userIds)
              .moduleId(moduleId)
              .month(month)
              .personaScoreThreshold(personaScoreThreshold)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getAllFacetAttributes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ModelsUserPersonasResponse>> response = client
              .users
              .getAllFacetAttributes(userIds)
              .moduleId(moduleId)
              .month(month)
              .personaScoreThreshold(personaScoreThreshold)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getAllFacetAttributes");
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
| **modelsBatchUserPersonasRequest** | [**ModelsBatchUserPersonasRequest**](ModelsBatchUserPersonasRequest.md)| List of user IDs | |
| **moduleId** | **String**| Module ID | [optional] |
| **month** | **String**| Reference month for persona scores in &#x60;YYYY-MM&#x60; format. | [optional] |
| **personaScoreThreshold** | **Double**| Minimum user persona score threshold to be included in the response. | [optional] |

### Return type

[**List&lt;ModelsUserPersonasResponse&gt;**](ModelsUserPersonasResponse.md)

### Authorization

[PASETO](../README.md#PASETO)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a name="listUserPersonas"></a>
# **listUserPersonas**
> ModelsUserPersonasResponse listUserPersonas(userId).moduleId(moduleId).month(month).personaScoreThreshold(personaScoreThreshold).execute();

List personas associated with a user.

Returns a list of personas and their scores for a given user. Personas are sorted by their persona score, in descending order.  You can also specify the minimum persona score threshold that a user must meet to be included in the response. Defaults to hyperplane&#39;s suggested threshold to determine if the user belongs to the persona.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Hyperplane;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sandbox-65ebc.chico.ai/v1";
    
    configuration.pASETO  = "YOUR API KEY";
    Hyperplane client = new Hyperplane(configuration);
    String userId = "userId_example"; // User ID
    String moduleId = "moduleId_example"; // Module ID
    String month = "month_example"; // Reference month for persona scores in `YYYY-MM` format.
    Double personaScoreThreshold = 3.4D; // Minimum user persona score threshold to be included in the response.
    try {
      ModelsUserPersonasResponse result = client
              .users
              .listUserPersonas(userId)
              .moduleId(moduleId)
              .month(month)
              .personaScoreThreshold(personaScoreThreshold)
              .execute();
      System.out.println(result);
      System.out.println(result.getPersonaScores());
      System.out.println(result.getUserId());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listUserPersonas");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelsUserPersonasResponse> response = client
              .users
              .listUserPersonas(userId)
              .moduleId(moduleId)
              .month(month)
              .personaScoreThreshold(personaScoreThreshold)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listUserPersonas");
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
| **userId** | **String**| User ID | |
| **moduleId** | **String**| Module ID | [optional] |
| **month** | **String**| Reference month for persona scores in &#x60;YYYY-MM&#x60; format. | [optional] |
| **personaScoreThreshold** | **Double**| Minimum user persona score threshold to be included in the response. | [optional] |

### Return type

[**ModelsUserPersonasResponse**](ModelsUserPersonasResponse.md)

### Authorization

[PASETO](../README.md#PASETO)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

