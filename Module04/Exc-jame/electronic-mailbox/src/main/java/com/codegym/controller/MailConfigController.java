package com.codegym.controller;

import com.codegym.model.MailConfig;
import com.codegym.service.IMailConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/config")
public class MailConfigController {
    @Autowired
    private IMailConfigService mailConfigService;

    @GetMapping("/")
    public String showMailConfig(Model model) {
        model.addAttribute("mailConfigs", mailConfigService.getAll());
        return "/list";
    }

    @GetMapping("/edit")
    public ModelAndView showFormEdit(@RequestParam int id) {
        ModelAndView modelAndView = new ModelAndView("/form");
        MailConfig mailConfig = mailConfigService.getById(id);
        modelAndView.addObject("mailConfig", mailConfig);
        modelAndView.addObject("languages", mailConfigService.languages());
        modelAndView.addObject("pageSizes", mailConfigService.pageSizes());
        return modelAndView;
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("mailConfig") MailConfig mailConfig, RedirectAttributes redirectAttributes) {
        mailConfigService.edit(mailConfig);
        redirectAttributes.addFlashAttribute("message", "Update successfully!");
        return "redirect:/config/";
    }
}
