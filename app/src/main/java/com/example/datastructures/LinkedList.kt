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