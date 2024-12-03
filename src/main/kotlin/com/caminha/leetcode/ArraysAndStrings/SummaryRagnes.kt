package com.caminha.leetcode.ArraysAndStrings

class SummaryRagnes {

    fun summaryRanges(nums: IntArray): List<String> {
        // easier way -> O(n)

        if(nums.isEmpty() || nums.size == 1) return nums.map { it.toString() }

        val result = mutableListOf<String>()
        var currentStart = nums[0]

        val range = mutableListOf<Int>()

        for(i in 0..< nums.size) {

            if (nums[i] == range.lastOrNull()?.plus(1)) {
                range.add(nums[i])
                if(nums[i] != nums.getOrNull(i + 1)?.minus(1)) {
                    result.add("${range.first()}->${range.last()}")
                    range.clear()
                }
            } else {
                if(range.size == 0) {
                    range.add(nums[i])
                    if(i == nums.size - 1) {
                        result.add("${nums[i]}")
                    }
                } else {
                    result.add("${range.first()}")
                    if(i == nums.size - 1) {
                        result.add("${nums[i]}")
                    }
                    range.clear()
                    range.add(nums[i])
                }
            }
        }

        return result
    }
}

fun main() {
    println(
        SummaryRagnes().summaryRanges(
            intArrayOf(0,1,2,4,5,7)
        )
    )
}