# EnrichedTransactionsApi

All URIs are relative to *https://api.sandbox-65ebc.chico.ai/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getHistory**](EnrichedTransactionsApi.md#getHistory) | **GET** /user/{user_id}/transactions | Get the transaction history for a given user. |
| [**getStatistics**](EnrichedTransactionsApi.md#getStatistics) | **GET** /module/transaction-enrichment/statistics | Get statistics for transaction enrichment module. |
| [**getUserCashflowCategories**](EnrichedTransactionsApi.md#getUserCashflowCategories) | **GET** /user/{user_id}/cashflow/categories | Get a user&#39;s cashflow aggregated per category. |
| [**getUserCashflowHistory**](EnrichedTransactionsApi.md#getUserCashflowHistory) | **GET** /user/{user_id}/cashflow/history | Get the cashflow history for a given user. |
| [**getUserCashflowStatistics**](EnrichedTransactionsApi.md#getUserCashflowStatistics) | **GET** /user/{user_id}/cashflow/statistics | Get the cashflow statistics for a given user. |
| [**getUserStatistics**](EnrichedTransactionsApi.md#getUserStatistics) | **GET** /user/{user_id}/transactions/statistics | Get the transaction statistics for a given user. |
| [**listUsers**](EnrichedTransactionsApi.md#listUsers) | **GET** /module/transaction-enrichment/users | List the users in a transaction enrichment module. |


<a name="getHistory"></a>
# **getHistory**
> ModelsUserTransactionsResponse getHistory(userId, moduleId).pageNumber(pageNumber).pageSize(pageSize).startDate(startDate).endDate(endDate).flowType(flowType).minAmount(minAmount).maxAmount(maxAmount).accountType(accountType).categories(categories).searchName(searchName).execute();

Get the transaction history for a given user.

Returns the enriched transaction history of a user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Hyperplane;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EnrichedTransactionsApi;
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
    Integer pageNumber = 1; // Page number, starting at 1
    Integer pageSize = 100; // Number of elements per page
    String startDate = "startDate_example"; // Minimum transaction date to be included (e.g. '2020-09-18 10:00:00').
    String endDate = "endDate_example"; // Maximum transaction date to be included (e.g. '2020-09-18 10:00:00').
    String flowType = "flowType_example"; // The flow type from transactions to be returned, must be either 'inflow', or 'outflow'. Defaults to returning both.
    Double minAmount = 3.4D; // The minimum amount from transactions to be returned.
    Double maxAmount = 3.4D; // The maximum amount from transactions to be returned.
    String accountType = "accountType_example"; // Specifies if we must include only an specific account type.
    List<String> categories = Arrays.asList(); // List of categories to filter. Accept only category codes present on our taxonomy.
    String searchName = "searchName_example"; // Search for a specific string in the transaction description.
    try {
      ModelsUserTransactionsResponse result = client
              .enrichedTransactions
              .getHistory(userId, moduleId)
              .pageNumber(pageNumber)
              .pageSize(pageSize)
              .startDate(startDate)
              .endDate(endDate)
              .flowType(flowType)
              .minAmount(minAmount)
              .maxAmount(maxAmount)
              .accountType(accountType)
              .categories(categories)
              .searchName(searchName)
              .execute();
      System.out.println(result);
      System.out.println(result.getEnrichedTransactions());
      System.out.println(result.getPaginationMetadata());
      System.out.println(result.getUserId());
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrichedTransactionsApi#getHistory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelsUserTransactionsResponse> response = client
              .enrichedTransactions
              .getHistory(userId, moduleId)
              .pageNumber(pageNumber)
              .pageSize(pageSize)
              .startDate(startDate)
              .endDate(endDate)
              .flowType(flowType)
              .minAmount(minAmount)
              .maxAmount(maxAmount)
              .accountType(accountType)
              .categories(categories)
              .searchName(searchName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrichedTransactionsApi#getHistory");
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
| **moduleId** | **String**| Module ID | |
| **pageNumber** | **Integer**| Page number, starting at 1 | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of elements per page | [optional] [default to 100] |
| **startDate** | **String**| Minimum transaction date to be included (e.g. &#39;2020-09-18 10:00:00&#39;). | [optional] |
| **endDate** | **String**| Maximum transaction date to be included (e.g. &#39;2020-09-18 10:00:00&#39;). | [optional] |
| **flowType** | **String**| The flow type from transactions to be returned, must be either &#39;inflow&#39;, or &#39;outflow&#39;. Defaults to returning both. | [optional] |
| **minAmount** | **Double**| The minimum amount from transactions to be returned. | [optional] |
| **maxAmount** | **Double**| The maximum amount from transactions to be returned. | [optional] |
| **accountType** | **String**| Specifies if we must include only an specific account type. | [optional] |
| **categories** | [**List&lt;String&gt;**](String.md)| List of categories to filter. Accept only category codes present on our taxonomy. | [optional] |
| **searchName** | **String**| Search for a specific string in the transaction description. | [optional] |

### Return type

[**ModelsUserTransactionsResponse**](ModelsUserTransactionsResponse.md)

### Authorization

[PASETO](../README.md#PASETO)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getStatistics"></a>
# **getStatistics**
> ModelsTransactionEnrichmentStatisticsResponse getStatistics(moduleId).execute();

Get statistics for transaction enrichment module.

Retrieves statistics about a transaction enrichment module. The payload includes the number of distinct users and number of transactions.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Hyperplane;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EnrichedTransactionsApi;
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
      ModelsTransactionEnrichmentStatisticsResponse result = client
              .enrichedTransactions
              .getStatistics(moduleId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTransactionCount());
      System.out.println(result.getUserReach());
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrichedTransactionsApi#getStatistics");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelsTransactionEnrichmentStatisticsResponse> response = client
              .enrichedTransactions
              .getStatistics(moduleId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrichedTransactionsApi#getStatistics");
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
| **moduleId** | **String**| Module ID | |

### Return type

[**ModelsTransactionEnrichmentStatisticsResponse**](ModelsTransactionEnrichmentStatisticsResponse.md)

### Authorization

[PASETO](../README.md#PASETO)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getUserCashflowCategories"></a>
# **getUserCashflowCategories**
> ModelsUserCashflowPerCategoryResponse getUserCashflowCategories(userId, moduleId).startDate(startDate).endDate(endDate).accountType(accountType).execute();

Get a user&#39;s cashflow aggregated per category.

Detailed percentages of inflow and outflow for each category. Lists all the top level categories and the discrimination under each top level category

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Hyperplane;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EnrichedTransactionsApi;
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
    String startDate = "startDate_example"; // Minimum transaction date to be included (e.g. '2020-09-18 10:00:00').
    String endDate = "endDate_example"; // Maximum transaction date to be included (e.g. '2020-09-18 10:00:00').
    String accountType = "accountType_example"; // Specifies if we must include only an specific account type. Can be 'CREDIT_CARD', 'DEBIT_CARD', 'SAVINGS', 'CHECKING', 'INVESTMENT', 'PENSION', or 'LOAN'.
    try {
      ModelsUserCashflowPerCategoryResponse result = client
              .enrichedTransactions
              .getUserCashflowCategories(userId, moduleId)
              .startDate(startDate)
              .endDate(endDate)
              .accountType(accountType)
              .execute();
      System.out.println(result);
      System.out.println(result.getInflowCategories());
      System.out.println(result.getOutflowCategories());
      System.out.println(result.getUserId());
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrichedTransactionsApi#getUserCashflowCategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelsUserCashflowPerCategoryResponse> response = client
              .enrichedTransactions
              .getUserCashflowCategories(userId, moduleId)
              .startDate(startDate)
              .endDate(endDate)
              .accountType(accountType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrichedTransactionsApi#getUserCashflowCategories");
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
| **moduleId** | **String**| Module ID | |
| **startDate** | **String**| Minimum transaction date to be included (e.g. &#39;2020-09-18 10:00:00&#39;). | [optional] |
| **endDate** | **String**| Maximum transaction date to be included (e.g. &#39;2020-09-18 10:00:00&#39;). | [optional] |
| **accountType** | **String**| Specifies if we must include only an specific account type. Can be &#39;CREDIT_CARD&#39;, &#39;DEBIT_CARD&#39;, &#39;SAVINGS&#39;, &#39;CHECKING&#39;, &#39;INVESTMENT&#39;, &#39;PENSION&#39;, or &#39;LOAN&#39;. | [optional] |

### Return type

[**ModelsUserCashflowPerCategoryResponse**](ModelsUserCashflowPerCategoryResponse.md)

### Authorization

[PASETO](../README.md#PASETO)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getUserCashflowHistory"></a>
# **getUserCashflowHistory**
> ModelsUserCashflowHistoryResponse getUserCashflowHistory(userId, moduleId).startDate(startDate).endDate(endDate).aggregation(aggregation).accountType(accountType).execute();

Get the cashflow history for a given user.

Creates a cashflow timeline for a given user, aggregating all transactions in a given window. The period windows can be of 1 hour, day, week, month or year.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Hyperplane;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EnrichedTransactionsApi;
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
    String startDate = "startDate_example"; // Minimum transaction date to be included (e.g. '2020-09-18 10:00:00').
    String endDate = "endDate_example"; // Maximum transaction date to be included (e.g. '2020-09-18 10:00:00').
    String aggregation = "aggregation_example"; // How to aggregate the cashflows in periods. Can be 'HOUR', 'DAY', 'WEEK', 'MONTH', or 'YEAR'.
    String accountType = "accountType_example"; // Specifies if we must include only an specific account type. Can be 'CREDIT_CARD', 'DEBIT_CARD', 'SAVINGS', 'CHECKING', 'INVESTMENT', 'PENSION', or 'LOAN'.
    try {
      ModelsUserCashflowHistoryResponse result = client
              .enrichedTransactions
              .getUserCashflowHistory(userId, moduleId)
              .startDate(startDate)
              .endDate(endDate)
              .aggregation(aggregation)
              .accountType(accountType)
              .execute();
      System.out.println(result);
      System.out.println(result.getUserId());
      System.out.println(result.getWindows());
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrichedTransactionsApi#getUserCashflowHistory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelsUserCashflowHistoryResponse> response = client
              .enrichedTransactions
              .getUserCashflowHistory(userId, moduleId)
              .startDate(startDate)
              .endDate(endDate)
              .aggregation(aggregation)
              .accountType(accountType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrichedTransactionsApi#getUserCashflowHistory");
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
| **moduleId** | **String**| Module ID | |
| **startDate** | **String**| Minimum transaction date to be included (e.g. &#39;2020-09-18 10:00:00&#39;). | [optional] |
| **endDate** | **String**| Maximum transaction date to be included (e.g. &#39;2020-09-18 10:00:00&#39;). | [optional] |
| **aggregation** | **String**| How to aggregate the cashflows in periods. Can be &#39;HOUR&#39;, &#39;DAY&#39;, &#39;WEEK&#39;, &#39;MONTH&#39;, or &#39;YEAR&#39;. | [optional] |
| **accountType** | **String**| Specifies if we must include only an specific account type. Can be &#39;CREDIT_CARD&#39;, &#39;DEBIT_CARD&#39;, &#39;SAVINGS&#39;, &#39;CHECKING&#39;, &#39;INVESTMENT&#39;, &#39;PENSION&#39;, or &#39;LOAN&#39;. | [optional] |

### Return type

[**ModelsUserCashflowHistoryResponse**](ModelsUserCashflowHistoryResponse.md)

### Authorization

[PASETO](../README.md#PASETO)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getUserCashflowStatistics"></a>
# **getUserCashflowStatistics**
> List&lt;ModelsAccountCashflowOverview&gt; getUserCashflowStatistics(userId, moduleId).startDate(startDate).endDate(endDate).execute();

Get the cashflow statistics for a given user.

Get the cashflow statistics for a given user per account type. That includes inflow, outflow, and net cashflow for each account type.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Hyperplane;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EnrichedTransactionsApi;
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
    String startDate = "startDate_example"; // Minimum transaction date to be included (e.g. '2020-09-18 10:00:00').
    String endDate = "endDate_example"; // Maximum transaction date to be included (e.g. '2020-09-18 10:00:00').
    try {
      List<ModelsAccountCashflowOverview> result = client
              .enrichedTransactions
              .getUserCashflowStatistics(userId, moduleId)
              .startDate(startDate)
              .endDate(endDate)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrichedTransactionsApi#getUserCashflowStatistics");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ModelsAccountCashflowOverview>> response = client
              .enrichedTransactions
              .getUserCashflowStatistics(userId, moduleId)
              .startDate(startDate)
              .endDate(endDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrichedTransactionsApi#getUserCashflowStatistics");
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
| **moduleId** | **String**| Module ID | |
| **startDate** | **String**| Minimum transaction date to be included (e.g. &#39;2020-09-18 10:00:00&#39;). | [optional] |
| **endDate** | **String**| Maximum transaction date to be included (e.g. &#39;2020-09-18 10:00:00&#39;). | [optional] |

### Return type

[**List&lt;ModelsAccountCashflowOverview&gt;**](ModelsAccountCashflowOverview.md)

### Authorization

[PASETO](../README.md#PASETO)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getUserStatistics"></a>
# **getUserStatistics**
> ModelsUserTransactionsStatisticsResponse getUserStatistics(userId, moduleId).startDate(startDate).endDate(endDate).flowType(flowType).minAmount(minAmount).maxAmount(maxAmount).accountType(accountType).execute();

Get the transaction statistics for a given user.

Get the number of transactions, average transaction value and median.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Hyperplane;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EnrichedTransactionsApi;
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
    String startDate = "startDate_example"; // Minimum transaction date to be included (e.g. '2020-09-18 10:00:00').
    String endDate = "endDate_example"; // Maximum transaction date to be included (e.g. '2020-09-18 10:00:00').
    String flowType = "flowType_example"; // The flow type from transactions to be returned, must be either 'inflow', or 'outflow'. Defaults to returning both.
    Double minAmount = 3.4D; // The minimum amount from transactions to be returned.
    Double maxAmount = 3.4D; // The maximum amount from transactions to be returned.
    String accountType = "accountType_example"; // Specifies if we must include only an specific account type.
    try {
      ModelsUserTransactionsStatisticsResponse result = client
              .enrichedTransactions
              .getUserStatistics(userId, moduleId)
              .startDate(startDate)
              .endDate(endDate)
              .flowType(flowType)
              .minAmount(minAmount)
              .maxAmount(maxAmount)
              .accountType(accountType)
              .execute();
      System.out.println(result);
      System.out.println(result.getAverageTransactionValue());
      System.out.println(result.getMedianTransactionValue());
      System.out.println(result.getTransactionCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrichedTransactionsApi#getUserStatistics");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelsUserTransactionsStatisticsResponse> response = client
              .enrichedTransactions
              .getUserStatistics(userId, moduleId)
              .startDate(startDate)
              .endDate(endDate)
              .flowType(flowType)
              .minAmount(minAmount)
              .maxAmount(maxAmount)
              .accountType(accountType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrichedTransactionsApi#getUserStatistics");
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
| **moduleId** | **String**| Module ID | |
| **startDate** | **String**| Minimum transaction date to be included (e.g. &#39;2020-09-18 10:00:00&#39;). | [optional] |
| **endDate** | **String**| Maximum transaction date to be included (e.g. &#39;2020-09-18 10:00:00&#39;). | [optional] |
| **flowType** | **String**| The flow type from transactions to be returned, must be either &#39;inflow&#39;, or &#39;outflow&#39;. Defaults to returning both. | [optional] |
| **minAmount** | **Double**| The minimum amount from transactions to be returned. | [optional] |
| **maxAmount** | **Double**| The maximum amount from transactions to be returned. | [optional] |
| **accountType** | **String**| Specifies if we must include only an specific account type. | [optional] |

### Return type

[**ModelsUserTransactionsStatisticsResponse**](ModelsUserTransactionsStatisticsResponse.md)

### Authorization

[PASETO](../README.md#PASETO)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listUsers"></a>
# **listUsers**
> ModelsTransactionEnrichmentUsersResponse listUsers(moduleId).userIdPrefix(userIdPrefix).pageNumber(pageNumber).pageSize(pageSize).execute();

List the users in a transaction enrichment module.

List the users in a transaction enrichment module. Optionally, you can pass a &#x60;user_id_prefix&#x60; as a query parameter to filter users by a user ID prefix. Every user will contain their user ID, as well as their first and last transaction dates.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Hyperplane;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EnrichedTransactionsApi;
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
    String userIdPrefix = "userIdPrefix_example"; // Prefix used to filter user_id results (e.g.: prefix = '2'-> users = ['23456', '24562']).
    Integer pageNumber = 1; // Page number, starting at 1
    Integer pageSize = 100; // Number of elements per page. Defaults to 100
    try {
      ModelsTransactionEnrichmentUsersResponse result = client
              .enrichedTransactions
              .listUsers(moduleId)
              .userIdPrefix(userIdPrefix)
              .pageNumber(pageNumber)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getPaginationMetadata());
      System.out.println(result.getUsers());
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrichedTransactionsApi#listUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelsTransactionEnrichmentUsersResponse> response = client
              .enrichedTransactions
              .listUsers(moduleId)
              .userIdPrefix(userIdPrefix)
              .pageNumber(pageNumber)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EnrichedTransactionsApi#listUsers");
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
| **moduleId** | **String**| Module ID | |
| **userIdPrefix** | **String**| Prefix used to filter user_id results (e.g.: prefix &#x3D; &#39;2&#39;-&gt; users &#x3D; [&#39;23456&#39;, &#39;24562&#39;]). | [optional] |
| **pageNumber** | **Integer**| Page number, starting at 1 | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of elements per page. Defaults to 100 | [optional] [default to 100] |

### Return type

[**ModelsTransactionEnrichmentUsersResponse**](ModelsTransactionEnrichmentUsersResponse.md)

### Authorization

[PASETO](../README.md#PASETO)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

