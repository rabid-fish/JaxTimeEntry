package org.jaxtools.service;

import org.jaxtools.common.CommonModelService;
import org.jaxtools.domain.Project;
import org.jaxtools.service.util.ModelServiceAbstractImpl;
import org.springframework.stereotype.Service;

@Service(value = "ProjectServiceImpl")
public class ProjectServiceImpl extends ModelServiceAbstractImpl<Project> implements CommonModelService<Project> {

	@Override
	protected Class<Project> getServiceEntityClass() {
		return Project.class;
	}

}
