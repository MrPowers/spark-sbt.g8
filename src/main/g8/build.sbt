resolvers += "jitpack" at "https://jitpack.io"

name := "$name$"

version := "$version$"

scalaVersion := "$scalaVersion$"

sparkVersion := "$sparkVersion$"

sparkComponents ++= Seq("sql")

libraryDependencies += "com.github.mrpowers" % "spark-daria" % "v2.3.0_0.18.0"

libraryDependencies += "com.github.mrpowers" % "spark-fast-tests" % "v2.3.0_0.7.0" % "test"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

// test suite settings
fork in Test := true
javaOptions ++= Seq("-Xms512M", "-Xmx2048M", "-XX:MaxPermSize=2048M", "-XX:+CMSClassUnloadingEnabled")
// Show runtime of tests
testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-oD")

// JAR file settings
assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)
assemblyJarName in assembly := s"${name.value}_${scalaBinaryVersion.value}-${sparkVersion.value}_${version.value}.jar"
