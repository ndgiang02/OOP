import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Week4Test {
    @Test
    public void testMax2Int1() {
        int answer = Week4.max2Int(1, 2);
        int key = 2;
        assertEquals(answer, key);
    }

    @Test
    public void testMax2Int2() {
        int answer = Week4.max2Int(3, 4);
        int key = 4;
        assertEquals(answer, key);
    }

    @Test
    public void testMax2Int3() {
        int answer = Week4.max2Int(5, 6);
        int key = 6;
        assertEquals(answer, key);
    }

    @Test
    public void testMax2Int4() {
        int answer = Week4.max2Int(7, 8);
        int key = 8;
        assertEquals(answer, key);
    }

    @Test
    public void testMax2Int5() {
        int answer = Week4.max2Int(7, 8);
        int key = 8;
        assertEquals(answer, key);
    }

    @Test
    public void testMinArray1() {
        int[] arr = new int[]{1, 2};
        int answer = Week4.minArray(arr);
        int key = 1;
        assertEquals(answer, key);
    }

    @Test
    public void testMinArray2() {
        int[] arr = new int[]{3, 4};
        int answer = Week4.minArray(arr);
        int key = 3;
        assertEquals(answer, key);
    }

    @Test
    public void testMinArray3() {
        int[] arr = new int[]{5, 6};
        int answer = Week4.minArray(arr);
        int key = 5;
        assertEquals(answer, key);
    }

    @Test
    public void testMinArray4() {
        int[] arr = new int[]{7, 8};
        int answer = Week4.minArray(arr);
        int key = 7;
        assertEquals(answer, key);
    }

    @Test
    public void testMinArray5() {
        int[] arr = new int[]{7, 8};
        int answer = Week4.minArray(arr);
        int key = 7;
        assertEquals(answer, key);
    }

    @Test
    public void testCalculateBMI1() {
        String answer = Week4.calculateBMI(60, 1.72);
        String key = "Bình thường";
        assertEquals(answer, key);
    }

    @Test
    public void testCalculateBMI2() {
        String answer = Week4.calculateBMI(54, 1.72);
        String key = "Thiếu cân";
        assertEquals(answer, key);
    }

    @Test
    public void testCalculateBMI3() {
        String answer = Week4.calculateBMI(70, 1.72);
        String key = "Thừa cân";
        assertEquals(answer, key);
    }

    @Test
    public void testCalculateBMI4() {
        String answer = Week4.calculateBMI(66, 1.72);
        String key = "Bình thường";
        assertEquals(answer, key);
    }

    @Test
    public void testCalculateBMI5() {
        String answer = Week4.calculateBMI(80, 1.72);
        String key = "Béo phì";
        assertEquals(answer, key);
    }

}