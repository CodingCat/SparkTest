// put this at the top of the file

name := "spark_test"

version := "1.0"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
                "org.apache.spark" %% "spark-core" % "0.9.0-incubating",
                "org.scala-lang" % "scala-reflect" % "2.10.3")

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"
