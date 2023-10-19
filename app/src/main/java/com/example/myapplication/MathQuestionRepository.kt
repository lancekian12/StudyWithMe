package com.example.myapplication

object MathQuestionRepository {
    fun getQuestion(): ArrayList<DataClassQuestionAnswer> {
        val questionList = ArrayList<DataClassQuestionAnswer>()
        val ques1 = DataClassQuestionAnswer(
            "Which of the following statements is TRUE? Choose the following",
            "A Cells are the basic building blocks of all living organisms.",
            "B. Cells are completely hollow and empty spaces.",
            "C. Cells are all the same size and shape.",
            "D. Cells can survive indefinitely without any source of energy",
            1
        )
        questionList.add(ques1)
        val ques2 = DataClassQuestionAnswer(
            "What is CELL-MEMBRANE? Choose the following",
            "A. The outer boundary of the cell, controlling what enters and exits the cell.",
            "B. The gel-like substance that fills the cell and houses various organelles.",
            "C. He control center of the cell, containing genetic material (DNA) that directs cell activities.",
            "D. Organelles responsible for producing energy (ATP) through cellular respiration.",
            1
        )
        questionList.add(ques2)
        val ques3 = DataClassQuestionAnswer(
            "What is CYTOPLASM? Choose the following",
            "A. The outer boundary of the cell, controlling what enters and exits the cell.",
            "B. The gel-like substance that fills the cell and houses various organelles.",
            "C. He control center of the cell, containing genetic material (DNA) that directs cell activities.",
            "D. Organelles responsible for producing energy (ATP) through cellular respiration.",
            2
        )
        questionList.add(ques3)
        val ques4 = DataClassQuestionAnswer(
            "What is NUCLEUS? Choose the following",
            "A. The outer boundary of the cell, controlling what enters and exits the cell.",
            "B. The gel-like substance that fills the cell and houses various organelles.",
            "C. He control center of the cell, containing genetic material (DNA) that directs cell activities.",
            "D. Organelles responsible for producing energy (ATP) through cellular respiration.",
            3
        )
        questionList.add(ques4)
        val ques5 = DataClassQuestionAnswer(
            "What is MITOCHONDRIA? Choose the following",
            "A. The outer boundary of the cell, controlling what enters and exits the cell.",
            "B. The gel-like substance that fills the cell and houses various organelles.",
            "C. He control center of the cell, containing genetic material (DNA) that directs cell activities.",
            "D. Organelles responsible for producing energy (ATP) through cellular respiration.",
            4
        )
        questionList.add(ques5)
        //2
        val ques6 = DataClassQuestionAnswer(
            "Which of the following statements is TRUE? Choose the following",
            "A. The solar system consists of only eight planets.",
            "B. The solar system is a fascinating topic in science, offering a wide range of information for learners of all ages.",
            "C. The planets in the solar system all have the same gravitational force. ",
            "D. The solar system consists of only eight planets.",
            2
        )
        questionList.add(ques6)
        val ques7 = DataClassQuestionAnswer(
            "What is STAR? Choose the following",
            "A.  It's a rocky or metallic objects that orbit the Sun, primarily found in the asteroid belt.",
            "B. It's a vast system of stars, stellar remnants, interstellar gas, dust, and dark matter bound together by gravity.",
            "C. It's a celestial objects that orbit stars, including our Sun, and they lack the ability to generate their own light.",
            "D. It's a luminous celestial object consisting primarily of hydrogen and helium gas that emits light.",
            4
        )
        questionList.add(ques7)
        val ques8 = DataClassQuestionAnswer(
            "What is PLANETS? Choose the following",
            "A.  It's a rocky or metallic objects that orbit the Sun, primarily found in the asteroid belt.",
            "B. It's a vast system of stars, stellar remnants, interstellar gas, dust, and dark matter bound together by gravity.",
            "C. It's a celestial objects that orbit stars, including our Sun, and they lack the ability to generate their own light.",
            "D. It's a luminous celestial object consisting primarily of hydrogen and helium gas that emits light.",
            3
        )
        questionList.add(ques8)
        val ques9 = DataClassQuestionAnswer(
            "What is GALAXY? Choose the following",
            "A.  It's a rocky or metallic objects that orbit the Sun, primarily found in the asteroid belt.",
            "B. It's a vast system of stars, stellar remnants, interstellar gas, dust, and dark matter bound together by gravity.",
            "C. It's a celestial objects that orbit stars, including our Sun, and they lack the ability to generate their own light.",
            "D. It's a luminous celestial object consisting primarily of hydrogen and helium gas that emits light.",
            2
        )
        questionList.add(ques9)
        val ques10 = DataClassQuestionAnswer(
            "What is ASTEROID? Choose the following,",
            "A.  It's a rocky or metallic objects that orbit the Sun, primarily found in the asteroid belt.",
            "B. It's a vast system of stars, stellar remnants, interstellar gas, dust, and dark matter.",
            "C. It's a celestial objects that orbit stars, including our Sun, and they lack the ability to generate their own light.",
            "D. It's a luminous celestial object consisting primarily of hydrogen and helium gas that emits light.",
            1
        )
        questionList.add(ques10)
        //3
        val ques11 = DataClassQuestionAnswer(
            "Which of the following statements is TRUE? Choose the following",
            "A. All animals are capable of time travel and can visit any point in history. ",
            "B. Animals communicate with each other through telepathy. ",
            "C. It's a highly diverse group of living organisms that can be categorized in various ways",
            "D. All animals are highly intelligent and capable of advanced reasoning.",
            3
        )
        questionList.add(ques11)
        val ques12 = DataClassQuestionAnswer(
            "What is the example of MAMMAL? Choose the following",
            "A. Salamander",
            "B.  Zebra",
            "C. Alligator",
            "D. Eagle",
            2
        )
        questionList.add(ques12)
        val ques13 = DataClassQuestionAnswer(
            "What is the example of REPTILE? Choose the following",
            "A. Salamander",
            "B.  Zebra",
            "C. Alligator",
            "D. Eagle",
            3
        )
        questionList.add(ques13)
        val ques14 = DataClassQuestionAnswer(
            "What is the example of AMPHIBIAN? Choose the following",
            "A. Salamander",
            "B.  Zebra",
            "C. Alligator",
            "D. Eagle",
            1
        )
        questionList.add(ques14)
        val ques15 = DataClassQuestionAnswer(
            "What is the example of BIRD? Choose the following",
            "A. Salamander",
            "B.  Zebra",
            "C. Alligator",
            "D. Eagle",
            4
        )
        questionList.add(ques15)
        //4
        val ques16 = DataClassQuestionAnswer(
            "Which of the following statements is TRUE? Choose the following",
            "A. Scientist is a person who engages in scientific research and investigation to gain a better understanding of the natural world",
            "B. All scientists have secret labs hidden inside volcanoes, just like in movies.",
            "C. Scientists wear white lab coats 24/7, even at home or while shopping.",
            "D. Scientists always possess the ability to instantly invent groundbreaking technologies.",
            4
        )
        questionList.add(ques16)
        val ques17 = DataClassQuestionAnswer(
            "What is the famous discovery of ISAAC NEWTON? Choose the following",
            "A. Telescope Observation",
            "B. Theory of Relativity",
            "C. Law of Universal Gravitation",
            "D. Theory of Evolution",
            3
        )
        questionList.add(ques17)
        val ques18 = DataClassQuestionAnswer(
            "What is the famous discovery of CHARLES DARWIN? Choose the following",
            "A. Telescope Observation",
            "B. Theory of Relativity",
            "C. Law of Universal Gravitation",
            "D. Theory of Evolution",
            4
        )
        questionList.add(ques18)
        val ques19 = DataClassQuestionAnswer(
            "What is the famous discovery of ALBERT EINSTEIN? Choose the following",
            "A. Telescope Observation",
            "B. Theory of Relativity",
            "C. Law of Universal Gravitation",
            "D. Theory of Evolution",
            2
        )
        questionList.add(ques19)
        val ques20 = DataClassQuestionAnswer(
            "What is the famous discovery of GALILEO GALILEI? Choose the following",
            "A. Telescope Observation",
            "B. Theory of Relativity",
            "C. Law of Universal Gravitation",
            "D. Theory of Evolution",
            1
        )
        questionList.add(ques20)
        //5
        val ques21 = DataClassQuestionAnswer(
            "Which of the following statements is TRUE? Choose the following",
            "A. Matter is everything that has mass and occupies space.",
            "B. All matter is invisible and intangible.",
            "C. Matter can be converted into pure energy at will.",
            "D. All matter is made of the same substance, like jelly. ",
            1
        )
        questionList.add(ques21)
        val ques22 = DataClassQuestionAnswer(
            "What is the example of SOLID? Choose the following",
            "A. Crystal",
            "B. Water",
            "C. Hot Air Balloon",
            "D. Blood",
            1
        )
        questionList.add(ques22)
        val ques23 = DataClassQuestionAnswer(
            "What is the example of LIQUID? Choose the following",
            "A. Crystal",
            "B. Water",
            "C. Hot Air Balloon",
            "D. Blood",
            2
        )
        questionList.add(ques23)
        val ques24 = DataClassQuestionAnswer(
            "What is the example of GAS? Choose the following",
            "A. Crystal",
            "B. Water",
            "C. Hot Air Balloon",
            "D. Blood",
            3
        )
        questionList.add(ques24)
        val ques25 = DataClassQuestionAnswer(
            "What is the example of PLASMA? Choose the following",
            "A. Crystal",
            "B. Water",
            "C. Hot Air Balloon",
            "D. Blood",
            4
        )
        questionList.add(ques25)
        return questionList
    }
}