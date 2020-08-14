object Tree extends App {

  println(" ")
  println(" " * 7 + "X" * 1)
  println(" " * 6 + "*" * 3)
  println(" " * 5 + "*" * 5)
  println(" " * 4 + "*" * 7)
  println(" " * 3 + "*" * 9)
  println(" " * 2 + "*" * 11)
  println(" " * 1 + "*" * 13)
  println(" ")


  for (i <- Array(" "*4+"A"," "*3+"*"*3," "*2+"*"*5," "*1+"*"*7,"*"*9))
    println(s"$i")


  Array(" "*4+"X"," "*3+"*"*3," "*2+"-"*5," "*1+"*"*7,"-"*9,"*"*10).foreach(println)


  for (item <- Array(" "*4+"A"," "*3+"*"*3," "*2+"*"*5," "*1+"*"*7,"*"*9)) println(s"$item")
}
