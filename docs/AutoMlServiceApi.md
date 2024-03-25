# AutoMlServiceApi

All URIs are relative to *https://api.sandbox-65ebc.chico.ai/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLookalikeRequest**](AutoMlServiceApi.md#createLookalikeRequest) | **POST** /automl/lookalike | Create an AutoML lookalike request |
| [**getAllRuns**](AutoMlServiceApi.md#getAllRuns) | **GET** /automl/runs | Get all AutoML runs in a specified module |
| [**getAvailableUsers**](AutoMlServiceApi.md#getAvailableUsers) | **GET** /automl/users | Get available users for training an AutoML run in a specified module |
| [**getRunStatus**](AutoMlServiceApi.md#getRunStatus) | **GET** /automl/runs/{run_id}/status | Get status of a specified AutoML run |
| [**getRunStatusBatchScores**](AutoMlServiceApi.md#getRunStatusBatchScores) | **GET** /automl/runs/{run_id}/status_batch_scores | Get status of the batch scores request for an AutoML run |
| [**getRunSummary**](AutoMlServiceApi.md#getRunSummary) | **GET** /automl/runs/{run_id} | Get run summary for a specified AutoML run |
| [**getTopUsersExcludingTraining**](AutoMlServiceApi.md#getTopUsersExcludingTraining) | **POST** /automl/runs/{run_id}/users | Get top users from a specified AutoML run excluding training users |
| [**rerunInference**](AutoMlServiceApi.md#rerunInference) | **POST** /automl/runs/{run_id}/rescore | Rerun inference on latest user snapshots to update scores |
| [**rerunInferenceScores**](AutoMlServiceApi.md#rerunInferenceScores) | **POST** /automl/runs/{run_id}/generate_batch_scores | Rerun the inference and store the updated scores in the output connection of the module |


<a name="createLookalikeRequest"></a>
# **createLookalikeRequest**
> ModelsAutoMLLookalikeCreateResponse createLookalikeRequest(modelsAutoMLLookalikeCreateRequest).modelVersion(modelVersion).moduleId(moduleId).execute();

Create an AutoML lookalike request

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Hyperplane;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutoMlServiceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sandbox-65ebc.chico.ai/v1";
    
    configuration.pASETO  = "YOUR API KEY";
    Hyperplane client = new Hyperplane(configuration);
    String engagementType = "engagementType_example"; // Intended use case of this product, between MULTI_ENGAGE and SINGLE_ENGAGE
    List<ModelsLookalikeLabel> positiveLabelUsers = Arrays.asList(); // List of positive users in lookalike model. Model will be trained to identify users similar to these users. This list must contain at least ten elements.
    List<ModelsLookalikeLabel> negativeLabelUsers = Arrays.asList(); // List of negative users in lookalike model. Model will be trained to identify users dissimilar to these users. If None, negative users will be generated from data. List length must be either 0 or greater than 10.
    String runDescription = "runDescription_example"; // Custom run description to attach to run
    String modelVersion = "modelVersion_example"; // Model Version
    String moduleId = "moduleId_example"; // Module ID
    try {
      ModelsAutoMLLookalikeCreateResponse result = client
              .autoMlService
              .createLookalikeRequest(engagementType, positiveLabelUsers)
              .negativeLabelUsers(negativeLabelUsers)
              .runDescription(runDescription)
              .modelVersion(modelVersion)
              .moduleId(moduleId)
              .execute();
      System.out.println(result);
      System.out.println(result.getInputLabelSummary());
      System.out.println(result.getRunDescription());
      System.out.println(result.getRunId());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoMlServiceApi#createLookalikeRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelsAutoMLLookalikeCreateResponse> response = client
              .autoMlService
              .createLookalikeRequest(engagementType, positiveLabelUsers)
              .negativeLabelUsers(negativeLabelUsers)
              .runDescription(runDescription)
              .modelVersion(modelVersion)
              .moduleId(moduleId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoMlServiceApi#createLookalikeRequest");
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
| **modelsAutoMLLookalikeCreateRequest** | [**ModelsAutoMLLookalikeCreateRequest**](ModelsAutoMLLookalikeCreateRequest.md)| Lookalike Request Body | |
| **modelVersion** | **String**| Model Version | [optional] |
| **moduleId** | **String**| Module ID | [optional] |

### Return type

[**ModelsAutoMLLookalikeCreateResponse**](ModelsAutoMLLookalikeCreateResponse.md)

### Authorization

[PASETO](../README.md#PASETO)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a name="getAllRuns"></a>
# **getAllRuns**
> ModelsAutoMLRunsGetResponse getAllRuns().moduleId(moduleId).execute();

Get all AutoML runs in a specified module

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Hyperplane;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutoMlServiceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sandbox-65ebc.chico.ai/v1";
    
    configuration.pASETO  = "YOUR API KEY";
    Hyperplane client = new Hyperplane(configuration);
    String moduleId = "moduleId_example"; // Module ID
    try {
      ModelsAutoMLRunsGetResponse result = client
              .autoMlService
              .getAllRuns()
              .moduleId(moduleId)
              .execute();
      System.out.println(result);
      System.out.println(result.getRuns());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoMlServiceApi#getAllRuns");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelsAutoMLRunsGetResponse> response = client
              .autoMlService
              .getAllRuns()
              .moduleId(moduleId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoMlServiceApi#getAllRuns");
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
| **moduleId** | **String**| Module ID | [optional] |

### Return type

[**ModelsAutoMLRunsGetResponse**](ModelsAutoMLRunsGetResponse.md)

### Authorization

[PASETO](../README.md#PASETO)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a name="getAvailableUsers"></a>
# **getAvailableUsers**
> ModelsAutoMLUsersGetResponse getAvailableUsers().moduleId(moduleId).pageNumber(pageNumber).pageSize(pageSize).execute();

Get available users for training an AutoML run in a specified module

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Hyperplane;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutoMlServiceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sandbox-65ebc.chico.ai/v1";
    
    configuration.pASETO  = "YOUR API KEY";
    Hyperplane client = new Hyperplane(configuration);
    String moduleId = "moduleId_example"; // Module ID
    Integer pageNumber = 1; // Page number, starting at 1
    Integer pageSize = 500; // Number of users scored in run per page. Between 1 and 10000. Defaults to 500
    try {
      ModelsAutoMLUsersGetResponse result = client
              .autoMlService
              .getAvailableUsers()
              .moduleId(moduleId)
              .pageNumber(pageNumber)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getUserList());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoMlServiceApi#getAvailableUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelsAutoMLUsersGetResponse> response = client
              .autoMlService
              .getAvailableUsers()
              .moduleId(moduleId)
              .pageNumber(pageNumber)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoMlServiceApi#getAvailableUsers");
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
| **moduleId** | **String**| Module ID | [optional] |
| **pageNumber** | **Integer**| Page number, starting at 1 | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of users scored in run per page. Between 1 and 10000. Defaults to 500 | [optional] [default to 500] |

### Return type

[**ModelsAutoMLUsersGetResponse**](ModelsAutoMLUsersGetResponse.md)

### Authorization

[PASETO](../README.md#PASETO)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a name="getRunStatus"></a>
# **getRunStatus**
> String getRunStatus(runId).execute();

Get status of a specified AutoML run

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Hyperplane;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutoMlServiceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sandbox-65ebc.chico.ai/v1";
    
    configuration.pASETO  = "YOUR API KEY";
    Hyperplane client = new Hyperplane(configuration);
    String runId = "runId_example"; // Run ID
    try {
      String result = client
              .autoMlService
              .getRunStatus(runId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoMlServiceApi#getRunStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .autoMlService
              .getRunStatus(runId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoMlServiceApi#getRunStatus");
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
| **runId** | **String**| Run ID | |

### Return type

**String**

### Authorization

[PASETO](../README.md#PASETO)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a name="getRunStatusBatchScores"></a>
# **getRunStatusBatchScores**
> String getRunStatusBatchScores(runId).execute();

Get status of the batch scores request for an AutoML run

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Hyperplane;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutoMlServiceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sandbox-65ebc.chico.ai/v1";
    
    configuration.pASETO  = "YOUR API KEY";
    Hyperplane client = new Hyperplane(configuration);
    String runId = "runId_example"; // Run ID
    try {
      String result = client
              .autoMlService
              .getRunStatusBatchScores(runId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoMlServiceApi#getRunStatusBatchScores");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .autoMlService
              .getRunStatusBatchScores(runId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoMlServiceApi#getRunStatusBatchScores");
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
| **runId** | **String**| Run ID | |

### Return type

**String**

### Authorization

[PASETO](../README.md#PASETO)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a name="getRunSummary"></a>
# **getRunSummary**
> ModelsAutoMLRunGetIdResponse getRunSummary(runId).execute();

Get run summary for a specified AutoML run

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Hyperplane;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutoMlServiceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sandbox-65ebc.chico.ai/v1";
    
    configuration.pASETO  = "YOUR API KEY";
    Hyperplane client = new Hyperplane(configuration);
    String runId = "runId_example"; // Run ID
    try {
      ModelsAutoMLRunGetIdResponse result = client
              .autoMlService
              .getRunSummary(runId)
              .execute();
      System.out.println(result);
      System.out.println(result.getEngagementType());
      System.out.println(result.getInputLabelSummary());
      System.out.println(result.getNumberOfInferenceUsers());
      System.out.println(result.getNumberOfTrainUsers());
      System.out.println(result.getRunDescription());
      System.out.println(result.getRunId());
      System.out.println(result.getRunMetrics());
      System.out.println(result.getStatus());
      System.out.println(result.getTimestamp());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoMlServiceApi#getRunSummary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelsAutoMLRunGetIdResponse> response = client
              .autoMlService
              .getRunSummary(runId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoMlServiceApi#getRunSummary");
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
| **runId** | **String**| Run ID | |

### Return type

[**ModelsAutoMLRunGetIdResponse**](ModelsAutoMLRunGetIdResponse.md)

### Authorization

[PASETO](../README.md#PASETO)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a name="getTopUsersExcludingTraining"></a>
# **getTopUsersExcludingTraining**
> ModelsAutoMLRunUsersGetResponse getTopUsersExcludingTraining(runId, modelsAutoMLRunUsersGetRequest).pageNumber(pageNumber).pageSize(pageSize).execute();

Get top users from a specified AutoML run excluding training users

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Hyperplane;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutoMlServiceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sandbox-65ebc.chico.ai/v1";
    
    configuration.pASETO  = "YOUR API KEY";
    Hyperplane client = new Hyperplane(configuration);
    String runId = "runId_example"; // Run ID
    List<ModelsUserMetadata> allowUsers = Arrays.asList(); // List of users to return user scores for
    List<ModelsUserMetadata> blockUsers = Arrays.asList(); // List of users to omit from returned user scores
    List<ModelsTagCategoricalAttributeFilter> tagFilters = Arrays.asList(); // Categorical Filters on pf_type metadata
    Integer pageNumber = 1; // Page number, starting at 1
    Integer pageSize = 500; // Number of users scored in run per page. Between 1 and 10000. Defaults to 500
    try {
      ModelsAutoMLRunUsersGetResponse result = client
              .autoMlService
              .getTopUsersExcludingTraining(runId)
              .allowUsers(allowUsers)
              .blockUsers(blockUsers)
              .tagFilters(tagFilters)
              .pageNumber(pageNumber)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getLastScoredDate());
      System.out.println(result.getUserScores());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoMlServiceApi#getTopUsersExcludingTraining");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelsAutoMLRunUsersGetResponse> response = client
              .autoMlService
              .getTopUsersExcludingTraining(runId)
              .allowUsers(allowUsers)
              .blockUsers(blockUsers)
              .tagFilters(tagFilters)
              .pageNumber(pageNumber)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoMlServiceApi#getTopUsersExcludingTraining");
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
| **runId** | **String**| Run ID | |
| **modelsAutoMLRunUsersGetRequest** | [**ModelsAutoMLRunUsersGetRequest**](ModelsAutoMLRunUsersGetRequest.md)| Request Options | |
| **pageNumber** | **Integer**| Page number, starting at 1 | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of users scored in run per page. Between 1 and 10000. Defaults to 500 | [optional] [default to 500] |

### Return type

[**ModelsAutoMLRunUsersGetResponse**](ModelsAutoMLRunUsersGetResponse.md)

### Authorization

[PASETO](../README.md#PASETO)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a name="rerunInference"></a>
# **rerunInference**
> ModelsAutoMLLookalikeCreateResponse rerunInference(runId).execute();

Rerun inference on latest user snapshots to update scores

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Hyperplane;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutoMlServiceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sandbox-65ebc.chico.ai/v1";
    
    configuration.pASETO  = "YOUR API KEY";
    Hyperplane client = new Hyperplane(configuration);
    String runId = "runId_example"; // Run ID
    try {
      ModelsAutoMLLookalikeCreateResponse result = client
              .autoMlService
              .rerunInference(runId)
              .execute();
      System.out.println(result);
      System.out.println(result.getInputLabelSummary());
      System.out.println(result.getRunDescription());
      System.out.println(result.getRunId());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoMlServiceApi#rerunInference");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelsAutoMLLookalikeCreateResponse> response = client
              .autoMlService
              .rerunInference(runId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoMlServiceApi#rerunInference");
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
| **runId** | **String**| Run ID | |

### Return type

[**ModelsAutoMLLookalikeCreateResponse**](ModelsAutoMLLookalikeCreateResponse.md)

### Authorization

[PASETO](../README.md#PASETO)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a name="rerunInferenceScores"></a>
# **rerunInferenceScores**
> ModelsAutoMLBatchScoresCreateResponse rerunInferenceScores(runId).moduleId(moduleId).execute();

Rerun the inference and store the updated scores in the output connection of the module

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Hyperplane;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutoMlServiceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sandbox-65ebc.chico.ai/v1";
    
    configuration.pASETO  = "YOUR API KEY";
    Hyperplane client = new Hyperplane(configuration);
    String runId = "runId_example"; // Run ID
    String moduleId = "moduleId_example"; // Module ID
    try {
      ModelsAutoMLBatchScoresCreateResponse result = client
              .autoMlService
              .rerunInferenceScores(runId)
              .moduleId(moduleId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPath());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoMlServiceApi#rerunInferenceScores");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelsAutoMLBatchScoresCreateResponse> response = client
              .autoMlService
              .rerunInferenceScores(runId)
              .moduleId(moduleId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoMlServiceApi#rerunInferenceScores");
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
| **runId** | **String**| Run ID | |
| **moduleId** | **String**| Module ID | [optional] |

### Return type

[**ModelsAutoMLBatchScoresCreateResponse**](ModelsAutoMLBatchScoresCreateResponse.md)

### Authorization

[PASETO](../README.md#PASETO)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

