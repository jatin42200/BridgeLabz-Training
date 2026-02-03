class commanPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Pehle prefix ko pehle string se initialize karte hai
        String prefix = strs[0];

        // Baaki strings ke saath compare karte hai
        for (int i = 1; i < strs.length; i++) {
            // Jab tak prefix current string ka prefix nahi hai, usko chhota karte jao
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}