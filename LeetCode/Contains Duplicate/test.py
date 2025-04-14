from typing import List

class Solution:
    @staticmethod
    def containsDuplicate(nums: List[int]) -> bool:
        return len(set(nums)) != len(nums)

if __name__ == "__main__":
    print(Solution.containsDuplicate([1, 2, 3, 1]))  # True
    print(Solution.containsDuplicate([1, 2, 3, 4]))  # False