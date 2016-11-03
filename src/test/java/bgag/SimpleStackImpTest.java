package bgag;

import bgag.MySimpleStack.Item;
import bgag.MySimpleStack.SimpleStack;
import bgag.MySimpleStack.SimpleStackImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

public class SimpleStackImpTest  {

    SimpleStackImp simpleStack;

    @Before
    public void setUp() throws Exception
    {
        simpleStack = new SimpleStackImp();
        System.out.println("Je suis executé avant chaque test");
    }

    @Test
    public void testIsEmpty() throws Exception {
        Assert.assertEquals(true,simpleStack.isEmpty());
        String element1 = "toto";
        simpleStack.push(new Item(new String(element1)));
        Assert.assertEquals(false,simpleStack.isEmpty());


    }

    @Test
    public void testGetSize() throws Exception
    {
        Assert.assertEquals(0,simpleStack.getSize());
        String element1 = "toto";
        simpleStack.push(new Item(new String(element1)));
        simpleStack.push(new Item(new String(element1+"2")));

        //la taille doit augmenter de 2
        Assert.assertEquals(2,simpleStack.getSize());
    }

    @Test
    public void testPush() throws Exception
    {
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0,simpleStack.getSize());
        simpleStack.push(ita);
        //la pide doit etre augmente d'un item
        Assert.assertEquals(1,simpleStack.getSize());
        Item o = simpleStack.peek();

        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        Assert.assertEquals(8,integer.intValue());
        Assert.assertEquals(ita.getValue(),integer);
    }

    @Test
    public void testPeek() throws Exception
    {
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        Assert.assertEquals(1,simpleStack.getSize());
        Item o = simpleStack.peek();

        Assert.assertEquals(1,simpleStack.getSize());

        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        Assert.assertEquals(8,integer.intValue());
        Assert.assertEquals(ita.getValue(),integer);
    }

    @Test
    public void testPop() throws Exception
    {
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        Assert.assertEquals(1,simpleStack.getSize());
        Item o = simpleStack.pop();

        Assert.assertEquals(0,simpleStack.getSize());

        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        Assert.assertEquals(8,integer.intValue());
        Assert.assertEquals(ita.getValue(),integer);

    }





}