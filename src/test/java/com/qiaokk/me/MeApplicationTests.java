package com.qiaokk.me;

import com.qiaokk.me.Repertory.TestRepertory;
import com.qiaokk.me.domain.TestDomain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MeApplicationTests {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void contextLoads() {
	}


	@Autowired
	TestRepertory testRepertory;
	@Test
	public void testSave(){
		TestDomain t = testRepertory.save(new TestDomain(2,"ni"));
		logger.info(t.toString());
	}

	@Test
	public void testFindAll(){
		List<TestDomain> testDomainList = testRepertory.findAllByOrderByIdAsc();

		for (TestDomain testDomain:testDomainList
			 ) {
			logger.info(testDomain.toString());
		}
	}

}
