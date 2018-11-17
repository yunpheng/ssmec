package com.ssm.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/mt")
public class Test {

    /*@Autowired
    private UserService userService;

    @RequestMapping("/test")
    public ModelAndView test() {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("ids", "1");
        List<Map<String, Object>> users = userService.findUsers(param);
        return new ModelAndView("test")
                .addObject("name", users.get(0).get("NAME"));
    }

    @RequestMapping("/test2")
    public ModelAndView test2() {
        Map<String, Object> param = new HashMap<String, Object>();
        List<Map<String, Object>> users = userService.findUsers(param);
        return new ModelAndView("test2")
                .addObject("users", users);
    }*/

}
