package me.yingrui.learning.scala.macros

import java.util.Date

import scala.language.experimental.macros
import scala.reflect.macros.blackbox.Context

object HelloMacros {

  def greeting: String = macro greetingMacro

  def greetingMacro(c: Context): c.Tree = {
    import c.universe._

    val now = new Date().toString

    q"""
     "Hi! This code was compiled at " +
     $now
     """
  }

}
