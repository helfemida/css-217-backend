package com.sdu.foodorderingsystem.authcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sdu.foodorderingsystem.authexceptions.AuthorizationException;
import com.sdu.foodorderingsystem.authmodels.LogInModel;
import com.sdu.foodorderingsystem.authservice.LogInModelServiceImpl;

@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    private LogInModelServiceImpl loginService;

    @PostMapping("/login")
    public String loginHandler(@RequestBody LogInModel loginData) throws AuthorizationException {
        return loginService.LogIn(loginData);
    }

    @PatchMapping("/logout")
    public String logOutFromAccount(@RequestParam String key) throws AuthorizationException {
        return loginService.LogOut(key);
    }
}
