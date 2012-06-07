package org.jaxtools.common;

import java.math.BigDecimal;
import java.util.Date;

import org.jaxtools.domain.Entry;
import org.jaxtools.domain.Issue;
import org.jaxtools.domain.Project;
import org.jaxtools.domain.Role;
import org.jaxtools.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value = "CommonServiceInitializer")
public class CommonServiceInitializer {

	@Autowired
	@Qualifier("EntryServiceImpl")
	public CommonModelService<Entry> entryService;

	@Autowired
	@Qualifier("IssueServiceImpl")
	public CommonModelService<Issue> issueService;

	@Autowired
	@Qualifier("ProjectServiceImpl")
	public CommonModelService<Project> projectService;

	@Autowired
	@Qualifier("RoleServiceImpl")
	public CommonModelService<Role> roleService;

	@Autowired
	@Qualifier("UserServiceImpl")
	public CommonModelService<User> userService;

	public void init() {

		Project project = new Project();
		project.setId(0l);
		project.setTitle("My First Project");
		project.setDescription("My First Project Description");
		projectService.insert(project);

		Issue issue = new Issue();
		issue.setId(0l);
		issue.setProjectId(0l);
		issue.setTitle("My First Issue");
		issue.setDescription("My First Issue Description");
		issueService.insert(issue);

		Role role = new Role();
		role.setId(0l);
		role.setName("My First Role");
		roleService.insert(role);

		User user1 = new User();
		user1.setId(0l);
		user1.setFullname("John Smith");
		user1.setUsername("jsmith");
		user1.setPassword("password");
		userService.insert(user1);

		User user2 = new User();
		user2.setId(1l);
		user2.setFullname("Jane Doe");
		user2.setUsername("jdoe");
		user2.setPassword("money");
		userService.insert(user2);

		User user3 = new User();
		user3.setId(2l);
		user3.setFullname("John Deer");
		user3.setUsername("jdeer");
		user3.setPassword("abcdefg");
		userService.insert(user3);

		Entry entry = new Entry();
		entry.setId(0l);
		entry.setIssueId(0l);
		entry.setUserId(0l);
		entry.setEntryDate(new Date());
		entry.setHours(new BigDecimal("4.0"));
		entryService.insert(entry);
	}
}
