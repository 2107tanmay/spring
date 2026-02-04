package com.controller;

import java.util.ArrayList;
import java.util.List;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.model.Candidate;
import com.service.RecruitService;
import com.validate.CustomValidator;
@Controller
public class RecruitController {

    @Autowired
    private CustomValidator custValidator;

    @Autowired
    private RecruitService service;

    @GetMapping("/home")
    public String showIndexPage() {
        return "index";
    }

    @GetMapping("/showCandidatePage")
    public String showPage(@ModelAttribute("candidate") Candidate candidate) {
        return "showPage";
    }

    @ModelAttribute("positionDtls")
    public List<String> populatePositionDtls() {
        List<String> list = new ArrayList<>();
        list.add("TL");
        list.add("PL");
        list.add("Developer");
        list.add("Tester");
        list.add("Admin");
        return list;
    }

    @PostMapping("/register")
    public String registerCandidate(@ModelAttribute("candidate") @Valid Candidate candidate,
                                    BindingResult result, ModelMap model) {

        custValidator.validate(candidate, result);

        if (result.hasErrors()) {
            return "showPage";
        }

        service.insertCandidate(candidate);
        model.addAttribute("candidateName", candidate.getCandidateName());
        return "success";
    }

    @GetMapping("/viewAllCandidateList")
    public String viewAllCandidates(ModelMap model) {
        model.addAttribute("candidates", service.viewAllCandidates());
        return "viewList";
    }
}
