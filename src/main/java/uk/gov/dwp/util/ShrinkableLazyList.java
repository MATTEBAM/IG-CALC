package uk.gov.dwp.util;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.list.LazyList;

@SuppressWarnings({ "serial", "rawtypes" })
public class ShrinkableLazyList extends LazyList {

    private static List listToBeDecorated;

    @SuppressWarnings({ "unchecked" })
    protected ShrinkableLazyList(List list, Factory factory) {
        super(list, factory);
    }

    /**
     * Decorates list with shrinkable lazy list.
     */
    public static List decorate(List list, Factory factory) {
        listToBeDecorated = list;
        return new ShrinkableLazyList(list, factory);
    }

    public void shrink() {
        for (Iterator i = listToBeDecorated.iterator(); i.hasNext();) {
            if (i.next() == null) {
                i.remove();
            }
        }
    }

    @Override
    public Iterator iterator() {
        shrink();
        return super.iterator();
    }
}
