class User (var firstName: String = "Peter", var secondName: String = "Simpson"){
    var login: String? = null
    set(value) {
        if(value == "Codi"){
            field = "None"
        }
        else{
            field = value
        }
        println("Variable: $field")
    }
    get() {
        val lognField = field ?: "Unknown"
        println("Variable equals: $lognField")
        return field
    }

        fun printUser(){
         println("$firstName $secondName")
    }
//    var firstName: String = _firstName
//    var secondName: String = _secondName

//    init {
//        firstName = _firstName
//        secondName = _secondName
//    }

//    constructor(): this("Peter", "Simpson"){
//        println("Data is set")
//    }
//
//    constructor(firstName: String): this(firstName, "Simpson"){
//        println("Data is set")
//    }

}


