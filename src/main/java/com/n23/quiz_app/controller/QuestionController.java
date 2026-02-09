package com.n23.quiz_app.controller;


import com.n23.quiz_app.entity.Question;
import com.n23.quiz_app.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
@RequiredArgsConstructor
public class QuestionController {


    private final QuestionService questionService;


    @PostMapping("/add")
    public Question addNewQuestion(@RequestBody Question newQuestion)
    {
        return questionService.addNewQuestion(newQuestion);
    }

    @GetMapping("/allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }


    @GetMapping("/category/{category}")
    public List<Question>getAllQuestionsByCategory(@PathVariable String category)
    {

        return questionService.getAllQuestionsByCategory(category);

    }
}
