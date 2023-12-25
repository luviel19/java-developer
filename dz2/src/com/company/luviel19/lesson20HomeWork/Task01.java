package com.company.luviel19.lesson20HomeWork;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class Task01 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(1, "Женя", Student.Gender.MALE, LocalDate.now().minusYears(10)),
                new Student(2, "Олег", Student.Gender.MALE, LocalDate.now().minusYears(7)),
                new Student(3, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(6)),
                new Student(4, "Иван", Student.Gender.MALE, LocalDate.now().minusYears(12)),
                new Student(5, "Алексей", Student.Gender.MALE, LocalDate.now().minusYears(9)),
                new Student(6, "Петр", Student.Gender.MALE, LocalDate.now().minusYears(9)),
                new Student(7, "Иван", Student.Gender.MALE, LocalDate.now().minusYears(17)),
                new Student(8, "Петр", Student.Gender.MALE, LocalDate.now().minusYears(5)),
                new Student(9, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(8)),
                new Student(10, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(10)),
                new Student(11, "Григорий", Student.Gender.MALE, LocalDate.now().minusYears(7)),
                new Student(12, "Ирина", Student.Gender.FEMALE, LocalDate.now().minusYears(6))
        ));


        // Используя методы Stream API:
        //  1. Разделить учеников на две группы: мальчиков и девочек. Результат: Map<Student.Gender, ArrayList<Student>>
        Map<Student.Gender, List<Student>> studentMap = students.stream().collect(Collectors.groupingBy(student -> student.getGender(),
                Collectors.toCollection(ArrayList::new)));
        System.out.println(studentMap);
        //  2. Найти средний возраст учеников
        Double averagingInt = students.stream().collect(Collectors.averagingInt(student -> {
            Period diff = Period.between(student.getBirth(), LocalDate.now());
            return diff.getYears();
        }));
        System.out.println("Cредний возраст учеников = " + averagingInt);

        //  3. Найти самого младшего ученика - Stream -> min(Comparator<Student>): int compare(T o1, T o2);
        Student studentMin = students.stream().min((student01, student02) -> student02.getBirth().compareTo(student01.getBirth())).get();
        System.out.println("Младший ученик = " + studentMin);

        //  5. Собрать учеников в группы по году рождения, результат - Map<Integer, List<Student>>
        Map<Number, List<Student>> mapGroupAge = students.stream().collect(Collectors.groupingBy(student -> student.getBirth().getYear(),
                Collectors.toCollection(ArrayList::new)));
        System.out.println("группа по году рожденгия = " + mapGroupAge);
        //  6. Отсортировать по полу, дате рождения, имени (в обратном порядке),
        //  собрать в список (ArrayList)

        Comparator<Student> byGender = (s1, s2) -> s1.getGender().ordinal() - s2.getGender().ordinal();
        Comparator<Student> byBirth = (s1, s2) -> s1.getBirth().compareTo(s2.getBirth());
        Comparator<Student> studentComparator = byGender.thenComparing(byBirth);
        // Function<? super T, ? extends U> keyExtractor
        // R apply(T value);
        studentComparator = Comparator.<Student>comparingInt(student->student.getGender().ordinal())
                // .thenComparing(Comparator.comparing(student -> student.getBirth()))
                .thenComparing(student -> student.getBirth())
                .thenComparing(student -> student.getName()).reversed();
        ArrayList<Student> studentArrayList = students.stream()
                .sorted(studentComparator)
                .collect(Collectors.toCollection(ArrayList::new));


        // 7. Собрать в список всех учеников с именем
        String someName = "Петр";
        List<Student> StudentNameArray = students.stream().filter(student -> student.getName() == someName).collect(Collectors.toList());
        System.out.println("Имя "+ someName + StudentNameArray);
        //  8. Собрать Map<Student.Gender, Integer>,
        //  где Student.Gender - пол,
        //  Integer - суммарный возраст учеников данного пола
        Map<Student.Gender, Integer> SummaryAgeArr = students.stream().collect(Collectors.groupingBy(student -> student.getGender(), Collectors.summingInt(student -> {
            Period diff = Period.between(student.getBirth(), LocalDate.now());
            return diff.getYears();
        })));

        System.out.println("Cумарный возраст = " + SummaryAgeArr);
    }
}