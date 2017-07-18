name := "$name$"

version := "$version$"

scalaVersion := "$scalaVersion$"

sparkVersion := "$sparkVersion$"

sparkComponents ++= Seq("sql", "hive")

spDependencies += "MrPowers/spark-fast-tests:0.2.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
