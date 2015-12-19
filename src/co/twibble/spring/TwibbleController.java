/**
 * 
 */
package co.twibble.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.twibble.spring.model.Twibble;
import co.twibble.spring.model.TwibbleUser;
import co.twibble.spring.service.TwibbleService;
import co.twibble.spring.service.TwibbleUserService;
 
/**
 * @author Andy McCall
 *
 */
@Controller
public class TwibbleController {

	@Autowired
    TwibbleService twibbleService;

	@Autowired
	TwibbleUserService twibbleUserService;
     
    @Autowired
    MessageSource messageSource;
 
    /*
     * This method will list all existing twibbles.
     */
    @RequestMapping(value = { "/", "/twibbles" }, method = RequestMethod.GET)
    public String listTwibbles(ModelMap model) {
 
        List<Twibble> twibbles = twibbleService.listTwibbles();
        model.addAttribute("twibbles", twibbles);
        return "twibbles";
    }
  
    /*
     * This method will list all existing users.
     */
    
    @RequestMapping(value = { "/users" }, method = RequestMethod.GET)
    public String listUsers(ModelMap model) {
 
        List<TwibbleUser> users = twibbleUserService.listUsers();
        model.addAttribute("users", users);
        return "users";
    }
    
    @RequestMapping(value = "/users/{userId}/delete", method = RequestMethod.POST)
	public String deleteUser(@PathVariable("userId") int userId, 
		final RedirectAttributes redirectAttributes) {

		twibbleUserService.deleteUserById(userId);
		return "redirect:/users";

	}

    
    
}
