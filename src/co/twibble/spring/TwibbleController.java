/**
 * 
 */
package co.twibble.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
import co.twibble.spring.model.Twibble;
import co.twibble.spring.service.TwibbleService;
 
/**
 * @author Andy McCall
 *
 */
@Controller
@RequestMapping("/")
public class TwibbleController {

	@Autowired
    TwibbleService service;
     
    @Autowired
    MessageSource messageSource;
 
    /*
     * This method will list all existing employees.
     */
    @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
    public String listTwibbles(ModelMap model) {
 
        List<Twibble> twibbles = service.listTwibbles();
        model.addAttribute("twibbles", twibbles);
        return "twibbles";
    }
}
