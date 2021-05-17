fun main() {
    println(evenTeams(listOf("Manchester United","Arsenal","Cardif City","Roma","Liverpool","Manchester City")))
    println(measurement(listOf(2.34,1.89,1.12,2.34,2.01,1.32,2.34,1.45,2.91,2.22)))
    var personList= mutableListOf<Person>(
        Person("Zillah",22,1.23,55.51),
        Person("Webster",27,2.03,74.6),
        Person("Jabali",12,1.35,34.6),
        Person("Mwimali",23,1.76,64.7)
        )
    println(personList)
    var sortAge=personList.sortedByDescending { human -> human.age }
    println(sortAge)

   println(addPeople(mutableListOf<Person>(
        Person("Zillah",22,1.23,55.51),
        Person("Webster",27,2.03,74.6),
        Person("Jabali",12,1.35,34.6),
        Person("Mwimali",23,1.76,64.7)


            )))
    println(avergeDistance(listOf(
        Car("KDA 359M",11500),
        Car("KCZ 999Z",12000),
        Car("KBA 367Z",9000)

    )))
}
fun evenTeams(teams:List<String>):List<String>{
    var newTeams=teams.filter { team->teams.indexOf(team)%2==0 }
    return newTeams
}
fun measurement(height:List<Double>):Pair<Double,Int>{
    var sum=height.sum()
    var average=height.average()
    return Pair(average,sum.toInt())
}
data class Person(var name:String,var age:Int,var height:Double,var weight:Double)
fun addPeople(personList: MutableList<Person>){
    personList.addAll(
        listOf(
            Person("Kamau",32,2.98,60.10),
            Person("Zawadi",17,1.45,48.92))
    )
    println(personList)
}

data class Car(var registration:String,var mileage:Int)
fun avergeDistance(car:List<Car>):Double{
    var total=0.000
    car.forEach { car ->
        car.mileage
        total += car.mileage
    }
    return total/car.count()
}

