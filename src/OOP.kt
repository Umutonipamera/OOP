fun main(){
var gari=Car("Nissan","leaf","KDA379G",0)
    gari.start()
    println(gari.speed)
    gari.acceleration(50)
    println(gari.speed)
    gari.hoot()
    var pen = BirePen()
    pen.write()
}
class Car(  var make:String, var model:String,var registration:String,var speed:Int) {
    fun start() {
        println("I am starting")
    }
    fun acceleration(acceleration: Int): Int {
        speed = speed + acceleration
        return speed
    }
    fun hoot(){
        println( "A car is hooting")
    }
}
class BirePen() {
    fun write() {
        println("I am writing")
    }
}
data class registration( val name:String,var location:String,var age:Int,)