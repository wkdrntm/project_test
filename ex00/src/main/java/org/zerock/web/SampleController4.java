package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class SampleController4 {
	
	public static final Logger logger
		= LoggerFactory.getLogger(SampleController4.class);
	
	
	@RequestMapping("/doE")
	public String doE(RedirectAttributes asdf) {
		logger.info("doE colled but redirect go /doF...............");
		asdf.addFlashAttribute("msg", "This is the Message!! with redirected");
		return "redirect:/doF";
		
	}
	
	@RequestMapping("/doF")
	public void doF(@ModelAttribute String msg) {
		logger.info ("doF called.............." + msg);
	}
	
}
