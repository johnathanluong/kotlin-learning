package helloworld

import java.util.*

fun main(){
    // Printing
    println("Hello World, I'm Kotlin!")
    println()
    println("New line and stuff")

    // Variable declaration
    var myVar: Int = 2
    val myVal: Int = 3
    var myBool: Boolean = true
    println(myVar)
    myVar = 1

    // Template literals
    print("The new value of myVar is: $myVar.")
    print(" this should be on the same line.")
    println(myBool)

    // Arithmetic
    val result: Int = myVar + myVal + 3
    println("$myVar + $myVal + 3 = $result")

    // Variables store result and don't update if parts change
    myVar += 10
    println("Template literal: $myVar + $myVal + 3 = ${myVar + myVal + 3}")
    println("Result: $myVar + $myVal + 3 = $result")

    // Integer division if both values are integers
    val intDivision = myVar / myVal
    println("$myVar / $myVal = $intDivision")

    // Float division if at least 1 value is a float/double
    val myFloat: Float = 20f
    println("$myFloat / $myVar = ${myFloat / myVar}")

    // Calculate the volume of a sphere
    val sphereRadius = 20
    println("Given sphere radius = $sphereRadius, volume of sphere = ${0.75 * 3.1415 * sphereRadius * sphereRadius * sphereRadius}")

    // Strings
    val string: String = "example"
    println("The string is: $string")
    println("String length: ${string.length}")
    println("char at index 2 of string: ${string[2]}")
    println("toUppercase: ${string.uppercase()}")
    println("JOHNATHAN".uppercase().reversed())

    val x = 2
    val y = 2
    if(x < y || x * y == 4){
        println("thing1")
    }
    else{
        println("thing2")
    }

    val z = if(x + y == 4) 3 else 4
    println(z)

    val word = "racecar"
    if(word == word.reversed()){
        println("$word is a palindrome")
    }
    else{
        println("$word is not a palindrome")
    }

    var l = 0
    var r = word.length - 1
    var isPalindrome = true
    while(l < r) {
        if(word[l] != word[r]){
            isPalindrome = false
        }
        l += 1
        r -= 1
    }

    println("Result of two pointer palindrome: $isPalindrome")
}