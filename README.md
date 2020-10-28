# spark-sbt.g8

A [Giter8](https://github.com/foundweekends/giter8) template for Spark SBT applications.

## Usage

1. Install SBT with Homebrew: `brew install sbt`

2. Start the app generation wizard: `sbt new MrPowers/spark-sbt.g8`

3. Fill out the project properties on the command line

4. Run the tests to make sure the project was generated correctly.  `cd` into the top level project directory and then run `sbt test`.

5. (optional) run the shell scripts to add the log4j.properties file and additional options to the `build.sbt` file

![giter8 gif](giter8.gif "giter8 Screenshot")

**Important Note**: Use Scala 2.11 for Spark 2 apps and Scala 2.12 for Spark 3 apps (e.g. use Scala 2.11.12 with Spark 2.4.7 and Scala 2.12.12 with Spark 3.0.1).

## Project Properties

**name (default: my-cool-project)**

The project name.  This should be all lowercase and use hyphens.

**package (default: com.github.mrpowers.my.cool.project)**

The top-level package of the project.  This is typically the organization name followed by the project name.

For example, the [top level package of spark-daria](https://github.com/MrPowers/spark-daria/blob/master/src/main/scala/com/github/mrpowers/spark/daria/sql/ColumnExt.scala#L1) is `com.github.mrpowers.spark.daria`, which consists of the organization name `com.github.mrpowers` and the project name `spark.daria`.

**scalaVersion (default: 2.11.12)**

**sparkVersion (default: 2.4.7)**

**sbtVersion (default: 1.3.13)**

**version (default: 0.0.1)**

The project version.  `0.0.1` is usually the best place to start.

## Contribution

Send pull requests to keep this project updated.

We'll always try to keep this updated with the latest version of Spark and Scala.
