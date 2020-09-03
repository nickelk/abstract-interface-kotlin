enum class Animals{
    DOG, CAT, BEAR, LION;

    fun toLowerCase() = name.toLowerCase().capitalize()
}

fun main(args: Array<String>) {
//    val user = NewClass()
//    user.printInfo(User())
//    println(user.getConnection())

    val user = object : MainProvider(){
        override fun printInfo(user: User) {
            super.printInfo(user)
            println("Text from inherited class")
        }
    }

    checkDataTypes(user)

    val animal = Animals.BEAR
    when(animal){
        Animals.CAT -> println("Cat")
        Animals.BEAR -> println(animal.toLowerCase())
        else -> println("Something else")
    }

}

fun checkDataTypes(obj: MainProvider){
    if(obj is UserInfoProvider){
        obj.printInfo(User())
    }
    if(obj is DbConnection){
        println(obj.getConnection())
    }
}