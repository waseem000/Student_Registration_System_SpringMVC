package com.srs.Controller;

import java.sql.SQLException;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ErrorHandlingController {

	
	@RequestMapping(value="/403", method= RequestMethod.GET)
	public String accessDeined(Model model )
	{
		System.out.println("403 ERROR Get Method");
		 model.addAttribute("Error", "You do not have permission to access this page!");
		 return ("403Page");
	}
	 @ExceptionHandler({SQLException.class,DuplicateKeyException.class})
	  public String databaseError() {
	    // Nothing to do.  Returns the logical view name of an error page, passed
	    // to the view-resolver(s) in usual way.
	    // Note that the exception is NOT available to this view (it is not added
	    // to the model) but see "Extending ExceptionHandlerExceptionResolver"
	    // below.
	    return "databaseError";
	  }
}
