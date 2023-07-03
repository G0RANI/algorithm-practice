class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] result = new int[encoded.length + 1];
        for (int i = 0; i < encoded.length + 1; i++) {
            if (i == 0) {
                result[i] = first;
            } else {
                result[i] = encoded[i - 1] ^ result[i - 1];
            }
        }
        return result;
    }
}