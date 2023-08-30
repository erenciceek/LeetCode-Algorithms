class Solution(object):
    """ runtime : 19ms  , memory 13.59mb """
    def longestCommonPrefix(self, strs) -> str:
        res = ""
        minLen =min([len(a) for a in strs])
        print(minLen)
        for i in range(minLen,0,-1):
            temp = strs[0][:i]
            flag = True
            for string in strs:
                if not string.startswith(temp):
                    flag = False
                    break
            if(flag):
                return temp
        return ""
    
sol = Solution()
liste = ["flower","flow","flight"]
print(sol.longestCommonPrefix(liste))