package com.example.myapplication

object HistoryQuestionRepository {
    fun getQuestion(): ArrayList<DataClassQuestionAnswer> {
        val questionList = ArrayList<DataClassQuestionAnswer>()
        val ques1 = DataClassQuestionAnswer(
            "Which of the following statements is TRUE? Choose the following",
            "A The Spanish colonization had no impact on Philippine culture.",
            "B. The Spanish ruled the Philippines for over 400 years",
            "C. The Spanish did not led by Magellan",
            "D. The Spanish Colonial Period refers to the era when the Philippines was under Spanish rule.",
            4
        )
        questionList.add(ques1)
        val ques2 = DataClassQuestionAnswer(
            "What is Spanish Arrival and Conquest? Choose the following",
            "A. KKK led the Philippine Revolution in the late 19th century.",
            "B. Spanish influence had a profound impact on Philippine culture and language.",
            "C. One of the most enduring legacies of the Spanish colonial period is the introduction of Christianity.",
            "D. Spanish expedition led by Ferdinand Magellan arrived in the Philippines in 1521 is killed by Lapu-Lapu.",
            4
        )
        questionList.add(ques2)
        val ques3 = DataClassQuestionAnswer(
            "What is Spread of Christianity? Choose the following",
            "A. KKK led the Philippine Revolution in the late 19th century.",
            "B. Spanish influence had a profound impact on Philippine culture and language.",
            "C. One of the most enduring legacies of the Spanish colonial period is the introduction of Christianity.",
            "D. Spanish expedition led by Ferdinand Magellan arrived in the Philippines in 1521 is killed by Lapu-Lapu.",
            3
        )
        questionList.add(ques3)
        val ques4 = DataClassQuestionAnswer(
            "What is Cultural Influence and Language? Choose the following",
            "A. KKK led the Philippine Revolution in the late 19th century.",
            "B. Spanish influence had a profound impact on Philippine culture and language.",
            "C. One of the most enduring legacies of the Spanish colonial period is the introduction of Christianity.",
            "D. Spanish expedition led by Ferdinand Magellan arrived in the Philippines in 1521 is killed by Lapu-Lapu.",
            2
        )
        questionList.add(ques4)
        val ques5 = DataClassQuestionAnswer(
            "What is Filipino Resistance and Revolts? Choose the following",
            "A. KKK led the Philippine Revolution in the late 19th century.",
            "B. Spanish influence had a profound impact on Philippine culture and language.",
            "C. One of the most enduring legacies of the Spanish colonial period is the introduction of Christianity.",
            "D. Spanish expedition led by Ferdinand Magellan arrived in the Philippines in 1521 is killed by Lapu-Lapu.",
            1
        )
        questionList.add(ques5)
        //2
        val ques6 = DataClassQuestionAnswer(
            "Which of the following statements is TRUE? Choose the following",
            "A. An ancient civilization refers to a complex society characterized by various essential elements, including advanced social, political, economic",
            "B. Ancient civilizations were highly advanced in space exploration, with the ability to send astronauts to other planets.",
            "C. Ancient civilizations communicated with extraterrestrial beings using advanced smartphones.",
            "D. Ancient civilizations invented the internet and social media, allowing them to share memes and viral videos worldwide.",
            1
        )
        questionList.add(ques6)
        val ques7 = DataClassQuestionAnswer(
            "Which of the following example of Ancient Egypt? Choose the following",
            "A.  Pyramid of Giza",
            "B. Summeranians",
            "C. Athenian Democracy",
            "D. Harappan Seals",
            1
        )
        questionList.add(ques7)
        val ques8 = DataClassQuestionAnswer(
            "Which of the following example of Ancient Mesopotamian? Choose the following",
            "A.  Pyramid of Giza",
            "B. Summeranians",
            "C. Athenian Democracy",
            "D. Harappan Seals",
            2
        )
        questionList.add(ques8)
        val ques9 = DataClassQuestionAnswer(
            "Which of the following example of Ancient Greece? Choose the following",
            "A.  Pyramid of Giza",
            "B. Summeranians",
            "C. Athenian Democracy",
            "D. Harappan Seals",
            3
        )
        questionList.add(ques9)
        val ques10 = DataClassQuestionAnswer(
            "Which of the following example of Ancient Indus Civilization? Choose the following,",
            "A.  Pyramid of Giza",
            "B. Summeranians",
            "C. Athenian Democracy",
            "D. Harappan Seals",
            4
        )
        questionList.add(ques10)
        //3
        val ques11 = DataClassQuestionAnswer(
            "Which of the following statements is TRUE? Choose the following",
            "A. During the EDSA Revolution, participants used water balloons and confetti cannons to express their political opinions.",
            "B. The revolution marked a pivotal moment in Philippine history and is considered one of the most significant peaceful uprisings ",
            "C. The EDSA Revolution was actually a massive dance party with participants showcasing their best dance moves to elect a new leader.",
            "D. The EDSA Revolution was a peaceful gathering of people who came together to celebrate a national picnic day.",
            2
        )
        questionList.add(ques11)
        val ques12 = DataClassQuestionAnswer(
            "What is the example of bad MARTIAL LAW? Choose the following",
            "A. Abuse of Power",
            "B.  Restoring Law and Order",
            "C. National Security",
            "D. Efficient Crisis Management",
            1
        )
        questionList.add(ques12)
        val ques13 = DataClassQuestionAnswer(
            "When is the start of SPARK of Edsa Revolution? Choose the following",
            "A. 1994",
            "B.  1991",
            "C. 1990",
            "D. 1993",
            4
        )
        questionList.add(ques13)
        val ques14 = DataClassQuestionAnswer(
            "Who is the Dictator in Philippines? Choose the following",
            "A. Bongbong Marcos",
            "B.  Cory Aquino",
            "C. Benigno Aquino",
            "D. Ferdinand Marcos",
            4
        )
        questionList.add(ques14)
        val ques15 = DataClassQuestionAnswer(
            "When we celebrate EDSA REVOLUTION? Choose the following",
            "A. February 25",
            "B.  March 24",
            "C. January 23",
            "D. February 2",
                    1
        )
        questionList.add(ques15)
        //4
        val ques16 = DataClassQuestionAnswer(
            "Which of the following statements is TRUE? Choose the following",
            "A. The American colonial period was known for its advanced smartphone technology and social media platforms.",
            "B. This period began in 1898 when the United States acquired the Philippines from Spain",
            "C. American colonists had a thriving space program, with moon landings and Martian colonies.",
            "D. During the American colonial period, fast-food restaurants like McDonald's were popular hangout spots.",
            2
        )
        questionList.add(ques16)
        val ques17 = DataClassQuestionAnswer(
            "Which of the following define Treaty of Paris? Choose the following",
            "A. The annexation of the Philippines by the United States led to the Philippine-American War",
            "B. This treaty marked the end of the Spanish-American War and led to the transfer of several territories from Spain to the United States.",
            "C. After the war, the United States established a civil government in the Philippines.",
            "D. The Philippines finally gained full independence from the United States",
            2
        )
        questionList.add(ques17)
        val ques18 = DataClassQuestionAnswer(
            "Which of the following define Philippine-American War? Choose the following",
            "A. The annexation of the Philippines by the United States led to the Philippine-American War",
            "B. This treaty marked the end of the Spanish-American War and led to the transfer of several territories from Spain to the United States.",
            "C. After the war, the United States established a civil government in the Philippines.",
            "D. The Philippines finally gained full independence from the United States",
            1
        )
        questionList.add(ques18)
        val ques19 = DataClassQuestionAnswer(
            "Which of the following define Civil Goverment? Choose the following",
            "A. The annexation of the Philippines by the United States led to the Philippine-American War",
            "B. This treaty marked the end of the Spanish-American War and led to the transfer of several territories from Spain to the United States.",
            "C. After the war, the United States established a civil government in the Philippines.",
            "D. The Philippines finally gained full independence from the United States",
            3
        )
        questionList.add(ques19)
        val ques20 = DataClassQuestionAnswer(
            "Which of the following define Independence Day? Choose the following",
            "A. The annexation of the Philippines by the United States led to the Philippine-American War",
            "B. This treaty marked the end of the Spanish-American War and led to the transfer of several territories from Spain to the United States.",
            "C. After the war, the United States established a civil government in the Philippines.",
            "D. The Philippines finally gained full independence from the United States",
            4
        )
        questionList.add(ques20)
        val ques21 = DataClassQuestionAnswer(
            "Which of the following statements is TRUE? Choose the following",
            "A. Southeast Asia is known for its vast desert landscapes and sand dunes.",
            "B. Southeast Asia is a massive continent covering half of the Earth's land area.",
            "C. Southeast Asia is a region in Asia that is situated to the southeast of the Asian continent.",
            "D. Southeast Asia is home to the world's largest penguin population.",
            3
        )
        questionList.add(ques21)
        val ques22 = DataClassQuestionAnswer(
            "Which of the following define Philippines? Choose the following",
            "A. It's known for its diverse geography, including mountain ranges, volcanoes, plains, and coastal areas.",
            "B. This known for its diverse and beautiful landscapes, which include mountains, plateaus, fertile plains, lakes, rivers, and coastal areas.",
            "C. It was officially recognized to have 7,641 islands",
            "D. It's known for its diverse geography, which includes lush mountains, rolling hills, fertile plains, and beautiful coastlines.",
            3
        )
        questionList.add(ques22)
        val ques23 = DataClassQuestionAnswer(
            "Which of the following define Civil Goverment? Choose the following",
            "A. It's known for its diverse geography, including mountain ranges, volcanoes, plains, and coastal areas.",
            "B. This known for its diverse and beautiful landscapes, which include mountains, plateaus, fertile plains, lakes, rivers, and coastal areas.",
            "C. It was officially recognized to have 7,641 islands",
            "D. It's known for its diverse geography, which includes lush mountains, rolling hills, fertile plains, and beautiful coastlines.",
            1
        )
        questionList.add(ques23)
        val ques24 = DataClassQuestionAnswer(
            "Which of the following define Civil Goverment? Choose the following",
            "A. It's known for its diverse geography, including mountain ranges, volcanoes, plains, and coastal areas.",
            "B. This known for its diverse and beautiful landscapes, which include mountains, plateaus, fertile plains, lakes, rivers, and coastal areas.",
            "C. It was officially recognized to have 7,641 islands",
            "D. It's known for its diverse geography, which includes lush mountains, rolling hills, fertile plains, and beautiful coastlines.",
            4
        )
        questionList.add(ques24)
        val ques25 = DataClassQuestionAnswer(
            "Which of the following define Civil Goverment? Choose the following",
            "A. It's known for its diverse geography, including mountain ranges, volcanoes, plains, and coastal areas.",
            "B. This known for its diverse and beautiful landscapes, which include mountains, plateaus, fertile plains, lakes, rivers, and coastal areas.",
            "C. It was officially recognized to have 7,641 islands",
            "D. It's known for its diverse geography, which includes lush mountains, rolling hills, fertile plains, and beautiful coastlines.",
            2
        )
        questionList.add(ques25)
        return questionList
    }
}