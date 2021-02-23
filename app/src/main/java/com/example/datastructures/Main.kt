package com.example.datastructures

import java.util.*
import kotlin.collections.ArrayList

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val list = LinkedListExample()
        list.add(30)
        list.add(20)
        println(list.head!!.data)
        println(list.head!!.next!!.data)

        //Java does all these works behind the sceen and provides us class called LinkedList
        //ADD ITEMS

        val list1 = LinkedList<String>()
        list1.add("Java, C++")
        list1.addFirst("C,Python")
        list1.addLast("last element in the list")
        println(list1)

        //ACCESS ITEMS

        println(list1.get(2))
        println(list1.first)
        println(list1.contains("Java, C++"))
        println(list1)

        //REMOVE
        println("Removing items")
        list1.remove()
        println(list1)
        list1.removeLast()
        println(list1)

        //print was showing that list is traversing from last


        //accessing Stack data structure

        val stack:Stack = Stack()
        stack.push("Jack")
        stack.push("Jill")
        stack.push("Went")
        stack.push("up")
        println( stack.pop())
        println(stack.peek())
        val list3: ArrayList<Stack> = ArrayList<Stack>()
        list3.add(stack)
        println(list3[0])

        //Working with Queues
        val queue = Queue()
        queue.add("Q data 1")
        queue.add("Q data 2")
        queue.add("Q data 3")
        queue.add("Q data 3")
        println(queue.deleteData())
        println(queue.deleteData())
        println(queue.peek())
    }
}