// Turn this project into a Scala.js project by importing these settings
enablePlugins(ScalaJSPlugin)

name := "$name$"

version := "$version$"

scalaVersion := "2.11.7"

persistLauncher := true

persistLauncher in Test := false

libraryDependencies ++= Seq(
  "org.scala-lang.modules" % "scala-async_2.11" % "0.9.6-RC2",
  "org.scala-js" %%% "scalajs-dom" % "0.8.2",
  "com.lihaoyi" %%% "scalatags" % "0.5.3"
)
