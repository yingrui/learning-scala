
name := "learning-scala"

lazy val commonSettings = Seq(
  version := "1.0-SNAPSHOT",
  organization := "me.yingrui",
  scalaVersion := "2.11.8",
  scalacOptions ++= Seq("-deprecation", "-feature"),
  libraryDependencies ++= Seq(
    "org.scala-lang" % "scala-reflect" % "2.11.8",
    "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.1"
  )
)

lazy val root = project in file(".") aggregate `scala-macro` aggregate `lib-scala-macro`

lazy val `lib-scala-macro` = project.in(file("lib-scala-macro")).settings(commonSettings: _*)

lazy val `scala-macro` = project.in(file("scala-macro")).dependsOn(`lib-scala-macro`).settings(commonSettings: _*)
