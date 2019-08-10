object LearningScala1 {
  // Los valores son constantes inmutables. No puede cambiarlos una vez definidos.
  val hello: String = "Hola!"                     //> hello  : String = Hola!
  println(hello)                                  //> Hola!
  
  
  // Las VARIABLES son mutables
  var helloThere: String = hello                  //> helloThere  : String = Hola!
  helloThere = hello + " There!"
  println(helloThere)                             //> Hola! There!
  
  
  // Intente utilizar operaciones que transformen objetos inmutables en un nuevo objeto inmutable.
  // Por ejemplo, podríamos haber hecho lo mismo así:
  val immutableHelloThere = hello + "There!"      //> immutableHelloThere  : String = Hola!There!
  println(immutableHelloThere)                    //> Hola!There!
  
  // Algunos otros tipos
  val numberOne : Int = 1                         //> numberOne  : Int = 1
  val truth : Boolean = true                      //> truth  : Boolean = true
  val letterA : Char = 'a'                        //> letterA  : Char = a
  val pi : Double = 3.14159265                    //> pi  : Double = 3.14159265
  val piSinglePrecision : Float = 3.14159265f     //> piSinglePrecision  : Float = 3.1415927
  val bigNumber : Long = 1234567890l              //> bigNumber  : Long = 1234567890
  val smallNumber : Byte = 127                    //> smallNumber  : Byte = 127
  
  // Trucos de impresión de cadena
  // Concatenar usando +
  println("Here is a mess: " + numberOne + truth + letterA + pi + bigNumber)
                                                  //> Here is a mess: 1truea3.141592651234567890
  
  // printf:
  println(f"Pi is about $piSinglePrecision%.3f")  //> Pi is about 3,142
  println(f"Zero padding on the left: $numberOne%05d")
                                                  //> Zero padding on the left: 00001
                                                  
  // Sustituyendo en variables:
  println(s"I can use the s prefix to use variables like $numberOne $truth $letterA")
                                                  //> I can use the s prefix to use variables like 1 true a
  // Sustituir usando llaves:
  println(s"The s prefix isn't limited to variables; I can include any expression. Like ${1+2}")
                                                  //> The s prefix isn't limited to variables; I can include any expression. Like
                                                  //|  3
                                                 
  // Usando expresiones regulares:
  val theUltimateAnswer: String = "To life, the universe, and everything is 42."
                                                  //> theUltimateAnswer  : String = To life, the universe, and everything is 42.
                                                  //| 
  val pattern = """.* ([\d]+).*""".r              //> pattern  : scala.util.matching.Regex = .* ([\d]+).*
  val pattern(answerString) = theUltimateAnswer   //> answerString  : String = 42
  val answer = answerString.toInt                 //> answer  : Int = 42
  println(answer)                                 //> 42
  
  // Buleanos
  val isGreater = 1 > 2                           //> isGreater  : Boolean = false
  val isLesser = 1 < 2                            //> isLesser  : Boolean = true
  val impossible = isGreater & isLesser           //> impossible  : Boolean = false
  val anotherWay = isGreater && isLesser          //> anotherWay  : Boolean = false
  
  val picard: String = "Picard"                   //> picard  : String = Picard
  val bestCaptain: String = "Picard"              //> bestCaptain  : String = Picard
  val isBest: Boolean = picard == bestCaptain     //> isBest  : Boolean = true
  
}