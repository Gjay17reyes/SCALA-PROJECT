
/**
  * Created by Luis on 10/2/2016.
  */

import scala.io.Source
import java.io._

object Project
{
  def main(args: Array[String])
  {

    val file = Source.fromFile("C://Users//Luis//Documents//Scala Text//Scala Text.txt")

      .getLines()
      .toList
      .flatMap(_.split(" "))
      .filter(x => x.matches("[a-zA-Z]+"))
      .sorted
      .groupBy(x => x)
      .map(y => (y._1, y._2.length))
      .toList
      .sorted

    val pw = new PrintWriter(new File("Scala Result.txt"))

      for (a <- file) {

        pw.write(a._1 + " " +a._2 + "\n")

      }

    pw.close()

  }
}
