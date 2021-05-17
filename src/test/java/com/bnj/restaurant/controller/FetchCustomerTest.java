package com.bnj.restaurant.controller;

import com.bnj.restaurant.controller.support.FetchCustomerSupport;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.jdbc.JdbcTestUtils;
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class FetchCustomerTest extends FetchCustomerSupport {

    private JdbcTemplate jdbcTemplate;

    @Test
    void testDb(){
        int numRows = JdbcTestUtils.countRowsInTable(jd)
    }
}
