class Solution {
    void solve(int idx, StringBuilder temp, List<String> result, String digits, HashMap<Integer, String> map) {
        if (idx >= digits.length()) {
            result.add(temp.toString());
            return;
        }
        String s = map.get(Character.getNumericValue(digits.charAt(idx)));
        for (int i = 0; i < s.length(); i++) {
            temp.append(s.charAt(i));
            solve(idx + 1, temp, result, digits, map);
            temp.deleteCharAt(temp.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0)
            return result;
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        StringBuilder temp = new StringBuilder();

        solve(0, temp, result, digits, map);
        return result;
    }
}