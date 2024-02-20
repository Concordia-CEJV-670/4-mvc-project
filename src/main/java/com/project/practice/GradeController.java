package com.project.practice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GradeController {

    List<Grade> studentGrades = new ArrayList<>();

    @GetMapping("/grades")
    public String getGrades(Model model) {
        model.addAttribute("grades", studentGrades);
        return "grades";
    }

    @PostMapping("handleSubmit")
    public String submitGradeForm(Grade grade) {
        studentGrades.add(grade);
        return "redirect:/grades";
    }

    @GetMapping("/")
    public String getForm(Model model) {
        model.addAttribute("grade", new Grade());
        return "form";
    }
}
