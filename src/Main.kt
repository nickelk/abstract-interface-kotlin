fun main(args: Array<String>) {
    val user = MainProvider()
    user.printInfo(User())
    println(user.getConnection())
}