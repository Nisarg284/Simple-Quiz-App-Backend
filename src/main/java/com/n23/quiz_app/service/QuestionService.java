package com.n23.quiz_app.service;


import com.n23.quiz_app.entity.Question;
import com.n23.quiz_app.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepository questionRepository;




    public List<Question> getAllQuestions() {

        return questionRepository.findAll();
    }

    public List<Question> getAllQuestionsByCategory(String category) {

        return questionRepository.findQuestionsByCategory(category);
    }

    public Question addNewQuestion(Question newQuestion) {

        Question q1 = new Question();

        q1.setQuestionTitle(newQuestion.getQuestionTitle());
        q1.setOption1(newQuestion.getOption1());
        q1.setOption2(newQuestion.getOption2());
        q1.setOption3(newQuestion.getOption3());
        q1.setOption4(newQuestion.getOption4());

        q1.setRightAnswer(newQuestion.getRightAnswer());
        q1.setDifficultyLevel(newQuestion.getDifficultyLevel());
        q1.setCategory(newQuestion.getCategory());

        Question saved = questionRepository.save(q1);

        return saved;

    }
}
