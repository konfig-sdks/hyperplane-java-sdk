package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://api.sandbox-65ebc.chico.ai/v1";
        
        configuration.pASETO  = "YOUR API KEY";
        Hyperplane client = new Hyperplane(configuration);
        assertNotNull(client);
    }
}
