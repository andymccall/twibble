/**
 * 
 */
package co.twibble.spring.cli;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import co.twibble.spring.configuration.TwibbleConfig;
import co.twibble.spring.model.Twibble;
import co.twibble.spring.service.TwibbleService;

/**
 * @author Andy McCall
 *
 */
public class TwibbleCLI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(TwibbleConfig.class);

		TwibbleService service = (TwibbleService) context.getBean("twibbleService");

		/*
		 * Create Twibble1
		 */
		Twibble twibble1 = new Twibble();
		twibble1.setTwibble("This is the first ever twibble!");

		/*
		 * Create Twibble2
		 */
		Twibble twibble2 = new Twibble();
		twibble2.setTwibble("This is the second ever twibble, not quite as impressive, but still...");

		/*
		 * Persist both Twibbles
		 */
		service.addTwibble(twibble1);
		service.addTwibble(twibble2);

		/*
		 * Get all Twibbles list from database
		 */
		List<Twibble> twibbleList = service.listTwibbles();
		for (Twibble twibble : twibbleList) {
			System.out.println(twibble);
		}

		context.close();
	}

}
