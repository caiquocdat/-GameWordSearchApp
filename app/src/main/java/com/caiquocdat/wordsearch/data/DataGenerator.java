package com.caiquocdat.wordsearch.data;

import android.util.Log;

import com.caiquocdat.wordsearch.model.QuestionModel;
import com.caiquocdat.wordsearch.model.WordModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class DataGenerator {
    private static List<QuestionModel> easyQuestions = getEasyQuestions() ;
    private static List<QuestionModel> hardQuestions = getHardQuestions() ;
    private static List<QuestionModel> verryHardQuestions = getVeryHardQuestions() ;
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
        List<String> listWordAnswer_7 = Arrays.asList("D", "O", "I");
        QuestionModel question7 = new QuestionModel(7, "Ai giàu ba họ, ai khó ba ___",listWordAnswer_7,"easy", wordsForQuestion7);
        questions.add(question7);
        List<WordModel> wordsForQuestion8 = Arrays.asList(
                new WordModel(71, "O", 8),
                new WordModel(72, "U", 8),
                new WordModel(73, "I", 8),
                new WordModel(74, "H", 8),
                new WordModel(75, "T", 8),
                new WordModel(76, "N", 8),
                new WordModel(77, "A", 8),
                new WordModel(78, "E", 8),
                new WordModel(79, "D", 8),
                new WordModel(80, "Y", 8));
        List<String> listWordAnswer_8 = Arrays.asList("D", "A", "U");
        QuestionModel question8 = new QuestionModel(8, "Áo mặc sao qua khỏi ___",listWordAnswer_8,"easy", wordsForQuestion8);
        questions.add(question8);
        List<WordModel> wordsForQuestion9 = Arrays.asList(
                new WordModel(81, "O", 9),
                new WordModel(82, "U", 9),
                new WordModel(83, "I", 9),
                new WordModel(84, "H", 9),
                new WordModel(85, "T", 9),
                new WordModel(86, "N", 9),
                new WordModel(87, "A", 9),
                new WordModel(88, "E", 9),
                new WordModel(89, "D", 9),
                new WordModel(90, "Y", 9));
        List<String> listWordAnswer_9 = Arrays.asList("T", "O", "T");
        QuestionModel question9 = new QuestionModel(9, "Ao sâu ___ cá",listWordAnswer_9,"easy", wordsForQuestion9);
        questions.add(question9);
        List<WordModel> wordsForQuestion10 = Arrays.asList(
                new WordModel(91, "O", 10),
                new WordModel(92, "U", 10),
                new WordModel(93, "I", 10),
                new WordModel(94, "H", 10),
                new WordModel(95, "T", 10),
                new WordModel(96, "N", 10),
                new WordModel(97, "A", 10),
                new WordModel(98, "E", 10),
                new WordModel(99, "D", 10),
                new WordModel(100, "Y", 10));
        List<String> listWordAnswer_10 = Arrays.asList("D", "E");
        QuestionModel question10 = new QuestionModel(10, "Dễ người ___ ta",listWordAnswer_10,"easy", wordsForQuestion10);
        questions.add(question10);
        List<WordModel> wordsForQuestion11 = Arrays.asList(
                new WordModel(101, "O", 11),
                new WordModel(102, "U", 11),
                new WordModel(103, "I", 11),
                new WordModel(104, "H", 11),
                new WordModel(105, "T", 11),
                new WordModel(106, "N", 11),
                new WordModel(107, "A", 11),
                new WordModel(108, "E", 11),
                new WordModel(109, "D", 11),
                new WordModel(110, "Y", 11));
        List<String> listWordAnswer_11 = Arrays.asList("D", "E");
        QuestionModel question11 = new QuestionModel(11, "Dễ người ___ ta",listWordAnswer_11,"hard", wordsForQuestion11);
        questions.add(question11);
        List<WordModel> wordsForQuestion12 = Arrays.asList(
                new WordModel(111, "D", 12),
                new WordModel(112, "A", 12),
                new WordModel(113, "O", 12),
                new WordModel(114, "R", 12),
                new WordModel(115, "I", 12),
                new WordModel(116, "T", 12),
                new WordModel(117, "N", 12),
                new WordModel(118, "H", 12),
                new WordModel(119, "E", 12),
                new WordModel(120, "U", 12)
        );
        List<String> listWordAnswer_12 = Arrays.asList("D", "A", "T");
        QuestionModel question12 = new QuestionModel(12, "Dục tốc bất ___",listWordAnswer_12,"hard", wordsForQuestion12);
        questions.add(question12);

        List<WordModel> wordsForQuestion13 = Arrays.asList(
                new WordModel(121, "N", 13),
                new WordModel(122, "A", 13),
                new WordModel(123, "O", 13),
                new WordModel(124, "I", 13),
                new WordModel(125, "G", 13),
                new WordModel(126, "H", 13),
                new WordModel(127, "K", 13),
                new WordModel(128, "B", 13),
                new WordModel(129, "E", 13),
                new WordModel(130, "U", 13)
        );
        List<String> listWordAnswer_13 = Arrays.asList("K", "H", "O","N","G");
        QuestionModel question13 = new QuestionModel(13, "Được ăn cả, ngã về ___",listWordAnswer_13,"hard", wordsForQuestion13);
        questions.add(question13);
        List<WordModel> wordsForQuestion14 = Arrays.asList(
                new WordModel(131, "D", 14),
                new WordModel(132, "A", 14),
                new WordModel(133, "M", 14),
                new WordModel(134, "N", 14),
                new WordModel(135, "I", 14),
                new WordModel(136, "G", 14),
                new WordModel(137, "H", 14),
                new WordModel(138, "O", 14),
                new WordModel(139, "Y", 14),
                new WordModel(140, "U", 14)
        );
        List<String> listWordAnswer_14 = Arrays.asList("G", "A", "O");
        QuestionModel question14 = new QuestionModel(14, "Anh em ___, đạo ngãi tiền",listWordAnswer_14,"hard", wordsForQuestion14);
        questions.add(question14);

        List<WordModel> wordsForQuestion15 = Arrays.asList(
                new WordModel(141, "D", 15),
                new WordModel(142, "A", 15),
                new WordModel(143, "M", 15),
                new WordModel(144, "U", 15),
                new WordModel(145, "I", 15),
                new WordModel(146, "H", 15),
                new WordModel(147, "N", 15),
                new WordModel(148, "T", 15),
                new WordModel(149, "O", 15),
                new WordModel(150, "Y", 15)
        );
        List<String> listWordAnswer_15 = Arrays.asList("M", "A", "U");
        QuestionModel question15 = new QuestionModel(15, "Anh em hạt ___ sẻ đôi",listWordAnswer_15,"hard", wordsForQuestion15);
        questions.add(question15);

        List<WordModel> wordsForQuestion16 = Arrays.asList(
                new WordModel(151, "O", 16),
                new WordModel(152, "C", 16),
                new WordModel(153, "G", 16),
                new WordModel(154, "A", 16),
                new WordModel(155, "I", 16),
                new WordModel(156, "H", 16),
                new WordModel(157, "N", 16),
                new WordModel(158, "T", 16),
                new WordModel(159, "U", 16),
                new WordModel(160, "Y", 16)
        );
        List<String> listWordAnswer_16 = Arrays.asList("N", "H", "U");
        QuestionModel question16 = new QuestionModel(16, "Anh em ___ chân tay",listWordAnswer_16,"hard", wordsForQuestion16);
        questions.add(question16);

        List<WordModel> wordsForQuestion17 = Arrays.asList(
                new WordModel(161, "O", 17),
                new WordModel(162, "N", 17),
                new WordModel(163, "G", 17),
                new WordModel(164, "H", 17),
                new WordModel(165, "I", 17),
                new WordModel(166, "T", 17),
                new WordModel(167, "A", 17),
                new WordModel(168, "C", 17),
                new WordModel(169, "U", 17),
                new WordModel(170, "Y", 17)
        );
        List<String> listWordAnswer_17 = Arrays.asList("H", "O", "N");
        QuestionModel question17 = new QuestionModel(17, "Ẵm con chồng ___ bồng cháu ngoại",listWordAnswer_17,"hard", wordsForQuestion17);
        questions.add(question17);

        List<WordModel> wordsForQuestion18 = Arrays.asList(
                new WordModel(171, "O", 18),
                new WordModel(172, "T", 18),
                new WordModel(173, "G", 18),
                new WordModel(174, "R", 18),
                new WordModel(175, "I", 18),
                new WordModel(176, "H", 18),
                new WordModel(177, "A", 18),
                new WordModel(178, "N", 18),
                new WordModel(179, "D", 18),
                new WordModel(180, "Y", 18)
        );
        List<String> listWordAnswer_18 = Arrays.asList("N", "H", "O");
        QuestionModel question18 = new QuestionModel(18, "Ăn bát cơm dẻo, ___ nẻo đường đi",listWordAnswer_18,"hard", wordsForQuestion18);
        questions.add(question18);

        List<WordModel> wordsForQuestion19 = Arrays.asList(
                new WordModel(181, "O", 19),
                new WordModel(182, "M", 19),
                new WordModel(183, "G", 19),
                new WordModel(184, "P", 19),
                new WordModel(185, "I", 19),
                new WordModel(186, "L", 19),
                new WordModel(187, "A", 19),
                new WordModel(188, "H", 19),
                new WordModel(189, "N", 19),
                new WordModel(190, "D", 19)
        );
        List<String> listWordAnswer_19 = Arrays.asList("H", "O", "P");
        QuestionModel question19 = new QuestionModel(19, "Ăn bụi tre, dè bụi ___",listWordAnswer_19,"hard", wordsForQuestion19);
        questions.add(question19);

        List<WordModel> wordsForQuestion20 = Arrays.asList(
                new WordModel(191, "O", 20),
                new WordModel(192, "N", 20),
                new WordModel(193, "G", 20),
                new WordModel(194, "T", 20),
                new WordModel(195, "I", 20),
                new WordModel(196, "H", 20),
                new WordModel(197, "A", 20),
                new WordModel(198, "C", 20),
                new WordModel(199, "U", 20),
                new WordModel(200, "Y", 20)
        );
        List<String> listWordAnswer_20 = Arrays.asList("N", "O", "I");
        QuestionModel question20 = new QuestionModel(20, "Ăn có nhai, ___ có nghĩ",listWordAnswer_20,"hard", wordsForQuestion20);
        questions.add(question20);
        List<WordModel> wordsForQuestion21 = Arrays.asList(
                new WordModel(201, "O", 21),
                new WordModel(202, "M", 21),
                new WordModel(203, "G", 21),
                new WordModel(204, "T", 21),
                new WordModel(205, "I", 21),
                new WordModel(206, "H", 21),
                new WordModel(207, "A", 21),
                new WordModel(208, "C", 21),
                new WordModel(209, "U", 21),
                new WordModel(210, "Y", 21)
        );
        List<String> listWordAnswer_21 = Arrays.asList("T", "H", "A","M");
        QuestionModel question21 = new QuestionModel(21, "Ăn cơm mắm ___ về lâu.",listWordAnswer_21,"veryhard", wordsForQuestion21);
        questions.add(question21);
        List<WordModel> wordsForQuestion22 = Arrays.asList(
                new WordModel(211, "A", 22),
                new WordModel(212, "N", 22),
                new WordModel(213, "G", 22),
                new WordModel(214, "C", 22),
                new WordModel(215, "I", 22),
                new WordModel(216, "H", 22),
                new WordModel(217, "O", 22),
                new WordModel(218, "T", 22),
                new WordModel(219, "U", 22),
                new WordModel(220, "Y", 22)
        );
        List<String> listWordAnswer_22 = Arrays.asList("N", "O", "N");
        QuestionModel question22 = new QuestionModel(22, "Ăn nể ngồi không, ___ đồng cũng lở", listWordAnswer_22,"veryhard", wordsForQuestion22);
        questions.add(question22);

        List<WordModel> wordsForQuestion23 = Arrays.asList(
                new WordModel(221, "A", 23),
                new WordModel(222, "M", 23),
                new WordModel(223, "G", 23),
                new WordModel(224, "L", 23),
                new WordModel(225, "I", 23),
                new WordModel(226, "H", 23),
                new WordModel(227, "O", 23),
                new WordModel(228, "N", 23),
                new WordModel(229, "G", 23),
                new WordModel(230, "Y", 23)
        );
        List<String> listWordAnswer_23 = Arrays.asList("M", "A", "N");
        QuestionModel question23 = new QuestionModel(23, "Ăn ở trần, ___ mặc áo", listWordAnswer_23,"veryhard", wordsForQuestion23);
        questions.add(question23);

        List<WordModel> wordsForQuestion24 = Arrays.asList(
                new WordModel(231, "A", 24),
                new WordModel(232, "M", 24),
                new WordModel(233, "G", 24),
                new WordModel(234, "C", 24),
                new WordModel(235, "I", 24),
                new WordModel(236, "H", 24),
                new WordModel(237, "O", 24),
                new WordModel(238, "N", 24),
                new WordModel(239, "G", 24),
                new WordModel(240, "Y", 24)
        );
        List<String> listWordAnswer_24 = Arrays.asList("N", "H", "I", "N");
        QuestionModel question24 = new QuestionModel(24, "Ăn quen, ___ không quen", listWordAnswer_24,"veryhard", wordsForQuestion24);
        questions.add(question24);

        List<WordModel> wordsForQuestion25 = Arrays.asList(
                new WordModel(241, "A", 25),
                new WordModel(242, "M", 25),
                new WordModel(243, "G", 25),
                new WordModel(244, "C", 25),
                new WordModel(245, "I", 25),
                new WordModel(246, "H", 25),
                new WordModel(247, "O", 25),
                new WordModel(248, "N", 25),
                new WordModel(249, "G", 25),
                new WordModel(250, "Y", 25)
        );
        List<String> listWordAnswer_25 = Arrays.asList("N","G", "A", "I");
        QuestionModel question25 = new QuestionModel(25, "Ăn sung giả ___", listWordAnswer_25,"veryhard", wordsForQuestion25);
        questions.add(question25);

        List<WordModel> wordsForQuestion26 = Arrays.asList(
                new WordModel(251, "A", 26),
                new WordModel(252, "M", 26),
                new WordModel(253, "G", 26),
                new WordModel(254, "D", 26),
                new WordModel(255, "I", 26),
                new WordModel(256, "H", 26),
                new WordModel(257, "O", 26),
                new WordModel(258, "T", 26),
                new WordModel(259, "G", 26),
                new WordModel(260, "Y", 26)
        );
        List<String> listWordAnswer_26 = Arrays.asList("T", "O", "I");
        QuestionModel question26 = new QuestionModel(26, "Bẻ hành bẻ ___", listWordAnswer_26,"veryhard", wordsForQuestion26);
        questions.add(question26);

        List<WordModel> wordsForQuestion27 = Arrays.asList(
                new WordModel(261, "A", 27),
                new WordModel(262, "M", 27),
                new WordModel(263, "G", 27),
                new WordModel(264, "C", 27),
                new WordModel(265, "I", 27),
                new WordModel(266, "H", 27),
                new WordModel(267, "O", 27),
                new WordModel(268, "N", 27),
                new WordModel(269, "G", 27),
                new WordModel(270, "Y", 27)
        );
        List<String> listWordAnswer_27 = Arrays.asList("O", "C");
        QuestionModel question27 = new QuestionModel(27, "Bình phong cẩn ___ xà cừ, vợ hư rầy vợ đừng từ mẹ cha", listWordAnswer_27,"veryhard", wordsForQuestion27);
        questions.add(question27);

        List<WordModel> wordsForQuestion28 = Arrays.asList(
                new WordModel(271, "A", 28),
                new WordModel(272, "M", 28),
                new WordModel(273, "G", 28),
                new WordModel(274, "T", 28),
                new WordModel(275, "I", 28),
                new WordModel(276, "H", 28),
                new WordModel(277, "O", 28),
                new WordModel(278, "N", 28),
                new WordModel(279, "G", 28),
                new WordModel(280, "Y", 28)
        );
        List<String> listWordAnswer_28 = Arrays.asList("N", "G", "O","I");
        QuestionModel question28 = new QuestionModel(28, "Bói rẻ còn hơn ___ không", listWordAnswer_28,"veryhard", wordsForQuestion28);
        questions.add(question28);

        List<WordModel> wordsForQuestion29 = Arrays.asList(
                new WordModel(281, "A", 29),
                new WordModel(282, "M", 29),
                new WordModel(283, "G", 29),
                new WordModel(284, "T", 29),
                new WordModel(285, "I", 29),
                new WordModel(286, "H", 29),
                new WordModel(287, "O", 29),
                new WordModel(288, "N", 29),
                new WordModel(289, "G", 29),
                new WordModel(290, "Y", 29)
        );
        List<String> listWordAnswer_29 = Arrays.asList("N", "G","O","A", "I");
        QuestionModel question29 = new QuestionModel(29, "Bụt nhà không thiêng, đi cầu Thích Ca ___ đường", listWordAnswer_29,"veryhard", wordsForQuestion29);
        questions.add(question29);

        List<WordModel> wordsForQuestion30 = Arrays.asList(
                new WordModel(291, "A", 30),
                new WordModel(292, "M", 30),
                new WordModel(293, "G", 30),
                new WordModel(294, "B", 30),
                new WordModel(295, "I", 30),
                new WordModel(296, "T", 30),
                new WordModel(297, "O", 30),
                new WordModel(298, "N", 30),
                new WordModel(299, "R", 30),
                new WordModel(300, "E", 30)
        );
        List<String> listWordAnswer_30 = Arrays.asList("T","R","E", "O");
        QuestionModel question30 = new QuestionModel(30, "Buộc cổ mèo, ___ cổ chó", listWordAnswer_30,"veryhard", wordsForQuestion30);
        questions.add(question30);


        return questions;
    }
    public static List<QuestionModel> getEasyQuestions() {
        List<QuestionModel> allQuestions = generateQuestions();
        Log.d("Test_6", "size: "+allQuestions.size());

        List<QuestionModel> easyQuestions = allQuestions.stream()
                .filter(question -> "easy".equals(question.getTypeQuestion()))
                .collect(Collectors.toList());
        Log.d("Test_6", "size: "+easyQuestions.size());

        return easyQuestions;
    }
    public static List<QuestionModel> getHardQuestions() {
        List<QuestionModel> allQuestions = generateQuestions();
        Log.d("Test_6", "size: "+allQuestions.size());

        List<QuestionModel> easyQuestions = allQuestions.stream()
                .filter(question -> "hard".equals(question.getTypeQuestion()))
                .collect(Collectors.toList());
        Log.d("Test_6", "size: "+easyQuestions.size());

        return easyQuestions;
    }
    public static List<QuestionModel> getVeryHardQuestions() {
        List<QuestionModel> allQuestions = generateQuestions();
        Log.d("Test_6", "size: "+allQuestions.size());

        List<QuestionModel> easyQuestions = allQuestions.stream()
                .filter(question -> "veryhard".equals(question.getTypeQuestion()))
                .collect(Collectors.toList());
        Log.d("Test_6", "size: "+easyQuestions.size());

        return easyQuestions;
    }

    public static QuestionModel getRandomEasyQuestion() {
        if (easyQuestions.size() == 0) {
            // throw an exception or return null if there are no more questions
            throw new RuntimeException("No more questions available");
        }

        int randomIndex = random.nextInt(easyQuestions.size());
        QuestionModel randomQuestion = easyQuestions.get(randomIndex);

        // Shuffle the words
        Collections.shuffle(randomQuestion.getWords());

        // Remove the selected question from the list
        easyQuestions.remove(randomIndex);

        return randomQuestion;
    }
    public static void resetEasyQuestions() {
        easyQuestions = getEasyQuestions();
    }
    public static QuestionModel getRandomHardQuestion() {
        if (hardQuestions.size() == 0) {
            // throw an exception or return null if there are no more questions
            throw new RuntimeException("No more questions available");
        }

        int randomIndex = random.nextInt(hardQuestions.size());
        QuestionModel randomQuestion = hardQuestions.get(randomIndex);

        // Shuffle the words
        Collections.shuffle(randomQuestion.getWords());

        // Remove the selected question from the list
        hardQuestions.remove(randomIndex);

        return randomQuestion;
    }
    public static void resetHardQuestions() {
        hardQuestions = getHardQuestions();
    }
    public static QuestionModel getRandomVeryHardQuestion() {
        if (verryHardQuestions.size() == 0) {
            // throw an exception or return null if there are no more questions
            throw new RuntimeException("No more questions available");
        }

        int randomIndex = random.nextInt(verryHardQuestions.size());
        QuestionModel randomQuestion = verryHardQuestions.get(randomIndex);

        // Shuffle the words
        Collections.shuffle(randomQuestion.getWords());

        // Remove the selected question from the list
        verryHardQuestions.remove(randomIndex);

        return randomQuestion;
    }
    public static void resetVeryHardQuestions() {
        verryHardQuestions = getVeryHardQuestions();
    }
}
