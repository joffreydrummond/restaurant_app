package com.bnj.restaurant.controller;

import com.bnj.restaurant.ActiveProfile;
import com.bnj.restaurant.controller.support.FetchCustomerSupport;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.jdbc.JdbcTestUtils;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
//@ActiveProfiles("test")
//@Sql(scripts = {"classpath:data/V1.1__Restaurant_Data.sql", "classpath:data/V1.0__Restaurant_Schema.sql"}, config =
//@SqlConfig(encoding = "utf-8"))
public class FetchCustomerTest extends FetchCustomerSupport {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  @Test
  void testDb() {
    int numRows = JdbcTestUtils.countRowsInTable(jdbcTemplate, "customers");
    System.out.println("Num: " + numRows);
  }
}
