package com.codegym.controller;

import com.codegym.validator.PhoneValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.codegym.model.PhoneNumber;

@Controller
public class PhoneController {

    @Autowired
    private PhoneValidator phoneValidator;

    @GetMapping("/")
    public String showForm(Model model){
        model.addAttribute("phoneNumber", new PhoneNumber());
        return "/index";
    }

    @PostMapping("/")
    public String checkValidation (@ModelAttribute("phoneNumber") PhoneNumber phoneNumber,
                                   BindingResult bindingResult){
        phoneValidator.validate(phoneNumber, bindingResult);
        if (bindingResult.hasFieldErrors()){
            return "/index";
        } else {
            return "/result";
        }
    }
}