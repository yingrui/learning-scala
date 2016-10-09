package me.yingrui.learning.scala.macros

object Hello extends App {

  import HelloMacros._

  // Greeting is a macro that that prints "Hello world!"
  // and the time at the point of running the macro.
  //
  // In other words, it prints the time at the point of compilation:
  println(greeting)

}
