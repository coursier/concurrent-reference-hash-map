
inThisBuild(List(
  organization := "io.github.alexarchambault",
  homepage := Some(url("https://github.com/coursier/concurrent-reference-hash-map")),
  licenses := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")),
  developers := List(
    Developer(
      "alexarchambault",
      "Alexandre Archambault",
      "",
      url("https://github.com/alexarchambault")
    )
  )
))

crossPaths := false
autoScalaLibrary := false
javacOptions.in(Compile) ++= Seq("-source", "1.8")
javacOptions.in(Compile, compile) ++= Seq("-target", "1.8")
name := "concurrent-reference-hash-map"
