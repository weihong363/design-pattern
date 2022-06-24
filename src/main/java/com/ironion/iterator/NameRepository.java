package com.ironion.iterator;

/**
 * @author ironion
 * @date 2022/6/24 17:58
 */
public class NameRepository implements Container {

    /**
     * 图上画的是name，但是如果想要去遍历，得是names才行
     */
    private String[] names;

    public void setNames(String[] names) {
        this.names = names;
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        /**
         * 虽然图上没画，但是没这个下标就没法去拿下一个值了
         */
        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()){
                // 返回当前节点，并且下标移到下一个节点去，这里要注意，不能++ index,否则会数组下标越界
                return names[index ++];
            }
            return null;
        }
    }
}
