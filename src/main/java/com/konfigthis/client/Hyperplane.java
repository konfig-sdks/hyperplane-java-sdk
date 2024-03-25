package com.konfigthis.client;

import com.konfigthis.client.api.AuthApi;
import com.konfigthis.client.api.AutoMlServiceApi;
import com.konfigthis.client.api.ClientApi;
import com.konfigthis.client.api.EnrichedTransactionsApi;
import com.konfigthis.client.api.HealthApi;
import com.konfigthis.client.api.PersonasApi;
import com.konfigthis.client.api.StatisticsApi;
import com.konfigthis.client.api.UsersApi;

public class Hyperplane {
    private ApiClient apiClient;
    public final AuthApi auth;
    public final AutoMlServiceApi autoMlService;
    public final ClientApi client;
    public final EnrichedTransactionsApi enrichedTransactions;
    public final HealthApi health;
    public final PersonasApi personas;
    public final StatisticsApi statistics;
    public final UsersApi users;

    public Hyperplane() {
        this(null);
    }

    public Hyperplane(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.auth = new AuthApi(this.apiClient);
        this.autoMlService = new AutoMlServiceApi(this.apiClient);
        this.client = new ClientApi(this.apiClient);
        this.enrichedTransactions = new EnrichedTransactionsApi(this.apiClient);
        this.health = new HealthApi(this.apiClient);
        this.personas = new PersonasApi(this.apiClient);
        this.statistics = new StatisticsApi(this.apiClient);
        this.users = new UsersApi(this.apiClient);
    }

}
