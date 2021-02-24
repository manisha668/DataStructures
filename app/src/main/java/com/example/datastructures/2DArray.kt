package com.example.datastructures

class MultiDimensionalArray {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
//        var count = 0
//        var boolean = false
//        for (i in matrix.indices) {
//            for (element in matrix[i]) {
//                if(element == target) {
//                    count++
//                    break
//                }
//                else count = 0
//            }
//         if(count>0){
//             boolean = true
//             break
//         }else boolean = false
//        }
//        return boolean

//with binary search

        for (i in 0 until matrix.size) {
            var left = 0
            var right: Int = matrix[i].size - 1
            while (left <= right) {
                val mid = (left + right) / 2
                if (matrix[i][mid] == target) {
                    return true
                } else if (matrix[i][mid] < target) {
                    left = mid + 1
                } else right = mid - 1
            }
        }
        return false

    }

    /*
   //        Boolean bool = false;
//        int count = 0;
//        for(int i = 0; i< matrix.length ; i++){
//            for(int j = 0; j< matrix[i].length; j++){
//            if(matrix[i][j] == target){
//                count ++;
//                break;
//            }
//            else count = 0;
//
//        }
//            if(count>0){
//                bool = true;
//                break;
//            }
//            else bool = false;
//        }
//        return bool;
//    }*/


}