enum class Compass (var shortName: Char) {
    NORTH('N'){
        override fun displayIt(){
            println("This is North.")
        }
    },
    SOUTH('S'){
        override fun displayIt(){
            println("This is South.")
        }
    },
    EAST('E'){
        override fun displayIt(){
            println("This is East.")
        }
    },
    WEST('W'){
        override fun displayIt(){
            println("This is West.")
        }
    };

    abstract fun displayIt()
}