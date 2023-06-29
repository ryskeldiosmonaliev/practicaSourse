package ExamsQuestion;

import java.util.Random;
import java.util.Scanner;
import java.util.jar.Manifest;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int q = random.nextInt(1, 41);

        switch (q) {
	        case 1 -> {
		        System.out.println("Что такое SQL, для чего используем?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s1 = scanner.nextLine();
		        if (s1.equals("q")) {
			        System.out.println("Программа (язык запросов). Позволяет хранить и обрабатывать информацию");
			        System.out.println("Нужен для составления запросов так, чтобы находить среди большого объёма информфции нужную нам");
		        }
	        }
	        case 2 -> {
		        System.out.println("Что такое СУБД?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s2 = scanner.nextLine();
		        if (s2.equals("q")) {
			        System.out.println("Система Управления Базами Данных");
			        System.out.println("Работает с информацией:");
			        System.out.println("сохроняет, выводит, ");
		        }
	        }
	        case 3 -> {
		        System.out.println("Почему мы говорим реляционная база данных?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s3 = scanner.nextLine();
		        if (s3.equals("q")) {
			        System.out.println("Потому что выводит информацию используя столбцы и строки");
		        }
	        }
	        case 4 -> {
		        System.out.println("Расскажите про Primary key & Foreign key");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s4 = scanner.nextLine();
		        if (s4.equals("q")) {
			        System.out.println("PK - первичный ключ. FK - внешний ключ(чтобы ссылаться на PK)");
		        }
	        }
	        case 5 -> {
		        System.out.println("DDL?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s5 = scanner.nextLine();
		        if (s5.equals("q")) {
			        System.out.println("Опрераторы опрелеления данных");
			        System.out.println("CREATE(создать), ALTER(изменить), DROP(удалить)");
		        }
	        }
	        case 6 -> {
		        System.out.println("DML?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s6 = scanner.nextLine();
		        if (s6.equals("q")) {
			        System.out.println("Нужен для манипуляций");
			        System.out.println("SELECT(выведение), INSERT(добавление), UPDATE(изменение)");
		        }
	        }
	        case 7 -> {
		        System.out.println("Агрегатные фунуции?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s7 = scanner.nextLine();
		        if (s7.equals("q")) {
			        System.out.println("AVG, SUM, MIN, MAX, COUNT");
			        System.out.println("Агрегатные функции проводят вычисления");
		        }
	        }
	        case 8 -> {
		        System.out.println("С помощью какого запроса можно взять уникальные значения?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s8 = scanner.nextLine();
		        if (s8.equals("q")) {
			        System.out.println("DISTINCT");
		        }
	        }
	        case 9 -> {
		        System.out.println("Разница ORDER BY / GROUP BY?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s9 = scanner.nextLine();
		        if (s9.equals("q")) {
			        System.out.println("ORDER BY сортирует, GROUP BY групирует");
		        }
	        }
	        case 10 -> {
		        System.out.println("Какой запрос фильтрует, а какой сортирует?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s10 = scanner.nextLine();
		        if (s10.equals("q")) {
			        System.out.println("WHERE - фильтрация. ORDER BY - сортировка");
		        }
	        }
	        case 11 -> {
		        System.out.println("Зачем нужен WHERE?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s11 = scanner.nextLine();
		        if (s11.equals("q")) {
			        System.out.println("Для фильтрации. Выводить информацию с нужными нам параметрами");
		        }
	        }
	        case 12 -> {
		        System.out.println("Зачем нужен HAVING?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s12 = scanner.nextLine();
		        if (s12.equals("q")) {
			        System.out.println("По сути, такой же как и WHERE, но HAVING может работать с агрегатными функциями");
			        System.out.println("В HAVING можно наложить условия на результаты группировки");
		        }
	        }
	        case 13 -> {
		        System.out.println("BETWEEN, LIKE, IN?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s13 = scanner.nextLine();
		        if (s13.equals("q")) {
			        System.out.println("BETWEEN - находить значения между заданным параметром");
			        System.out.println("LIKE - как contains");
			        System.out.println("IN - как equals");
			
		        }
	        }
	        case 14 -> {
		        System.out.println("Какие есть виды JOIN и для чего нужны?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s14 = scanner.nextLine();
		        if (s14.equals("q")) {
			        System.out.println("LEFT JOIN, RIGHT JOIN, FULL JOIN");
			        System.out.println("Нужен для соединения сторк из других таблиц");
		        }
	        }
	        case 15 -> {
		        System.out.println("Что такое подзапросы?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s15 = scanner.nextLine();
		        if (s15.equals("q")) {
			        System.out.println("Данный запрос для получения данных из нескольких таблиц");
			        System.out.println("Также будут использоваться как условие для ограничения в основном запросе");
		        }
	        }
	        case 16 -> {
		        System.out.println("Что такое Maven? Для чего он нужен? Как добавлять в проект библиотеки без него?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s16 = scanner.nextLine();
		        if (s16.equals("q")) {
			        System.out.println("Maven - инструмент для автоматизации сборки проектов");
			        System.out.println("упрощает процесс сборки проекта");
		        }
	        }
	        case 17 -> {
		        System.out.println("Как добавить dependency в Maven? Для чего они нужны? Откуда они скачиваются?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s17 = scanner.nextLine();
		        if (s17.equals("q")) {
			        System.out.println("Рассказать пошагово что как");
		        }
	        }
	        case 18 -> {
		        System.out.println("Основные фазы проекта под управлением Maven?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s18 = scanner.nextLine();
		        if (s18.equals("q")) {
			        System.out.println("clean, validate, create, test");
		        }
	        }
	        case 19 -> {
		        System.out.println("Что такое JDBC?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s19 = scanner.nextLine();
		        if (s19.equals("q")) {
			        System.out.println("Взоимодействие Java с базой данных");
			        System.out.println("подключение к базе данных, выдача запросов, обработка данных");
		        }
	        }
	        case 20 -> {
		        System.out.println(" Для чего нужен DriverManager?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s20 = scanner.nextLine();
		        if (s20.equals("q")) {
			        System.out.println("Это класс который нужен для получения подключения ");
		        }
	        }
	        case 21 -> {
		        System.out.println("что такое connection?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s21 = scanner.nextLine();
		        if (s21.equals("q")) {
			        System.out.println("Объект(интерфейс), реализующий соединение");
		        }
	        }
	        case 22 -> {
		        System.out.println("Процесс обращения SQL к Java?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s22 = scanner.nextLine();
		        if (s22.equals("q")) {
			        System.out.println("Connection, open connection, statement, execute statement, ResultSet, close connection");
		        }
	        }
	        case 23 -> {
		        System.out.println("Что такое Statement, PreparedStatement, CallableStatement");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s23 = scanner.nextLine();
		        if (s23.equals("q")) {
			        System.out.println("statement - SQL без параметра. PreparedStatement - SQL с параметром. " +
					                           "CallableStatement - процедура, выводит функции из субд");
		        }
	        }
	        case 24 -> {
		        System.out.println("Как отправляем запрос на базу?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s24 = scanner.nextLine();
		        if (s24.equals("q")) {
			        System.out.println("execute - запрашиваем");
			        System.out.println("executeQuery - запрашиваем, результат ResultSet");
			        System.out.println("executeUpdate - insert, update, delete");
		        }
	        }
	        case 25 -> {
		        System.out.println("Что такое ResultSet, как с ним работать?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s25 = scanner.nextLine();
		        if (s25.equals("q")) {
			        System.out.println("Получуние данных, нужно приозывать по значению");
		        }
	        }
	        case 26 -> {
		        System.out.println("Поттерн DAO?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s26 = scanner.nextLine();
		        if (s26.equals("q")) {
			        System.out.println("Реализует необходимый для работы с источником данных мезанизм доступа");
		        }
	        }
	        case 27 -> {
		        System.out.println("Что такое JPA?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s27 = scanner.nextLine();
		        if (s27.equals("q")) {
			        System.out.println("Java Persistence API предоставляет возможность сохронять в удобном формате объекты в бд");
		        }
	        }
	        case 28 -> {
		        System.out.println("Что такое ORM?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s28 = scanner.nextLine();
		        if (s28.equals("q")) {
			        System.out.println("Преобразование объекта в строку в таблице и обратное");
		        }
	        }
	        case 29 -> {
		        System.out.println("Что такое Hibernate?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s29 = scanner.nextLine();
		        if (s29.equals("q")) {
			        System.out.println("Библиотека, решает задачи объктно-реляционного отображения");
			        System.out.println("чтобы создавать, выводить, изменять, удалять объекты из бд");
		        }
	        }
	        case 30 -> {
		        System.out.println(" В чем разница между JPA и Hibernate? Как связаны все эти понятия?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s30 = scanner.nextLine();
		        if (s30.equals("q")) {
			        System.out.println("JPA - это специфика, а Hibernate - ORM библиотека");
		        }
	        }
	        case 31 -> {
		        System.out.println("Какие классы/интерфейсы относятся к JPA/Hibernate?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s31 = scanner.nextLine();
		        if (s31.equals("q")) {
			        System.out.println("SessionFactory, Session, Transaction, Query");
			        System.out.println("Configuration");
		        }
	        }
	        case 32 -> {
		        System.out.println("Основные аннотации Hibernate, рассказать?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s32 = scanner.nextLine();
		        if (s32.equals("q")) {
			        System.out.println("Entity, Table, Id, GeneratedValue, Column");
		        }
	        }
	        case 33 -> {
		        System.out.println("Сколько есть способов соединить класс и таблицу?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s33 = scanner.nextLine();
		        if (s33.equals("q")) {
			        System.out.println("хз");
		        }
	        }
	        case 34 -> {
		        System.out.println("Что такое Session, SessionFactory?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s34 = scanner.nextLine();
		        if (s34.equals("q")) {
			        System.out.println("Session - осонова для работы с бд, с помощью его мы получаем, добавляем и др.");
			        System.out.println("SessionFactory - читает файлы и создаёт сессии");
		        }
	        }
	        case 35 -> {
		        System.out.println(" Чем HQL отличается от SQL?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s35 = scanner.nextLine();
		        if (s35.equals("q")) {
			        System.out.println("sql работает с таблицами бд, а hql с объектами и полями");
		        }
	        }
	        case 36 -> {
		        System.out.println("Что такое Query? Как передать в объект Query параметры?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s36 = scanner.nextLine();
		        if (s36.equals("q")) {
			        System.out.println("Интнрфейс с помощью которого можем задать параметр запроса");
			        System.out.println("setParameter");
		        }
	        }
	        case 37 -> {
		        System.out.println("Какие можно устанавливать параметры в hbm2ddl?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s37 = scanner.nextLine();
		        if (s37.equals("q")) {
			        System.out.println("validate, create, update");
		        }
	        }
	        case 38 -> {
		        System.out.println("Требования JPA к Entity-классам?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s38 = scanner.nextLine();
		        if (s38.equals("q")) {
			        System.out.println("Должна быть аннотация");
			        System.out.println("Конструктор без параметров");
			        System.out.println("Не final");
			        System.out.println("Поля должны быть доступны только этому классу");
			        System.out.println("Не может быть enum");
		        }
	        }
	        case 39 -> {
		        System.out.println("Жизненный цикл Entity в Hibernate?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s39 = scanner.nextLine();
		        if (s39.equals("q")) {
			        System.out.println("new - объект создан, но без всего и без бд");
			        System.out.println("managed - имеет ключи");
			        System.out.println("detached - не управляется JPA");
			        System.out.println("removed - будет удалён после коммит");
		        }
	        }
	        case 40 -> {
		        System.out.println("отношения связывающие 2 объектов hibernate?");
		        System.out.println("Нажмите q и enter чтобы узнать ответ");
		        String s40 = scanner.nextLine();
		        if (s40.equals("q")) {
			        System.out.println("@");
		        }
	        }
	
        }
	 
    }
}