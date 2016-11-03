package bgag.MySimpleStack;

/**
 * Created by 21103602 on 20/10/2016.
 */
public class Item {

    private Object value;

    public Item(Object value)
    {
       setValue(value);
    }

    public Object getValue()
    {
        return value;
    }

    public void setValue(Object value)
    {
        this.value = value;
    }
}
