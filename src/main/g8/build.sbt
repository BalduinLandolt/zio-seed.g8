// give the user a nice default project!
ThisBuild / organization := "com.example"
ThisBuild / scalaVersion := $scala$

lazy val root = (project in file(".")).
  settings(
    name := "zio-seed.g8"
  )
