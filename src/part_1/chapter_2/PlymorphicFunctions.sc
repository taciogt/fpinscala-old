/*
  Listing 2.3
  Monomorphic function to find a String in an array
 */
def findFirst(ss: Array[String], key: String): Int = {
  @annotation.tailrec
  def loop(n: Int): Int =
    if (n >= ss.length) -1
    else if (ss(n) == key) n
    else loop(n+1)

  loop(0)
}

val fruits = Array("Apple", "Banana", "Orange", "Tomato")
findFirst(fruits, "Orange")
findFirst(fruits, "Eggs")

/*
  Listing 2.4
  Polymorphic function to find an element in an array
 */

def findFirst2[A](as: Array[A], p: A => Boolean): Int = {
  @annotation.tailrec
  def loop(n: Int): Int =
    if (n >= as.length) -1
    else if (p(as(n))) n
    else loop(n+1)

  loop(0)
}

/*
  Exercise 2.2
 */
def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
  @annotation.tailrec
  def loop(n: Int): Boolean =
    if (n >= as.length - 1) true
    else if (!ordered(as(n), as(n+1) )) false
    else loop(n+1)

  loop(0)
}

isSorted(Array(1, 2, 3, 4, 5), (a: Int, b: Int) => a < b)
isSorted(Array(1, 2, 3, 4, 4), (a: Int, b: Int) => a < b)
isSorted(Array(1, 2, 3, 4, 4), (a: Int, b: Int) => a <= b)
