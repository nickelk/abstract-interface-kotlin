class NewClass : MainProvider(){

    override val db: String
        get() = "DB not connected"

    override val info: String
        get() = "New method from inherited class"

    override fun printInfo(user: User) {
        super.printInfo(user)
        println("Text from inherited class")
    }
}