package com.example.demo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class MainController {
    @RequestMapping(path="/greeting")
    public @ResponseBody User greeting(){
        String a="asd";
        User user=new User();
        user.setName(a);
        return user;
    }

    @RequestMapping(path="/getByName/{name}")
    public @ResponseBody User getByName(@PathVariable("name")String name){
        User user=new User();
        user.setName(name);
        return user;
    }

    @RequestMapping(path="/getById/{id}")
    public @ResponseBody User getById(@PathVariable("id")Integer id){
        User user=new User();
        user.setId(id);
        return user;
    }

    @RequestMapping(path="/getByRequestId")
    public @ResponseBody User getByRequestId(@RequestParam("id")Integer id){
        User user=new User();
        user.setId(id);
        return user;
    }

    @RequestMapping(path="/updateUser",method = RequestMethod.POST)
    public @ResponseBody User updateUser(@RequestBody User user){
        user.setName(user.getName()+"-updated");
        return user;
    }
}
