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
import com.konfigthis.client.model.ModelsAccountCashflowOverview;
import com.konfigthis.client.model.ModelsTransactionEnrichmentStatisticsResponse;
import com.konfigthis.client.model.ModelsTransactionEnrichmentUsersResponse;
import com.konfigthis.client.model.ModelsUserCashflowHistoryResponse;
import com.konfigthis.client.model.ModelsUserCashflowPerCategoryResponse;
import com.konfigthis.client.model.ModelsUserTransactionsResponse;
import com.konfigthis.client.model.ModelsUserTransactionsStatisticsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EnrichedTransactionsApi
 */
@Disabled
public class EnrichedTransactionsApiTest {

    private static EnrichedTransactionsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new EnrichedTransactionsApi(apiClient);
    }

    /**
     * Get the transaction history for a given user.
     *
     * Returns the enriched transaction history of a user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHistoryTest() throws ApiException {
        String userId = null;
        String moduleId = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        String startDate = null;
        String endDate = null;
        String flowType = null;
        Double minAmount = null;
        Double maxAmount = null;
        String accountType = null;
        List<String> categories = null;
        String searchName = null;
        ModelsUserTransactionsResponse response = api.getHistory(userId, moduleId)
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
        // TODO: test validations
    }

    /**
     * Get statistics for transaction enrichment module.
     *
     * Retrieves statistics about a transaction enrichment module. The payload includes the number of distinct users and number of transactions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStatisticsTest() throws ApiException {
        String moduleId = null;
        ModelsTransactionEnrichmentStatisticsResponse response = api.getStatistics(moduleId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a user&#39;s cashflow aggregated per category.
     *
     * Detailed percentages of inflow and outflow for each category. Lists all the top level categories and the discrimination under each top level category
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserCashflowCategoriesTest() throws ApiException {
        String userId = null;
        String moduleId = null;
        String startDate = null;
        String endDate = null;
        String accountType = null;
        ModelsUserCashflowPerCategoryResponse response = api.getUserCashflowCategories(userId, moduleId)
                .startDate(startDate)
                .endDate(endDate)
                .accountType(accountType)
                .execute();
        // TODO: test validations
    }

    /**
     * Get the cashflow history for a given user.
     *
     * Creates a cashflow timeline for a given user, aggregating all transactions in a given window. The period windows can be of 1 hour, day, week, month or year.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserCashflowHistoryTest() throws ApiException {
        String userId = null;
        String moduleId = null;
        String startDate = null;
        String endDate = null;
        String aggregation = null;
        String accountType = null;
        ModelsUserCashflowHistoryResponse response = api.getUserCashflowHistory(userId, moduleId)
                .startDate(startDate)
                .endDate(endDate)
                .aggregation(aggregation)
                .accountType(accountType)
                .execute();
        // TODO: test validations
    }

    /**
     * Get the cashflow statistics for a given user.
     *
     * Get the cashflow statistics for a given user per account type. That includes inflow, outflow, and net cashflow for each account type.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserCashflowStatisticsTest() throws ApiException {
        String userId = null;
        String moduleId = null;
        String startDate = null;
        String endDate = null;
        List<ModelsAccountCashflowOverview> response = api.getUserCashflowStatistics(userId, moduleId)
                .startDate(startDate)
                .endDate(endDate)
                .execute();
        // TODO: test validations
    }

    /**
     * Get the transaction statistics for a given user.
     *
     * Get the number of transactions, average transaction value and median.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserStatisticsTest() throws ApiException {
        String userId = null;
        String moduleId = null;
        String startDate = null;
        String endDate = null;
        String flowType = null;
        Double minAmount = null;
        Double maxAmount = null;
        String accountType = null;
        ModelsUserTransactionsStatisticsResponse response = api.getUserStatistics(userId, moduleId)
                .startDate(startDate)
                .endDate(endDate)
                .flowType(flowType)
                .minAmount(minAmount)
                .maxAmount(maxAmount)
                .accountType(accountType)
                .execute();
        // TODO: test validations
    }

    /**
     * List the users in a transaction enrichment module.
     *
     * List the users in a transaction enrichment module. Optionally, you can pass a &#x60;user_id_prefix&#x60; as a query parameter to filter users by a user ID prefix. Every user will contain their user ID, as well as their first and last transaction dates.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUsersTest() throws ApiException {
        String moduleId = null;
        String userIdPrefix = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        ModelsTransactionEnrichmentUsersResponse response = api.listUsers(moduleId)
                .userIdPrefix(userIdPrefix)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

}
