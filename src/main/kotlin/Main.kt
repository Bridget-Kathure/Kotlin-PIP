fun main(){
 school("akirachix")
 myName("Amanda",30)
 name("careny")
 yourName("cynthia")
 studentRecord("John",50,"012345689",60,"burundi")
 isEven(5)
}
fun school(name:String){
 var a = name[0]
 var b = name[2]
 var c = name[3]
 var add = a+""+b+""+c
 println(add)
}
fun myName(name:String,age:Int):String{
 var statement = "Hi,my name is $name and i am $age years old"
 println(statement)
 return(statement)
}
fun name(name:String):Int{
 println(name.length)
 return (name.length)
}
fun yourName(name:String){
 if(name == "Nancy") {
  println("Thats me")
 }
 else{println("I don't know who that is")}
}
fun studentRecord(fullName:String,age:Int,phoneNumber:String,weight:Int,citizen:String){
 println(fullName)
 println(age)
 println(phoneNumber)
 println(weight)
 println(citizen)
 if(citizen == "Kenyan"){
  println("Kenyan")
 }
 else{println("not Kenyan")}
}
fun isEven(number:Int):Boolean{
 var result = number%2 == 0
 println(result)
 return(result)
}
//MARCH-20-2024
fun main(){
 numberAverage(20,18,26);
 userInformation("Fancy",20,"yellow")
 statement("Assessment")
}
//Write a program that calculates the average of three numbers.
// The user should be prompted to enter the three numbers.

fun numberAverage(num1: Int,num2: Int, num3: Int) {
 var ages = (num1 + num2 + num3) / 3
 println(ages)
}

//Write a program that prompts the user to enter their name,
// age, and favourite color, and then prints out a message including all of that information.
fun userInformation(name: String, age: Int, color: String) {
 var sentence = "my name is $name and I am $age years old and my favourite color is $color"
 println(sentence)
}

//write a function that extracts a substring from a given string starting from index 2 to index 5
//using the slice function and return it
fun statement(word: String):String{
 var text=(word.slice(2..5))
 return text
}




