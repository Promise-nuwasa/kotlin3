fun main(){
    name()
    student("Promise",20)
    me()
    anisha("Promise")
    anisha("anisha")

}
fun name(){
    var name = "Akirachix"
    print(name[0])
    print(name[2])
    println(name[3])

}
fun student(name:String,age:Int){
    var x="Promise"
    var y=20
    println("Hi, my name is $name and am $age years old")
}
fun me(){
    var me ="promise"
    println(me.length)
}
fun anisha(name: String){
    if (name == "Promise"){
        println("That is me")

    }
   else{
       println("I don't know who that is")
   }

}