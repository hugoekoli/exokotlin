fun main(){
    var number = readln().toInt()
    var minimum = number
    for (i in 1 .. number) {
      var resultat = readln().toInt()
      if (resultat < minimum){
          resultat = minimum
      }
    }
}