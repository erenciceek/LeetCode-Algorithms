
class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        h_map = {}
        for i in range(len(nums)):
            if nums[i] not in h_map:
                h_map[target - nums[i]] = i
            else:
                return h_map[nums[i]],i
            
        return -1,-1
    
solution = Solution()

nums = [2, 7, 11, 15]
target = 9
result = solution.twoSum(nums, target)
print(result)
