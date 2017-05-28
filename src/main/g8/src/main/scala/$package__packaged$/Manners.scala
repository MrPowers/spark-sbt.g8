package $package$

import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions._

object Manners {

  def happyData()(df: DataFrame): DataFrame = {
    df.withColumn("happy", lit("data is fun"))
  }

}
