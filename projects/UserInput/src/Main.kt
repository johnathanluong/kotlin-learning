package userinput

fun main(){
    print("Enter some words or whatever... ")
    val userInput = readLine()
    println("User entered: ${userInput?.uppercase()}")

    if(userInput != null){
        println("User entered: ${userInput.uppercase()}")
    }

}