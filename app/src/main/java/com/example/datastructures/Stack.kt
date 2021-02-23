package com.example.datastructures

//Works on LIFO order

//to access a item at a position in the stack, we must pop out each item to get to that particular item
//for implementations : stacks are the ordered lists
//use when want to access something in reverse order.... the cards
class Stack {
  private  var list = ArrayList<String>()

    fun push(data:String){
        list.add(data)
    }

    fun pop():String?{
       for(i in 0..list.size) {
           val lastElement = list.get(list.size-1)
           list.remove(lastElement)
           return lastElement
        }
        return null
    }

    //peek return the element at top
    fun peek():String?{
        for(i in 0..list.size) {
            val lastElement = list.get(0)
            return lastElement
        }
        return null
    }
}