package org.jaxtools.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

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
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/calendarDay")
public class CalendarDayController {

	@Autowired
	@Qualifier("EntryServiceImpl")
	private CommonModelService<Entry> entryService;
	
	@InitBinder("entry")
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list(ModelMap modelMap) {

		List<Entry> entries = entryService.list();
		if (entries.size() == 0) {
			modelMap.addAttribute("message", "No entries exist yet, please create one");
		}
		
		return new ModelAndView("calendarDay/calendarDayList", "entries", entries);
	}

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create(Model model) {
		model.addAttribute(new Entry());
		return "calendarDay/calendarDayEdit";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@Valid Entry entry, BindingResult result) {
		if (result.hasErrors()) {
            return "calendarDay/calendarDayEdit";
        }
		entryService.insert(entry);
        return "redirect:list";
	}
}
