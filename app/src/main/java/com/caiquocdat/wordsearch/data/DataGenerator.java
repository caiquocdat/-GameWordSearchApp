package com.caiquocdat.wordsearch.data;

import com.caiquocdat.wordsearch.model.QuestionModel;
import com.caiquocdat.wordsearch.model.WordModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class DataGenerator {
    private static List<QuestionModel> questions =getEasyQuestions();
    private static Random random = new Random();
    public static List<QuestionModel> generateQuestions() {
        List<QuestionModel> questions = new ArrayList<>();

        // Here you can add your Questions and corresponding words
        // Example:

        List<WordModel> wordsForQuestion1 = Arrays.asList(
                new WordModel(1, "O", 1),
                new WordModel(2, "N", 1),
                new WordModel(3, "I", 1),
                new WordModel(4, "H", 1),
                new WordModel(5, "L", 1),
                new WordModel(6, "G", 1),
                new WordModel(7, "A", 1),
                new WordModel(8, "E", 1),
                new WordModel(9, "U", 1),
                new WordModel(10, "Y", 1));
        List<String> listWordAnswer_1 = Arrays.asList("N", "G", "U", "A");
        QuestionModel question1 = new QuestionModel(1, "Một con ___ đau, cả tàu bỏ cỏ", listWordAnswer_1, "easy",wordsForQuestion1);
        questions.add(question1);

        List<WordModel> wordsForQuestion2 = Arrays.asList(
                new WordModel(11, "O", 2),
                new WordModel(12, "U", 2),
                new WordModel(13, "I", 2),
                new WordModel(14, "B", 2),
                new WordModel(15, "L", 2),
                new WordModel(16, "N", 2),
                new WordModel(17, "A", 2),
                new WordModel(18, "E", 2),
                new WordModel(19, "X", 2),
                new WordModel(20, "Y", 2));
        List<String> listWordAnswer_2 = Arrays.asList("B", "A", "O");
        QuestionModel question2 = new QuestionModel(2, "Ác giả ác ___",listWordAnswer_2,"easy", wordsForQuestion2);
        questions.add(question2);
        List<WordModel> wordsForQuestion3 = Arrays.asList(
                new WordModel(21, "O", 3),
                new WordModel(22, "R", 3),
                new WordModel(23, "I", 3),
                new WordModel(24, "B", 3),
                new WordModel(25, "T", 3),
                new WordModel(26, "N", 3),
                new WordModel(27, "A", 3),
                new WordModel(28, "E", 3),
                new WordModel(29, "G", 3),
                new WordModel(30, "Y", 3));
        List<String> listWordAnswer_3 = Arrays.asList("T", "R", "O", "N","G");
        QuestionModel question3 = new QuestionModel(3, "Ăn quả nhớ kẻ ____ cây",listWordAnswer_3,"easy", wordsForQuestion3);
        questions.add(question3);
        List<WordModel> wordsForQuestion4 = Arrays.asList(
                new WordModel(31, "O", 4),
                new WordModel(32, "R", 4),
                new WordModel(33, "I", 4),
                new WordModel(34, "B", 4),
                new WordModel(35, "T", 4),
                new WordModel(36, "N", 4),
                new WordModel(37, "A", 4),
                new WordModel(38, "E", 4),
                new WordModel(39, "G", 4),
                new WordModel(40, "Y", 4));
        List<String> listWordAnswer_4 = Arrays.asList("R", "A", "O");
        QuestionModel question4 = new QuestionModel(4, "Ăn cây nào ___ cây nấy",listWordAnswer_4,"easy", wordsForQuestion4);
        questions.add(question4);
        List<WordModel> wordsForQuestion5 = Arrays.asList(
                new WordModel(41, "O", 5),
                new WordModel(42, "R", 5),
                new WordModel(43, "I", 5),
                new WordModel(44, "B", 5),
                new WordModel(45, "T", 5),
                new WordModel(46, "N", 5),
                new WordModel(47, "A", 5),
                new WordModel(48, "E", 5),
                new WordModel(49, "D", 5),
                new WordModel(50, "Y", 5));
        List<String> listWordAnswer_5 = Arrays.asList("D", "A");
        QuestionModel question5 = new QuestionModel(4, "Ăn cháo ___ bát",listWordAnswer_5,"easy", wordsForQuestion5);
        questions.add(question5);
        List<WordModel> wordsForQuestion6 = Arrays.asList(
                new WordModel(51, "O", 6),
                new WordModel(52, "R", 6),
                new WordModel(53, "I", 6),
                new WordModel(54, "H", 6),
                new WordModel(55, "T", 6),
                new WordModel(56, "N", 6),
                new WordModel(57, "A", 6),
                new WordModel(58, "E", 6),
                new WordModel(59, "D", 6),
                new WordModel(60, "Y", 6));
        List<String> listWordAnswer_6 = Arrays.asList("H", "A", "Y");
        QuestionModel question6 = new QuestionModel(6, "Ăn vóc học ___",listWordAnswer_6,"easy", wordsForQuestion6);
        questions.add(question6);
        List<WordModel> wordsForQuestion7 = Arrays.asList(
                new WordModel(61, "O", 7),
                new WordModel(62, "R", 7),
                new WordModel(63, "I", 7),
                new WordModel(64, "H", 7),
                new WordModel(65, "T", 7),
                new WordModel(66, "N", 7),
                new WordModel(67, "A", 7),
                new WordModel(68, "E", 7),
                new WordModel(69, "D", 7),
                new WordModel(70, "Y", 7));
        List<String> listWordAnswer_7 = Arrays.asList("H", "A", "Y");
        QuestionModel question7 = new QuestionModel(7, "Ác nhân tự ___ ác nhân ma",listWordAnswer_7,"hard", wordsForQuestion7);
        questions.add(question7);



        // Add as many questions as you need

        return questions;
    }
    public static List<QuestionModel> getEasyQuestions() {
        List<QuestionModel> allQuestions = generateQuestions();

        List<QuestionModel> easyQuestions = allQuestions.stream()
                .filter(question -> "easy".equals(question.getTypeQuestion()))
                .collect(Collectors.toList());

        return easyQuestions;
    }
    public static QuestionModel getRandomNewQuestion() {
        int randomIndex = random.nextInt(questions.size());
        QuestionModel randomQuestion = questions.get(randomIndex);
        // Shuffle the words
        Collections.shuffle(randomQuestion.getWords());
        return randomQuestion;

    }

    public static QuestionModel getRandomQuestion() {
        if (questions.size() == 0) {
            // throw an exception or return null if there are no more questions
            throw new RuntimeException("No more questions available");
        }

        int randomIndex = random.nextInt(questions.size());
        QuestionModel randomQuestion = questions.get(randomIndex);

        // Shuffle the words
        Collections.shuffle(randomQuestion.getWords());

        // Remove the selected question from the list
        questions.remove(randomIndex);

        return randomQuestion;
    }
    public static void resetQuestions() {
        questions = generateQuestions();
    }
}
