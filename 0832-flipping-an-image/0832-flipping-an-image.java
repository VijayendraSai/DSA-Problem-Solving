class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int mid = image[0].length / 2;
        if(image[0].length % 2 == 0) mid = mid - 1;
        for(int i=0; i<image.length; i++) {
            int k = image[0].length - 1;
            for(int j=0; j <= mid; j++) {
                if(j < k) {
                    int temp = image[i][j] ^ 1;
                    image[i][j] = image[i][k] ^ 1;
                    image[i][k] = temp;
                }
                if(j == k) {
                    image[i][j] ^= 1;
                }
                k--;
            }
        }
        return image;
    }
}