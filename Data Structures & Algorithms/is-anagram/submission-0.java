class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> hash1 = new HashMap<>();
        HashMap<Character, Integer> hash2 = new HashMap<>();

        // Count characters in s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (hash1.containsKey(ch)) {
                hash1.put(ch, hash1.get(ch) + 1);
            } else {
                hash1.put(ch, 1);
            }
        }

        // Count characters in t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (hash2.containsKey(ch)) {
                hash2.put(ch, hash2.get(ch) + 1);
            } else {
                hash2.put(ch, 1);
            }
        }

        // Compare the two HashMaps
        for (Character k : hash1.keySet()) {
            if (!hash2.containsKey(k) || !hash1.get(k).equals(hash2.get(k))) {
                return false;
            }
        }

        return true;
    }
}