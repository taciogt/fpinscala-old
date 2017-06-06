/*
  Part 1 - Chapter 2
  Exercise 2.1
 */

def fib(n: Int): Int = {
  def loop(n: Int): Int =
    if (n <= 1) 0
    else if (n == 2) 1
    else loop(n-1) + loop(n-2)

  loop(n)
}

def fib2(n: Int): Int = {
  @annotation.tailrec
  def loop(i: Int, acc1: Int, acc2: Int): Int =
    if (i >= n) acc1
    else loop(i+1, acc2, acc1+acc2)

  loop(1, 0, 1)
}

fib(1)
fib(2)
fib(3)
fib(4)
fib(5)
fib(6)
fib(7)
fib(8)
fib(9)
fib(10)

fib2(1)
fib2(2)
fib2(3)
fib2(4)
fib2(5)
fib2(6)
fib2(7)
fib2(8)
fib2(9)
fib2(10)