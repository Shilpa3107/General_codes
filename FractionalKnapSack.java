import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapSack {
    public static void main(String[] args) {
        ItemValue[] arr = {
            new ItemValue(5, 1),
            new ItemValue(10, 3),
            new ItemValue(15, 5),
            new ItemValue(7, 4),
            new ItemValue(8, 1),
            new ItemValue(9, 3),
            new ItemValue(4, 2)
        };
        int capacity = 15;
        double maxValue = getMaxValue(arr, capacity);
         System.out.println("\nMaximum value we can obtain = " + maxValue);
    }
       public  static double getMaxValue(ItemValue[] arr, int capacity) {
        System.out.println("Items before sorting:");
        printArray(arr);
        Arrays.sort(arr, new Comparator<ItemValue>() {
            @SuppressWarnings("removal")
            @Override
            public int compare(ItemValue item1, ItemValue item2) {
                double cpr1 = new Double((double) item1.profit / (double) item1.weight);
                double cpr2 = new Double((double) item2.profit / (double) item2.weight);
                if (cpr1 < cpr2)
                    return 1;
                else
                    return -1;
            }
        });
        System.out.println("Items after sorting by value/weight ratio:");
        printArray(arr);

        double totalValue = 0d;

        for (ItemValue i : arr) {
            int curWt = (int) i.weight;
            int curVal = (int) i.profit;

            if (capacity - curWt >= 0) {
                capacity = capacity - curWt;
                totalValue += curVal;
            } else {
                double fraction = ((double) capacity / (double) curWt);
                totalValue += (curVal * fraction);
                break;
            }
        }

        return totalValue;
    }
    public static void printArray(ItemValue[] arr) {
        for (ItemValue item : arr) {
            System.out.println("Profit: " + item.profit + ", Weight: " + item.weight);
        }
    }
       public static class ItemValue {
        int profit, weight;

        public ItemValue(int val, int wt) {
            this.weight = wt;
            this.profit = val;
        }
    }
}
