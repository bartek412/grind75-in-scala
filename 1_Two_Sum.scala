import scala.collection.mutable
object Solution {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val seen: mutable.Map[Int, Int] = mutable.Map()
    nums.zipWithIndex.foreach { case (element, i) =>
      var lack: Int = target - element;
      if (seen.contains(lack)) {
        return Array(seen(lack), i)
      } else {
        seen.put(element, i)
      }
    }

    Array()
  }
}
