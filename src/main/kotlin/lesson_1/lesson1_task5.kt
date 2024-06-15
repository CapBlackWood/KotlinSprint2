package lesson_1

fun main(){
    var seconds = 6480
    var minute = seconds/60
    var hour = minute/60

    minute = minute%60
    seconds = seconds%60

    println("0$hour:$minute:0$seconds")
}