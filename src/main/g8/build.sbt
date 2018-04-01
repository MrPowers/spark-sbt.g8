resolvers += "jitpack" at "https://jitpack.io"

name := "$name$"

version := "$version$"

scalaVersion := "$scalaVersion$"

sparkVersion := "$sparkVersion$"

sparkComponents ++= Seq("sql")

libraryDependencies += "com.github.mrpowers" % "spark-daria" % "v2.3.0_0.18.0"

libraryDependencies += "com.github.mrpowers" % "spark-fast-tests" % "v2.3.0_0.7.0" % "test"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

fork in Test := true
javaOptions ++= Seq("-Xms512M", "-Xmx2048M", "-XX:MaxPermSize=2048M", "-XX:+CMSClassUnloadingEnabled")
