package com.example.myapplication

object EnglishTitleDescriptionRepository {
    fun getTitleDescriptions(): ArrayList<DataClassTitleDescription> {
        val descriptionList = ArrayList<DataClassTitleDescription>()
        val desc1 = DataClassTitleDescription(
            "Sentence",
            "A \"sentence meaning\" refers to the intended message or information conveyed by a sentence.",
            "It's the main idea or communication within a sentence. ",
            "Declarative, Interrogative, Imperative, Exclamatory",
            R.drawable.englishvector1,
            R.drawable.englishvector2
        )
        descriptionList.add(desc1)
        val desc2 = DataClassTitleDescription(
            "Declarative Sentence",
            "A declarative sentence makes a statement or provides information.",
            "The cat is sleeping on the windowsill",
            "Water boils at 100 degrees Celsius.",
            R.drawable.cat,
            R.drawable.boil
        )
        descriptionList.add(desc2)
        val desc3 = DataClassTitleDescription(
            "Interrogative",
            "Interrogative sentences are used to ask questions or seek information.",
            "What is your name?",
            "Have you finished your homework?",
            R.drawable.askingname,
            R.drawable.finishedhomework
        )
        descriptionList.add(desc3)
        val desc4 = DataClassTitleDescription(
            "Imperative",
            "Imperative sentences are used to give commands, make requests, or offer advice",
            "Please close the door when you leave.",
            "Pass the salt, please.",
            R.drawable.closingdoor,
            R.drawable.givingsalt
        )
        descriptionList.add(desc4)
        val desc5 = DataClassTitleDescription(
            "Exclamatory",
            "Exclamatory sentences are used to express strong emotions, excitement, surprise, or enthusiasm. ",
            "Wow, that's an incredible sunset!",
            "Ouch, that really hurt!",
            R.drawable.sunset,
            R.drawable.masakit
        )
        descriptionList.add(desc5)
        val desc6 = DataClassTitleDescription(
            "Figure of Speech",
            "A figure of speech is a word or phrase used in a non-literal sense for rhetorical or vivid effect.",
            "A figure of speech is a non-literal language expression for emphasis.",
            "Simile, Hyperbole, Metaphor, Onomotopoeia, Personification",
            R.drawable.filipinovector3,
            R.drawable.filipinovector5
        )
        descriptionList.add(desc6)
        val desc7 = DataClassTitleDescription(
            "Simile",
            "A simile is a comparison between two unlike things using \"like\" or \"as.\" It is used to highlight a similarity or create a vivid image.",
            "Her smile was as bright as the morning sun.",
            "He fought like a lion on the battlefield.",
            R.drawable.girlsmile,
            R.drawable.soldier
        )
        descriptionList.add(desc7)
        val desc8 = DataClassTitleDescription(
            "Hyperbole",
            "Hyperbole involves exaggeration for emphasis or effect. It's used to create a dramatic or comedic impact.",
            "I've told you a million times.",
            "This bag weighs a ton!",
            R.drawable.persontelling,
            R.drawable.mabigat
        )
        descriptionList.add(desc8)
        val desc9 = DataClassTitleDescription(
            "Personification",
            "Ito ay uri ng tayutay na pagbibigay ng mga katangian ng tao sa mga bagay o hayop.",
            "The waves roar their anger at the shore.",
            "The clouds drift in the sky like soft blankets.",
            R.drawable.waves,
            R.drawable.clouds
        )
        descriptionList.add(desc9)
        val desc10 = DataClassTitleDescription(
            "Onomatopoeia",
            "Onomatopoeia is the use of words that imitate or resemble the sound they describe.",
            "The bees BUZZED around the flowers.",
            "The thunder ROARED in the distance.",
            R.drawable.bees,
            R.drawable.thundercloud
        )
        descriptionList.add(desc10)
        val desc11 = DataClassTitleDescription(
            "Literature",
            "Literature refers to written or spoken works that are considered to have artistic, intellectual, or cultural value. ",
            "Written works of art, including novels, poetry, and plays.. ",
            "Fiction, Non-Fiction, Fantasy, Drama",
            R.drawable.panitikanvector,
            R.drawable.panitkanvector2
        )
        descriptionList.add(desc11)
        val desc12 = DataClassTitleDescription(
            "Fiction",
            "This genre consists of imaginative or invented stories that are not based on real events.",
            "To Kill a Mockingbird by Harper Lee",
            "The Catcher in the Rye by J.D. Salinger",
            R.drawable.tokillamockingbird,
            R.drawable.thecatcherrye
        )
        descriptionList.add(desc12)
        val desc13 = DataClassTitleDescription(
            "Non-Fiction",
            "Non-fiction literature includes factual and informative works that are based on real events, people, or subjects.",
            "The Diary of a Young Girl by Anne Frank",
            "The Selfish Gene by Richard Dawkins",
            R.drawable.thediaryofyounggirl,
            R.drawable.theselfishgene
        )
        descriptionList.add(desc13)
        val desc14 = DataClassTitleDescription(
            "Fantasy",
            "Fantasy literature involves stories set in imaginary worlds with magical or supernatural elements.",
            "The Hobbit by J.R.R ",
            "Harry Potter and the Sorcerer's Stone",
            R.drawable.thehobbit,
            R.drawable.harrypoter
        )
        descriptionList.add(desc14)
        val desc15 = DataClassTitleDescription(
            "Drama",
            "Drama involves the presentation of a story through the performance of actors in a theater or onscreen.",
            " Death of a Salesman",
            "   Romeo at Juliet",
            R.drawable.deathofsalesman,
            R.drawable.romeoandjuliet
        )
        descriptionList.add(desc15)
        val desc16 = DataClassTitleDescription(
            "Folk Lore",
            "This refers to the traditional beliefs, customs, stories, songs, and practices that are passed down orally from one generation to another",
            "This is traditional beliefs, stories, and customs passed down through generations orally.",
            "Myths, Legends, Fairy Tales, Folktale",
            R.drawable.filipinovector3,
            R.drawable.filipinovector4
        )
        descriptionList.add(desc16)
        val desc17 = DataClassTitleDescription(
            "Myths",
            "Ito ay nakaugalian nang sabihin at nagsisilbing batas at tuntunin ng kagandahang-asal ng ating mga ninuno.",
            "Greek Mythology.",
            "Ragnarok Norse Mythology.",
            R.drawable.greekmythology,
            R.drawable.ragnarok
        )
        descriptionList.add(desc17)
        val desc18 = DataClassTitleDescription(
            "Legends",
            "Its a narratives that may be based on real historical events but have become embellished or transformed over time.",
            "King Arthur and the Sword in the Stone.",
            "Robin Hood.",
            R.drawable.kingarthur,
            R.drawable.robinhood
        )
        descriptionList.add(desc18)
        val desc19 = DataClassTitleDescription(
            "Fairy Tales",
            "Ito ay mga palaisipan o pahulaan na karaniwang may mga malalalim na kahulugan.",
            "Cinderella",
            "Hansel and Gretel",
            R.drawable.cinderella,
            R.drawable.hanselandgretel
        )
        descriptionList.add(desc19)
        val desc20 = DataClassTitleDescription(
            "Folktale",
            "These are traditional stories that have been passed down through generations ",
            "The Boy Who Cried Wolf",
            "The Little Red Hen",
            R.drawable.theboywhocriedwolf,
            R.drawable.thelittlehen
        )
        descriptionList.add(desc20)
        val desc21 = DataClassTitleDescription(
            "Verb",
            "Verbs are words that express actions, occurrences, or states.",
            "They are an essential part of grammar and are used in different tenses to indicate when an action or state occurs.",
            "Present Tense, Past Tense, Future Tense, Future Perfect Tense",
            R.drawable.filipinovector6,
            R.drawable.filipinovector5
        )
        descriptionList.add(desc21)
        val desc22 = DataClassTitleDescription(
            "Present Tense",
            "This indicates an action or state that is happening now, in the present.",
            "I eat breakfast every morning.",
            "She sings beautifully.",
            R.drawable.eatingbreakfast,
            R.drawable.girlsing
        )
        descriptionList.add(desc22)
        val desc23 = DataClassTitleDescription(
            "Past Tense",
            "This indicates an action or state that happened in the past.",
            "They visited Paris last summer.",
            "He worked late yesterday..",
            R.drawable.paris,
            R.drawable.latework
        )
        descriptionList.add(desc23)
        val desc24 = DataClassTitleDescription(
            "Future Tense",
            "This indicates an action or state that will happen in the future.",
            "I will travel to Japan next year.",
            "She is going to start a new job.",
            R.drawable.traveljapan,
            R.drawable.newjob
        )
        descriptionList.add(desc24)
        val desc25 = DataClassTitleDescription(
            "Future Perfect Tense",
            "his indicates an action that will be completed before a specified time in the future.",
            "I will have graduated by the end of the year.",
            "They will have finished their project by tomorrow.",
            R.drawable.graduate,
            R.drawable.projectfinish
        )
        descriptionList.add(desc25)
        return descriptionList
    }
}