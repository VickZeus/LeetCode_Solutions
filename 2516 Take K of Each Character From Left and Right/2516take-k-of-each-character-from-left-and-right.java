class Solution 
{

public boolean counter(String s, int k) {
    int[] counts = new int[3]; // Index 0 for 'a', 1 for 'b', 2 for 'c'
    for (char c : s.toCharArray()) {
        if (c == 'a') counts[0]++;
        if (c == 'b') counts[1]++;
        if (c == 'c') counts[2]++;
    }
    return counts[0] < k || counts[1] < k || counts[2] < k; 
}


public int takeCharacters(String s, int k) {
    if (k == 0) return 0; // No characters need to be taken
    if (s.length() < k || counter(s, k)) return -1; // Impossible cases

    int[] totalCount = new int[3]; // Total counts of 'a', 'b', 'c'
    for (char c : s.toCharArray()) {
        if (c == 'a') totalCount[0]++;
        if (c == 'b') totalCount[1]++;
        if (c == 'c') totalCount[2]++;
    }

    // Determine the minimum counts required to remain
    totalCount[0] -= k;
    totalCount[1] -= k;
    totalCount[2] -= k;

    int[] windowCount = new int[3]; // Sliding window counts
    int left = 0, maxWindow = 0;

    for (int right = 0; right < s.length(); right++) {
        // Expand the window
        if (s.charAt(right) == 'a') windowCount[0]++;
        if (s.charAt(right) == 'b') windowCount[1]++;
        if (s.charAt(right) == 'c') windowCount[2]++;

        // Shrink the window if it exceeds the "extra" count available
        while (windowCount[0] > totalCount[0] || 
               windowCount[1] > totalCount[1] || 
               windowCount[2] > totalCount[2]) {
            if (s.charAt(left) == 'a') windowCount[0]--;
            if (s.charAt(left) == 'b') windowCount[1]--;
            if (s.charAt(left) == 'c') windowCount[2]--;
            left++;
        }

        // Update the maximum valid window size
        maxWindow = Math.max(maxWindow, right - left + 1);
    }

    return s.length() - maxWindow; // Minimum time is total length minus the largest removable window
}

}


