package org.jaxtools.controller;

import javax.validation.Valid;

import org.jaxtools.common.CommonCrudOperations;
import org.jaxtools.common.CommonModelService;
import org.jaxtools.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/role")
public class RoleController {

	@Autowired
	@Qualifier("RoleServiceImpl")
	private CommonModelService<Role> modelService;

	private CommonCrudOperations crud = new CommonCrudOperations("role");

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list(ModelMap modelMap) {
		return crud.list(modelMap, modelService);
	}

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create(Model model) {
		return crud.create(model, new Role());
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createSave(@Valid Role role, BindingResult result) {
		return crud.createSave(result, modelService, role);
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(Model model, @RequestParam("id") Long id) {
		return crud.update(model, id, modelService);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateSave(@Valid Role role, BindingResult result) {
		return crud.updateSave(result, modelService, role);
	}
}
