package com.stock.analysis.db;

import javax.inject.Inject;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//@EnableConfigurationProperties
//@EnableAutoConfiguration
//@ConfigurationProperties
@Configuration
public class DataRepository {
	
	@Inject @Value("${db.stock.driver}") private String stockDbDriver;
	@Inject @Value("${db.stock.url}") private String stockDbUrl;
	@Inject @Value("${db.stock.user}") private String stockDbUser;
	@Inject @Value("${db.stock.password}") private String stockDbPassword;
	
	@Bean
	public JdbcTemplate stockJdbcTemplate() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(stockDbDriver);
		dataSource.setUrl(stockDbUrl);
		dataSource.setUsername(stockDbUser);
		dataSource.setPassword(stockDbPassword);
		return new JdbcTemplate(dataSource);
	}
	
}
