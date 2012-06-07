package org.jaxtools.service;

import org.jaxtools.common.CommonModelService;
import org.jaxtools.domain.Role;
import org.jaxtools.service.util.ModelServiceAbstractImpl;
import org.springframework.stereotype.Service;

@Service(value = "RoleServiceImpl")
public class RoleServiceImpl extends ModelServiceAbstractImpl<Role> implements CommonModelService<Role> {

	@Override
	protected Class<Role> getServiceEntityClass() {
		return Role.class;
	}

}
