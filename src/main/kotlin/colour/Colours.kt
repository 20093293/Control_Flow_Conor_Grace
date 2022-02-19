class Colours {

    private val colours = listOf("Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Black", "Silver")

    fun getAll (): List<String>{
        //TODO return the colours list
        return colours

    }

    fun numberOfColours (): Int{
        //TODO return the size of the colours list
        return colours.size
    }

    fun firstColour() : String{
        //TODO return the first colour in the list
        return colours.get(0)
    }

    fun lastColour() : String{
        //TODO return the last colour list
        return colours.get(8)
    }

    fun coloursInAlphabeticOrder() : List<String>{
        //TODO return the colours in alphabetical order
        return colours.sorted()
    }

    fun coloursInAllCapitals() : List<String>{
        //TODO return the colours in ALL CAPS
        return listOf("this should return colours in all capitals")
    }

    fun coloursStartingWithLetter(letter: Char) : List<String>{
        //TODO return the colours starting with the letter passed as a parameter
        return colours.filter { it.startsWith( 'B') }
    }

    fun coloursWithSpecificNumberOfChars(size: Int) : List<String>{
        //TODO return the colours that have exactly the same number of chars as the number passed as a parameter
        return colours.filter { it.length == 6 }
    }

    fun coloursWithLessCharsThan(size: Int) : List<String>{
        //TODO return the colours that have less chars than the number passed as s parameter
        return colours.filter { it.length == 6 }
    }

    fun isColourInTheList(colour : String) : Boolean{
        //TODO return true of the colour passed as a parameter is in the list and false otherwise
        // Note: the search should be case insensitive - if blue is passed as a parameter it should find Blue, BLUE etc.
        return colours.contains("Blue")
    }

    //TODO Write THREE additional functions of your choice that will perform some sort of
    // analysis on the colours list.

}