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
	@GetMapping("/galleria")
	public String galleria() {
		return "galleria";
	}
}
//<img alt="kuva1" src="../img/galleria1.jpg" style="width:300px; height:300px;transform:rotate(90deg)">