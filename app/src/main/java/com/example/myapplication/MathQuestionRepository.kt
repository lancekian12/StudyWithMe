package com.example.myapplication

object MathQuestionRepository {
    fun getQuestion(): ArrayList<DataClassQuestionAnswer> {
        val questionList = ArrayList<DataClassQuestionAnswer>()
        val ques1 = DataClassQuestionAnswer(
            "Find the f(x) = 2x + 3 where x is 2? Choose the following correct answer",
            "A. 7",
            "B. 8",
            "C. 10",
            "D. 11",
            1
        )
        questionList.add(ques1)
        val ques2 = DataClassQuestionAnswer(
            "Find the f(x) = 2x + 3 where x is 4? Choose the following correct answer",
            "A. 7",
            "B. 8",
            "C. 10",
            "D. 11",
            4
        )
        questionList.add(ques2)
        val ques3 = DataClassQuestionAnswer(
            "Find the f(x) = 6x2 - 4x + 4 where x is 5? Choose the following correct answer",
            "A. 190.",
            "B. 134",
            "C. 150",
            "D. 412",
            2
        )
        questionList.add(ques3)
        val ques4 = DataClassQuestionAnswer(
            "Find the f(x) = 6x + 1 + x where x is 5? Choose the following correct answer",
            "A. 19",
            "B. 12",
            "C. 36",
            "D. 100",
            3
        )
        questionList.add(ques4)
        val ques5 = DataClassQuestionAnswer(
            "Find the f(x) = -4**x + 5 where x is 5? Choose the following correct answer",
            "A. -2014",
            "B. 2014",
            "C. 1019",
            "D. -1019",
            4
        )
        questionList.add(ques5)
        //2
        val ques6 = DataClassQuestionAnswer(
            "Find the K=°C+273 where °C is 25? Choose the following correct answer",
            "A. 350",
            "B. 298",
            "C. 120",
            "D. 3097",
            2
        )
        questionList.add(ques6)
        val ques7 = DataClassQuestionAnswer(
            "Find the °F=(°C×9/5)+32 where °C is 100? Choose the following correct answer",
            "A.  212",
            "B. 321",
            "C. 415",
            "D. 212",
            4
        )
        questionList.add(ques7)
        val ques8 = DataClassQuestionAnswer(
            "Find the °C=K−273.15 where K is 500? Choose the following correct answer",
            "A.  124.85",
            "B. 122.85",
            "C. 226.85",
            "D. 40.85",
            3
        )
        questionList.add(ques8)
        val ques9 = DataClassQuestionAnswer(
            "Find the °F=(K−273.15)× 9/5 + 32 where K is -250? Choose the following correct answer",
            "A.  -412.44",
            "B. -909.67",
            "C. -779.12",
            "D. -554.56",
            2
        )
        questionList.add(ques9)
        val ques10 = DataClassQuestionAnswer(
            "Find the °C=(°F−32)×5/9 where °F is -20? Choose the following correct answer",
            "A.  -28.88",
            "B. -23.88",
            "C. -24.88",
            "D. -25.88",
            1
        )
        questionList.add(ques10)
        //3
        val ques11 = DataClassQuestionAnswer(
            "Find the Mean of 1,2,3,4,5? Choose the following correct answer",
            "A.  4",
            "B. 3",
            "C. 5",
            "D.  2.5",
            2
        )
        questionList.add(ques11)
        val ques12 = DataClassQuestionAnswer(
            "Find the Mean of 7,3,4,1,7,6? Choose the following correct answer",
            "A.  1.2",
            "B. 6.6",
            "C. 5.3",
            "D.  2.2",
            2
        )
        questionList.add(ques12)
        val ques13 = DataClassQuestionAnswer(
            "Find the Median of 7,3,4,1,7,6? Choose the following correct answer",
            "A.  1,2",
            "B. 3,4",
            "C. 4,6",
            "D.  5,1",
            3
        )
        questionList.add(ques13)
        val ques14 = DataClassQuestionAnswer(
            "Find the Median of 5,4,3,2,1? Choose the following correct answer",
            "A.  5",
            "B. 4",
            "C. 3",
            "D.  2",
            3
        )
        questionList.add(ques14)
        val ques15 = DataClassQuestionAnswer(
            "Find the Mode of 7,3,4,1,7,6? Choose the following correct answer",
            "A.  5",
            "B. 6",
            "C. 4",
            "D.  7",
            4
        )
        questionList.add(ques15)
        //4
        val ques16 = DataClassQuestionAnswer(
            "Find the Area = l x w, where l = 10 and w = 100? Choose the following correct answer",
            "A.  500",
            "B. 600",
            "C. 1000",
            "D.  1200",
            3
        )
        questionList.add(ques16)
        val ques17 = DataClassQuestionAnswer(
            "Find the Area = l x w , where l = 50 and w = -40? Choose the following correct answer",
            "A.  -5000",
            "B. -6000",
            "C. -2000",
            "D.  -1200",
            3
        )
        questionList.add(ques17)
        val ques18 = DataClassQuestionAnswer(
            "Find the Area = s**2, where s = 5? Choose the following correct answer",
            "A.  100",
            "B. 125",
            "C. 150",
            "D.  25",
            4
        )
        questionList.add(ques18)
        val ques19 = DataClassQuestionAnswer(
            "Find the Area = s**2, where s = -25? Choose the following correct answer",
            "A.  625",
            "B. 400",
            "C. 200",
            "D.  1000",
            1
        )
        questionList.add(ques19)
        val ques20 = DataClassQuestionAnswer(
            "Find the Area = 1/2 * b * h, where b = -5 and h = 5? Choose the following correct answer",
            "A.  -10.4",
            "B. -12.5",
            "C. -14.3",
            "D.  -15.22",
            2
        )
        questionList.add(ques20)
        //5
        val ques21 = DataClassQuestionAnswer(
            "Find the E = f * d, where b = -5 and h = 5? Choose the following correct answer",
            "A.  -10.4",
            "B. -12.5",
            "C. -14.3",
            "D.  -15.22",
            1
        )
        questionList.add(ques21)
        val ques22 = DataClassQuestionAnswer(
            "Find the Area = 1/2 * b * h, where b = -5 and h = 5? Choose the following correct answer",
            "A.  -10.4",
            "B. -12.5",
            "C. -14.3",
            "D.  -15.22",
            1
        )
        questionList.add(ques22)
        val ques23 = DataClassQuestionAnswer(
            "Find the Area = 1/2 * b * h, where b = -5 and h = 5? Choose the following correct answer",
            "A.  -10.4",
            "B. -12.5",
            "C. -14.3",
            "D.  -15.22",
            2
        )
        questionList.add(ques23)
        val ques24 = DataClassQuestionAnswer(
            "Find the Area = 1/2 * b * h, where b = -5 and h = 5? Choose the following correct answer",
            "A.  -10.4",
            "B. -12.5",
            "C. -14.3",
            "D.  -15.22",
            3
        )
        questionList.add(ques24)
        val ques25 = DataClassQuestionAnswer(
            "Find the Area = 1/2 * b * h, where b = -5 and h = 5? Choose the following correct answer",
            "A.  -10.4",
            "B. -12.5",
            "C. -14.3",
            "D.  -15.22",
            4
        )
        questionList.add(ques25)
        return questionList
    }
}