package org.example.multimodule;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApiController {

    @RequestMapping("/api/view")
    public String api(ModelMap model) {
        model.addAttribute("api_attr1", "api_attr1");
        return "api_view";
    }
}
