package exercises



object StringUpper {
  
  def main(args: Array[String]){
    println(stringUpper("hola"))
    println(stringUpper("adios"))
  }
  
  def stringUpper(x: String) : String = { return x.toUpperCase}
}