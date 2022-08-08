package lectures.part1basics

import scala.annotation.tailrec

object DefaultArgs extends App {

  @tailrec
  def trFact(n: Int, acc: Int = 1): Int = {
    if (n <= 1) acc
    else trFact(n - 1, n * acc)
  }

  val fact10 = trFact(10)

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("saving picture")
  /*
    1. Pass in every leading argument
    2. Name the arguments
  */
  savePicture("bmp", 500, 222)
  savePicture(height = 123, width = 456, format = "tiff")

}
