class Node(object):
    def __init__(self,data):
        self.data = data
        self.next = None


""" runtime 23ms, memory 13.22mb """
class Solution(object):
    def mergeTwoLists(self, list1, list2):
        head = temp =  Node(0)
        while list1 or list2:
            if list1 and list2:
                if list1.val < list2.val:
                    temp.next = list1
                    list1 = list1.next
                else:
                    temp.next = list2
                    list2 = list2.next                
            elif list1:
                temp.next = list1
                list1 = list1.next
            elif list2:
                temp.next = list2
                list2 = list2.next
            temp = temp.next
        return head.next
    
sol = Solution()

