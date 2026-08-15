package Geometry;

class RectangleArea {
    public static void main(String[] args) {
        // int ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2;
        int ax1 = -2, ay1 = -2, ax2 = 2, ay2 = 2, bx1 = -2, by1 = -2, bx2 = 2, by2 = 2;        

        int aLength = Math.abs(ax2-ax1);
        int aWidth = Math.abs(ay2-ay1);
        int bLength = Math.abs(bx2-bx1);
        int bWidth = Math.abs(by2-by1);
        int aArea = aLength*aWidth;
        int bArea = bLength*bWidth;
    
        int overlapX = Math.min(ax2,bx2) - Math.max(ax1, bx1);
        int overlapY = Math.min(ay2, by2) - Math.max(ay1, by1);
        int overlapArea=0;
        if (overlapX > 0 && overlapY > 0) {
            overlapArea = overlapX * overlapY;
        }

        int area = aArea + bArea - overlapArea;
        System.out.println(area);

    }
}
