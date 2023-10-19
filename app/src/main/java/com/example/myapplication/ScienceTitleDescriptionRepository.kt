package com.example.myapplication

object ScienceTitleDescriptionRepository {
    fun getTitleDescriptions(): ArrayList<DataClassTitleDescription> {
        val descriptionList = ArrayList<DataClassTitleDescription>()
        val desc1 = DataClassTitleDescription(
            "Cell",
            "Cells are the basic building blocks of all living organisms.",
            "They come in various shapes and sizes, but they share common structural components.",
            "Cell-Membrane, Cytoplasm, Nucleus, Mitochondria",
            R.drawable.sciencevector,
            R.drawable.alberteintein
        )
        descriptionList.add(desc1)
        val desc2 = DataClassTitleDescription(
            "Cell-Membrane",
            "The outer boundary of the cell, controlling what enters and exits the cell.",
            "Nutrient Uptake.",
            "Protection from Toxins.",
            R.drawable.cellmembrane1,
            R.drawable.cellmembrane2
        )
        descriptionList.add(desc2)
        val desc3 = DataClassTitleDescription(
            "Cytoplasm",
            "The gel-like substance that fills the cell and houses various organelles.",
            "Plant Cell",
            "Animal Cell",
            R.drawable.plantcell,
            R.drawable.animalcell
        )
        descriptionList.add(desc3)
        val desc4 = DataClassTitleDescription(
            "Nucleus",
            "he control center of the cell, containing genetic material (DNA) that directs cell activities.",
            "Genetic Information",
            "Cell Division.",
            R.drawable.nucleus,
            R.drawable.genetic
        )
        descriptionList.add(desc4)
        val desc5 = DataClassTitleDescription(
            "Mitochondria",
            "Organelles responsible for producing energy (ATP) through cellular respiration. ",
            "ATP Production",
            "Apoptosis",
            R.drawable.mitchondria,
            R.drawable.apoptosis
        )
        descriptionList.add(desc5)
        val desc6 = DataClassTitleDescription(
            "Solar System",
            "The solar system is a fascinating topic in science, offering a wide range of information for learners of all ages.",
            "The solar system is a collection of celestial bodies that orbit the Sun. ",
            "Star, Planets, Comets, Asteroid",
            R.drawable.solarsystem,
            R.drawable.solarsystem2
        )
        descriptionList.add(desc6)
        val desc7 = DataClassTitleDescription(
            "Star",
            "A star is a luminous celestial object consisting primarily of hydrogen and helium gas that emits light and heat energy through nuclear fusion reactions in its core.",
            "One of the biggest star is: Sun.",
            "The primary source of a star's energy is nuclear fusion, which occurs in its core.",
            R.drawable.sun,
            R.drawable.nuclearfusion
        )
        descriptionList.add(desc7)
        val desc8 = DataClassTitleDescription(
            "Planets",
            "Planets are celestial objects that orbit stars, including our Sun, and they lack the ability to generate their own light.",
            "There are eight recognized planets in the solar system, in order of their distance from the Sun",
            "They lack the ability to generate their own light.",
            R.drawable.planets,
            R.drawable.circleblack
        )
        descriptionList.add(desc8)
        val desc9 = DataClassTitleDescription(
            "Galaxy",
            "A galaxy is a vast system of stars, stellar remnants, interstellar gas, dust, and dark matter bound together by gravity.",
            "The Milky Way",
            "The Andromeda Galaxy",
            R.drawable.milkyway,
            R.drawable.andromeda
        )
        descriptionList.add(desc9)
        val desc10 = DataClassTitleDescription(
            "Asteroid",
            " Asteroids are rocky or metallic objects that orbit the Sun, primarily found in the asteroid belt.",
            "Ceres is the largest asteroid in asteroid belt",
            "The thunder ROARED in the distance.",
            R.drawable.asteroid,
            R.drawable.asteroidbelt
        )
        descriptionList.add(desc10)
        val desc11 = DataClassTitleDescription(
            "Animals",
            "Animals are a highly diverse group of living organisms that can be categorized in various ways based on their characteristics and evolutionary relationships. ",
            "Veterbrates ",
            "Invertebrates",
            R.drawable.vertebrate,
            R.drawable.invertebrate
        )
        descriptionList.add(desc11)
        val desc12 = DataClassTitleDescription(
            "Mammals",
            "Warm-blooded vertebrates that typically have hair or fur, mammary glands, and give birth to live young",
            "Zebra",
            "Rhino",
            R.drawable.zebra,
            R.drawable.rhino
        )
        descriptionList.add(desc12)
        val desc13 = DataClassTitleDescription(
            "Reptiles",
            "Cold-blooded vertebrates with scales. They include snakes, lizards, turtles, and crocodiles.",
            "Alligator",
            "Turtle",
            R.drawable.alligator,
            R.drawable.turtle
        )
        descriptionList.add(desc13)
        val desc14 = DataClassTitleDescription(
            "Amphibians",
            "Cold-blooded vertebrates with moist, permeable skin. They typically have an aquatic larval stage and include frogs, toads, and salamanders.",
            "Frog",
            "Salamander",
            R.drawable.frog,
            R.drawable.salamander
        )
        descriptionList.add(desc14)
        val desc15 = DataClassTitleDescription(
            "Birds",
            "Warm-blooded vertebrates characterized by feathers, beaks, and the ability to fly.",
            "Eagle",
            "Sparrow",
            R.drawable.eagle,
            R.drawable.sparrow
        )
        descriptionList.add(desc15)
        val desc16 = DataClassTitleDescription(
            "Scientist",
            "A scientist is a person who engages in scientific research and investigation to gain a better understanding of the natural world and its underlying principles. ",
            "Famous scientists whose groundbreaking discoveries and contributions have shaped our understanding of the natural world",
            "Isaac Newton, Charles Darwin, Albert Einstein, Galileo Galilei",
            R.drawable.famousscientist,
            R.drawable.bigidea
        )
        descriptionList.add(desc16)
        val desc17 = DataClassTitleDescription(
            "Isaac Newton",
            "Newton formulated the law that describes the gravitational attraction between objects.",
            "His work in mathematics and physics laid the foundation for classical mechanics.",
            "Discovered Law of Universal Gravitation ",
            R.drawable.isaac_newton,
            R.drawable.gravity
        )
        descriptionList.add(desc17)
        val desc18 = DataClassTitleDescription(
            "Charles Darwin",
            "Darwin's theory of evolution by natural selection explains how species evolve over time",
            "Charles Darwin is best known for his pioneering work in the field of biology.",
            "Discovered Theory of Evolution",
            R.drawable.charlesdarwin,
            R.drawable.evolution
        )
        descriptionList.add(desc18)
        val desc19 = DataClassTitleDescription(
            "Albert Einstein",
            "Einstein's theory of relativity introduced new concepts of space, time, and energy, with the famous equation E=mc².",
            "Albert Einstein is best known for his pioneering work in the field of physics.",
            "Discovered Theory of Relativity",
            R.drawable.alberteintein,
            R.drawable.relativity
        )
        descriptionList.add(desc19)
        val desc20 = DataClassTitleDescription(
            "Galileo Galilei",
            "He made significant discoveries, including observations of the Moon, Jupiter's moons, and the phases of Venus",
            "Galileo was the first to use a telescope for astronomical observations.",
            "Created Telescope Observation",
            R.drawable.galileo,
            R.drawable.telescope
        )
        descriptionList.add(desc20)
        val desc21 = DataClassTitleDescription(
            "Matter",
            "States of matter refer to the distinct physical forms in which matter can exist, depending on its temperature and pressure conditions.",
            "Matter is everything that has mass and occupies space.",
            "Solid, Liquid, Gas and fourth state Plasma",
            R.drawable.statesofmatter,
            R.drawable.filipinovector5
        )
        descriptionList.add(desc21)
        val desc22 = DataClassTitleDescription(
            "Solid",
            "In the solid state, particles (atoms, molecules, or ions) are closely packed and arranged in a regular, repeating pattern.",
            "Crystal",
            "Rock",
            R.drawable.crystal,
            R.drawable.rock
        )
        descriptionList.add(desc22)
        val desc23 = DataClassTitleDescription(
            "Liquid",
            "Liquids have particles that are more loosely packed than in solids.",
            "Water",
            "Liquid",
            R.drawable.water,
            R.drawable.liquid
        )
        descriptionList.add(desc23)
        val desc24 = DataClassTitleDescription(
            "Gas",
            "Gases have particles that are widely separated and have high kinetic energy.",
            "Gas",
            "Hot Air Balloon",
            R.drawable.gas,
            R.drawable.hotairballoon
        )
        descriptionList.add(desc24)
        val desc25 = DataClassTitleDescription(
            "Plasma",
            "Plasma is a high-energy, electrically charged state of matter where electrons have been stripped from atoms or molecules.",
            "Blood",
            "Bag of Blood",
            R.drawable.blood,
            R.drawable.bagofplasma
        )
        descriptionList.add(desc25)
        return descriptionList
    }
}