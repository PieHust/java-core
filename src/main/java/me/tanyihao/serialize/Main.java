package me.tanyihao.serialize;

import java.io.*;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("XiXi", 30);
        serialize(student);
        Student student1 = deserialize("student.ser");
        Objects.requireNonNull(student1);

        assert (student.age == student1.age);
        assert (student.name == student1.name);


    }

    private static void serialize(Student student) {
        try (FileOutputStream fos = new FileOutputStream("student.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {

            oos.writeObject(student);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Student deserialize(String path) {
        try (FileInputStream fis = new FileInputStream(path);
             ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            return (Student) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
