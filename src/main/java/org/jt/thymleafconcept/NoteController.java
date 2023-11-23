package org.jt.thymleafconcept;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoteController {
    @RequestMapping
    public String home(){
        return "home";
    }
     @RequestMapping("/about")
    public String about(){
        return "about";
    }
     @RequestMapping("/contact")
    public String contact(){
        return "fragment/contact";
    }
     @RequestMapping("/show")
    public String show(){
        return "fragment/show";
    }
    @RequestMapping("/welcome")
    public String welcome(){
        return "fragment/design/welcome";
    }
}
