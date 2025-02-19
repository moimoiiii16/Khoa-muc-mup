import org.junit.Test;
import static org.junit.Assert.assertEquals;
//MOIbeo

public class Week4Test {
    @Test
    public void testMax2Int1(){
        assertEquals(5, Week4.max2Int(5, 3));
        assertEquals(5, Week4.max2Int(3, 5));
        assertEquals(5, Week4.max2Int(5, 5));
        assertEquals(0, Week4.max2Int(0, 0));
        assertEquals(-5, Week4.max2Int(-5, -10));
        assertEquals(-5, Week4.max2Int(-10, -5));
        assertEquals(0, Week4.max2Int(-5, 0));
        assertEquals(0, Week4.max2Int(0, -5));
        assertEquals(0, Week4.max2Int(0, 0));
    }

    @Test
    public void testMax2Int2(){
        assertEquals(5, Week4.max2Int(5, 3));
        assertEquals(5, Week4.max2Int(3, 5));
        assertEquals(5, Week4.max2Int(5, 5));
        assertEquals(0, Week4.max2Int(0, 0));
        assertEquals(-5, Week4.max2Int(-5, -10));
        assertEquals(-5, Week4.max2Int(-10, -5));
        assertEquals(0, Week4.max2Int(-5, 0));
        assertEquals(0, Week4.max2Int(0, -5));
        assertEquals(0, Week4.max2Int(0, 0));
    }

    @Test
    public void testMax2Int3(){

    }

    @Test
    public void testMax2Int4(){}

    @Test
    public void testMax2Int5(){}

    @Test
    public void testMinArray1(){}

    @Test
    public void testMinArray2(){}

    @Test
    public void testMinArray3(){}

    @Test
    public void testMinArray4(){}

    @Test
    public void testMinArray5(){}

    @Test
    public void testCalculateBMI1(){}

    @Test
    public void testCalculateBMI2(){}

    @Test
    public void testCalculateBMI3(){}

    @Test
    public void testCalculateBMI4(){}

    @Test
    public void testCalculateBMI5(){}
} 
