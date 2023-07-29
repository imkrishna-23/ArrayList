import java.util.*;

public class containerWithMostWater {
    // 2 pointer approach
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            // calculate the area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);
            // update ptr
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> heigh = new ArrayList<>();
        heigh.add(1);
        heigh.add(8);
        heigh.add(6);
        heigh.add(2);
        heigh.add(5);
        heigh.add(4);
        heigh.add(8);
        heigh.add(3);
        heigh.add(7);
        System.out.println(storeWater(heigh));
    }
}
