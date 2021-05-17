package com.bnj.restaurant.controller.support;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

public class BaseTest {

    @LocalServerPort
    private int serverPort;

    @Autowired @Getter
    private TestRestTemplate restTemplate;

    protected String getBaseUrl(){return String.format("http://localhost:%d/restaurant_db", serverPort);}
}
