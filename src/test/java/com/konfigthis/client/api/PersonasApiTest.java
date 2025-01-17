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
import com.konfigthis.client.model.ModelsBatchUserPersonasRequest;
import com.konfigthis.client.model.ModelsCategoricalAttributeFilter;
import com.konfigthis.client.model.ModelsFacetWeightObject;
import com.konfigthis.client.model.ModelsListPersonasResponse;
import com.konfigthis.client.model.ModelsNumericalAttributeFilter;
import com.konfigthis.client.model.ModelsPercentileScore;
import com.konfigthis.client.model.ModelsPersonaCreateRequest;
import com.konfigthis.client.model.ModelsPersonaCreateResponse;
import com.konfigthis.client.model.ModelsPersonaDetailsResponse;
import com.konfigthis.client.model.ModelsPersonaUsersResponse;
import com.konfigthis.client.model.ModelsPostPersonaUsersRequest;
import com.konfigthis.client.model.ModelsTimestampAttributeFilter;
import com.konfigthis.client.model.ModelsUserPersonasResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PersonasApi
 */
@Disabled
public class PersonasApiTest {

    private static PersonasApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PersonasApi(apiClient);
    }

    /**
     * Create a persona definition.
     *
     * Creates a persona definition from a list of facet weights.  Personas enable you to define a weighted combination of interests, demographics, and financial behaviors to create highly targeted audiences for specialized use cases. They are defined using a list of facet weights, each containing a facet name and a weight. To create a persona, you must provide at least one facet weight. Each facet weight must contain a valid facet name and must be registered in the field with corresponding facet type. For example, if you want to create a persona with a facet weight for the \&quot;Travel\&quot; interest facet, you must provide a facet weight with the name \&quot;Travel\&quot; with the facet type \&quot;interest\&quot;, the facet weight must be defined in the &#x60;interest_facets&#x60; field.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createDefinitionTest() throws ApiException {
        String personaName = null;
        List<ModelsFacetWeightObject> companyFacets = null;
        List<ModelsFacetWeightObject> demographicFacets = null;
        List<ModelsFacetWeightObject> interestFacets = null;
        List<String> locations = null;
        List<ModelsFacetWeightObject> preDefinedPersonas = null;
        String modelVersion = null;
        ModelsPersonaCreateResponse response = api.createDefinition(personaName)
                .companyFacets(companyFacets)
                .demographicFacets(demographicFacets)
                .interestFacets(interestFacets)
                .locations(locations)
                .preDefinedPersonas(preDefinedPersonas)
                .modelVersion(modelVersion)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a persona definition.
     *
     * Deletes a custom persona for a provided &#x60;persona_id&#x60;.  Personas with facet type other than &#x60;custom&#x60; cannot be deleted. Attempting to delete a persona with facet type other than &#x60;custom&#x60; will result in a 403 Forbidden error.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteDefinitionTest() throws ApiException {
        String personaId = null;
        String response = api.deleteDefinition(personaId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the facet attributes for a list of users.
     *
     * Returns all personas associated with a user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllFacetAttributesTest() throws ApiException {
        List<String> userIds = null;
        String moduleId = null;
        String month = null;
        Double personaScoreThreshold = null;
        List<ModelsUserPersonasResponse> response = api.getAllFacetAttributes(userIds)
                .moduleId(moduleId)
                .month(month)
                .personaScoreThreshold(personaScoreThreshold)
                .execute();
        // TODO: test validations
    }

    /**
     * Fetch score on a given percentile for a persona id.
     *
     * Returns the score associated with a given percentile for a persona id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPercentileScoreTest() throws ApiException {
        String personaId = null;
        Double percentile = null;
        String moduleId = null;
        String month = null;
        ModelsPercentileScore response = api.getPercentileScore(personaId, percentile)
                .moduleId(moduleId)
                .month(month)
                .execute();
        // TODO: test validations
    }

    /**
     * Fetch information and score statistics about a persona definition.
     *
     * Returns statistics and information about a persona definition.  The response includes the original persona definition, its creation date, as well as statistics about the persona&#39;s score distribution (e.g. number of users, average score, score percentiles, etc.). You can also specify the minimum persona score threshold that a user must meet to be included in the response.  You must provide a valid persona ID. Otherwise, a 404 (Not Found) error will be returned.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPersonaStatisticsTest() throws ApiException {
        String personaId = null;
        String moduleId = null;
        String month = null;
        Double personaScoreThreshold = null;
        ModelsPersonaDetailsResponse response = api.getPersonaStatistics(personaId)
                .moduleId(moduleId)
                .month(month)
                .personaScoreThreshold(personaScoreThreshold)
                .execute();
        // TODO: test validations
    }

    /**
     * Get ranked list of users who match a persona definition.
     *
     * Returns a ranked list of users who match a persona definition.  Users are sorted by their persona score, with the highest scoring users appearing first. Results are paginated by default, with 500 users per page. You can specify the page number and page size by passing the &#x60;page_number&#x60; and &#x60;page_size&#x60; query parameters. (e.g. &#x60;GET /persona/{persona_id}/users?page_number&#x3D;2&amp;page_size&#x3D;100&#x60;)  You can also specify the minimum persona score threshold that a user must meet to be included in the response. If not specified, will default to the hyperplane suggested threshold for the given persona_id.  You can also use a blocklist to exclude specific users from the response.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRankedUsersTest() throws ApiException {
        List<String> blocklist = null;
        ModelsCategoricalAttributeFilter branch = null;
        String personaId = null;
        ModelsTimestampAttributeFilter birthDate = null;
        ModelsCategoricalAttributeFilter cboCode = null;
        ModelsNumericalAttributeFilter declaredMonthlyIncome = null;
        ModelsCategoricalAttributeFilter jobTitle = null;
        String moduleId = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        String month = null;
        Double personaScoreThreshold = null;
        ModelsPersonaUsersResponse response = api.getRankedUsers(blocklist, branch, personaId)
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
        // TODO: test validations
    }

    /**
     * List existing personas.
     *
     * Lists all existing personas.  Personas are sorted by creation date, with the most recently created personas appearing first. By default, all personas are returned. However, you can specify the type of personas you want by passing specific facet types as a query parameter. (e.g. &#x60;GET /persona?facet_types&#x3D;interest,demographic&#x60;) Optionally, you can paginate the results by specifying the &#x60;page_number&#x60; and &#x60;page_size&#x60; query parameters. If either &#x60;page_number&#x60; and &#x60;page_size&#x60; are not specified, all personas will be returned.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listExistingTest() throws ApiException {
        String facetTypes = null;
        String moduleId = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        ModelsListPersonasResponse response = api.listExisting()
                .facetTypes(facetTypes)
                .moduleId(moduleId)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

    /**
     * List personas associated with a user.
     *
     * Returns a list of personas and their scores for a given user. Personas are sorted by their persona score, in descending order.  You can also specify the minimum persona score threshold that a user must meet to be included in the response. Defaults to hyperplane&#39;s suggested threshold to determine if the user belongs to the persona.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUserPersonasTest() throws ApiException {
        String userId = null;
        String moduleId = null;
        String month = null;
        Double personaScoreThreshold = null;
        ModelsUserPersonasResponse response = api.listUserPersonas(userId)
                .moduleId(moduleId)
                .month(month)
                .personaScoreThreshold(personaScoreThreshold)
                .execute();
        // TODO: test validations
    }

}
