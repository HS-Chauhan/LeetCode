// 1184. Distance Between Bus Stops


class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int clockwise=0;
        int antiClockwise=0;
        for(int i = start;i != destination;i = (i+1) % distance.length){
            clockwise+=distance[i];
        } 
        for(int i = destination;i != start;i = (i+1) % distance.length){
            antiClockwise+=distance[i];
        }
        return Math.min(clockwise,antiClockwise);
    }
}
