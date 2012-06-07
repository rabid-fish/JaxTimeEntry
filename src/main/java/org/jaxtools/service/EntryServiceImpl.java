package org.jaxtools.service;

import org.jaxtools.common.CommonModelService;
import org.jaxtools.domain.Entry;
import org.jaxtools.service.util.ModelServiceAbstractImpl;
import org.springframework.stereotype.Service;

@Service(value = "EntryServiceImpl")
public class EntryServiceImpl extends ModelServiceAbstractImpl<Entry> implements CommonModelService<Entry> {

	@Override
	protected Class<Entry> getServiceEntityClass() {
		return Entry.class;
	}

}
