package com.avoid.playtolearn.game;

import com.avoid.playtolearn.models.Category;
import com.avoid.playtolearn.models.Difficulty;
import com.avoid.playtolearn.models.Question;

import java.util.ArrayList;
import java.util.Random;

public class QuestionLogic {
    public static Category getRandomCategory() {
        Random random = new Random();
        int i = random.nextInt(2);

        if (i == 0) {
            return Category.Loops;
        } else {
            return Category.Conditional_Structures;
        }
    }

    public static Difficulty getRandomDifficulty() {
        Random random = new Random();
        int i = random.nextInt(2);

        if (i == 0) {
//            return Difficulty.Very_easy;
            return Difficulty.Easy;
        } else if (i == 1) {
            return Difficulty.Easy;
        } else if (i == 2) {
            return Difficulty.Medium;
        } else if (i == 3) {
            return Difficulty.Hard;
        } else if (i == 4) {
//            return Difficulty.Very_hard;
            return Difficulty.Medium;
        } else {
//            return Difficulty.Expert;
            return Difficulty.Hard;
        }
    }

    public static Question getRandomQuestion() {
        Category category = getRandomCategory();
        Difficulty difficulty = getRandomDifficulty();

        ArrayList<Question> tempQuestionList = new ArrayList<>();
        for (Question question : QuestionCache.getQuestionArrayList()) {
            if (question.getCategory() == category && question.getDifficulty() == difficulty) {
                tempQuestionList.add(question);
            }
        }

        Random random = new Random();
        int i = random.nextInt(tempQuestionList.size());
        return tempQuestionList.get(i);
    }
}
