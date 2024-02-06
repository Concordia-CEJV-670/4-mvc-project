package com.project.practice;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeController {

    List<Grade> studentGrades = Arrays.asList(
            new Grade("Meli", "B+", "Math"),
            new Grade("Jack", "C-", "Physics"),
            new Grade("Nina", "A", "Biology"));

    @GetMapping("/grades")
    public String getGrades(Model model) {
        model.addAttribute("grades", studentGrades);
        return "grades";
    }
}
