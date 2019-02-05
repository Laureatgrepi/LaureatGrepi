package Laureatgrepi.Laureatgrepi.WebController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	@GetMapping("/index")
	public String indexPage() {
		return "index";
	}
	@GetMapping("/contact")
	public String contactPage() {
		return "contact";
	}
	@GetMapping("/CV")
	public String cv() {
		return "CV";
	}
	@GetMapping("/gallery")
	public String galleria() {
		return "gallery";
	}
	@GetMapping("/testailu")
	public String test() {
		return "testailu";
	}
}
