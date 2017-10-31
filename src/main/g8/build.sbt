name := "$name$"

version := "$version$"

scalaVersion := "$scalaVersion$"

sparkVersion := "$sparkVersion$"

sparkComponents ++= Seq("sql")

spDependencies += s"mrpowers/spark-daria:${sparkVersion.value}_0.12.0"

libraryDependencies += "MrPowers" % "spark-fast-tests" % s"${sparkVersion.value}_0.5.0" % "test"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

fork in Test := true
javaOptions ++= Seq("-Xms512M", "-Xmx2048M", "-XX:MaxPermSize=2048M", "-XX:+CMSClassUnloadingEnabled")
