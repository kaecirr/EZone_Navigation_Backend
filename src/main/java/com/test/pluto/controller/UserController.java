package com.test.pluto.controller;

import com.test.pluto.entity.User;
import com.test.pluto.service.UserService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * Description: UserController is just for test. Never used in Ezone project.
 *
 * @author Yuntian
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    private User user;

    @RequestMapping("/getPerson/{name}")
    @ResponseBody
    public String getPerson(@PathVariable("name") String name, Model model) throws JSONException{
        //System.out.println("!!!!!!!!!!!!!!!!!!!!!this is " + this.userService.getUserByName(name).getPassword());
        //model.addAttribute("message", this.userService.getUserByName(name).getPassword());

        user = this.userService.getUserByName(name);
        JSONArray userArray = new JSONArray();
        JSONObject userJSON = new JSONObject();
        userJSON.put("name", user.getName());
        userJSON.put("password", user.getPassword());
        userArray.put(userJSON);

        return userArray.toString();
    }

    @Autowired(required=true)
    public void setUserService(UserService userService){
        this.userService = userService;
    }

    @RequestMapping("/hello")
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }
}
