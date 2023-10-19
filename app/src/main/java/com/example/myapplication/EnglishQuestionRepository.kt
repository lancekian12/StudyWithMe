package com.example.myapplication

object EnglishQuestionRepository {
    fun getQuestion(): ArrayList<DataClassQuestionAnswer> {
        val questionList = ArrayList<DataClassQuestionAnswer>()
        val ques1 = DataClassQuestionAnswer("What is SENTENCE? ",
            "A Sentence is a group of words that doesn't make sense.",
            "B. Sentence is a collection of random words.",
            "C. Sentence is a group of words that always has to be long and complex.",
            "D. Sentence is the main idea or communication within a sentence.",
            4)
        questionList.add(ques1)
        val ques2 = DataClassQuestionAnswer("What is the example of DECLARATIVE SENTENCE? Choose the following",
            "A. Send the email to the entire team.",
            "B. Why did you choose that restaurant for dinner?",
            "C. My brother is an excellent cook.",
            "D. I can't believe we won the championship!",
            3)
        questionList.add(ques2)
        val ques3 = DataClassQuestionAnswer("What is the example of INTERROGATIVE SENTENCE? Choose the following",
            "A. Send the email to the entire team.",
            "B. Why did you choose that restaurant for dinner?",
            "C. My brother is an excellent cook.",
            "D. I can't believe we won the championship!",
            2)
        questionList.add(ques3)
        val ques4 = DataClassQuestionAnswer("What is the example of IMPERATIVE SENTENCE? Choose the following",
            "A. Send the email to the entire team.",
            "B. Why did you choose that restaurant for dinner?",
            "C. My brother is an excellent cook.",
            "D. I can't believe we won the championship!",
            1)
        questionList.add(ques4)
        val ques5 = DataClassQuestionAnswer("What is the example of EXCLAMATORY SENTENCE? Choose the following",
            "A. Send the email to the entire team.",
            "B. Why did you choose that restaurant for dinner?",
            "C. My brother is an excellent cook.",
            "D. I can't believe we won the championship!",
            4)
        questionList.add(ques5)
        //2
        val ques6 = DataClassQuestionAnswer("What is FIGURE OF SPEECH?",
            "A. A figure of speech is a form of written that is always literal and straightforward.",
            "B. Figures of speech are used in writing to avoid clarity and create confusion.",
            "C. A figure of speech is a non-literal language expression for emphasis",
            "D. Figures of speech are only used in poetry and have no place in other forms of writing.",
            3)
        questionList.add(ques6)
        val ques7 = DataClassQuestionAnswer("What is the example of SIMILE? Choose the following",
            "A. His laughter was like music to her ears.",
            "B. The flowers danced in the gentle breeze.",
            "C. The thunder rumbled loudly in the distance.",
            "D.  I'm so hungry I could eat a horse.",
            1)
        questionList.add(ques7)
        val ques8 = DataClassQuestionAnswer("What is the example of HYPERBOLE? Choose the following",
            "A. His laughter was like music to her ears.",
            "B. The flowers danced in the gentle breeze.",
            "C. The thunder rumbled loudly in the distance.",
            "D.  I'm so hungry I could eat a horse.",
            4)
        questionList.add(ques8)
        val ques9 = DataClassQuestionAnswer("What is the example of PERSONIFICATION? Choose the following",
            "A. His laughter was like music to her ears.",
            "B. The flowers danced in the gentle breeze.",
            "C. The thunder rumbled loudly in the distance.",
            "D.  I'm so hungry I could eat a horse.",
            2)
        questionList.add(ques9)
        val ques10 = DataClassQuestionAnswer("What is the example of ONOMATOPOEIA? Choose the following",
            "A. His laughter was like music to her ears.",
            "B. The flowers danced in the gentle breeze.",
            "C. The thunder rumbled loudly in the distance.",
            "D.  I'm so hungry I could eat a horse.",
            3)
        questionList.add(ques10)
        //3
        val ques11 = DataClassQuestionAnswer("What is LITERATURE?",
            "A. Literature refers to written or spoken works that are considered to have artistic, intellectual, or cultural value.",
            "B. Literature is just a collection of words with no real meaning.",
            "C. Literature is solely for entertainment and has no educational value.",
            "D. Literature is always written by famous authors and is never produced by ordinary people.",
            1)
        questionList.add(ques11)
        val ques12 = DataClassQuestionAnswer("What is the example of FICTION? Choose the following",
            "A. The Hobbit",
            "B.  Romeo and Juliet",
            "C. The Diary of a Young Girl",
            "D. To Kill a Mockingbird",
            4)
        questionList.add(ques12)
        val ques13 = DataClassQuestionAnswer("What is the example of NON-FICTION? Choose the following",
            "A. The Hobbit",
            "B.  Romeo and Juliet",
            "C. The Diary of a Young Girl",
            "D. To Kill a Mockingbird",
            3)
        questionList.add(ques13)
        val ques14 = DataClassQuestionAnswer("What is the example of FANTASY? Choose the following",
            "A. The Hobbit",
            "B.  Romeo and Juliet",
            "C. The Diary of a Young Girl",
            "D. To Kill a Mockingbird",
            1)
        questionList.add(ques14)
        val ques15 = DataClassQuestionAnswer("What is the example of DRAMA? Choose the following",
            "A. The Hobbit",
            "B.  Romeo and Juliet",
            "C. The Diary of a Young Girl",
            "D. To Kill a Mockingbird",
            2)
        questionList.add(ques15)
        //4
        val ques16 = DataClassQuestionAnswer("What is FOLK LORE?",
            "A. Folklore is always based on historical facts and events.",
            "B. Folklore is a static and unchanging form of cultural expression.",
            "C. Folklore is limited to stories passed down only through written records.",
            "D. Folklore is traditional beliefs, stories, and customs passed down through generations orally.",
            4)
        questionList.add(ques16)
        val ques17 = DataClassQuestionAnswer("What is the example of MYTHS? Choose the following",
            "A. Cinderella",
            "B. Greek Mythology",
            "C. King Arthur and the Sword in the Stone",
            "D. The Little Red Hen",
            2)
        questionList.add(ques17)
        val ques18 = DataClassQuestionAnswer("What is the example of LEGENDS? Choose the following",
            "A. Cinderella",
            "B. Greek Mythology",
            "C. King Arthur and the Sword in the Stone",
            "D. The Little Red Hen",
            3)
        questionList.add(ques18)
        val ques19 = DataClassQuestionAnswer("What is the example of FAIRY TALES? Choose the following",
            "A. Cinderella",
            "B. Greek Mythology",
            "C. King Arthur and the Sword in the Stone",
            "D. The Little Red Hen",
            1)
        questionList.add(ques19)
        val ques20 = DataClassQuestionAnswer("What is the example of FOLKTALE? Choose the following",
            "A. Cinderella",
            "B. Greek Mythology",
            "C. King Arthur and the Sword in the Stone",
            "D. The Little Red Hen",
            4)
        questionList.add(ques20)
        //5
        val ques21 = DataClassQuestionAnswer("What is VERB?",
            "A. A verb is a type of punctuation mark used to separate sentences.",
            "B. Verbs are words that express actions, occurrences, or states.",
            "C. Verbs are not action words and never express a state or condition.",
            "D. Verbs are pronounced the same way in all languages and have no variations.",
            2)
        questionList.add(ques21)
        val ques22 = DataClassQuestionAnswer("What is the example of PAST TENSE? Choose the following",
            "A. I eat lunch at 12 PM.",
            "B. Yesterday, I ate a delicious pizza.",
            "C. I will eat breakfast tomorrow.",
            "D. By next week, I will have eaten all the cookies.",
            1)
        questionList.add(ques22)
        val ques23 = DataClassQuestionAnswer("What is the example of PRESENT TENSE? Choose the following",
            "A. I eat lunch at 12 PM.",
            "B. Yesterday, I ate a delicious pizza.",
            "C. I will eat breakfast tomorrow.",
            "D. By next week, I will have eaten all the cookies.",
            2)
        questionList.add(ques23)
        val ques24 = DataClassQuestionAnswer("What is the example of FUTURE TENSE? Choose the following",
            "A. I eat lunch at 12 PM.",
            "B. Yesterday, I ate a delicious pizza.",
            "C. I will eat breakfast tomorrow.",
            "D. By next week, I will have eaten all the cookies.",
            3)
        questionList.add(ques24)
        val ques25 = DataClassQuestionAnswer("What is the example of FUTURE PERFECT TENSE? Choose the following",
            "A. I eat lunch at 12 PM.",
            "B. Yesterday, I ate a delicious pizza.",
            "C. I will eat breakfast tomorrow.",
            "D. By next week, I will have eaten all the cookies.",
            4)
        questionList.add(ques25)
        return questionList
    }
}