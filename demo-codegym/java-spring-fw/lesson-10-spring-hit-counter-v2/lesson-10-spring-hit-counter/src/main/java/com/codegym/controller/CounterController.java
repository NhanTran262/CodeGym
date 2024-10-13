package com.codegym.controller;

import com.codegym.model.Counter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes("counter")
public class CounterController {

    @ModelAttribute("counter")
    public Counter setUpCounter() {
        return new Counter();
    }

//    @GetMapping("/")
//    public String get(@ModelAttribute("counter") Counter counter,
//                      @CookieValue(value = "cookieCounter", defaultValue = "0") Long cookieValue,
//                      Model model, HttpServletRequest req, HttpServletResponse resp) {
//        counter.increment();
//        cookieValue = (long) counter.getCount();
//
//        Cookie cookie = new Cookie("cookieCounter", cookieValue.toString());
//        cookie.setMaxAge(30);
//        resp.addCookie(cookie);
//        Cookie[] cookies = req.getCookies();
//        for (Cookie ck : cookies) {
//            if (ck.getName().equals("cookieCounter")) {
//                model.addAttribute("cookieCounter", ck);
//                break;
//            }
//        }
//        model.addAttribute("counter", counter);
//        model.addAttribute("cookieCounter", cookieValue);
//
////        HttpSession session = req.getSession();
////        session.setAttribute("sessionCounter", counter.getCount());
//        return "/index";
//    }

    @GetMapping("/")
    public String get(@ModelAttribute("counter") long counter,
                      @CookieValue(value = "cookieCounter", defaultValue = "0") Long cookieValue,
                      Model model, HttpServletRequest req, HttpServletResponse resp) {
        counter.increment();
        cookieValue = counter.getCount();

        Cookie cookie = new Cookie("cookieCounter", "0");
        cookie.setMaxAge(30);
        resp.addCookie(cookie);
        Cookie[] cookies = req.getCookies();
        for (Cookie ck : cookies) {
            if (ck.getName().equals("cookieCounter")) {
                model.addAttribute("cookieCounter", ck);
                counter = Long.parseLong(ck.getValue());
                break;
            }
        }
        return "/index";
    }
}
