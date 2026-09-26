class Solution {
    public int leastInterval(char[] tasks, int n) {
         int[] freq = new int[26];
        for (char c : tasks) {
            freq[c - 'A']++;
        }
        int max = 0;
        for (int x : freq) {
            max = Math.max(max, x);
        }
        int count = 0;
        for (int x : freq) {
            if (x == max) {
                count++;
            }
        }
        int result = (max - 1) * (n + 1) + count;
        return Math.max(result, tasks.length);
    }
}