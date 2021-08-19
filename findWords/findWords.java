class Solution {
    public String[] findWords(String[] words) {
         ArrayList<String> result = new ArrayList<>();
        HashSet<Character> first = new HashSet<>(), second = new HashSet<>(), third = new HashSet<>();
        String s1 = "qwertyuiopQWERTYUIOP", s2 = "asdfghjklASDFGHJKL", s3 = "zxcvbnmZXCVBNM";
        for (int i = 0; i < s1.length(); i++) first.add(s1.charAt(i));
        for (int i = 0; i < s2.length(); i++) second.add(s2.charAt(i));
        for (int i = 0; i < s3.length(); i++) third.add(s3.charAt(i));
        for (int i = 0; i < words.length; i++) {
            boolean one = false, two = false, three = false;
            for (int j = 0; j < words[i].length(); j++) {
                if (first.contains(words[i].charAt(j))) one = true;
                if (second.contains(words[i].charAt(j))) two = true;
                if (third.contains(words[i].charAt(j))) three = true;
            }
            if ((one == false && two == false) || (three == false && two == false) || (one == false && three == false)) {
                result.add(words[i]);
            }
        }
        return result.toArray(new String[0]);
    }
}
