package com.example.datastructures

//In doubly linked list we have reference to previous and next node
class DoublyLinkedList {
    var head : DoubleNode? = null
    var tail : DoubleNode? = null
}

class DoubleNode(data : Int){
    var data : Int = 0
    var previousNode : DoubleNode? = null
    var nextNode : DoubleNode? = null
       constructor( data: Int, previousNode:DoubleNode,  nextNode: DoubleNode):this(data){

       }
}

//time complexity

//Access : O(n)..linear ..sequential accessing
//Update : O(n)
//Insert : O(n)
//searching and sorting : O(n)
//merge sort is preferable for sorting linked lists
