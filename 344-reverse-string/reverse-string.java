class Solution {
    //public void reverseString(char[] s) {
        // int left = 0;
        // int right = s.length - 1;

        // while (left < right) {
        //     char temp = s[left];
        //     s[left] = s[right];
        //     s[right] = temp;

        //     left++;
        //     right--;
        // }
     public void reverseString(char[] s) {
        solve(0, s.length - 1, s);
    }

    public void solve(int i, int j, char[] arr) {

        if (i >= j) return;

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        solve(i + 1, j - 1, arr);
    }
}