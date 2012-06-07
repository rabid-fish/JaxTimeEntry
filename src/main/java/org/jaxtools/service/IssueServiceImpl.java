package org.jaxtools.service;

import org.jaxtools.common.CommonModelService;
import org.jaxtools.domain.Issue;
import org.jaxtools.service.util.ModelServiceAbstractImpl;
import org.springframework.stereotype.Service;

@Service(value = "IssueServiceImpl")
public class IssueServiceImpl extends ModelServiceAbstractImpl<Issue> implements CommonModelService<Issue> {

	@Override
	protected Class<Issue> getServiceEntityClass() {
		return Issue.class;
	}

}
