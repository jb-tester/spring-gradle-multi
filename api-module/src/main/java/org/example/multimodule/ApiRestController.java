package org.example.multimodule;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiRestController {
    @GetMapping("/api/rest")
    public String apirest() {
        return "apirest";
    }
}
