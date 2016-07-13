/**
 * 
 */
package lxj.web.controller;

/**
 * @author luxj
 *
 * */
//@Controller
//@RequestMapping("/redirect")
public class RedirectControl {
	//@RequestMapping(value = "/error.do", method = RequestMethod.POST)
	public String calculate() {
		return "redirect:/page/toList"; 
	}
}
