class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        
        int cx = Math.max(x1, Math.min(xCenter, x2));
        int cy = Math.max(y1, Math.min(yCenter, y2));

        int x0 = xCenter - cx;
        int y0 = yCenter - cy;

        return (x0*x0+y0*y0) <= radius*radius;
    }
}