package com.codegym.currencyconversion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConversionController {
    @GetMapping("/conversion")
    public String showForm() {
        return "conversion-form";
    }

    @PostMapping("/convert")
    public String convertCurrency(@RequestParam("rate") double rate,
                                  @RequestParam("usdAmount") double usdAmount,
                                  Model model) {
        double vndAmount = rate * usdAmount;
        model.addAttribute("vndAmount", vndAmount);
        return "result";
    }
}
