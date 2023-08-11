
class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []

        for i in s:
            if len(stack) != 0:
                last = stack[-1]
                if (last == '(' and i == ')' or last == '{' and i == '}' or 
                    last == '[' and i== ']'):
                    stack.pop()
                    continue
            stack.append(i)

        
        if len(stack) == 0:
            return True
        else :
            return False





solution = Solution()
s = "()[]{}"
print(solution.isValid(s))
