/* LEETCODE JAVA CHALLENGES: 341. Flatten Nested List Iterator

You are given a nested list of integers nestedList. Each element is either an integer or a list whose elements may also be integers or other lists. Implement an iterator to flatten it.
Implement the NestedIterator class:
    NestedIterator(List<NestedInteger> nestedList) Initializes the iterator with the nested list nestedList.
    int next() Returns the next integer in the nested list.
    boolean hasNext() Returns true if there are still some integers in the nested list and false otherwise.

Your code will be tested with the following pseudocode:
initialize iterator with nestedList
res = []
while iterator.hasNext()
    append iterator.next() to the end of res
return res

If res matches the expected flattened list, then your code will be judged as correct.
Example 1:
Input: nestedList = [[1,1],2,[1,1]]
Output: [1,1,2,1,1]
Explanation: By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,1,2,1,1].

Example 2:
Input: nestedList = [1,[4,[6]]]
Output: [1,4,6]
Explanation: By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,4,6].

 */

package in_2023_10_20;

import java.util.*;

interface NestedInteger {
    boolean isInteger();
    Integer getInteger();
    List<NestedInteger> getList();
}

class SimpleNestedInteger implements NestedInteger {
    private Integer value;
    private List<NestedInteger> list;

    public SimpleNestedInteger(Integer value) {
        this.value = value;
        this.list = null;
    }

    public SimpleNestedInteger(List<NestedInteger> list) {
        this.list = list;
        this.value = null;
    }

    @Override
    public boolean isInteger() {
        return value != null;
    }

    @Override
    public Integer getInteger() {
        return value;
    }

    @Override
    public List<NestedInteger> getList() {
        if (isInteger()) {
            return new ArrayList<>(); // empty list
        }
        return list;
    }
}

public class NestedIterator implements Iterator<Integer> {

    private Stack<NestedInteger> stack;

    public NestedIterator(List<NestedInteger> nestedList) {
        stack = new Stack<>();
        flattenList(nestedList);
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            return null; // or throw exception
        }
        return stack.pop().getInteger();
    }

    @Override
    public boolean hasNext() {
        while (!stack.isEmpty()) {
            if (stack.peek().isInteger()) {
                return true;
            }
            // It's a nested list, so flatten it.
            flattenList(stack.pop().getList());
        }
        return false;
    }

    private void flattenList(List<NestedInteger> nestedList) {
        for (int i = nestedList.size() - 1; i >= 0; i--) {
            stack.push(nestedList.get(i));
        }
    }

    public static void main(String[] args) {
        List<NestedInteger> nestedList1 = Arrays.asList(
                new SimpleNestedInteger(Arrays.asList(
                        new SimpleNestedInteger(1),
                        new SimpleNestedInteger(1)
                )),
                new SimpleNestedInteger(2),
                new SimpleNestedInteger(Arrays.asList(
                        new SimpleNestedInteger(1),
                        new SimpleNestedInteger(1)
                ))
        );

        List<NestedInteger> nestedList2 = Arrays.asList(
                new SimpleNestedInteger(1),
                new SimpleNestedInteger(Arrays.asList(
                        new SimpleNestedInteger(4),
                        new SimpleNestedInteger(Arrays.asList(
                                new SimpleNestedInteger(6)
                        ))
                ))
        );

        NestedIterator i1 = new NestedIterator(nestedList1);
        while (i1.hasNext()) {
            System.out.print(i1.next() + " ");
        }
        System.out.println();

        NestedIterator i2 = new NestedIterator(nestedList2);
        while (i2.hasNext()) {
            System.out.print(i2.next() + " ");
        }
        System.out.println();
    }
}
