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
        QuestionModel question11 = new QuestionModel(11, "Dễ người ___ ta",listWordAnswer_11,"easy", wordsForQuestion11);
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
        QuestionModel question12 = new QuestionModel(12, "Dục tốc bất ___",listWordAnswer_12,"easy", wordsForQuestion12);
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
        QuestionModel question13 = new QuestionModel(13, "Được ăn cả, ngã về ___",listWordAnswer_13,"easy", wordsForQuestion13);
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
        QuestionModel question14 = new QuestionModel(14, "Anh em ___, đạo ngãi tiền",listWordAnswer_14,"easy", wordsForQuestion14);
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
        QuestionModel question15 = new QuestionModel(15, "Anh em hạt ___ sẻ đôi",listWordAnswer_15,"easy", wordsForQuestion15);
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
        QuestionModel question16 = new QuestionModel(16, "Anh em ___ chân tay",listWordAnswer_16,"easy", wordsForQuestion16);
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
        QuestionModel question17 = new QuestionModel(17, "Ẵm con chồng ___ bồng cháu ngoại",listWordAnswer_17,"easy", wordsForQuestion17);
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
        QuestionModel question18 = new QuestionModel(18, "Ăn bát cơm dẻo, ___ nẻo đường đi",listWordAnswer_18,"easy", wordsForQuestion18);
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
        QuestionModel question19 = new QuestionModel(19, "Ăn bụi tre, dè bụi ___",listWordAnswer_19,"easy", wordsForQuestion19);
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
        List<WordModel> wordsForQuestion31 = Arrays.asList(
                new WordModel(301, "A", 31),
                new WordModel(302, "B", 31),
                new WordModel(303, "G", 31),
                new WordModel(304, "D", 31),
                new WordModel(305, "I", 31),
                new WordModel(306, "H", 31),
                new WordModel(307, "C", 31),
                new WordModel(308, "N", 31),
                new WordModel(309, "R", 31),
                new WordModel(310, "E", 31)
        );
        List<String> listWordAnswer_31 = Arrays.asList("G", "A");
        QuestionModel question31 = new QuestionModel(31, "Bút sa, ___ chết", listWordAnswer_31,"veryhard", wordsForQuestion31);
        questions.add(question31);

        List<WordModel> wordsForQuestion32 = Arrays.asList(
                new WordModel(311, "A", 32),
                new WordModel(312, "B", 32),
                new WordModel(313, "G", 32),
                new WordModel(314, "D", 32),
                new WordModel(315, "V", 32),
                new WordModel(316, "H", 32),
                new WordModel(317, "O", 32),
                new WordModel(318, "N", 32),
                new WordModel(319, "R", 32),
                new WordModel(320, "E", 32)
        );
        List<String> listWordAnswer_32 = Arrays.asList("V", "O","N");
        QuestionModel question32 = new QuestionModel(32, "Cả ___ lớn lãi", listWordAnswer_32,"veryhard", wordsForQuestion32);
        questions.add(question32);

        List<WordModel> wordsForQuestion33 = Arrays.asList(
                new WordModel(321, "A", 33),
                new WordModel(322, "B", 33),
                new WordModel(323, "G", 33),
                new WordModel(324, "D", 33),
                new WordModel(325, "I", 33),
                new WordModel(326, "H", 33),
                new WordModel(327, "O", 33),
                new WordModel(328, "N", 33),
                new WordModel(329, "R", 33),
                new WordModel(330, "E", 33)
        );
        List<String> listWordAnswer_33 = Arrays.asList("B", "O");
        QuestionModel question33 = new QuestionModel(33, "Cái khó ___ cái khôn", listWordAnswer_33,"veryhard", wordsForQuestion33);
        questions.add(question33);

        List<WordModel> wordsForQuestion34 = Arrays.asList(
                new WordModel(331, "A", 34),
                new WordModel(332, "B", 34),
                new WordModel(333, "G", 34),
                new WordModel(334, "D", 34),
                new WordModel(335, "I", 34),
                new WordModel(336, "H", 34),
                new WordModel(337, "O", 34),
                new WordModel(338, "N", 34),
                new WordModel(339, "T", 34),
                new WordModel(340, "E", 34)
        );
        List<String> listWordAnswer_34 = Arrays.asList("N", "E","T");
        QuestionModel question34 = new QuestionModel(34, "Cái ___ đánh chết cái đẹp", listWordAnswer_34,"veryhard", wordsForQuestion34);
        questions.add(question34);

        List<WordModel> wordsForQuestion35 = Arrays.asList(
                new WordModel(341, "A", 35),
                new WordModel(342, "B", 35),
                new WordModel(343, "G", 35),
                new WordModel(344, "D", 35),
                new WordModel(345, "I", 35),
                new WordModel(346, "H", 35),
                new WordModel(347, "O", 35),
                new WordModel(348, "N", 35),
                new WordModel(349, "U", 35),
                new WordModel(350, "E", 35)
        );
        List<String> listWordAnswer_35 = Arrays.asList("B", "A", "U");
        QuestionModel question35 = new QuestionModel(35, "Cắt dây ___ dây bí, ai nỡ cắt dây chị dây em", listWordAnswer_35,"veryhard", wordsForQuestion35);
        questions.add(question35);

        List<WordModel> wordsForQuestion36 = Arrays.asList(
                new WordModel(351, "A", 36),
                new WordModel(352, "B", 36),
                new WordModel(353, "G", 36),
                new WordModel(354, "D", 36),
                new WordModel(355, "I", 36),
                new WordModel(356, "H", 36),
                new WordModel(357, "O", 36),
                new WordModel(358, "T", 36),
                new WordModel(359, "R", 36),
                new WordModel(360, "E", 36)
        );
        List<String> listWordAnswer_36 = Arrays.asList("T", "A", "I");
        QuestionModel question36 = new QuestionModel(36, "Cần ___, cải nhừ", listWordAnswer_36,"veryhard", wordsForQuestion36);
        questions.add(question36);

        List<WordModel> wordsForQuestion37 = Arrays.asList(
                new WordModel(361, "A", 37),
                new WordModel(362, "B", 37),
                new WordModel(363, "G", 37),
                new WordModel(364, "D", 37),
                new WordModel(365, "I", 37),
                new WordModel(366, "H", 37),
                new WordModel(367, "O", 37),
                new WordModel(368, "N", 37),
                new WordModel(369, "R", 37),
                new WordModel(370, "E", 37)
        );
        List<String> listWordAnswer_37 = Arrays.asList("D", "A", "N","G");
        QuestionModel question37 = new QuestionModel(37, "Đi một ngày ___ , học một sàng khôn", listWordAnswer_37,"veryhard", wordsForQuestion37);
        questions.add(question37);

        List<WordModel> wordsForQuestion38 = Arrays.asList(
                new WordModel(371, "A", 38),
                new WordModel(372, "B", 38),
                new WordModel(373, "G", 38),
                new WordModel(374, "D", 38),
                new WordModel(375, "I", 38),
                new WordModel(376, "H", 38),
                new WordModel(377, "O", 38),
                new WordModel(378, "N", 38),
                new WordModel(379, "R", 38),
                new WordModel(380, "E", 38)
        );
        List<String> listWordAnswer_38 = Arrays.asList("L", "A");
        QuestionModel question38 = new QuestionModel(38, "Cây chạm ___, cá chạm vây", listWordAnswer_38,"veryhard", wordsForQuestion38);
        questions.add(question38);

        List<WordModel> wordsForQuestion39 = Arrays.asList(
                new WordModel(381, "A", 39),
                new WordModel(382, "B", 39),
                new WordModel(383, "G", 39),
                new WordModel(384, "D", 39),
                new WordModel(385, "I", 39),
                new WordModel(386, "U", 39),
                new WordModel(387, "O", 39),
                new WordModel(388, "N", 39),
                new WordModel(389, "R", 39),
                new WordModel(390, "E", 39)
        );
        List<String> listWordAnswer_39 = Arrays.asList("D", "U", "N","G");
        QuestionModel question39 = new QuestionModel(39, "Cây ngay chẳng sợ chết ___", listWordAnswer_39,"veryhard", wordsForQuestion39);
        questions.add(question39);

        List<WordModel> wordsForQuestion40 = Arrays.asList(
                new WordModel(391, "A", 40),
                new WordModel(392, "B", 40),
                new WordModel(393, "G", 40),
                new WordModel(394, "D", 40),
                new WordModel(395, "I", 40),
                new WordModel(396, "H", 40),
                new WordModel(397, "O", 40),
                new WordModel(398, "N", 40),
                new WordModel(399, "M", 40),
                new WordModel(400, "E", 40)
        );
        List<String> listWordAnswer_40 = Arrays.asList("M","A", "N","G");
        QuestionModel question40 = new QuestionModel(40, "Cha cầm khoáng, con bẻ ___", listWordAnswer_40,"veryhard", wordsForQuestion40);
        questions.add(question40);

        List<WordModel> wordsForQuestion41 = Arrays.asList(
                new WordModel(401, "A", 41),
                new WordModel(402, "B", 41),
                new WordModel(403, "G", 41),
                new WordModel(404, "D", 41),
                new WordModel(405, "C", 41),
                new WordModel(406, "H", 41),
                new WordModel(407, "U", 41),
                new WordModel(408, "N", 41),
                new WordModel(409, "M", 41),
                new WordModel(410, "E", 41)
        );
        List<String> listWordAnswer_41 = Arrays.asList("C","H","U","N","G");
        QuestionModel question41 = new QuestionModel(41, "Cha ___ không ai khóc", listWordAnswer_41,"hard", wordsForQuestion41);
        questions.add(question41);
        List<WordModel> wordsForQuestion42 = Arrays.asList(
                new WordModel(411, "B", 42),
                new WordModel(412, "A", 42),
                new WordModel(413, "C", 42),
                new WordModel(414, "O", 42),
                new WordModel(415, "H", 42),
                new WordModel(416, "E", 42),
                new WordModel(417, "M", 42),
                new WordModel(418, "U", 42),
                new WordModel(419, "K", 42),
                new WordModel(420, "N", 42)
        );
        List<String> listWordAnswer_42 = Arrays.asList("C","O","N");
        QuestionModel question42 = new QuestionModel(42, "Cha già ___ cọc", listWordAnswer_42, "hard", wordsForQuestion42);
        questions.add(question42);

        List<WordModel> wordsForQuestion43 = Arrays.asList(
                new WordModel(421, "D", 43),
                new WordModel(422, "A", 43),
                new WordModel(423, "E", 43),
                new WordModel(424, "T", 43),
                new WordModel(425, "M", 43),
                new WordModel(426, "S", 43),
                new WordModel(427, "N", 43),
                new WordModel(428, "I", 43),
                new WordModel(429, "H", 43),
                new WordModel(430, "C", 43)
        );
        List<String> listWordAnswer_43 = Arrays.asList("S","I","N","H");
        QuestionModel question43 = new QuestionModel(43, "Cha ___ chẳng bằng mẹ dưỡng", listWordAnswer_43, "hard", wordsForQuestion43);
        questions.add(question43);
        List<WordModel> wordsForQuestion44 = Arrays.asList(
                new WordModel(431, "A", 44),
                new WordModel(432, "B", 44),
                new WordModel(433, "L", 44),
                new WordModel(434, "T", 44),
                new WordModel(435, "H", 44),
                new WordModel(436, "O", 44),
                new WordModel(437, "I", 44),
                new WordModel(438, "E", 44),
                new WordModel(439, "R", 44),
                new WordModel(440, "K", 44)
        );
        List<String> listWordAnswer_44 = Arrays.asList("T","O","I");
        QuestionModel question44 = new QuestionModel(44, "Cháu bà nội, ___ bà ngoại", listWordAnswer_44, "hard", wordsForQuestion44);
        questions.add(question44);

        List<WordModel> wordsForQuestion45 = Arrays.asList(
                new WordModel(441, "G", 45),
                new WordModel(442, "A", 45),
                new WordModel(443, "D", 45),
                new WordModel(444, "I", 45),
                new WordModel(445, "T", 45),
                new WordModel(446, "M", 45),
                new WordModel(447, "L", 45),
                new WordModel(448, "N", 45),
                new WordModel(449, "E", 45),
                new WordModel(450, "Y", 45)
        );
        List<String> listWordAnswer_45 = Arrays.asList("L","A","Y");
        QuestionModel question45 = new QuestionModel(45, "Cháy thành vạ ___", listWordAnswer_45, "hard", wordsForQuestion45);
        questions.add(question45);

        List<WordModel> wordsForQuestion46 = Arrays.asList(
                new WordModel(451, "N", 46),
                new WordModel(452, "A", 46),
                new WordModel(453, "C", 46),
                new WordModel(454, "M", 46),
                new WordModel(455, "O", 46),
                new WordModel(456, "I", 46),
                new WordModel(457, "B", 46),
                new WordModel(458, "H", 46),
                new WordModel(459, "Y", 46),
                new WordModel(460, "R", 46)
        );
        List<String> listWordAnswer_46 = Arrays.asList("C","H","A","Y");
        QuestionModel question46 = new QuestionModel(46, "___ trời không khỏi nắng", listWordAnswer_46, "hard", wordsForQuestion46);
        questions.add(question46);

        List<WordModel> wordsForQuestion47 = Arrays.asList(
                new WordModel(461, "A", 47),
                new WordModel(462, "B", 47),
                new WordModel(463, "T", 47),
                new WordModel(464, "N", 47),
                new WordModel(465, "H", 47),
                new WordModel(466, "O", 47),
                new WordModel(467, "M", 47),
                new WordModel(468, "E", 47),
                new WordModel(469, "R", 47),
                new WordModel(470, "L", 47)
        );
        List<String> listWordAnswer_47 = Arrays.asList("B","E","N");
        QuestionModel question47 = new QuestionModel(47, "Chắc rễ ___ cây", listWordAnswer_47, "hard", wordsForQuestion47);
        questions.add(question47);

        List<WordModel> wordsForQuestion48 = Arrays.asList(
                new WordModel(471, "A", 48),
                new WordModel(472, "B", 48),
                new WordModel(473, "C", 48),
                new WordModel(474, "D", 48),
                new WordModel(475, "E", 48),
                new WordModel(476, "F", 48),
                new WordModel(477, "G", 48),
                new WordModel(478, "H", 48),
                new WordModel(479, "I", 48),
                new WordModel(480, "K", 48)
        );
        List<String> listWordAnswer_48 = Arrays.asList("C","H","E","P");
        QuestionModel question48 = new QuestionModel(48, "Chẳng được con trắm, con ___ cũng được mớ tép, mớ tôm", listWordAnswer_48, "hard", wordsForQuestion48);
        questions.add(question48);

        List<WordModel> wordsForQuestion49 = Arrays.asList(
                new WordModel(481, "A", 49),
                new WordModel(482, "B", 49),
                new WordModel(483, "C", 49),
                new WordModel(484, "D", 49),
                new WordModel(485, "E", 49),
                new WordModel(486, "F", 49),
                new WordModel(487, "M", 49),
                new WordModel(488, "H", 49),
                new WordModel(489, "I", 49),
                new WordModel(490, "L", 49)
        );
        List<String> listWordAnswer_49 = Arrays.asList("L","A","M");
        QuestionModel question49 = new QuestionModel(49, "Chẳng ốm chẳng đau, ___ giàu mấy chốc", listWordAnswer_49, "hard", wordsForQuestion49);
        questions.add(question49);

        List<WordModel> wordsForQuestion50 = Arrays.asList(
                new WordModel(491, "A", 50),
                new WordModel(492, "B", 50),
                new WordModel(493, "C", 50),
                new WordModel(494, "D", 50),
                new WordModel(495, "E", 50),
                new WordModel(496, "F", 50),
                new WordModel(497, "M", 50),
                new WordModel(498, "U", 50),
                new WordModel(499, "I", 50),
                new WordModel(500, "K", 50)
        );
        List<String> listWordAnswer_50 = Arrays.asList("M","A","U");
        QuestionModel question50 = new QuestionModel(50, "Chê chồng trước đánh đau, gặp chồng sau ___ đánh", listWordAnswer_50, "hard", wordsForQuestion50);
        questions.add(question50);
        List<WordModel> wordsForQuestion51 = Arrays.asList(
                new WordModel(501, "A", 51),
                new WordModel(502, "B", 51),
                new WordModel(503, "U", 51),
                new WordModel(504, "N", 51),
                new WordModel(505, "H", 51),
                new WordModel(506, "O", 51),
                new WordModel(507, "I", 51),
                new WordModel(508, "E", 51),
                new WordModel(509, "R", 51),
                new WordModel(510, "K", 51)
        );
        List<String> listWordAnswer_51 = Arrays.asList("H","E","O");
        QuestionModel question51 = new QuestionModel(51, "Dao thử trầu ___, kéo thử lụa sô", listWordAnswer_51, "hard", wordsForQuestion51);
        questions.add(question51);

        List<WordModel> wordsForQuestion52 = Arrays.asList(
                new WordModel(511, "G", 52),
                new WordModel(512, "C", 52),
                new WordModel(513, "D", 52),
                new WordModel(514, "I", 52),
                new WordModel(515, "T", 52),
                new WordModel(516, "M", 52),
                new WordModel(517, "O", 52),
                new WordModel(518, "N", 52),
                new WordModel(519, "E", 52),
                new WordModel(520, "R", 52)
        );
        List<String> listWordAnswer_52 = Arrays.asList("C","O","N");
        QuestionModel question52 = new QuestionModel(52, "Dâu dâu rể rể cũng kể là ___", listWordAnswer_52, "hard", wordsForQuestion52);
        questions.add(question52);

        List<WordModel> wordsForQuestion53 = Arrays.asList(
                new WordModel(521, "N", 53),
                new WordModel(522, "A", 53),
                new WordModel(523, "D", 53),
                new WordModel(524, "M", 53),
                new WordModel(525, "O", 53),
                new WordModel(526, "U", 53),
                new WordModel(527, "B", 53),
                new WordModel(528, "H", 53),
                new WordModel(529, "E", 53),
                new WordModel(530, "R", 53)
        );
        List<String> listWordAnswer_53 = Arrays.asList("D","A","U");
        QuestionModel question53 = new QuestionModel(53, "___ dữ mất họ, chó dữ mất láng giềng", listWordAnswer_53, "hard", wordsForQuestion53);
        questions.add(question53);

        List<WordModel> wordsForQuestion54 = Arrays.asList(
                new WordModel(531, "A", 54),
                new WordModel(532, "B", 54),
                new WordModel(533, "C", 54),
                new WordModel(534, "N", 54),
                new WordModel(535, "H", 54),
                new WordModel(536, "O", 54),
                new WordModel(537, "M", 54),
                new WordModel(538, "E", 54),
                new WordModel(539, "R", 54),
                new WordModel(540, "L", 54)
        );
        List<String> listWordAnswer_54 = Arrays.asList("C","O","N");
        QuestionModel question54 = new QuestionModel(54, "Dốt đặc ___ hơn hay chữ lỏng", listWordAnswer_54, "hard", wordsForQuestion54);
        questions.add(question54);

        List<WordModel> wordsForQuestion55 = Arrays.asList(
                new WordModel(541, "A", 55),
                new WordModel(542, "B", 55),
                new WordModel(543, "C", 55),
                new WordModel(544, "D", 55),
                new WordModel(545, "E", 55),
                new WordModel(546, "T", 55),
                new WordModel(547, "G", 55),
                new WordModel(548, "H", 55),
                new WordModel(549, "I", 55),
                new WordModel(550, "K", 55)
        );
        List<String> listWordAnswer_55 = Arrays.asList("B","I","E","T");
        QuestionModel question55 = new QuestionModel(55, "Đàn bà không ___ nuôi heo - đàn bà nhác", listWordAnswer_55, "hard", wordsForQuestion55);
        questions.add(question55);

        List<WordModel> wordsForQuestion56 = Arrays.asList(
                new WordModel(551, "A", 56),
                new WordModel(552, "B", 56),
                new WordModel(553, "C", 56),
                new WordModel(554, "D", 56),
                new WordModel(555, "E", 56),
                new WordModel(556, "F", 56),
                new WordModel(557, "G", 56),
                new WordModel(558, "H", 56),
                new WordModel(559, "R", 56),
                new WordModel(560, "K", 56)
        );
        List<String> listWordAnswer_56 = Arrays.asList("R","E");
        QuestionModel question56 = new QuestionModel(56, "Kén dâu thì dễ, kén ___ thì khó", listWordAnswer_56, "hard", wordsForQuestion56);
        questions.add(question56);

        List<WordModel> wordsForQuestion57 = Arrays.asList(
                new WordModel(561, "A", 57),
                new WordModel(562, "B", 57),
                new WordModel(563, "C", 57),
                new WordModel(564, "D", 57),
                new WordModel(565, "E", 57),
                new WordModel(566, "F", 57),
                new WordModel(567, "G", 57),
                new WordModel(568, "H", 57),
                new WordModel(569, "I", 57),
                new WordModel(570, "O", 57)
        );
        List<String> listWordAnswer_57 = Arrays.asList("C","O");
        QuestionModel question57 = new QuestionModel(57, "Khéo ăn thì no, khéo ___ thì ấm", listWordAnswer_57, "hard", wordsForQuestion57);
        questions.add(question57);

        List<WordModel> wordsForQuestion58 = Arrays.asList(
                new WordModel(571, "A", 58),
                new WordModel(572, "B", 58),
                new WordModel(573, "C", 58),
                new WordModel(574, "D", 58),
                new WordModel(575, "E", 58),
                new WordModel(576, "F", 58),
                new WordModel(577, "G", 58),
                new WordModel(578, "N", 58),
                new WordModel(579, "I", 58),
                new WordModel(580, "K", 58)
        );
        List<String> listWordAnswer_58 = Arrays.asList("N","E","N");
        QuestionModel question58 = new QuestionModel(58, "Khi ___, trời cũng chiều người", listWordAnswer_58, "hard", wordsForQuestion58);
        questions.add(question58);

        List<WordModel> wordsForQuestion59 = Arrays.asList(
                new WordModel(581, "A", 59),
                new WordModel(582, "B", 59),
                new WordModel(583, "C", 59),
                new WordModel(584, "D", 59),
                new WordModel(585, "E", 59),
                new WordModel(586, "F", 59),
                new WordModel(587, "G", 59),
                new WordModel(588, "O", 59),
                new WordModel(589, "I", 59),
                new WordModel(590, "K", 59)
        );
        List<String> listWordAnswer_59 = Arrays.asList("C","O","I");
        QuestionModel question59 = new QuestionModel(59, "Lá rụng về ___", listWordAnswer_59, "hard", wordsForQuestion59);
        questions.add(question59);

        List<WordModel> wordsForQuestion60 = Arrays.asList(
                new WordModel(591, "A", 60),
                new WordModel(592, "B", 60),
                new WordModel(593, "C", 60),
                new WordModel(594, "D", 60),
                new WordModel(595, "E", 60),
                new WordModel(596, "M", 60),
                new WordModel(597, "G", 60),
                new WordModel(598, "H", 60),
                new WordModel(599, "I", 60),
                new WordModel(600, "K", 60)
        );
        List<String> listWordAnswer_60 = Arrays.asList("M","E");
        QuestionModel question60 = new QuestionModel(60, "Không ___ lẹ chân tay", listWordAnswer_60, "hard", wordsForQuestion60);
        questions.add(question60);



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
