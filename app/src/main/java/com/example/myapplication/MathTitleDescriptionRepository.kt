package com.example.myapplication

object MathTitleDescriptionRepository {
    fun getTitleDescriptions(): ArrayList<DataClassTitleDescription> {
        val descriptionList = ArrayList<DataClassTitleDescription>()
        val desc1 = DataClassTitleDescription(
            "Linear Function",
            "A linear function of x takes the form: f(x) = ax + b, where \"a\" and \"b\" are constants.",
            "For example of function, f(x) = 2x + 3 where x is 2 ",
            "For example of function, f(x) = 6x + 1 - x where x is 3 ",
            R.drawable.fx,
            R.drawable.fx2
        )
        descriptionList.add(desc1)
        val desc2 = DataClassTitleDescription(
            "Quadratic Function",
            " A quadratic function of x is of the form: f(x) = ax^2 + bx + c, where \"a,\" \"b,\" and \"c\" are constants.",
            "For instance, f(x) = 6x2 - 4x + 4 where x is 5",
            "For instance, f(x) = 6x + 1 + x where x is 3 ",
            R.drawable.fx4,
            R.drawable.fx3
        )
        descriptionList.add(desc2)
        val desc3 = DataClassTitleDescription(
            "Exponential Function",
            "An exponential function of x is given as: f(x) = a^x, where \"a\" is a positive constant.",
            "For example, f(x) = 2^x represents exponential growth.",
            "For example, f(x) = -4^x + 5 represents exponential growth",
            R.drawable.fx5,
            R.drawable.fx6
        )
        descriptionList.add(desc3)
        val desc4 = DataClassTitleDescription(
            "Celsius",
            "Celsius (symbol: °C) is a temperature scale used in most of the world for measuring temperature.",
            "To convert from Celsius to Kelvin, K=°C+273.15",
            "To convert from Celsius to Fahrenheit, °F=(°C×9/5)+32",
            R.drawable.celsius1,
            R.drawable.celsius2
        )
        descriptionList.add(desc4)
        val desc5 = DataClassTitleDescription(
            "Kelvin",
            "Kelvin (symbol: K) is an absolute temperature scale commonly used in scientific and engineering contexts.",
            "To convert from Kelvin to Celsius, °C=K−273.15",
            "To convert from Kelvin to Fahrenheit, °F=(K−273.15)× 9/5 + 32",
            R.drawable.kelvin1,
            R.drawable.kelvin2
        )
        descriptionList.add(desc5)
        val desc6 = DataClassTitleDescription(
            "Fahrenheit",
            "Fahrenheit (symbol: °F) is a temperature scale commonly used in the United States and a few other countries.",
            "To convert from Fahrenheit to Celsius, °C=(°F−32)×5/9",
            "To convert from Fahrenheit to Kelvin, K=(°F−32)× 5/9 + 273.15",
            R.drawable.fahrenheit1,
            R.drawable.fahrenheit2
        )
        descriptionList.add(desc6)
        val desc7 = DataClassTitleDescription(
            "Mean",
            "The mean (average) of a data set is found by adding all numbers in the data set and then dividing by the number of values in the set",
            "Average number in group of number",
            "The example is in the picture",
            R.drawable.mean1,
            R.drawable.mean2
        )
        descriptionList.add(desc7)
        val desc8 = DataClassTitleDescription(
            "Median",
            "The median is the middle value when a data set is ordered from least to greatest.",
            "The example is in the picture",
            "Middle number rin group of number",
            R.drawable.median1,
            R.drawable.median2
        )
        descriptionList.add(desc8)
        val desc9 = DataClassTitleDescription(
            "Mode",
            "The mode is the number that occurs most often in a data set.",
            "Most common number in group of number",
            "The example is in the picture",
            R.drawable.mode1,
            R.drawable.mode2
        )
        descriptionList.add(desc9)
        val desc10 = DataClassTitleDescription(
            "Rectangle",
            "The area of a rectangle is calculated by multiplying its length (l) by its width (w):",
            "The formula of Rectangle: Area=l×w",
            "The example is in the picture",
            R.drawable.rectangle1,
            R.drawable.rectangle2
        )
        descriptionList.add(desc10)
        val desc11 = DataClassTitleDescription(
            "Square",
            "Since a square has all sides of equal length, its area is calculated by squaring one side's length (s)",
            "The formula of Rectangle: Area = s**2 ",
            "The example is in the picture",
            R.drawable.square1,
            R.drawable.square2
        )
        descriptionList.add(desc11)
        val desc12 = DataClassTitleDescription(
            "Triangle",
            "The area of a triangle is calculated using its base (b) and height (h):",
            "The formula of Rectangle: Area = 1/2 x b x h",
            "The example is in the picture",
            R.drawable.triangle1,
            R.drawable.triangle2
        )
        descriptionList.add(desc12)
        val desc13 = DataClassTitleDescription(
            "Joule",
            "Joule (J) is the unit of energy in the International System of Units (SI).",
            "E means Energy, F means Force and D means distance",
            "Formula: E = f * d",
            R.drawable.alligator,
            R.drawable.turtle
        )
        descriptionList.add(desc13)
        val desc14 = DataClassTitleDescription(
            "Newton",
            "Newton (N) is the unit of force in the International System of Units (SI). It is named after Sir Isaac Newton, a mathematician, physicist",
            "F means force, M means mass and A means acceleration",
            "Formula: F = m * a",
            R.drawable.frog,
            R.drawable.salamander
        )
        descriptionList.add(desc14)
        val desc15 = DataClassTitleDescription(
            "Speed",
            "Speed is a measure of how quickly an object moves. It quantifies the rate at which an object changes its position with respect to time.",
            "Speed = Distance/Time",
            "The example is in the picture",
            R.drawable.eagle,
            R.drawable.sparrow
        )
        descriptionList.add(desc15)
        return descriptionList
    }
}