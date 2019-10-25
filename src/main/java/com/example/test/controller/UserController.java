package com.example.test.controller;
import com.example.test.entity.User;
import com.example.test.service.UserService;
import com.example.test.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/login")
    Result  login (User user){
        System.out.println(user);
      Object obj=  userService.login(user);
        return Result.success(obj);
    }
    @GetMapping("/loginout")
    boolean  loginout (){
//        System.out.println(id+name);
        return true;
    }
    @PostMapping("/add")
    Result add(User user){
        boolean result = userService.addUser(user);
        if(result){
            return Result.success(result);
        }else{
            return Result.error();
        }
    }
    @PutMapping("/update")
    Result  update(User user){
        if(userService.updateUser(user)){
            return Result.success();
        }else{
            return Result.error();
        }
    }
    @DeleteMapping("/delete/{id}")
    Result  delete(@PathVariable("id") String id){
        if(userService.deleteUser(id)){
            return Result.success();
        }else {
            return Result.error();
        }
    }
    @GetMapping ("/selectById/{id}")
    Result  selectById(@PathVariable("id") String id){
        return Result.success(userService.selectById(id));
    }
    @GetMapping("/test")
    public String test(){
        return  "qqqqqqqqqqqqq";
    }
}


