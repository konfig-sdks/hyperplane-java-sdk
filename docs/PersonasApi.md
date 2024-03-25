# PersonasApi

All URIs are relative to *https://api.sandbox-65ebc.chico.ai/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDefinition**](PersonasApi.md#createDefinition) | **POST** /persona | Create a persona definition. |
| [**deleteDefinition**](PersonasApi.md#deleteDefinition) | **DELETE** /persona/{persona_id} | Delete a persona definition. |
| [**getAllFacetAttributes**](PersonasApi.md#getAllFacetAttributes) | **POST** /batch/user/personas | Get all the facet attributes for a list of users. |
| [**getPercentileScore**](PersonasApi.md#getPercentileScore) | **GET** /persona/{persona_id}/percentile_score | Fetch score on a given percentile for a persona id. |
| [**getPersonaStatistics**](PersonasApi.md#getPersonaStatistics) | **GET** /persona/{persona_id} | Fetch information and score statistics about a persona definition. |
| [**getRankedUsers**](PersonasApi.md#getRankedUsers) | **POST** /persona/{persona_id}/users | Get ranked list of users who match a persona definition. |
| [**listExisting**](PersonasApi.md#listExisting) | **GET** /persona | List existing personas. |
| [**listUserPersonas**](PersonasApi.md#listUserPersonas) | **GET** /users/{user_id}/personas | List personas associated with a user. |


<a name="createDefinition"></a>
# **createDefinition**
> ModelsPersonaCreateResponse createDefinition(modelsPersonaCreateRequest).modelVersion(modelVersion).execute();

Create a persona definition.

Creates a persona definition from a list of facet weights.  Personas enable you to define a weighted combination of interests, demographics, and financial behaviors to create highly targeted audiences for specialized use cases. They are defined using a list of facet weights, each containing a facet name and a weight. To create a persona, you must provide at least one facet weight. Each facet weight must contain a valid facet name and must be registered in the field with corresponding facet type. For example, if you want to create a persona with a facet weight for the \&quot;Travel\&quot; interest facet, you must provide a facet weight with the name \&quot;Travel\&quot; with the facet type \&quot;interest\&quot;, the facet weight must be defined in the &#x60;interest_facets&#x60; field.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Hyperplane;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PersonasApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sandbox-65ebc.chico.ai/v1";
    
    configuration.pASETO  = "YOUR API KEY";
    Hyperplane client = new Hyperplane(configuration);
    String personaName = "personaName_example"; // A name for describing this persona. Used for easy human-friendly identification.
    List<ModelsFacetWeightObject> companyFacets = Arrays.asList(); // Optional list of behavioral facet component objects. Each object outlines how a user's likelihood to consume from a particular company's products and how much it contributes to the persona definition. If left empty, no company-based scoring is done. Company facets can be found by listing personas of facet type 'company'. Facet name must be a valid company facet in the persona taxonomy.
    List<ModelsFacetWeightObject> demographicFacets = Arrays.asList(); // Optional list of interest facet component objects. Defines how much each demographic attribute (location, affluence, household composition, etc.)  weighs in the persona. If left empty, no demographic-based scoring is done. Demographic facets can be found by listing personas of facet type 'demographic'. Facet name must be a valid demographic facet in the persona taxonomy.
    List<ModelsFacetWeightObject> interestFacets = Arrays.asList(); // Optional list of interest facet component objects. Each object represents how much an interest weighs in the persona. If left empty, no interest-based scoring is done. Interests can be found by listing personas of facet type 'interest'. Facet name must be a valid interest in the persona taxonomy.
    List<String> locations = Arrays.asList(); // Optional list of zip codes or city ids to filter users by. If left empty, no location-based filtering is done.
    List<ModelsFacetWeightObject> preDefinedPersonas = Arrays.asList(); // Optional list of pre-defined persona facet component objects. Each object outlines how a pre-defined persona ('Car Owners' or 'International Travelers') contributes to the persona definition. If left empty, no predefined personas are incorporated into the persona definition. Pre-defined personas have been optimized for financial use cases and have been validated at scale. They can be found by listing personas of facet type 'pre_defined_persona'. Facet name must be a valid pre-defined persona facet in the persona taxonomy.
    String modelVersion = "\\\"latest\\\""; // Model Version
    try {
      ModelsPersonaCreateResponse result = client
              .personas
              .createDefinition(personaName)
              .companyFacets(companyFacets)
              .demographicFacets(demographicFacets)
              .interestFacets(interestFacets)
              .locations(locations)
              .preDefinedPersonas(preDefinedPersonas)
              .modelVersion(modelVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreationDatetime());
      System.out.println(result.getPersonaId());
      System.out.println(result.getPersonaName());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonasApi#createDefinition");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelsPersonaCreateResponse> response = client
              .personas
              .createDefinition(personaName)
              .companyFacets(companyFacets)
              .demographicFacets(demographicFacets)
              .interestFacets(interestFacets)
              .locations(locations)
              .preDefinedPersonas(preDefinedPersonas)
              .modelVersion(modelVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonasApi#createDefinition");
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
| **modelsPersonaCreateRequest** | [**ModelsPersonaCreateRequest**](ModelsPersonaCreateRequest.md)| Persona Request Body | |
| **modelVersion** | **String**| Model Version | [optional] [default to \&quot;latest\&quot;] |

### Return type

[**ModelsPersonaCreateResponse**](ModelsPersonaCreateResponse.md)

### Authorization

[PASETO](../README.md#PASETO)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteDefinition"></a>
# **deleteDefinition**
> String deleteDefinition(personaId).execute();

Delete a persona definition.

Deletes a custom persona for a provided &#x60;persona_id&#x60;.  Personas with facet type other than &#x60;custom&#x60; cannot be deleted. Attempting to delete a persona with facet type other than &#x60;custom&#x60; will result in a 403 Forbidden error.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Hyperplane;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PersonasApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sandbox-65ebc.chico.ai/v1";
    
    configuration.pASETO  = "YOUR API KEY";
    Hyperplane client = new Hyperplane(configuration);
    String personaId = "personaId_example"; // Persona ID
    try {
      String result = client
              .personas
              .deleteDefinition(personaId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonasApi#deleteDefinition");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .personas
              .deleteDefinition(personaId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonasApi#deleteDefinition");
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
| **personaId** | **String**| Persona ID | |

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
| **204** | Ok |  -  |

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
import com.konfigthis.client.api.PersonasApi;
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
              .personas
              .getAllFacetAttributes(userIds)
              .moduleId(moduleId)
              .month(month)
              .personaScoreThreshold(personaScoreThreshold)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonasApi#getAllFacetAttributes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ModelsUserPersonasResponse>> response = client
              .personas
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
      System.err.println("Exception when calling PersonasApi#getAllFacetAttributes");
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

<a name="getPercentileScore"></a>
# **getPercentileScore**
> ModelsPercentileScore getPercentileScore(personaId, percentile).moduleId(moduleId).month(month).execute();

Fetch score on a given percentile for a persona id.

Returns the score associated with a given percentile for a persona id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Hyperplane;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PersonasApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sandbox-65ebc.chico.ai/v1";
    
    configuration.pASETO  = "YOUR API KEY";
    Hyperplane client = new Hyperplane(configuration);
    String personaId = "personaId_example"; // Persona ID
    Double percentile = 50D; // Target percentile. Defaults to 50th percentile (i.e.: the median)
    String moduleId = "moduleId_example"; // Module ID
    String month = "month_example"; // Reference month for persona scores in `YYYY-MM` format. Defaults to current month.
    try {
      ModelsPercentileScore result = client
              .personas
              .getPercentileScore(personaId, percentile)
              .moduleId(moduleId)
              .month(month)
              .execute();
      System.out.println(result);
      System.out.println(result.getPercentile());
      System.out.println(result.getScore());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonasApi#getPercentileScore");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelsPercentileScore> response = client
              .personas
              .getPercentileScore(personaId, percentile)
              .moduleId(moduleId)
              .month(month)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonasApi#getPercentileScore");
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
| **personaId** | **String**| Persona ID | |
| **percentile** | **Double**| Target percentile. Defaults to 50th percentile (i.e.: the median) | [default to 50] |
| **moduleId** | **String**| Module ID | [optional] |
| **month** | **String**| Reference month for persona scores in &#x60;YYYY-MM&#x60; format. Defaults to current month. | [optional] |

### Return type

[**ModelsPercentileScore**](ModelsPercentileScore.md)

### Authorization

[PASETO](../README.md#PASETO)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a name="getPersonaStatistics"></a>
# **getPersonaStatistics**
> ModelsPersonaDetailsResponse getPersonaStatistics(personaId).moduleId(moduleId).month(month).personaScoreThreshold(personaScoreThreshold).execute();

Fetch information and score statistics about a persona definition.

Returns statistics and information about a persona definition.  The response includes the original persona definition, its creation date, as well as statistics about the persona&#39;s score distribution (e.g. number of users, average score, score percentiles, etc.). You can also specify the minimum persona score threshold that a user must meet to be included in the response.  You must provide a valid persona ID. Otherwise, a 404 (Not Found) error will be returned.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Hyperplane;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PersonasApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sandbox-65ebc.chico.ai/v1";
    
    configuration.pASETO  = "YOUR API KEY";
    Hyperplane client = new Hyperplane(configuration);
    String personaId = "personaId_example"; // Persona ID
    String moduleId = "moduleId_example"; // Module ID
    String month = "month_example"; // Reference month for persona scores in `YYYY-MM` format. Defaults to current month.
    Double personaScoreThreshold = 3.4D; // Minimum user persona score threshold to count a user as belonging to a persona in the response.
    try {
      ModelsPersonaDetailsResponse result = client
              .personas
              .getPersonaStatistics(personaId)
              .moduleId(moduleId)
              .month(month)
              .personaScoreThreshold(personaScoreThreshold)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreationDatetime());
      System.out.println(result.getDefinition());
      System.out.println(result.getPersonaId());
      System.out.println(result.getPersonaScoreStatistics());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonasApi#getPersonaStatistics");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelsPersonaDetailsResponse> response = client
              .personas
              .getPersonaStatistics(personaId)
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
      System.err.println("Exception when calling PersonasApi#getPersonaStatistics");
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
| **personaId** | **String**| Persona ID | |
| **moduleId** | **String**| Module ID | [optional] |
| **month** | **String**| Reference month for persona scores in &#x60;YYYY-MM&#x60; format. Defaults to current month. | [optional] |
| **personaScoreThreshold** | **Double**| Minimum user persona score threshold to count a user as belonging to a persona in the response. | [optional] |

### Return type

[**ModelsPersonaDetailsResponse**](ModelsPersonaDetailsResponse.md)

### Authorization

[PASETO](../README.md#PASETO)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a name="getRankedUsers"></a>
# **getRankedUsers**
> ModelsPersonaUsersResponse getRankedUsers(personaId, modelsPostPersonaUsersRequest).moduleId(moduleId).pageNumber(pageNumber).pageSize(pageSize).month(month).personaScoreThreshold(personaScoreThreshold).execute();

Get ranked list of users who match a persona definition.

Returns a ranked list of users who match a persona definition.  Users are sorted by their persona score, with the highest scoring users appearing first. Results are paginated by default, with 500 users per page. You can specify the page number and page size by passing the &#x60;page_number&#x60; and &#x60;page_size&#x60; query parameters. (e.g. &#x60;GET /persona/{persona_id}/users?page_number&#x3D;2&amp;page_size&#x3D;100&#x60;)  You can also specify the minimum persona score threshold that a user must meet to be included in the response. If not specified, will default to the hyperplane suggested threshold for the given persona_id.  You can also use a blocklist to exclude specific users from the response.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Hyperplane;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PersonasApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sandbox-65ebc.chico.ai/v1";
    
    configuration.pASETO  = "YOUR API KEY";
    Hyperplane client = new Hyperplane(configuration);
    List<String> blocklist = Arrays.asList(); // List of user ids to not be included in the response
    ModelsCategoricalAttributeFilter branch = new ModelsCategoricalAttributeFilter(); // Filter branch based on a list of allowed values
    String personaId = "personaId_example"; // Persona ID
    ModelsTimestampAttributeFilter birthDate = new ModelsTimestampAttributeFilter(); // Filter birth date based on a date range
    ModelsCategoricalAttributeFilter cboCode = new ModelsCategoricalAttributeFilter(); // Filter cbo code based on a list of allowed values
    ModelsNumericalAttributeFilter declaredMonthlyIncome = new ModelsNumericalAttributeFilter(); // Filter declared monthly income based on a numeric range
    ModelsCategoricalAttributeFilter jobTitle = new ModelsCategoricalAttributeFilter(); // Filter job title based on a list of allowed values
    String moduleId = "moduleId_example"; // Module ID
    Integer pageNumber = 1; // Page number, starting at 1
    Integer pageSize = 500; // Number of users scored in run per page, between 1 and 10000. Defaults to 500.
    String month = "month_example"; // Reference month for persona scores in `YYYY-MM` format. Defaults to current month.
    Double personaScoreThreshold = 3.4D; // Minimum user persona score threshold for user to be included in the response.
    try {
      ModelsPersonaUsersResponse result = client
              .personas
              .getRankedUsers(blocklist, branch, personaId)
              .birthDate(birthDate)
              .cboCode(cboCode)
              .declaredMonthlyIncome(declaredMonthlyIncome)
              .jobTitle(jobTitle)
              .moduleId(moduleId)
              .pageNumber(pageNumber)
              .pageSize(pageSize)
              .month(month)
              .personaScoreThreshold(personaScoreThreshold)
              .execute();
      System.out.println(result);
      System.out.println(result.getUsers());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonasApi#getRankedUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelsPersonaUsersResponse> response = client
              .personas
              .getRankedUsers(blocklist, branch, personaId)
              .birthDate(birthDate)
              .cboCode(cboCode)
              .declaredMonthlyIncome(declaredMonthlyIncome)
              .jobTitle(jobTitle)
              .moduleId(moduleId)
              .pageNumber(pageNumber)
              .pageSize(pageSize)
              .month(month)
              .personaScoreThreshold(personaScoreThreshold)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonasApi#getRankedUsers");
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
| **personaId** | **String**| Persona ID | |
| **modelsPostPersonaUsersRequest** | [**ModelsPostPersonaUsersRequest**](ModelsPostPersonaUsersRequest.md)| Optional user filters | |
| **moduleId** | **String**| Module ID | [optional] |
| **pageNumber** | **Integer**| Page number, starting at 1 | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of users scored in run per page, between 1 and 10000. Defaults to 500. | [optional] [default to 500] |
| **month** | **String**| Reference month for persona scores in &#x60;YYYY-MM&#x60; format. Defaults to current month. | [optional] |
| **personaScoreThreshold** | **Double**| Minimum user persona score threshold for user to be included in the response. | [optional] |

### Return type

[**ModelsPersonaUsersResponse**](ModelsPersonaUsersResponse.md)

### Authorization

[PASETO](../README.md#PASETO)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a name="listExisting"></a>
# **listExisting**
> ModelsListPersonasResponse listExisting().facetTypes(facetTypes).moduleId(moduleId).pageNumber(pageNumber).pageSize(pageSize).execute();

List existing personas.

Lists all existing personas.  Personas are sorted by creation date, with the most recently created personas appearing first. By default, all personas are returned. However, you can specify the type of personas you want by passing specific facet types as a query parameter. (e.g. &#x60;GET /persona?facet_types&#x3D;interest,demographic&#x60;) Optionally, you can paginate the results by specifying the &#x60;page_number&#x60; and &#x60;page_size&#x60; query parameters. If either &#x60;page_number&#x60; and &#x60;page_size&#x60; are not specified, all personas will be returned.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Hyperplane;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PersonasApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sandbox-65ebc.chico.ai/v1";
    
    configuration.pASETO  = "YOUR API KEY";
    Hyperplane client = new Hyperplane(configuration);
    String facetTypes = "facetTypes_example"; // Comma-separated facet types to select. By default, all personas are returned. Valid facet types are: interest, demographic, pre_defined_persona, custom.
    String moduleId = "moduleId_example"; // Module ID
    Integer pageNumber = 1; // Page number, starting at 1
    Integer pageSize = 56; // Number of personas per page, between 1 and 10000. Will return all personas if not specified.
    try {
      ModelsListPersonasResponse result = client
              .personas
              .listExisting()
              .facetTypes(facetTypes)
              .moduleId(moduleId)
              .pageNumber(pageNumber)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getPersonas());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonasApi#listExisting");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelsListPersonasResponse> response = client
              .personas
              .listExisting()
              .facetTypes(facetTypes)
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
      System.err.println("Exception when calling PersonasApi#listExisting");
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
| **facetTypes** | **String**| Comma-separated facet types to select. By default, all personas are returned. Valid facet types are: interest, demographic, pre_defined_persona, custom. | [optional] |
| **moduleId** | **String**| Module ID | [optional] |
| **pageNumber** | **Integer**| Page number, starting at 1 | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of personas per page, between 1 and 10000. Will return all personas if not specified. | [optional] |

### Return type

[**ModelsListPersonasResponse**](ModelsListPersonasResponse.md)

### Authorization

[PASETO](../README.md#PASETO)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of personas available in the database. |  -  |

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
import com.konfigthis.client.api.PersonasApi;
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
              .personas
              .listUserPersonas(userId)
              .moduleId(moduleId)
              .month(month)
              .personaScoreThreshold(personaScoreThreshold)
              .execute();
      System.out.println(result);
      System.out.println(result.getPersonaScores());
      System.out.println(result.getUserId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonasApi#listUserPersonas");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelsUserPersonasResponse> response = client
              .personas
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
      System.err.println("Exception when calling PersonasApi#listUserPersonas");
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

