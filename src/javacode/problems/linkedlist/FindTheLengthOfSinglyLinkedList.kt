package javacode.problems.linkedlist

import javacode.problems.linkedlist.base.Node

class FindTheLengthOfSinglyLinkedList {
    companion object {
        private var head: Node? = null

        fun findLengthOfLinkedList(): Int {
            var node = head
            var count = 0

            while (node != null) {
                node = node.next
                count++
            }
            return count
        }

        fun add(element: Int): Node? {
            if (head == null) {
                head = Node(element)
            } else {
                var node = head
                while (node?.next != null) {
                    node = node.next
                }
                node?.next = Node(element)
            }
            return head
        }
    }
}

fun main() {
    FindTheLengthOfSinglyLinkedList.add(1)
    FindTheLengthOfSinglyLinkedList.add(2)
    FindTheLengthOfSinglyLinkedList.add(3)

    print(FindTheLengthOfSinglyLinkedList.findLengthOfLinkedList())
}