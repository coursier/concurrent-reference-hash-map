
inThisBuild(List(
  organization := "io.github.alexarchambault",
  homepage := Some(url("https://github.com/alexarchambault/concurrent-reference-hash-map")),
  licenses := List("GNU LGPL 2.1" -> url("https://www.gnu.org/licenses/old-licenses/lgpl-2.1.html")),
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
