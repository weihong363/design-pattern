package com.ironion.singleton;

/**
 * @author ironion
 * @date 2022/6/13 14:12
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
        System.out.println(Hungry.getInstance().hashCode() + "..." + Hungry.getInstance().hashCode());
        System.out.println(Lazy.getInstance().hashCode() + "..." + Lazy.getInstance().hashCode());
        System.out.println(SyncLazy.getInstance().hashCode() + "..." + SyncLazy.getInstance().hashCode());
        System.out.println(DoubleCheckLock.getInstance().hashCode() + "..." + DoubleCheckLock.getInstance().hashCode());
        System.out.println(Enumerate.INSTANCE.hashCode() + "..." + Enumerate.INSTANCE.hashCode());
    }
}
