import javax.swing.ListModel

fun main(){
println(nameList(listOf("Sarah","jane","Veronicah","catherine","Sharon","Victorine","Mercy","hunter","Pamera","Rebeca",)))
    println(meter(listOf(1.2,1.3,1.4,1.5,1.6,1.7,1.8)))
    var people= listOf(
        People("Ann",18,1.7,60.0),
        People("Wato",19,1.9,60.0),
        People("Celine",28,1.5,70.0),
    )
    var descendingSortedPeople=people.sortedByDescending { people->people.age }
    println(descendingSortedPeople)
    individual()
    println(car(listOf(180,360,170,130)))


}
fun  nameList( names:List<String>):List<String> {
    var k = mutableListOf<String>()
    for (name in names) {
        if (names.indexOf(name)%2 == 0) {
            k.add(name)
        }

    }
   return k

}
data class Person(var average:Double,var total:Double)



fun meter(height:List<Double>):Person{
    var total=height.sum()
    var average=height.average()
    var together=Person(average,total)
    return together
}
data class People(var name:String,var age:Int,var height:Double, var weight:Double)

fun individual(){
    var detail= mutableListOf(
        People("Diana",20,1.8,65.0),
        People("Ruth",16,21.5,45.0),
        People("Eric",30,23.5,67.0),

    )
    detail.addAll(listOf(
        People("Leah",30,23.5,67.0),
        People("Reachel",40,33.5,77.0),
    ))
    println(detail)
}
data class Car(var registration:String,var mileage:Int)
 fun car(mileage:List<Int>):Int{
     var totalmileage=mileage.average().toInt()
     return totalmileage

 }
