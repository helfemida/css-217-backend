package com.sdu.foodorderingsystem.authcontroller;

import com.sdu.foodorderingsystem.authexceptions.AuthorizationException;
import com.sdu.foodorderingsystem.authmodels.SignUpModel;
import com.sdu.foodorderingsystem.authservice.SignUpModelService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@Transactional
public class SignUpController {
    @Autowired
    private SignUpModelService signUpService;

    @PostMapping("/signUp")
    public ResponseEntity<SignUpModel> createNewSignUpHandler(@RequestBody SignUpModel newSignUp) throws AuthorizationException {
        SignUpModel newSignedUp = signUpService.newSignUp(newSignUp);
        return new ResponseEntity<SignUpModel>(newSignedUp, HttpStatus.CREATED);
    }

    @PutMapping("/updateSignUp")
    public ResponseEntity<SignUpModel> updateSignUpDetailsHandler(@RequestBody SignUpModel signUp, @RequestParam String key) throws AuthorizationException {
        SignUpModel newUpdatedSignUp = signUpService.updateSignUp(signUp, key);
        return new ResponseEntity<SignUpModel>(newUpdatedSignUp, HttpStatus.ACCEPTED);
    }
}
