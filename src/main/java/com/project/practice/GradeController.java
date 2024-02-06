package com.project.practice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeController {

    List<Grade> studentGrades = new ArrayList<>();

    @GetMapping("/grades")
    public String getGrades(Model model) {
        studentGrades.add(new Grade("Meli", "B+", "Math"));
        studentGrades.add(new Grade("Jack", "C-", "Physics"));
        studentGrades.add(new Grade("Nina", "A", "Biology"));
        model.addAttribute("grades", studentGrades);
        return "grades";
    }
}
