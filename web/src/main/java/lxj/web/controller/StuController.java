/**
 * 
 */
package lxj.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import lxj.web.domain.pojo.Stu;

/**
 * @author luxj
 *
 */
@Controller
public class StuController {
	@RequestMapping(method=RequestMethod.GET, value="/stu/{id}")
	public ModelAndView getEmployee(@PathVariable String id) {
		Stu e = new Stu();
		e.setProp(id);
		return new ModelAndView("STUVIEW", "object", e);
	}
}
