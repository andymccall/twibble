/**
 * 
 */
package co.twibble.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    public String listTwibbles(Model model) {
 
        List<Twibble> twibbles = twibbleService.listTwibbles();
        model.addAttribute("twibbles", twibbles);
        return "twibbles";
    }
  
    /*
     * This method will list all existing users.
     */
    
    @RequestMapping(value = { "/users" }, method = RequestMethod.GET)
    public String listUsers(Model model) {
 
        List<TwibbleUser> users = twibbleUserService.listUsers();
        model.addAttribute("users", users);
        return "users";
    }
    
 // show add user form
 	@RequestMapping(value = "/users/add", method = RequestMethod.GET)
 	public String showAddUserForm(Model model) {

 		TwibbleUser user = new TwibbleUser();

 		// set default value
 		user.setUsername("Username");
 		user.setFirstName("First Name");
 		user.setLastName("Last Name");
 		user.setEmailAddress("first.last@address.com");
 		model.addAttribute("userForm", user);

 		return "userform";

 	}

 	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public String saveOrUpdateUser(@ModelAttribute("userForm") TwibbleUser user,
			BindingResult result, Model model, 
			final RedirectAttributes redirectAttributes) {
 		
			twibbleUserService.addUser(user);
			return "redirect:/users";

		}
 	
 	@RequestMapping(value = "/users/{userId}/", method = RequestMethod.GET)
 	public String showUserForm(Model model, @PathVariable("userId") int userId) {

 		TwibbleUser user = twibbleUserService.getUserById(userId);

 		model.addAttribute("user", user);

 		return "user";

 	}
    
    @RequestMapping(value = "/users/{userId}/delete", method = RequestMethod.POST)
	public String deleteUser(@PathVariable("userId") int userId, 
		final RedirectAttributes redirectAttributes) {

		twibbleUserService.deleteUserById(userId);
		return "redirect:/users";

	}

}
