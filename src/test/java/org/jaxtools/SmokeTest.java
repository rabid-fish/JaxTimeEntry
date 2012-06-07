package org.jaxtools;

import static org.junit.Assert.assertNotNull;

import org.jaxtools.common.CommonServiceInitializer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:/META-INF/spring/applicationContext.xml" })
public class SmokeTest {

	@Autowired
	private CommonServiceInitializer initializer;

	@Test
	public void test() {
		assertNotNull(initializer.entryService);
		assertNotNull(initializer.issueService);
		assertNotNull(initializer.projectService);
		assertNotNull(initializer.roleService);
		assertNotNull(initializer.userService);
		System.out.println("Success!");
	}
}
