package javacode.problems.linkedlist.base

class CustomLinkedList {

    companion object {
        private var head: Node? = null
        fun insertElementAtEnd(element: Int): Node? {
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

        fun traverseLinkedList() {
            var temp = head

            while (temp != null) {
                print("${temp.data} ")
                temp = temp.next
            }
        }

        fun lengthOfLinkedList(): Int {
            var count = 0
            var temp = head
            while (temp!=null){
                temp = temp.next
                count++
            }
            return count
        }

        fun findMiddleElementOfLinkedList(): Int? {
            var slow = head
            var fast = head
            while (fast?.next != null){
                fast = fast.next?.next
                slow = slow?.next
            }

            return slow?.data
        }

        fun getNthNodeFromStart(n : Int): Int {
            var temp = head
            var count = 1
            while (temp!=null){
                if (count == n) {
                    return temp.data
                }
                count++
                temp = temp.next
            }
            return 0
        }

        fun getNthNodeFromEnd(n : Int): Int? {
            var mainPtr = head
            var refPtr = head
            var count =0

            for (i in 0 until n){
                if (refPtr == null){
                    return null
                }
                refPtr = refPtr.next
            }

            /*while (count<n){          Or this also we can use
                p2 = p2?.next
                count+=1
            }*/

            while (refPtr!=null){
                refPtr = refPtr.next
                mainPtr = mainPtr?.next
            }
            return mainPtr?.data
        }

        fun reverseALinkedList(){
            var pointer = head
            var previous : Node? = null
            var current : Node?= null

            while (pointer!=null){
                current = pointer
                pointer = pointer.next

                // Reverse the link
                current.next = previous
                previous = current
                head = current
            }
        }

        fun removeDuplicateFromLinkedList(){
            var current = head
            var previous: Node? = null

            val hashSet = hashSetOf<Int>()

            while (current!=null){
                if (hashSet.contains(current.data)){
                    previous?.next = current.next
                }else{
                    hashSet.add(current.data)
                    previous = current
                }
                current = previous?.next
            }
        }
    }
}

fun main() {
    CustomLinkedList.apply {
        insertElementAtEnd(1)
        insertElementAtEnd(2)
        insertElementAtEnd(2)
        insertElementAtEnd(4)
        insertElementAtEnd(6)
        insertElementAtEnd(6)
        insertElementAtEnd(7)


        traverseLinkedList()
        print("\n")

        print("Length of linked list - ${lengthOfLinkedList()}\n")


        print("Middle element - ${findMiddleElementOfLinkedList()}\n")

        print("Get nth node from start - ${getNthNodeFromStart(5)}\n")

        print("Get nth node from end - ${getNthNodeFromEnd(5)}\n")
        reverseALinkedList()

        print("Reverse a linked list -\n")
        traverseLinkedList()

        print("Remove duplicate from Linked List -\n")
        removeDuplicateFromLinkedList()

        traverseLinkedList()
    }
}