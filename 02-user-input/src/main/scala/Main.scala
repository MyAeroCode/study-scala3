import scala.io.StdIn.readLine

@main def helloInteractive(): Unit =
  println("What's your name?")
  var name = readLine();

  println("Hello, " + name + "!")
