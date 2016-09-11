package com.stock.analysis.dao;

import javax.inject.Inject;
import javax.servlet.annotation.WebInitParam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class) @ActiveProfiles
@SpringBootTest
public class StockDaoTest {

	@Inject private StockDao stockDao;
	
	@Test
	public void stockDaoTest() {
		stockDao.sampleQuery();
	}
	
}
