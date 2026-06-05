/*Given an array representing the height of bars, 
find the total amount of rainwater trapped between them.
Approach

For each index, the amount of water that can be stored depends on:

Maximum height on its left side.
Maximum height on its right side.
Formula
Water Level = min(LeftMax, RightMax)

Trapped Water = Water Level - Current Height

To efficiently find left and right maximum heights, use two auxiliary  arrays:

leftMax[] → Stores the maximum height from the left up to the current index.
rightMax[] → Stores the maximum height from the right up to the current index.
*/


public class TrappedRainWater {
    public static int trappedRainwater(int height[]){
        int n = height.length;
        // calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i] , leftMax[i-1]);
        }
        // Calculate RightMax boundary array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i] , rightMax[i+1]);
        }

        int trappedWater = 0;
        // loop
        for(int i=0; i<n; i++){
        // waterlevel = min(leftmax bound, rightmax bound)
        int waterLevel = Math.min(leftMax[i], rightMax[i]);
        // trapped water = wateerlevel - height[i];
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(height));
    }
}
