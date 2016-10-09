
name := "learning-scala"

val commonSettings = Seq(
  version := "1.0-SNAPSHOT",
  organization := "me.yingrui",
  scalaVersion := "2.11.8",
  scalacOptions ++= Seq("-deprecation", "-feature"),
  libraryDependencies ++= Seq(
    "org.scala-lang" % "scala-reflect" % scalaVersion.value,
    "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.1",
    "org.specs2" %% "specs2" % "2.3.12" % "test"
  )
)

lazy val root = project in file(".") aggregate `scala-macro` aggregate `lib-scala-macro`

lazy val `scala-macro` = project.in(file("scala-macro")).settings(commonSettings: _*).dependsOn(`lib-scala-macro`)

lazy val `lib-scala-macro` = project.in(file("lib-scala-macro")).settings(commonSettings: _*)