class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        int n = rectangles.length;
        double[] arr = new double[n];
        for(int i=0;i<n;i++){
            arr[i] = (double)rectangles[i][0]/rectangles[i][1];
        }
        long count = 0;
        HashMap<Double,Integer> map = new HashMap<>();
        for(double val : arr){
            if(map.containsKey(val)){
                int freq = map.get(val);
                count+=freq;
                map.put(val,freq+1);
            }
            else map.put(val,1);
        }
        return count;
    }
}