package org.jaxtools.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.jaxtools.common.CommonCrudOperations;
import org.jaxtools.common.CommonModelService;
import org.jaxtools.domain.Entry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/entry")
public class EntryController {

	@Autowired
	@Qualifier("EntryServiceImpl")
	private CommonModelService<Entry> modelService;

	private CommonCrudOperations crud = new CommonCrudOperations("entry");

	@InitBinder("entry")
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list(ModelMap modelMap) {
		return crud.list(modelMap, modelService);
	}

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create(Model model) {
		return crud.create(model, new Entry());
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createSave(@Valid Entry entry, BindingResult result) {
		return crud.createSave(result, modelService, entry);
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(Model model, @RequestParam("id") Long id) {
		return crud.update(model, id, modelService);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateSave(@Valid Entry entry, BindingResult result) {
		return crud.updateSave(result, modelService, entry);
	}
	
}
