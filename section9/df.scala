import org.apache.spark.sql.SparkSession

val spark = SparkSession.builder().getOrCreate()

import spark.implicits._

val df = spark.read.option("header", "true").option("inferSchema", "true").csv("CitiGroup2006_2008")

df.printSchema()
for(row <- df.head(5)){
  println(row)
}

// SparkSQL style
//df.filter("Close > 480").show()
//df.filter("Close < 480 AND High < 480").show()

// Scala style
//df.filter($"Close" > 480 && $"High" > 480).show()

val CH_low = df.filter($"Close" > 480 && $"High" > 480).collect()

// NOTE: triple === instead of ==
df.filter($"Close" === 484.20).show()
// SQL alternative
df.filter("Close = 484.20").show()
