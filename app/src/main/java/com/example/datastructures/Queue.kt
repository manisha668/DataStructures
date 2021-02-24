package com.example.datastructures

//accesses data in FIFO order...insert elements from rear and delete from front
//Enqueue means : add data in queue
//Dequeue : delete data from queue
//when we have to arrange items : waiting list for tickets
//peek

//doubly queue : add or remove from either end
//priority queue

class Queue {
    private  var list = ArrayList<String>()

    //enqueue
    fun add(data:String){
        list.add(data)
    }

    //dequeue
    fun deleteData():String?{
        for(i in 0..list.size){
            val item = list.get(0)
            list.remove(item)
            return item
        }
        return null
    }

    //peek from top
    fun peek():String?{
        return list[0]
    }
}