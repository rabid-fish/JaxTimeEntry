package org.jaxtools.service;

import org.jaxtools.common.CommonModelService;
import org.jaxtools.domain.User;
import org.jaxtools.service.util.ModelServiceAbstractImpl;
import org.springframework.stereotype.Service;

@Service(value = "UserServiceImpl")
public class UserServiceImpl extends ModelServiceAbstractImpl<User> implements CommonModelService<User> {

	@Override
	protected Class<User> getServiceEntityClass() {
		return User.class;
	}

}
