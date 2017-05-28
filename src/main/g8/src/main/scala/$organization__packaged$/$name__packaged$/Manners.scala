package $organization$.$name$

import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions._

object Manners {

  def beNice(): String = {
    "Be nice to your mother!"
  }

  def happyData()(df: DataFrame): DataFrame = {
    df.withColumn("happy", lit("data is fun"))
  }

}
