package ru.spbstu.telematics.java.petrosyan.lab02;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.TreeMap;

import org.junit.Test;

import static org.junit.Assert.*;


public class AppTest {
    //LinkedList

    @Test
    public void testSizeLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(10);
        list.add(10);
        assertTrue(list.size() == 3);
    }

    @Test
    public void testFirstItemLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(10);
        list.add(10);
        list.addFirst(15);
        list.addFirst(25);
        assertTrue(list.getFirst() == 25);
    }

    @Test
    public void testClearLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.clear();
        assertTrue(list.size() == 0);
    }

    @Test
    public void testGetLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.addFirst(15);
        list.addFirst(25);
        assertTrue(list.get(1) == 15);
        assertTrue(list.get(2) == 0);
    }

    @Test
    public void testSetLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.set(0,5);
        assertTrue(list.get(0)==5);
        list.set(0,0);
        assertTrue(list.get(0)==0);
    }
    @Test
    public void testRemoveLastLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.removeLast();
        assertTrue(list.size()==4);
        assertTrue(list.get(list.size()-1)==30);
    }
    @Test
    public void testPopLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        assertTrue(list.pop()==10);
        assertTrue(list.getFirst()==20);
    }
    @Test
    public void testIndexLinkedList(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        assertTrue(list.indexOf(10)==0);
        assertTrue(list.indexOf(15)==-1);
    }
    @Test
    public void testListIteratorLinkedList()
    {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        assertTrue(list.listIterator(2).next() == 30);
        assertTrue(list.listIterator(2).previous() == 20);
        assertTrue(!list.listIterator(0).hasPrevious());
        assertTrue(!list.listIterator(4).hasNext());
    }
    @Test
    public void testListDescendingIteratorLinkedList()
    {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        Iterator x = list.descendingIterator();
        int c =list.size();
        while (x.hasNext()) {
            c--;
            assertTrue(x.next()==list.get(c));

        }
    }
    //TreeSet
    @Test
    public void testAddSet(){
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        assertTrue(set.size()==3);
    }
    @Test
    public void testIsEmptySet(){
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.clear();
        assertTrue(set.isEmpty());
    }
    @Test
    public void testContainsSet(){
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        assertTrue(set.contains(20));
        assertFalse(set.contains(15));
    }
    @Test
    public void testRemoveSet(){
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        assertTrue(set.contains(20));
        set.remove(20);
        assertFalse(set.contains(20));
    }
    @Test
    public void testEqualsSet(){
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(30);
        set2.add(20);
        set2.add(10);
        assertTrue(set1.equals(set2));
    }
    @Test
    public void testRetainAllSet(){
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(10);
        set2.add(20);
        set2.add(40);
        set1.retainAll(set2);
        assertFalse(set1.contains(30));
        set2.retainAll(set1);
        assertFalse(set2.contains(40));
    }
    @Test
    public void testAddAllSet(){
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(10);
        set2.add(20);
        set2.add(40);
        set1.addAll(set2);
        assertTrue(set1.contains(40));
    }
    @Test
    public void testRemoveAllSet(){
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(10);
        set2.add(20);
        set2.add(40);
        set1.removeAll(set2);
        assertTrue(set1.contains(30));
        assertFalse(set1.contains(10));
    }
    @Test
    public void testCloneSet(){
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        TreeSet<Integer> set2 = new TreeSet<>();
        set2 = (TreeSet<Integer>) set1.clone();
        assertTrue(set2.equals(set1));
    }

    //TreeMap
    @Test
    public void testPutMap(){
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(0,"Zero");
        map.put(1,"One");
        assertTrue(map.size()==2);
    }
    @Test
    public void testClearMap(){
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(0,"Zero");
        map.put(1,"One");
        map.clear();
        assertTrue(map.size()==0);
    }
    @Test
    public void testContainsKeyMap(){
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(0,"Zero");
        map.put(1,"One");
        assertTrue(map.containsKey(1));
        assertFalse(map.containsKey(5));
    }
    @Test
    public void testContainsValueMap(){
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(0,"Zero");
        map.put(1,"One");
        assertTrue(map.containsValue("One"));
        assertFalse(map.containsValue("Two"));
    }
    @Test
    public void testGetMap(){
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(0,"Zero");
        map.put(1,"One");
        assertTrue(map.get(0)=="Zero");
    }
    @Test
    public void testReplaceMap(){
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(0,"Zero");
        map.put(1,"One");
        map.replace(0,"Zero","Null");
        assertTrue(map.get(0)=="Null");
    }
    @Test
    public void testToStringMap(){
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(0,"Zero");
        map.put(1,"One");
        assertTrue(map.toString().equals("{0=Zero, 1=One}"));
    }

}
