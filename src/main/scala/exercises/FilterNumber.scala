package exercises



object FilterNumber {
  def main(args: Array[String]){
    val lista = List.range(1,21)
    
    for (x <- lista){
      if (x % 3 == 0){
        println(x)
      }
    }
    println("\n")
    //filter
    lista.filter( _%3 == 0).foreach(println)
  }
}