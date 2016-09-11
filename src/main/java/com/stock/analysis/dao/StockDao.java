package com.stock.analysis.dao;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.stock.analysis.db.DataRepository;

@Component
public class StockDao {
	
	@Inject private JdbcTemplate stockJdbcTemplate;
	
	public void sampleQuery() {
		stockJdbcTemplate.update("INSERT INTO Stock VALUES ('google')");
	}
	

}
