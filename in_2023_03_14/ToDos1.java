// LEARN JAVA // ARRAYLISTS / Adding an Item

package in_2023_03_14;

import java.util.ArrayList;

class ToDos1 {

    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<String>();
        String toDo1 = "Water plants";
        // Add more to-dos here:
        String toDo2 = "Crush your enemies";
        String toDo3 = "See them driven before you";
        String toDo4 = "And hear the lamentation of their woman";

        // Add to-dos to toDoList
        toDoList.add(toDo1);
        toDoList.add(toDo2);
        toDoList.add(toDo3);
        toDoList.add(toDo4);

        System.out.println(toDoList);
    }
}
