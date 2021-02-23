package com.example.datastructures

import java.util.*

//LinkedList

//Learning Linked List
class LinkedListExample {
    var head: Node? = null
    fun add(data: Int) {
        //add node if head is null
        if (head == null) {
            head = Node(data)
        } else {
            val newNode = Node(data)
            newNode.next = head
            head = newNode
        }
    }

    companion object {
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

        }
    }
}

//The linked list node class
class Node {
    var data: Int
    var next: Node? = null

    constructor(data: Int) {
        this.data = data
    }

    constructor(data: Int, next: Node?) {
        this.data = data
        this.next = next
    }
}