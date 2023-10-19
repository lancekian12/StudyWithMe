package com.example.myapplication

object HistoryTitleDescriptionRepository {
    fun getTitleDescriptions(): ArrayList<DataClassTitleDescription> {
        val descriptionList = ArrayList<DataClassTitleDescription>()
        val desc1 = DataClassTitleDescription(
            "Spanish Colonial Period",
            "The Spanish Colonial Period in the Philippines refers to the era when the Philippines was under Spanish rule.",
            "The Spanish rule lasted over 333 years",
            "Spanish Arrival and Conquest, Spread of Christianity, Filipino Resistance and Revolts, Legacy and the End of Spanish Rule",
            R.drawable.spanish,
            R.drawable.spanisharrival
        )
        descriptionList.add(desc1)
        val desc2 = DataClassTitleDescription(
            "Spanish Arrival and Conquest",
            "The Spanish expedition led by Ferdinand Magellan arrived in the Philippines in 1521 that killed by Lapu-Lapu",
            "Magellan",
            "Lapu-Lapu",
            R.drawable.magellan,
            R.drawable.lapulapu
        )
        descriptionList.add(desc2)
        val desc3 = DataClassTitleDescription(
            "Spread of Christianity",
            "One of the most enduring legacies of the Spanish colonial period is the introduction of Christianity to the Philippines. ",
            "Spanish Missionaries",
            "Christianity",
            R.drawable.missionary,
            R.drawable.christianity
        )
        descriptionList.add(desc3)
        val desc4 = DataClassTitleDescription(
            "Cultural Influence and Language",
            "Spanish influence had a profound impact on Philippine culture and language.",
            "Spanish Language",
            "Maria Clara Dress",
            R.drawable.spanishlanguage,
            R.drawable.mariaclara
        )
        descriptionList.add(desc4)
        val desc5 = DataClassTitleDescription(
            "Filipino Resistance and Revolts",
            "KKK led the Philippine Revolution in the late 19th century.",
            "Jose Rizal open the eyes of the Filipino people to fight the tyranny of Spaniards",
            "Apoptosis",
            R.drawable.phrevolution,
            R.drawable.joserizal
        )
        descriptionList.add(desc5)
        val desc6 = DataClassTitleDescription(
            "Ancient Civilization",
            "An ancient civilization refers to a complex society characterized by various essential elements, including advanced social, political, economic, and cultural structures.",
            "There are periods such as the Bronze Age, Iron Age, and antiquity. ",
            "Ancient Egypt, Ancient Mesopotamian, Ancient Greece, Ancient Indus Civilization",
            R.drawable.solarsystem,
            R.drawable.solarsystem2
        )
        descriptionList.add(desc6)
        val desc7 = DataClassTitleDescription(
            "Ancient Egypt",
            "It is one of the world's most iconic and enduring civilizations, with a history that spans over three millennia.",
            "Pyramid of Giza",
            "The Egyptians developed a calendar based on the lunar and solar cycles.",
            R.drawable.pyramid,
            R.drawable.calendar
        )
        descriptionList.add(desc7)
        val desc8 = DataClassTitleDescription(
            "Ancient Mesopotamian",
            "Ancient Mesopotamia refers to the historical region located in the eastern part of the Fertile Crescent, between the Tigris and Euphrates rivers.",
            "Summeranians",
            "Babylonians",
            R.drawable.summeranians,
            R.drawable.babylonians
        )
        descriptionList.add(desc8)
        val desc9 = DataClassTitleDescription(
            "Ancient Greece",
            "Ancient Greece refers to the period in history, roughly from the 9th century BCE to the 6th century CE",
            "Athenian Democracy",
            "Classical Greek Art and Architecture:",
            R.drawable.athenians,
            R.drawable.architecture
        )
        descriptionList.add(desc9)
        val desc10 = DataClassTitleDescription(
            "Ancient Indus Civilization",
            "The Indus Valley Civilization, also known as the Harappan Civilization, was an ancient urban civilization that thrived in what is now modern-day Pakistan and India",
            "Harappan Seals",
            "Great Bath of Mohenjo-Daro",
            R.drawable.harrapanseal,
            R.drawable.harrapanbath
        )
        descriptionList.add(desc10)
        val desc11 = DataClassTitleDescription(
            "Edsa Revolution",
            "It's a series of nonviolent protests and political events in the Philippines that took place from February 22 to February 25, 1986.",
            "The revolution marked a pivotal moment in Philippine history and is considered one of the most significant peaceful uprisings of the 20th century.",
            "Martial Law",
            R.drawable.edsarevolution,
            R.drawable.martiallaw
        )
        descriptionList.add(desc11)
        val desc12 = DataClassTitleDescription(
            "Martial Law",
            "Martial law is a legal and political measure that allows the government, typically headed by the military, to take on expanded powers and authority",
            "Media Suppresion",
            "Control of Authority",
            R.drawable.mediasuppresion,
            R.drawable.power
        )
        descriptionList.add(desc12)
        val desc13 = DataClassTitleDescription(
            "The Spark",
            "The spark where Benigno Ninoy Aquino who was assasinated in 1993 where he exposed the abuse of power and corruption",
            "Ferdinand Marcos",
            "Benigno Ninoy Aquino",
            R.drawable.marcos,
            R.drawable.benignoaquino
        )
        descriptionList.add(desc13)
        val desc14 = DataClassTitleDescription(
            "Gathering at EDSA",
            "The People Power Revolution gained momentum when a large number of civilians, including students, religious groups, and military personnel.",
            "Cory Aquino",
            "Military Personnel of Marcos",
            R.drawable.coryaquino,
            R.drawable.police
        )
        descriptionList.add(desc14)
        val desc15 = DataClassTitleDescription(
            "Legacy",
            "The EDSA Revolution is celebrated as a symbol of the Filipino people's power to peacefully overthrow authoritarian rule.",
            "This date remarks the Edsa Revolution Feb 25, 1986",
            "Vote Wisely for our Country",
            R.drawable.edsarevolution,
            R.drawable.votewisely
        )
        descriptionList.add(desc15)
        val desc16 = DataClassTitleDescription(
            "American Colonial Period ",
            "The American Colonial Period in the Philippines refers to the era when the Philippines was under the colonial rule of the United States.",
            "This period began in 1898 when the United States acquired the Philippines from Spain",
            "Treaty of Paris, Philippine-American War, Civil Government, Independence Day",
            R.drawable.colonial,
            R.drawable.treatyofparis
        )
        descriptionList.add(desc16)
        val desc17 = DataClassTitleDescription(
            "Treaty of Paris",
            "This treaty marked the end of the Spanish-American War and led to the transfer of several territories from Spain to the United States.",
            "Sovereignty over the Philippines from Spain to the United States.",
            "The Treaty of Paris was 1898 a peace aggrement",
            R.drawable.treatyofparis,
            R.drawable.peace
        )
        descriptionList.add(desc17)
        val desc18 = DataClassTitleDescription(
            "Philippine-American War",
            "The Philippine-American War, also known as the Philippine Insurrection or the Filipino-American War, was a conflict that took place from 1899 to 1902.",
            "The annexation of the Philippines by the United States led to the Philippine-American War",
            "Emilio Aguinaldo, fought against American forces in an effort to gain independence.",
            R.drawable.colonial,
            R.drawable.emilioaguinaldo
        )
        descriptionList.add(desc18)
        val desc19 = DataClassTitleDescription(
            "Civil Government",
            "After the war, the United States established a civil government in the Philippines.",
            "William Howard Taft served as first American governor in Philippines",
            "William Howard Taft became the President in United States later on",
            R.drawable.william,
            R.drawable.president
        )
        descriptionList.add(desc19)
        val desc20 = DataClassTitleDescription(
            "Independence Day",
            "The Philippines finally gained full independence from the United States ",
            "This date will mark the Independence day in July 4, 1946.",
            "The country transitioned to a sovereign republic with Manuel Roxas as its first President.",
            R.drawable.independence,
            R.drawable.firstpresident
        )
        descriptionList.add(desc20)
        val desc21 = DataClassTitleDescription(
            "Southeast Asia",
            "Southeast Asia is a region in Asia that is situated to the southeast of the Asian continent.",
            "It comprises the countries and territories located between the Indian Ocean and the Pacific Ocean",
            "This is where our Country Located",
            R.drawable.southeastasia,
            R.drawable.ph
        )
        descriptionList.add(desc21)
        val desc22 = DataClassTitleDescription(
            "Philippines",
            "The Philippines is an archipelagic country located in Southeast Asia, known for its stunning natural beauty, rich cultural diversity, and warm, welcoming people",
            "Philippines was officially recognized to have 7,641 islands",
            "Filipino people are always happy despite of their problems",
            R.drawable.islands,
            R.drawable.filipinopeople
        )
        descriptionList.add(desc22)
        val desc23 = DataClassTitleDescription(
            "Luzon",
            "Luzon is known for its diverse geography, including mountain ranges, volcanoes, plains, and coastal areas. ",
            "Luzon Geography",
            "The Capital of the Philippines: Manila",
            R.drawable.luzon,
            R.drawable.manila
        )
        descriptionList.add(desc23)
        val desc24 = DataClassTitleDescription(
            "Visayas",
            "The region is known for its diverse geography, which includes lush mountains, rolling hills, fertile plains, and beautiful coastlines. ",
            "Visayas Geography",
            "Cebu City is one of the most popular City",
            R.drawable.visayas,
            R.drawable.cebucity
        )
        descriptionList.add(desc24)
        val desc25 = DataClassTitleDescription(
            "Mindanao",
            "Mindanao is known for its diverse and beautiful landscapes, which include mountains, plateaus, fertile plains, lakes, rivers, and coastal areas.",
            "Mindanao Geography",
            "Davao City",
            R.drawable.mindanao,
            R.drawable.davaocity
        )
        descriptionList.add(desc25)
        return descriptionList
    }
}