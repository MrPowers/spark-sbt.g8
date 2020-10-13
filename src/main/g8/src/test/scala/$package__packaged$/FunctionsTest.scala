package $package$

import org.scalatest.FunSpec
import org.apache.spark.sql.functions._
import com.github.mrpowers.spark.fast.tests.ColumnComparer
import org.apache.spark.sql.types.{StructField, StructType, StringType}
import org.apache.spark.sql.Row

class FunctionsSpec
    extends FunSpec
    with SparkSessionTestWrapper
    with ColumnComparer {

  import spark.implicits._

  describe("isEven") {

    it("returns true if the number is even and false otherwise") {

      val data = Seq(
        (1, false),
        (2, true),
        (3, false)
      )

      val df = data
        .toDF("some_num", "expected")
        .withColumn("actual", functions.isEven(col("some_num")))

      assertColumnEquality(df, "actual", "expected")

    }

  }

}

