/**
 * 
 */
package lxj.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import lxj.web.dao.FirstDao;
import lxj.web.domain.pojo.Stu;
import lxj.web.repository.FHbnRep;

/**
 * @author luxj
 *
 */
@Controller
public class StuController {
	private FirstDao userDao;
	
	public FirstDao getFirstDao() {
		return userDao;
	}
	@Autowired
	public void setFirstDao(FirstDao userDao) {
		this.userDao = userDao;
	}
	@Autowired
	private FHbnRep fHbnRep;
	
	@RequestMapping(method=RequestMethod.GET, value="/stu/{id}")	
	public ModelAndView getEmployee(@PathVariable Long id) {
		Stu e = fHbnRep.getstu(id);
		//e.setProp(id);
		return new ModelAndView("jsonView", "object", e);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/stu/add")	
	public ModelAndView addStu() {
		Long e = fHbnRep.addStu();
		//e.setProp(id);
		return new ModelAndView(new RedirectView(String.valueOf(e), false));
	}
}
