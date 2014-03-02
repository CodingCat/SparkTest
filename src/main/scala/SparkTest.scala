import org.apache.spark.{SparkContext, SparkConf}

object SparkTest {
  def main(args: Array[String]) {

    val conf = new SparkConf()
      .setMaster("spark://127.0.0.1:7077")
      //.setMaster("local")
      .setAppName("SparkTest")
      .setJars(List("target/scala-2.10/spark_test_2.10-1.0.jar"))
      .setSparkHome("/Users/nanzhu/code/spark-0.9.0-incubating")

    val sc = new SparkContext(conf)
    sc.parallelize(Seq("b")).map(identity).collect
  }
}
