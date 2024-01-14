public class Main {
    public static void main(String[] args) {
        //1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        //2
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
        //3
        String completeName = "Иванов Семён Семёнович";
        completeName = completeName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + completeName);
    }
}