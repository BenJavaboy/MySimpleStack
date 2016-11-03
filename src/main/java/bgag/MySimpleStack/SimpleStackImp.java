package bgag.MySimpleStack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by 21103602 on 20/10/2016.
 */
public class SimpleStackImp implements SimpleStack {

    Stack<Object> pile = new Stack<Object>();



    public boolean isEmpty()
    {
        return pile.isEmpty();
    }

    public int getSize()
    {
        return pile.size();
    }

    @Override
    public void push(Item item) {
        pile.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return (Item) pile.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return (Item) pile.pop();
    }
}
