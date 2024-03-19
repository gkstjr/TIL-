class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxW = Integer.MIN_VALUE;
        int maxH = Integer.MIN_VALUE;
        
        for(int i = 0; i < sizes.length; i++) {
            int w = Math.max(sizes[i][0] , sizes[i][1]);
            int h = Math.min(sizes[i][0] , sizes[i][1]);
                       
            maxW = (w > maxW) ? w : maxW;
            maxH = (h > maxH) ? h : maxH;
        }
        
        
        return maxW * maxH;
    }
}