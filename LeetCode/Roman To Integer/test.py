class Solution(object):
    """ runtime : 27ms , memory : 13.28mb """
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        symbols = { "I" : 1, "V" : 5, "X" : 10 , "L" : 50,
        "C":100 , "D" : 500 , "M":1000
        }
        result = symbols[s[len(s)-1]]
        for i in range(0,len(s)-1):
            val = symbols[s[i]]
            nextval = symbols[s[i+1]]

            if val >= nextval:
                result += val
            else :
                result -= val
        return result
    
sol = Solution()
print(sol.romanToInt("IV"))