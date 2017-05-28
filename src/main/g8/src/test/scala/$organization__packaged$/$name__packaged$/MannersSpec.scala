package $organization$.$name$

import org.scalatest.FunSpec
import org.apache.spark.sql.functions._
import com.github.mrpowers.spark.fast.tests.DataFrameComparer

class MannersSpec
    extends FunSpec
    with SparkSessionTestWrapper
    with DataFrameComparer {

  import spark.implicits._

  describe(".beNice") {

    it("tells you how to treat your mother") {
      assert(Fun.beNice() === "Be nice to your mother!")
    }

  }

  describe(".happyData") {

    it("appends a happy column to a DataFrame") {

      val sourceDF = Seq(
        ("jose"),
        ("li"),
        ("luisa")
      ).toDF("name")

      val actualDF = sourceDF.transform(Manners.happyData())

      val expectedDF = Seq(
        ("jose", "data is fun"),
        ("li", "data is fun"),
        ("luisa", "data is fun")
      ).toDF("name", "happy")

      assertSmallDataFrameEquality(actualDF, expectedDF)

    }

  }

}